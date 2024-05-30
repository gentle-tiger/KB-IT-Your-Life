<template>
  <div>
    <input type="checkbox" :value="id" :checked="checked" @change="$emit('check-changed', { id, checked: $event.target.checked })" />
    <span v-if="checked === true" style="color: blue">
      <i>{{ label }}</i>
    </span>
    <span v-else style="color: gray">{{ label }}</span>
  </div>
</template>
<script>
export default {
  name: 'CheckBox1',
  props: ['id', 'checked', 'label'],
};
</script>
