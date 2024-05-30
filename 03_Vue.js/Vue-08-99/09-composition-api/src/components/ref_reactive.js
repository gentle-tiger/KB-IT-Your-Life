// ref 사용
// 기본(원시)값, 단일 데이터
import { ref } from 'vue';

const count = ref(0);

function increment() {
  count.value++;
}

// reactive 사용
// 참조값, 중복 데이터
import { reactive } from 'vue';

const state = reactive({
  count: 0,
  nested: {
    value: 42,
  },
});

function increment() {
  state.count++;
  state.nested.value++;
}
