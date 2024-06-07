<template>
  <div>
    <h1>데이터 가져오기</h1>
    <form @submit.prevent="fetchData">
      <div>
        <button @click="setPeriod('daily')">일별</button>
        <button @click="setPeriod('weekly')">주간별</button>
        <button @click="setPeriod('monthly')">월별</button>
      </div>
    </form>
    <div v-if="data">
      <h2>{{ period }} 데이터</h2>
      <ul>
        <li v-for="(item, index) in dummyData" :key="index">{{ item }}</li>
      </ul>
    </div>
  </div>
</template>

<script setup>
import { ref, reactive } from 'vue';

const period = ref('');
const data = ref(null);

const setPeriod = (selectedPeriod) => {
  period.value = selectedPeriod;
};
const dummyData = reactive({
  daily: ['지출', '식비(계절밥상)', '국민은행', '20,000원'],
  weekly: ['지출', '월세(김국자)', '신한은행', '300,000원'],
  monthly: ['수입', '급여(멀티캠퍼스)', '카카오뱅크', '2,000,000원'],
});
const fetchData = async () => {
  if (!period.value) return;

  //   여기서 데이터 가져오기 로직을 구현
  //   예를 들어, API 호출을 통해 데이터를 가져올 수 있습니다.
  //   현재 예시에서는 임의의 데이터를 사용합니다.

  data.value = dummyData[period.value];
};
</script>

<style scoped>
button {
  margin-right: 10px;
  padding: 10px;
  font-size: 16px;
}
</style>
