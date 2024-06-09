<script setup>
//  2024.05.30 오후 강의
import DrillModel from "./components/DrillModel.vue";
import EmitModel from "./components/EmitModel.vue";
import ParentPropsModel from "./components/ParentPropsModel.vue";
import RefModel from "./components/RefModel.vue";
import imgModal from "./components/imgModal.vue";
</script>

<template>
  <DrillModel />
  <RefModel />
  <EmitModel />
  <ParentPropsModel />
  <!-- <imgModal /> -->
</template>

<script>
export default {
  name: "App",
  components: { DrillModel, RefModel, EmitModel, ParentPropsModel, imgModal },
};
</script>
<style scoped></style>
