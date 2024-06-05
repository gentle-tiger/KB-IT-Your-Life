<template>
  <div>
    <h2>Date</h2>
    <div>오늘은 {{ date }}</div>
    <div>
      <button @click="year">년도 출력</button>
      <button @click="month">월 출력</button>
      <button @click="today">일자 출력</button>
    </div>
  </div>
</template>

<script setup>
import { computed } from 'vue';
import { useDateStore } from '@/stores/date';

// store import
const dateStore = useDateStore();

// 원시형 데이터
const date = computed(() => dateStore.date);

// 참조 데이터
const { year, month, today } = dateStore;
</script>

<style scoped>
div {
  font-size: 40px;
}
button {
  margin-right: 20px;
  padding: 10px;
  font-size: 20px;

  border-radius: 10px;
  border: none;
  background-color: rgb(5, 5, 5);
  color: white;
  font-weight: bold;
  transition: all 0.5s;
}
button:hover {
  transform: scale(1.2);
  background-color: rgb(99, 1, 1);
  cursor: pointer;
}
</style>
