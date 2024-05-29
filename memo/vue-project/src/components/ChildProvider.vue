<template>
  <p>{{ message }}</p>
</template>

<script>
export default {
  name: "ChildProvider",
  inject: ["message"], //-------------------------- 핵심
};
</script>

<style lang="scss" scoped></style>
