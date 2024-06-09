<template>
  <div>msg: {{ mood }}</div>
</template>

<script setup>
import { ref, watch } from "vue";
import { useRoute } from "vue-router";

const currentRoute = useRoute();
const mood = ref(currentRoute.params.mood); // 현재 라우트의 mood 파라미터를 나타냄.

// watch를 통해 currentRoute.params.mood 의 값의 변경을 감지하여 업데이트.
// watch(() =>(),()=>()) / (감시할 대상의 변화를 감지,감시할 값이나 상태)
watch(
  // () => mood.value, // mood.value를 감시
  () => currentRoute.params.mood, // mood.value를 감시
  (newMood) => (
    (mood.value = newMood),
    console.log("mood :", mood.value),
    console.log("newMood :", newMood)
  )
);
</script>

<style scoped></style>
<!-- useRotue와 watch만을 사용하여 route 객체의 속성값이 변경될 때 업데이트 되도록 할 수 있다. -->
<!-- <template>
  <div>msg: {{ currentRoute.params.mood }}</div>
</template>

<script setup>
import { watch } from "vue";
import { useRoute } from "vue-router";

const currentRoute = useRoute();

// watch를 통해 currentRoute.params.mood의 값 변경을 감지하여 콘솔에 로그 출력
watch(
  () => currentRoute.params.mood,
  (newMood) => {
    console.log("new mood:", newMood);
  }
);
</script>

<style scoped></style> -->
