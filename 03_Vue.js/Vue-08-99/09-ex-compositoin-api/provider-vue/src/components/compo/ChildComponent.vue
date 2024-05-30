<template>
  <div>
    <h1>{{ number }}</h1>
    <input type="text" v-model.number="inputNum" />
    <button @click="inputAnswer">정답 확인</button>
  </div>
</template>

<!-- click 되면 inputAnswer 메서드가 실행되고, 조건에 맞으면 emit로 이벤트명을 직접 설정해서 첫 번쨰 매개변수로 보낸다. 이때 이벤트명은 부모 컴포넌트의 이벤트 명과 동일해야하며,  defineEmits로 정의한 문자(defineEmits(['input_answer'])와 동일해야 한다.  -->

<script setup>
import { ref, defineProps, defineEmits } from 'vue';

const inputNum = ref(0);

// 부모로 보낼 데이터
const emit = defineEmits(['input_answer']); //  emit 여기에서 맞아야 함.

// 부모로부터 받은 값 받기 ( defineProps )
const props = defineProps({
  number: {
    type: Number,
    required: true, // 필수로 와야할 때
  },
});

function inputAnswer() {
  let msg = '';
  // number는 부모로부터 받은 것이기 때문에 props를 써야 한다.
  if (props.number === inputNum.value) {
    msg = '정답!!!!';
  } else if (props.number > inputNum.value) {
    msg = '작다~~ ';
  } else {
    msg = '크다~~ ';
  }
  console.log(msg);
  emit('input_answer', msg); //  emit 여기에서 맞아야 함.
}
</script>

<style lang="scss" scoped></style>

<!-- if (number.value === input) {
      emit('input-quiz', input);
      console.log('true')
      input = '';
    } else if {
      console.log('false')

  } -->
