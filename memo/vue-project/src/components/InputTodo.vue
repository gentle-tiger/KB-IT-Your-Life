<template>
  <div class="inputWrapper">
    <!-- v-model을 통해 todo의 값을 위로 올려보냄. -->
    <input
      id="msg"
      type="text"
      name="msg"
      placeholder="할일을 여기에 입력!!"
      v-model.trim="todo"
      @keyup.enter="addTodo"
    />
    <span @click="$emit('add-todo', todo)">추가</span>
  </div>
</template>

<script>
export default {
  name: "InputTodo",
  data() {
    return {
      todo: "",
    };
  },
};
</script>

<style lang="scss" scoped></style>
