<template>
  <div>
    <h1>{{ msg }}</h1>
  </div>
</template>

<!-- definedProps 사용 예시 ~ ~ ~  -->
<script setup>
import { defineProps } from 'vue';

const props = defineProps({
  // defineProps도 메서드이기 떄문에 중괄호~
  msg: {
    type: String,
    required: true,
  },
});
</script>

<style scoped></style>
