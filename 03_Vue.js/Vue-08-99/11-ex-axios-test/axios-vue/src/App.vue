<template>
  <div class="container">
    <nav>
      <router-link to="/">홈페이지</router-link>
      <router-link to="/login">로그인</router-link>
      <router-link to="/todo">투두</router-link>
    </nav>
    <router-view></router-view>
  </div>
</template>
<script setup></script>

<style scoped>
.container {
  border: 1px solid red;
  height: 200px;
  background-color: gray;
  font-size: 50px;
}
nav {
  display: flex;
  gap: 10px;
}
</style>
