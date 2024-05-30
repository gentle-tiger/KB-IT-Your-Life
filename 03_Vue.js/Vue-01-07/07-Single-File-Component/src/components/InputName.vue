<template>
  <div style="border: solid 1x gray; padding: 5px">
    이름: <input type="text" v-model="name" />
    <!-- 자식 -> 부모 (이벤트 전달 emit) -->
    <!-- emit('이벤트명',전달할 데이터 ) -->
    <button @click="$emit('nameChanged', { name })">이벤트 발신</button>
  </div>
</template>
<script>
export default {
  name: 'InputName',
  data() {
    return { name: '' };
  },
};
</script>
