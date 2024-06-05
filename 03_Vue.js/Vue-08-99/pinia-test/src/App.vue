<template>
  <div>
    <h1>TodoList 테스트(Composition API)</h1>
    <hr />
    <!-- input -->
    할 일 추가 : <input type="text" v-model="todo" />
    <button @click="addTodoHandler">추가</button>

    <hr />

    <!-- list  /   key 값 필수 -->
    <ul v-for="todoItem in todoList" :key="todoItem.id">
      <li>
        <span style="cursor: pointer" @click="toggleDone(todoItem.id)"> {{ todoItem.todo }} {{ todoItem.done ? '0' : '' }} </span> &nbsp;&nbsp;&nbsp;
        <button @click="deleteTodo(todoItem.id)">삭제</button>
      </li>
    </ul>

    <!-- total list count -->
    <hr />
    <div>완료된 할 일 수 : {{ doneCount }}</div>
  </div>
</template>

<script setup>
import { ref, computed } from 'vue';
import { useTodoListStore } from '@/stores/todo.js';

// ipnut 태그 값
const todo = ref('');

// computed의 값을 store에서 직접 가져왔기 떄문에 구조 분해에서는 뺌.
const doneCount = computed(() => todoListStore.doneCount);
// store 가져오기 ( 함수로 작성해야함... 왜지?  )
const todoListStore = useTodoListStore();
// store에서 값 가져오기.
const { todoList, addTodo, deleteTodo, toggleDone } = todoListStore;

// todo 추가 이후 밸류 삭제
const addTodoHandler = () => {
  addTodo(todo.value);
  todo.value = '';
};
// 완료될 할 일 수
// const doneCount = todoList.filter((item) => item.done).length;
</script>

<style scoped>
* {
  user-select: none; /* 표준 속성 */
}
</style>
