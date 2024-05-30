<template>
  <div>
    <InputName @nameChanged="nameChangedHandler" />
    <br />
    <h3>App 데이터 : {{ parentName }} App4</h3>
  </div>
</template>
<script>
import InputName from './InputName.vue';
export default {
  name: 'App4',
  components: { InputName },
  data() {
    return {
      parentName: '',
    };
  },
  // input 컴포넌트에서 전달된 이벤트 객체 e를 받아서 그 안에 있는
  // name 속성 값을 사용하여 부모 컴포넌트의 parentName 데이터를 업데이트합니다.
  methods: {
    nameChangedHandler(e) {
      this.parentName = e.name;
    },
  },
};
</script>
