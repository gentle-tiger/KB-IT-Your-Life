<template>
  <div id="app">
    <VCalenderChild />
  </div>
</template>

<script>
import VCalenderChild from '@/pages/VCalenderChild.vue';

export default {
  name: 'App',
  components: {
    VCalenderChild,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.vc-container {
  width: 100% !important;
}
</style>
