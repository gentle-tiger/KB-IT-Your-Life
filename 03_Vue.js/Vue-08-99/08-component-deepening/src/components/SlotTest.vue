<template>
  <div>
    <h3>당신이 경험한 프론트 엔드 기술은?(두번째:slot기본 )</h3>
    <!-- CheckBox2 컴포넌트를 사용할 경우 -->
    <CheckBox2 v-for="item in items" :key="item.id" :id="item.id" :checked="item.checked" @check-changed="CheckBoxChanged">
      <span v-if="item.checked" style="color: blue">
        <i>{{ item.label }}</i>
      </span>
      <span v-else style="color: gray">{{ item.label }}</span>
    </CheckBox2>
    <br />
    <!-- CheckBox_GPT 컴포넌트를 사용할 경우 -->
    <CheckBox_GPT v-for="item in items" :key="item.id" :id="item.id" :checked="item.checked" @check-changed="CheckBoxChanged">
      <span v-if="item.checked" style="color: blue">
        <i>{{ item.label }}</i>
      </span>
      <span v-else style="color: gray">{{ item.label }}</span>
    </CheckBox_GPT>
  </div>
</template>
<script>
import CheckBox2 from './CheckBox2.vue';
import CheckBox_GPT from './CheckBox_GPT.vue';
export default {
  name: 'SlotTest',
  components: { CheckBox2, CheckBox_GPT },
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
