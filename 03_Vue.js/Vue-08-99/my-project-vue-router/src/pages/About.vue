<template>
  <div>
    <h2>About</h2>
    <router-link to="/reactive">Reactive</router-link>
    <router-view></router-view>
  </div>
</template>

<script setup>
import { defineProps } from 'vue';
import { useRoute } from 'vue-router';
const props = defineProps({
  title: String,
});
const currentRoute = useRoute();
console.log('currentRoute :', currentRoute);
</script>

<style scoped></style>
