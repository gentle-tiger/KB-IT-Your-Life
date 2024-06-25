<template>
  <div class="cal">
    <Calendar2 />
  </div>
</template>

<script>
import Calendar2 from "./components/Calendar2.vue";

export default {
  name: "App",
  components: {
    Calendar2,
  },
};
</script>

<style>
.cal {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
