<template>
  <div class="vCalendarWarpper">
    <VCalendarChild />
  </div>
</template>

<script setup>
import VCalendarChild from "@/pages/VCalendarChild.vue";
</script>

<style>
.vCalendarWarpper {
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
