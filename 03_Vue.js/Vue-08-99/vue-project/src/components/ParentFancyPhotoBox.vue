<template>
  <div>
    <FancyPhotoBox>
      <template v-slot:title>
        <h1>펭귄</h1>
      </template>
      <template #img>
        <img src="./img.jpg" alt="" />
      </template>
    </FancyPhotoBox>
  </div>
</template>

<script>
import FancyPhotoBox from './FancyPhotoBox.vue';
export default {
  name: 'ParentFancyPhotoBox',
  components: { FancyPhotoBox },
};
</script>

<style lang="scss" scoped></style>
