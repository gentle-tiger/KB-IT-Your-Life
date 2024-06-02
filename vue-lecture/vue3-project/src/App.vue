<template>
  <div>
    <h1 style="font-size: 70px">{{ name }}</h1>
    <h1 style="font-size: 70px">{{ greet }}</h1>
    <h1 style="font-size: 70px">valueReact : {{ valueReact }}</h1>
    <h1 style="font-size: 70px">valueRef : {{ valueRef }}</h1>
    <!-- <button style="font-size: 40px" v-on:click="updataName">Click</button> -->
    <button v-on:click="reactClick">valueReact</button>
    <button v-on:click="refClick">valueRef</button>
  </div>
</template>

<script>
import { reactive, ref } from "vue";

export default {
  setup() {
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

    const reactClick = () => {
      valueReact.id++;
      console.log("valueReact : ", valueReact.id);
      console.log("valueReact : ", valueReact.name);
      console.log("valueReact : ", valueReact.home);
    };
    const refClick = () => {
      valueRef.value.id++;
      console.log("valueRef : ", valueRef.value.id);
      console.log("valueRef : ", valueRef.value.name);
      console.log("valueRef : ", valueRef.value.home);
    };
    const greeting = (userName) => {
      return "Hello " + userName.value;
    };

    const greet = greeting(name);

    const updataName = () => {
      name.value = "Gentle Tiger~~";
    };

    return {
      name,
      valueReact,
      valueRef,
      greet,
      updataName,
      reactClick,
      refClick,
    };
  },
};
</script>

<style>
button {
  display: inline-flex;
  gap: 10px;
  font-size: 50px;
  margin-left: 30px;
  padding: 10px;
}
</style>
