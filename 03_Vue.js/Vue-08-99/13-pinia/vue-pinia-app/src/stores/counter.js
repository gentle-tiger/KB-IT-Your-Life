import { ref, computed } from 'vue';
import { defineStore } from 'pinia'; // Pinia에서 store를 정의할 때 사용하는 함수. store는 전역 상태를 관리하는 컨테이너 역할을 한다.

// defineStore(스토어명, 상태 및 메서드를 정의하는 함수)
// counter는 스토어의 이름으로 다른 곳에서 이 스토어를 참조한다.
//
export const useCounterStore = defineStore('counter', () => {
  const count = ref(0);
  const doubleCount = computed(() => count.value * 2);
  function increment() {
    count.value++;
  }

  // return을 통해 전역에서 사용할 수 있도록 한다.
  // 해당 값은 컴포넌트에서 사용할 시 바로 사용할 수 없고, ...

  // 원시형 값의 경우 컴포넌트에서 변경할 수 없도록 readonly로 보낸다.
  // 그래서 받을 때에 const { count, doubleCount, increment } = useCounterStore(); 이러한 식으로 받게 되면 해당 값이 반응형으로 되지 않도록 하였다.

  return { count, doubleCount, increment }; // 객체 형태로 리턴
});
