<script setup>
import ParentFancyPhotoBox from './components/ParentFancyPhotoBox.vue';
import ParentScopedSlot from './components/ParentScopedSlot.vue';
</script>

<template>
  <!-- <ParentFancyPhotoBox /> -->
  <ParentScopedSlot />
</template>
<script>
ParentFancyPhotoBox, ParentScopedSlot;
export default {
  name: 'App',
};
</script>
<style scoped></style>
