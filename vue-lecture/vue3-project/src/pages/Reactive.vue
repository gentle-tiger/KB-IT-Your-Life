<template>
  <div :style="backgroundStyle">
    <div>{{ name }}</div>
    <div>{{ greet }}</div>
    <div>valueReact : {{ valueReact }}</div>
    <div>valueRef : {{ valueRef }}</div>
    <button style="font-size: 40px" v-on:click="updataName">Click</button>
    <button v-on:click="reactClick">valueReact</button>
    <button v-on:click="refClick">valueRef</button>
    <div>마우스 위치: x : {{ x }}, y: {{ y }}</div>
  </div>
</template>

<script setup>
import { onMounted, onUnmounted, computed } from "vue";
import { reactive, ref } from "vue";

const name = ref("Gentele-Tiger");
// let name = "Gentele-Tiger";

const valueReact = reactive({
  id: 1,
  name: "호진",
  home: "서울 금천구 ",
});

const valueRef = ref({
  id: 1,
  name: "호진",
  home: "서울 금천구 ",
});

// ref와 react 비교
const refClick = () => {
  valueRef.value.id++;
  console.log("valueRef : ", valueRef.value.id);
  console.log("valueRef : ", valueRef.value.name);
  console.log("valueRef : ", valueRef.value.home);
};

const reactClick = () => {
  valueReact.id++;
  console.log("valueReact : ", valueReact.id);
  console.log("valueReact : ", valueReact.name);
  console.log("valueReact : ", valueReact.home);
};

// 마우스 위치 확인
const x = ref(0);
const y = ref(0);

function update(event) {
  x.value = event.pageX;
  y.value = event.pageY;
}

onMounted(() => window.addEventListener("mousemove", update));
onUnmounted(() => window.removeEventListener("mousemove", update));

// 마우스 위치에 따른 색상 번경
const backgroundStyle = computed(() => {
  const red = (x.value % 256).toString();
  const green = (y.value % 256).toString();
  const blue = ((x.value + y.value) % 256).toString();
  return {
    backgroundColor: `rgb(${red}, ${green}, ${blue})`,
    transition: "background-color 0.3s ease",
  };
});

const greeting = (userName) => {
  return "Hello " + userName.value;
};

const greet = greeting(name);
</script>

<style lang="scss" scoped></style>
