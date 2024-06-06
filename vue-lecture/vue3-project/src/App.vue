<template>
  <div>
    <h1>Components Assets</h1>
    <nav class="componentsAssets">
      <router-link to="/home">Home</router-link>
      <router-link to="/home">Home</router-link>
      <router-link to="/home">Home</router-link>
      <router-link to="/home">Home</router-link>
      <router-link to="/home">Home</router-link>
      <router-link to="/home">Home</router-link>
      <router-link to="/home">Home</router-link>
    </nav>
    <router-view></router-view>

    <ErrorMsg />
    <CharJs />
    <MyEvent />
    <GlobalStyle />
    <LocalStyle />
    <CombinedStyle />
    <Reactive />
  </div>
</template>

<script setup>
import CharJs from "./components/CharJs.vue";
import CombinedStyle from "./components/CombinedStyle.vue";
import GlobalStyle from "./components/GlobalStyle.vue";
import LocalStyle from "./components/LocalStyle.vue";
import MyEvent from "./components/MyEvent.vue";
import ErrorMsg from "./components/ErrorMsg.vue";
import Reactive from "./components/Reactive.vue";
</script>

<style>
button {
  display: inline-flex;
  gap: 10px;
  font-size: 20px;
  margin-left: 10px;
  padding: 10px;
}
.componentsAssets {
  display: flex;
  gap: 10px;
  font-size: 30px !important;
}
</style>
