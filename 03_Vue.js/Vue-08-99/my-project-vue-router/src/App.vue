<script setup>
import { useRoute } from 'vue-router';
import Header from './components/Header.vue';
const route = useRoute();
</script>

<template>
  <div>
    <Header></Header>
    <p>현재 페이지: {{ route.meta.title }}</p>
    <RouterView></RouterView>
  </div>
</template>
