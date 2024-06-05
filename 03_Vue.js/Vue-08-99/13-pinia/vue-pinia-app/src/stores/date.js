import { ref } from 'vue';
import { defineStore } from 'pinia';

// defineStore(스토어명, 상태 및 메서드를 정의하는 함수)
export const useDateStore = defineStore('date', () => {
  const date = ref('');

  const now = new Date();
  function year() {
    date.value = `${now.getFullYear()}년 입니다.`;
  }
  function month() {
    date.value = `${now.getMonth() + 1}월 입니다`;
  }
  function today() {
    date.value = `${now.getDate()}일 입니다.`;
  }

  return { date, year, month, today }; // 객체 형태로 리턴
});
