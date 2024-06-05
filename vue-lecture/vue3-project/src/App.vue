<template>
  <div :style="backgroundStyle">
    <h1>Router Ex</h1>
    <router-link to="/home">Home</router-link>
    <h2></h2>
    <router-view></router-view>
    <div>{{ name }}</div>
    <div>{{ greet }}</div>
    <div>valueReact : {{ valueReact }}</div>
    <div>valueRef : {{ valueRef }}</div>
    <!-- <button style="font-size: 40px" v-on:click="updataName">Click</button> -->
    <button v-on:click="reactClick">valueReact</button>
    <button v-on:click="refClick">valueRef</button>
    <!-- <div >마우스 위치: x : {{ x }}, y: {{ y }}</div> -->
    <div v-if="error">앗! 에러 발생: {{ error.message }}</div>
    <div v-else-if="data">
      로드된 데이터:
      <div>data : {{ data }}</div>
    </div>
    <div v-else>로딩...</div>
  </div>
</template>

<script setup>
import { reactive, ref } from 'vue';
import { useFetch } from './fetch';
// import { onMounted, onUnmounted, computed } from 'vue';

//  비동기 상태 예제
const { data, error } = useFetch('...');

fetch('...')
  .then((res) => res.json())
  .then((json) => (data.value = json))
  .catch((err) => (error.value = err));

//------------

// 마우스 위치 확인
// const x = ref(0);
// const y = ref(0);

// function update(event) {
//   x.value = event.pageX;
//   y.value = event.pageY;
// }

// onMounted(() => window.addEventListener('mousemove', update));
// onUnmounted(() => window.removeEventListener('mousemove', update));

// 마우스 위치에 따른 색상 번경
// const backgroundStyle = computed(() => {
//   const red = (x.value % 256).toString();
//   const green = (y.value % 256).toString();
//   const blue = ((x.value + y.value) % 256).toString();
//   return {
//     backgroundColor: `rgb(${red}, ${green}, ${blue})`,
//     transition: 'background-color 0.3s ease',
//   };
// });
//----------------------------------------------------------

const name = ref('Gentele-Tiger');
// let name = "Gentele-Tiger";

const valueReact = reactive({
  id: 1,
  name: '호진',
  home: '서울 금천구 ',
});

const valueRef = ref({
  id: 1,
  name: '호진',
  home: '서울 금천구 ',
});

// ref와 react 비교
const refClick = () => {
  valueRef.value.id++;
  console.log('valueRef : ', valueRef.value.id);
  console.log('valueRef : ', valueRef.value.name);
  console.log('valueRef : ', valueRef.value.home);
};

const reactClick = () => {
  valueReact.id++;
  console.log('valueReact : ', valueReact.id);
  console.log('valueReact : ', valueReact.name);
  console.log('valueReact : ', valueReact.home);
};

const greeting = (userName) => {
  return 'Hello ' + userName.value;
};

const greet = greeting(name);

// const updataName = () => {
//   name.value = 'Gentle Tiger~~';
// };
</script>

<style>
button {
  display: inline-flex;
  gap: 10px;
  font-size: 20px;
  margin-left: 10px;
  padding: 10px;
}
</style>
