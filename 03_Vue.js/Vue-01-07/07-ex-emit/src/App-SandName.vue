<template>
  <div>
    <h1>너의 이름은{{ name }}</h1>
    <!-- nameChange 가 자식 컴포넌트에서 올라오면 nameChangeHandler 가 실행딘다, ㅁ -->
    <SandNameComponent v-on:nameChange="nameChangeHandler" />
  </div>
</template>

<script>
import SandNameComponent from './components/SandNameComponent.vue';

export default {
  name: 'App',
  components: { SandNameComponent },
  data() {
    return {
      name: 'a',
    };
  },
  methods: {
    // 여기서 e는 객체이다.
    nameChangeHandler(e) {
      this.name = e.name;
    },
  },
};
</script>

<style lang="scss" scoped></style>
