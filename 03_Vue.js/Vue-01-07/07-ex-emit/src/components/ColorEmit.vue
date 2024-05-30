<template>
  <div><input type="text" v-model.trim="color" @input="emitColorChange" /></div>
</template>

<script>
export default {
  name: 'ColorEmit',
  data() {
    return {
      color: '',
    };
  },
  methods: {
    emitColorChange() {
      console.log(this.color);
      this.$emit('colorChangeBtn', { color: this.color });
    },
  },
};
</script>

<style lang="scss" scoped></style>
