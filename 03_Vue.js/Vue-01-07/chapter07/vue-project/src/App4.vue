<template>
  <div>
    <InputName @nameChanged="nameChangedHandler" />
    <br />
    <h3>App 데이터 : {{ parentName }} App5</h3>
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
  methods: {
    nameChangedHandler(e) {
      this.parentName = e.name;
    },
  },
};
</script>
