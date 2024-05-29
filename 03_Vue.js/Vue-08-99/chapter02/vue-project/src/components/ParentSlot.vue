<template>
  <div>
    <ChildSlot>
      <h1>테스트</h1>
      <img src="./imgs.jpg" alt="" />
    </ChildSlot>
  </div>
</template>

<script>
import ChildSlot from './ChildSlot.vue';
export default {
  name: 'ParentSlot',
  components: { ChildSlot },
};
</script>

<style lang="scss" scoped></style>
