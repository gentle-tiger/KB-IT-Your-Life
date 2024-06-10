<template>
  <div class="vCalenderWarpper">
    <VCalenderChild />
  </div>
</template>

<script setup>
import VCalenderChild from "@/pages/VCalenderChild.vue";
</script>

<style>
.vCalenderWarpper {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

.vc-container {
  width: 80% !important;
}
</style>
