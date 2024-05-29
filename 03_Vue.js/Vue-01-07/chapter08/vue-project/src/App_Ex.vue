<script setup>
import CheckList from './components/CheckList.vue';
import TodoProps from './components/TodoProps.vue';

CheckList;
</script>
<style>
.todo {
  text-align: center;
}
</style>
<template>
  <div class="todo">
    <h1>오늘의 할 일</h1>
    <CheckList />
    <TodoProps todo="Vue 부수기" />
    <TodoProps todo="Vue 두 번 부수기" />
    <TodoProps todo="Vue 세 번 부수기" />
    <TodoProps todo="Vue 네 번 부수기" />
    <CheckList />
  </div>
</template>

<style scoped></style>
