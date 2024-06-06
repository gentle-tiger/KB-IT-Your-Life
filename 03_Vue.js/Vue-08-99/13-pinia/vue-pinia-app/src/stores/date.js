import { defineStore } from "pinia";
import { ref } from "vue";

// defineStore(스토어명, 상태 및 메서드를 정의하는 함수)
export const useDateStore = defineStore("date", () => {
  const date = ref("");
  const now = new Date();
  function year() {
    const now = new Date();

    date.value = `${now.getFullYear()}년 입니다.`;
    console.log(date.value);
  }
  function month() {
    date.value = `${now.getMonth() + 1}월 입니다`;
  }
  function today() {
    date.value = `${now.getDate()}일 입니다.`;
  }

  return { date, year, month, today }; // 객체 형태로 리턴
});
