<template>
  <div>
    <h1>{{ answerMsg }}</h1>
    <!-- number는 부모 -> 자식으로 보내는 데이터 
         ipnut_answer는 자식 컴포넌트에서 받는 emit 이벤트 명으로 받게 되면 
         changeMsg가 실행되고, answerMsg.value의 값이 input_answer의 두 번째 매개변수로 받은 msg의 값으로 할당되어 화면의 출력되는 메세지가 바뀐다. 
    -->
    <ChildComponent :number="number" @input_answer="changeMsg" />
  </div>
</template>

<script setup>
import { ref } from 'vue';
import ChildComponent from './compo/ChildComponent.vue';

// 랜덤 숫자
const number = ref(Math.floor(Math.random() * 21));

// 메세지 출력
const answerMsg = ref('랜덤한 숫자 맞추기');

// 메세지 변경 (매개변수(payload)로 msg가 온다. )
function changeMsg(payload) {
  console.log(payload);
  answerMsg.value = payload;
}
</script>

<style lang="scss" scoped></style>
