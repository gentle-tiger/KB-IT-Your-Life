<template>
  <div>
    <slot name="title"></slot>
    <slot id="img" name="img"></slot>
  </div>
</template>

<script>
export default {
  name: 'FancyPhotoBox',
};
</script>

<style scoped>
#img {
  border-radius: 20px;
  width: 100px;
  height: 200px;
}
</style>
