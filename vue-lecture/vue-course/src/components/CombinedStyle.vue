<template>
  <div>
    <h2 :class="$style['g-1']">Another Global Style</h2>
    <h2 :class="$style['h-1']">Another Local Style</h2>
    <h2 :class="$style[dynamicClass]">Dynamic Style</h2>
    <button @click="change">change</button>
  </div>
</template>

<script setup>
import { ref } from 'vue'

const state = ref(true)

// const dynamicClass = computed(() => {
//   return state.value ? 'g-1' : 'h-1'
// })
function dynamicClass() {
  return state.value ? 'g-1' : 'h-1'
}
const change = () => {
  state.value = !state.value
}
</script>

<style module>
/* kabab-case */
.g-1 {
  background-color: rgba(214, 69, 224, 0.756);
  color: white;
  transition: all 1s;
}
.h-1 {
  background-color: rgba(137, 238, 42, 0.922);
  color: white;
  transition: all 1s;
}
</style>
