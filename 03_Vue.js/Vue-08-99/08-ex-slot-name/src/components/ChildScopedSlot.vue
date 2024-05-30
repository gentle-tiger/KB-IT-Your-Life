<template>
  <div>
    <!-- 주는 입장 -->
    <slot v-bind:msg="message"></slot>
  </div>
</template>

<script>
export default {
  name: 'ChildScopedSlot',
  data() {
    return {
      message: '과연 나는 어떤 태그에 들어갈까?',
    };
  },
};
</script>

<style lang="scss" scoped></style>
