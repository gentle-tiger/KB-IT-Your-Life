<template>
  <div>
    <div v-if="error">앗! 에러 발생: {{ error.message }}</div>
    <div v-else-if="data">
      로드된 데이터:
      <div>data : {{ data }}</div>
    </div>
    <div v-else>로딩...</div>
  </div>
</template>

<script setup>
//  비동기 상태 예제
import { useFetch } from "../fetch";

const { data, error } = useFetch("...");

fetch("...")
  .then((res) => res.json())
  .then((json) => (data.value = json))
  .catch((err) => (error.value = err));
</script>

<style lang="scss" scoped></style>
