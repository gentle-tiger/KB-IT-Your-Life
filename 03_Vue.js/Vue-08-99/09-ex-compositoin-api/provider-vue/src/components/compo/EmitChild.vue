<template>
  <div>
    <input type="text" v-model.trim="inputMsg" />
    <button @click="sandMsg">부모님께 전송</button>
  </div>
</template>

<script setup>
import { ref, defineEmits } from 'vue';
const inputMsg = ref(' ');

// 객체를 넣지 않아도 됨. msg와 헷갈리지 않도록
const emit = defineEmits(['sand-msg']);

const sandMsg = () => {
  emit('sand-msg', inputMsg.value);
  // 스크립트 태그 안에서는 꼭 value를 붙여야 한다.
  inputMsg.value = '';
};
</script>

<style lang="scss" scoped></style>
