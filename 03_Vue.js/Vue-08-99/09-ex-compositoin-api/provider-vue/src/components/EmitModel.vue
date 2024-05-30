<template>
  <div>
    <h1>{{ msg }}</h1>
    <EmitChild @sand-msg="emitHandler" />
  </div>
</template>

<script setup>
import { ref } from 'vue';

import EmitChild from './compo/EmitChild.vue';

const msg = ref('자식이 바꿀 메세지');

function emitHandler(value) {
  msg.value = value;
} // value, payload는 공용어
</script>

<style lang="scss" scoped></style>
