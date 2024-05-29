<template>
  <div class="liWrapper">
    <ul>
      <li
        v-for="todoItem in todoList"
        :key="todoItem.id"
        @click="$emit('toggleCompleted', todoItem.id)"
        draggable="false"
      >
        <span :class="{ 'todo-done': todoItem.completed }">
          {{ todoItem.todo }}
          <i
            v-if="todoItem.completed"
            class="mdi mdi-checkbox-blank-outline"
          ></i>
          <i v-else class="mdi mdi-checkbox-marked"></i>
        </span>
        <!-- 삭제 버튼 클릭 시 deleteTodo 이벤트 발생 -->
        <span @click.stop="$emit('deleteTodo', todoItem.id)">
          <i class="mdi mdi-close-circle"></i>
        </span>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "TodoItem",
  props: ["todoList"],
};
</script>

<style lang="scss" scoped></style>
