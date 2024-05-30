<template>
  <div>
    <Child :drilling="drilling" />
  </div>
</template>

<script>
import Child from './compo/Child.vue';
export default {
  name: 'DrillModel',
  components: { Child },

  data() {
    return {
      drilling: '드릴링~ ',
    };
  },
  // 중간 컴포넌트를 거치지 않고 손자 컴포넌트에게 바로 보내기.
  provide() {
    return {
      flyDrilling: 'fly 드릴링',
    };
  },
  provide() {
    return {
      flyArr: [
        { name: '민지', team: 'NewJeans' },
        { name: '하니', team: 'NewJeans' },
        { name: '다니엘', team: 'NewJeans' },
        { name: '해린', team: 'NewJeans' },
        { name: '혜인', team: 'NewJeans' },
      ],
    };
  },
};
</script>

<style lang="scss" scoped></style>
