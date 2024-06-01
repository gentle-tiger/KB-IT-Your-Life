<template>
  <div>
    <h2>Header</h2>
    <router-link :to="{ name: 'home' }">Home</router-link>
    <router-link :to="{ name: 'about' }">About</router-link>
    <router-link :to="{ name: 'memberInfo' }">MemberInfo</router-link>
    <!-- About 컴포넌트가 없는 경우 주석 처리 -->

    <!-- 동적 라우팅 (div 태그에서 for문) -->
    <!-- <router-link :to="'/members/' + m.id"> -->
  </div>
</template>

<script setup></script>

<style scoped></style>
