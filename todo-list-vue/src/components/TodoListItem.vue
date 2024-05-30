<template>
  <li>
    <!-- style : todoItem의completed를 따라가는데 -->
    <!--  click : emit으로 완료된 list의 id를 app으로 올려 보냄.-->
    <span @click="$emit('toggleCompleted', todoItem.id)" :style="todoItem.completed ? { textDecoration: 'line-through' } : ''">
      {{ todoItem.todo }} {{ todoItem.completed ? 'O' : 'X' }}</span
    >
    <!-- add로 해당 id값을 올려 보냄. -->
    <button @click="$emit('deleteTodo', todoItem.id)">삭제</button>
  </li>
</template>

<script>
export default {
  name: 'TodoListItem',
  props: ['todoItem'],
};
</script>

<style scoped>
li {
  padding: 5px 0px 5px 0px;
}
</style>
