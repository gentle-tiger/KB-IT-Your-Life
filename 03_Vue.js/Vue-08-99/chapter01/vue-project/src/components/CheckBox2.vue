<template>
  <div>
    <input type="checkbox" :value="id" :checked="checked" @change="$emit('check-changed', { id, checked: $event.target.checked })" />
    <!-- Item이라는 택스트는 기본 슬롯 콘텐츠로써 실제로 렌더링되지 않음. 비워도 됨. -->
    <slot>Item</slot>
  </div>
</template>
<script>
export default {
  name: 'CheckBox2',
  props: ['id', 'checked'],
};
</script>
