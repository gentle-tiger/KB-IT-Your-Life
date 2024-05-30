<template>
  <div>
    <h3>당신이 경험한 프론트 엔드 기술은?(네번째:ScopedSlot)</h3>
    <CheckBoxList :items="items" @check-changed="CheckBoxChanged">
      <!-- icon 슬롯 -->
      <template v-slot:icon="{ checked }">
        <i :class="checked ? 'far fa-grin-beam' : 'far fa-frown'"></i>
      </template>
      <!-- default 슬롯 -->
      <template v-slot:default="{ checked, label }">
        <span :style="{ color: checked ? 'blue' : 'gray', 'text-decoration': checked ? 'underline' : 'none' }">
          <i>{{ label }}</i>
        </span>
      </template>
    </CheckBoxList>
  </div>
</template>

<script>
import CheckBoxList from './CheckBoxList.vue';

export default {
  name: 'ScopedSlotTest',
  components: { CheckBoxList },
  data() {
    return {
      items: [
        { id: 'V', checked: true, label: 'Vue' },
        { id: 'A', checked: false, label: 'Angular' },
        { id: 'R', checked: false, label: 'React' },
        { id: 'S', checked: false, label: 'Svelte' },
      ],
    };
  },
  methods: {
    CheckBoxChanged(e) {
      let item = this.items.find((item) => item.id === e.id);
      item.checked = e.checked;
    },
  },
};
</script>

<style>
/* 아이콘 스타일을 위한 CSS */
@import url('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css');
</style>
