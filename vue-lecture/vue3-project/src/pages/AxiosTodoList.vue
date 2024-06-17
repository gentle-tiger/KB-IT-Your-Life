<template>
  <div class="todo-list">
    <h1>AxiosTodoList</h1>
    <!-- todoList -->
    <div class="add-todo">
      <input type="text" v-model.trim="todoInput" class="add-input" placeholder="입력해주세요." />
      <button class="fa-plus-btn" @click="addTodo">
        <i class="fa-solid fa-plus"></i>
      </button>
    </div>
    <div class="todo-box">
      <!-- state.todoList 로 접근해야함.  -->
      <ol v-for="todos in state.todoList" :key="todos.id" class="todo-box-ol">
        <li class="todo-items">
          <span
            class="todo-item"
            v-if="isState"
            @click="completedTodo(todos.id)"
            :style="todos.complete ? { textDecoration: 'line-through' } : { textDecoration: 'none' }"
          >
            {{ todos.todo }}
          </span>
          <span class="todo-item" v-else>
            <input type="text" v-model="todos.todo" />
          </span>

          <button class="icon modify" @click="modefyTodo(todos.id, todos.todo)">
            <i class="fa-solid fa-eraser" :style="isState ? { color: 'black' } : { color: 'red' }"></i>
          </button>
          <button class="icon delete" @click="deleteTodo(todos.id)">
            <i class="fa-solid fa-trash" :style="todos.complete ? { color: 'red' } : { color: 'black' }"></i>
          </button>
        </li>
      </ol>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios';
import { reactive, ref } from 'vue';

const todoInput = ref('');
const isState = ref(true);
const state = reactive({
  todoList: [],
});

// get list

const url = 'http://localhost:3000/todos';
// const BASEURL = "/api/todos"; // 오류

// todoList 추가
async function addTodo() {
  if (todoInput.value === '') return console.log('할 일을 입력해주세요');

  try {
    const Item = { id: new Date(), todo: todoInput.value, done: false };
    console.log('Item : ', Item);
    await axios.post(url, Item); // await 를 한 후에 이후 코드를 실행해야 제대로 업데이트됨.
    todoInput.value = '';
    fetchTodoList();
  } catch (error) {
    console.log('error : ', error);
  }
}

// todoList 삭제
async function deleteTodo(id) {
  try {
    const deleteTodo = `${url}/${id}`;
    console.log('deleteTodo', deleteTodo);
    await axios.delete(deleteTodo);
    fetchTodoList();
  } catch (error) {
    console.log('error', error);
  }
}

// todoList 수정 | todos.todo 가 변한 값을 담아서 보냄.
async function modefyTodo(id, todo) {
  try {
    isState.value = !isState.value;
    const modefyUrl = `${url}/${id}`;
    const modefyTodo = { id: id, todo: todo, complete: false };
    await axios.put(modefyUrl, modefyTodo);
    fetchTodoList();
  } catch (error) {
    console.log('error', error);
  }
  console.log(id);
}
async function completedTodo(id) {
  const todoItem = state.todoList.find((item) => item.id === id);
  const completedUrl = `${url}/${id}`;

  // console.log("todoItem", todoItem);
  const newTodo = { ...todoItem, complete: !todoItem.complete };
  await axios.put(completedUrl, newTodo);
  fetchTodoList();
}

// json 데이터 최신화
async function fetchTodoList() {
  try {
    // const getTodoRes = await axios.get(BASEURL);
    const getTodoRes = await axios.get(url);

    state.todoList = getTodoRes.data;
    console.log('state.todoList : ', state.todoList);
  } catch (error) {
    console.log('error : ', error);
  }
}

fetchTodoList();
</script>

<style scoped>
.todo-list {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  border: 1px solid rgb(187, 0, 255);
  padding-bottom: 30px;
}
.add-todo {
  display: flex;
  justify-content: center;
  height: 30px; /*  버튼의 크기 지정  */
}
.add-todo > .add-input {
  width: 300px;
  margin-right: 5px;
  height: 100%;
  font-size: 12px;
  padding: 0px 8px;
  border: 1px solid skyblue;
}
.add-todo > .add-input:focus {
  outline: none;
  border: 1px solid rgb(50, 50, 253);
}
.add-todo > .fa-plus-btn {
  height: 100%; /* add-todo 높이 따라가기  */
  width: 30px;
  border: none;
  transition: all 0.12s ease-in-out;
}
.add-todo > .fa-plus-btn:hover {
  background-color: gray;
  color: white;
}
.add-todo > .fa-plus-btn:active {
  transform: scale(0.95, 0.95);
}
.fa-plus {
  /* + 중앙정렬*/
  display: flex;
  justify-content: center;
  align-content: center;
}
.icon {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 24px;
  border: none;
  background-color: white;
}
/* todo-list */
.todo-box {
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 100%;
  padding-top: 20px;
}
.todo-box-ol {
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 0px;
}
.todo-items {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 300px;
  gap: 4px;
  padding: 5px 10px;
}
.todo-item {
  width: 100%;
  font-size: 12px;
  /* border: 1px solid red; */
}
</style>
