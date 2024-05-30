<template>
  <div>
    <!-- v-model로 input 태그의 text값을 가져온다. -->
    <input type="text" v-model.trim="todo" placeholder="입력해주세요" />

    <!-- app으로 보냄. -->
    <button @click="$emit('addTodo', { todo })">추가</button>
  </div>
</template>

<script>
export default {
  name: 'InputTodo',
  data() {
    return {
      todo: '',
    };
  },
};
</script>

<style scoped></style>
