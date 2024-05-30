<script setup>
import { ref } from "vue";
const products = ref(["금천구", "중랑구", "도봉구"]);
</script>

<template>
  <div>
    <div>
      <h4>{{ products[0] }} 원룬</h4>
      <p>50만원</p>
    </div>
    <div>
      <h4>{{ products[1] }} 원룬</h4>
      <p>50만원</p>
    </div>
    <div>
      <h4>{{ products[2] }} 원룬</h4>
      <p>50만원</p>
    </div>
  </div>
</template>

<script></script>
