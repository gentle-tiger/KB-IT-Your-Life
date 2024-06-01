<script setup></script>

<template>
  <div>
    <nav>
      <router-link to="/">Home</router-link>
      &nbsp;
      <router-link to="/about">About</router-link>
    </nav>
    <!--  동적 컴포넌트와 유사하게 작동한다.  해당 router-view에 따라 화면의 출력 위치가 달라진다. -->
  </div>
  <router-view></router-view>
  <RouterView />
  <RouterView />
  <RouterView />
  <RouterView />
  <RouterView />
  <RouterView />
  <RouterView />
  <RouterView />
  <RouterView />
  <RouterView />
</template>

<style scoped>
nav {
  display: flex;
  flex-direction: column;
  font-size: 40px;
  font-weight: bold;
  color: blue;
}
nav > img {
  width: 30px;
  height: 30px;
}
</style>
