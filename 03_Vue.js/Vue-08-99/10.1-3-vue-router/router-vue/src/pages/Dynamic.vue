<template>
  <div>
    <h1>오늘의 기분은 {{ msg }}</h1>
    <!-- <img :src="imgSrc" :alt="msg" /> -->
  </div>
</template>

<script setup>
import { ref, computed, watch } from 'vue';
import { useRoute } from 'vue-router';

const currentRoute = useRoute();
// mood는 큰 객체로 사용됨
const mood = ref(currentRoute.params.mood);

// 두 개의 인자를 받음 / 자주 쓰이는 구조 /
watch(
  () => currentRoute.params.mood,
  (newMood) => ((mood.value = newMood), console.log(newMood))
);

const msg = computed(() => (mood.value === 'happy' ? '행복합니다' : '신납니다.'));

// const imgSrc = computed(() => (mood.value === 'happy' ? '이미지 사진1' : '이미지 사진1'));
</script>

<style scoped></style>
