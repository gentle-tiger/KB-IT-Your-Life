<template>
  <div>로그인 페이지</div>
  <router-link to="/login/home">login-home</router-link>
  <!-- <router-view></router-view> -->
  <Home />
</template>

<script setup>
import useLoginStore from "@/store/login.js";
import { computed } from "vue";
import Home from "./Login/Home.vue";
const loginStore = useLoginStore;
const hello = computed(() => loginStore.hello);
</script>

<style lang="scss" scoped></style>
\
