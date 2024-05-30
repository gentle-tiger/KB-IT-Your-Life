<script setup>
import ColorEmit from './components/ColorEmit.vue';
</script>
<template>
  <div :style="{ backgroundColor: color }">
    <h1>저의 색상을 정해주세요!!</h1>
    <ColorEmit @colorChangeBtn="colorChange" />
  </div>
</template>

<script>
export default {
  name: 'App',
  components: { ColorEmit },
  data() {
    return {
      color: '',
    };
  },
  methods: {
    colorChange(e) {
      this.color = e.color;
    },
  },
};
</script>

<style lang="scss" scoped></style>
