<template>
  <h1>Counter</h1>
  <h1>counter : {{ count }}</h1>
  <h1>counter x 2 : {{ doubleCount }}</h1>

  <button @click="increment">+1</button>
</template>

<script setup>
import { computed } from 'vue';
import { useCounterStore } from '@/stores/counter'; // @는 vite.config.js을 통해서 가능하다.

const counterStore = useCounterStore();
const count = computed(() => counterStore.count); // 스토어.value를 해야 반응형+ readonly로 가져올 수 있다.
const doubleCount = computed(() => counterStore.doubleCount);
const { increment } = counterStore;
console.log(count);
console.log(doubleCount);
</script>

<style lang="scss" scoped></style>
