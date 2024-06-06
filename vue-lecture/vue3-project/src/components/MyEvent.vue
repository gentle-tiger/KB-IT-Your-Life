<template>
  <div>
    <h1>hello MyEvent</h1>
    <h1>{{ count }}</h1>
    <button v-on:click="count++">ref Increment</button>
    <hr />
    <h1>{{ count1.count }}</h1>
    <button v-on:click="count1.count++">reactive Increment</button>
  </div>
</template>

<script setup>
import { reactive, ref } from 'vue'

const count = ref(0) // 가능
const count1 = reactive({ count: 0 }) // 객체일 때 사용 가능
</script>

<style scoped></style>
