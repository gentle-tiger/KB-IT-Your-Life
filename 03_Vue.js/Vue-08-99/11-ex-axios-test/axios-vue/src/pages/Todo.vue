<template>
  <div>
    <h1>Todoist</h1>
    <input type="text" v-model.trim="todo" />
    <button @click="addTodo">추가</button>
    <!-- 리스트 파트 -->
    <ol>
      <!-- 투두 항목 -->
      <li v-for="todoItem in states.todoList" :key="todoItem.id">
        <span :style="todoItem.done ? { textDecoration: 'line-through' } : { textDecoration: 'none' }"
          >{{ todoItem.todo }} : {{ todoItem.done ? '0  ' : 'X  ' }}
        </span>
        <!-- 수정모드 -->
        <div v-if="todoItem.editing">
          <input type="text" v-model.trim="todoEdit" />
          <button @click.stop="confirmEditTodo(todoItem.id)">확인</button>
          <button @click.stop="cancelEditTodo(todoItem.id)">취소</button>
        </div>

        <span v-if="!todoItem.editing">
          <button v-on:click="editTodo(todoItem.id)">수정</button>
          /
          <button @click.stop="deleteTodo(todoItem.id)">삭제</button>
        </span>
      </li>
    </ol>
  </div>
</template>

<script setup>
import axios from 'axios';
import { reactive, ref } from 'vue';

// reactive는 비원시형 데이터~
// todoList 는 중요한 데이터(= 상태)이므로 states 라는 객체로 관리

const states = reactive({
  todoList: [],
});
const todoEdit = ref('');
const todo = ref('');
// Todo 컴포넌트는 todos로만 요청을 보낼 것이므로 BASEURL로 설정
// localhost:3000
const BASEURL = '/api/todos';

// todoList 를 json-server 에서 받아오는 비동기 통신 함수인 fetchTodoList 선언
async function fetchTodoList() {
  try {
    // 데이터 요청이므로 GET 방식으로 todoList 요청
    const fetchTodoRes = await axios.get(BASEURL);
    // console.log(fetchTodoRes.data);
    // 받아온 데이터를 states 에서 관리중인 todoList 에 업데이트 컴포넌트가 리렌더링
    states.todoList = fetchTodoRes.data;
  } catch (err) {
    alert('TodoList 데이터 통산 err 발생');
    console.log('err', err);
  }
}
// ccomponent가 실행될 때 바로 실행되어야 하기 때문에 바로 실행하는 방식으로 진행한다.

// addTodo
async function addTodo() {
  if (todo.value === '') return alert('할 일을 입력해주세요');

  try {
    const newTodo = { todo: todo.value, done: false };
    const addTodoRes = await axios.post(BASEURL, newTodo);
    fetchTodoList(); // 데이터 변경시 렌더링

    // 201번이 아닌 경우 종료 시킨다.
    if (addTodoRes.status !== 201) return alert('todoAdd 실패');
    todo.value = '';
  } catch (err) {
    alert('TodoList 추가 작업 중, Err 발생');
    console.log('err :', err);
  }
}

async function deleteTodo(id) {
  try {
    // axios.delete(url[, config])  url만 보내주면 해당 url의 데이터를 삭제해준다.
    const deleteTodoRes = await axios.delete(BASEURL + `/${id}`);
    if (deleteTodoRes.status !== 200) return alert('deleteTodo 실패');
    fetchTodoList();
  } catch (err) {
    alert('Todolist 삭제 작업 중, ERR 발생');
    console.log(err);
  }
}

async function toggleTodo(id) {
  try {
    const targetTodo = states.todoList.find((todo) => todo.id === id);
    console.log(targetTodo);
    const payload = { ...targetTodo, done: !targetTodo.done };

    const toggleTodoRes = await axios.put(BASEURL + `/${id}`, payload); // 그 자체로 실행
    if (toggleTodoRes.status !== 200) return alert('toggleTodoRes 변경 실패');
    fetchTodoList();
  } catch (err) {
    alert('TodoList ToggleTodo 작업 중, ERR 발생');
    console.log(err);
  }
}

async function editTodo(id) {
  const targetTodo = states.todoList.find((todo) => todo.id === id);
  targetTodo.editing = true;
}

async function cancelEditTodo(id) {
  const targetTodo = states.todoList.find((todo) => todo.id === id);
  targetTodo.editing = false;
}

async function confirmEditTodo(id) {
  if (todoEdit.value === '') return alert('수정 내용 입력 ');

  try {
    const targetTodo = states.todoList.find((todo) => todo.id === id);

    const payload = { ...targetTodo, todo: todoEdit.value, editing: false };
    // put(주소값, 바꿀 내용)
    const editTodoRes = await axios.put(BASEURL + `/${id}`, payload);
    if (editTodoRes.status !== 200) return alert('editTodoRes 변경 실패');

    todoEdit.value = '';
    fetchTodoList();
  } catch (error) {
    alert('수정 작업 중 오류 발생.');
    console.log(error);
  }
}

fetchTodoList();
</script>

<style scoped></style>
