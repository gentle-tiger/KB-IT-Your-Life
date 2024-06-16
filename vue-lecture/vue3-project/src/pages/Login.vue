<template>
  <div>로그인 페이지</div>
  <div>
    <nav>
      <router-link to="/login/home">home</router-link>
      <router-link to="/login/loginPage">loginPage</router-link>
      <router-link to="/login/loginTodo">loginTodo</router-link>
    </nav>
  </div>
  <router-view></router-view>
</template>

<script setup></script>

<style scoped>
a {
  padding: 5px;
  margin-right: 10px;
  background-color: lightgray;
  text-decoration: none;
  color: black;
  font-weight: 700;
  font-size: 24px !important;
}
</style>
