<template>
  <div>
    <h3>props로 받아온 : {{ drilling }}</h3>
    <h3>inject로 받아온 : {{ flyDrilling }}</h3>
    <ul v-for="item in flyArr">
      {{
        item.name
      }}
      {{
        item.team
      }}
    </ul>
  </div>
</template>

<script>
export default {
  name: 'GrandChild',
  props: ['drilling'],

  inject: ['flyDrilling', 'flyArr'],
};
</script>

<style lang="scss" scoped></style>
