<template>
  <div>
    <!-- slot에 name입력 -->
    <slot name="label"></slot>
    <input type="checkbox" :value="id" :checked="checked" @change="$emit('check-changed', { id, checked: $event.target.checked })" />
    <slot name="icon">Item</slot>
  </div>
</template>
<script>
export default {
  name: 'CheckBox3',
  props: ['id', 'checked'],
};
</script>
