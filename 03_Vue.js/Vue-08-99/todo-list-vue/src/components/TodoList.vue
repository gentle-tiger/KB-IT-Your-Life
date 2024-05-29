<template>
  <ul>
    <!--toggleCompleted,deleteTodo 둘 다 app으로 올려 보낸다. 
       $event는 데이터 값을 특정할 수 없을 때 쓴다. -->
    <TodoListItem
      v-for="todoItem in todoList"
      v-bind:todoItem="todoItem"
      v-bind:key="todoItem.id"
      @toggleCompleted="$emit('toggleCompleted', $event)"
      @deleteTodo="$emit('deleteTodo', $event)"
    />
  </ul>
</template>

<script>
import TodoListItem from './TodoListItem.vue';

export default {
  name: 'TodoList',
  props: ['todoList'],
  components: { TodoListItem },
};
</script>

<style scoped>
ul {
  width: 200px;
  height: 500px;
  background-color: #ece8eb;
  border-radius: 10px;
  /* list-style: none; */
}
</style>
