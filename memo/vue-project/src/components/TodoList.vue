<template>
  <div class="liWrapper">
    <ul>
      <li v-for="todoItem in todoList" :key="todoItem.id" @click="toggleCompleted(todoItem.id)" draggable="false">
        <span :class="{ 'todo-done': todoItem.completed }">
          {{ todoItem.todo }}
          <i v-if="todoItem.completed" class="mdi mdi-checkbox-blank-outline"></i>
          <i v-else class="mdi mdi-checkbox-marked"></i>
        </span>

        <span @click.stop="deleteTodo(todoItem.id)">
          <i class="mdi mdi-close-circle"></i>
        </span>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'TodoList',
};
</script>

<style lang="scss" scoped></style>
