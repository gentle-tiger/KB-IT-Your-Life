<template>
  <div>
    <!-- 자식이 올려보낸 코드. 이름이 있는 slot이라면 해당 이름을 default로 작성 
    fromChild는 객체형태를 받는 것이다.  -->
    <ChildScopedSlot v-slot:default="fromChild">
      <h1>{{ fromChild.msg }}</h1>
    </ChildScopedSlot>
  </div>
</template>

<script>
import ChildScopedSlot from './ChildScopedSlot.vue';

ChildScopedSlot;
export default {
  name: 'ParentScopedSlot',
  components: { ChildScopedSlot },
  data() {
    return {};
  },
};
</script>

<style lang="scss" scoped></style>
