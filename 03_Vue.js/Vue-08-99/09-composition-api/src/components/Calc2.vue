<template>
  <div>
    X : <input type="text" v-model.number="x" />
    <br />
    Y : <input type="text" v-model.number="y" />
    <br />
    <button @click="calcAdd">계산</button><br />
    <div>결과 : {{ result }}</div>
  </div>
</template>
<script>
import { ref } from 'vue';
export default {
  name: 'Calc2',
  setup() {
    // 외부함수
    const x = ref(10);
    const y = ref(20);
    const result = ref(30);

    // 여기가 중요
    // let을 사용하면 vue 의 반응형 시스템과 제대로 연동되지 않는다.
    const calcAdd = () => {
      // 내부함수
      result.value = x.value + y.value;
    };
    return { x, y, result, calcAdd }; // 참조형. 실체는 메모리를 할당하고 있으며, 해당 메모리를 참조해서 어디가에서 사용하면 해당 메모리를 불러온다. 즉 가비지 데이터가 아니라는 것임.
  },
};
</script>
<!-- setup()호출하면 scope 범위가 생성되고 해당 범위에 x,y, result calcAdd가 들어간다. 해당 데이터를 사용하게 되면 ,ref 등의 객체가 새로 만들어지면서 scope 범위에 있는 값이 해당 ref 등의 객체로 전달되는 것.즉 참조. -->
