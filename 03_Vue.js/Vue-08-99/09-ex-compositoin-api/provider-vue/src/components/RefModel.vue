<template>
  <div>
    <!-- <h1>count : {{ count }}</h1>
    <h1>double : {{ double }}</h1>
    <h1>계산 횟수 : {{ number }}</h1>
    <button @click="increment">+ 1</button>
    <button @click="decrement">- 1</button> -->

    <!-- defineProps 사용 방법  -->
    <PropsChild :msg="msg" />
  </div>
</template>

<script setup>
import { ref, reactive, computed } from 'vue'; // npm install 로 설치되었다면 확장자명이 없다~ (맞나)
import PropsChild from './compo/PropsChild.vue';

const count = ref(0);
const number = ref(0);
const obj = reactive({ x: 0, y: 0, result: 0 });

const msg = ref('props로 전달될 메세지');

// count 자체만을 쓰면 안 됨. ".value" 필수
const increment = computed(() => {
  count.value++;
  number.value++;
});
const decrement = computed(() => {
  count.value--;
  number.value++;
});
const double = computed(() => {
  count.value * 2;
});
</script>

<style scoped>
button {
  width: 50px;
  height: 50px;
  border: 0px;
  background-color: black;
  color: white;
  font: bold;
  font-size: 24px;
  margin-right: 10px;
}
</style>
