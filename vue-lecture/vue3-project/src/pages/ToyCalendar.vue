<template>
  <div class="toyCalendarWarrper">
    <div class="toyCalendar-controls">
      <button class="control-btn" @click="prevMonth">
        <i class="fa-solid fa-chevron-left"></i>
      </button>
      <span>{{ currentYear }}년 {{ currentMonth + 1 }}월</span>
      <button class="control-btn" @click="nextMonth">
        <i class="fa-solid fa-chevron-right"></i>
      </button>
    </div>
    <!-- week -->
    <div class="calendar-grid">
      <div class="weekDays" v-for="(day, index) in weekDays" :key="index">
        {{ day }}
      </div>
      <!-- days -->
      <div class="calendar-days" v-for="day in calendarDays" :key="day.date">
        <div class="day-selected">
          {{ day.date.getDate() }}
        </div>
      </div>
    </div>
    <div><button class="day-btn" @click="setToday">Day</button></div>
  </div>
</template>

<script setup>
import { computed, ref } from "vue";

// 현재 날짜
const currentDate = ref(new Date());
const currentYear = computed(() => currentDate.value.getFullYear());
const currentMonth = computed(() => currentDate.value.getMonth());

const weekDays = ["일", "월", "화", "수", "목", "금", "토"];

// 이걸 잘 모르겠음.

// 달력에 표시할 날짜들을 계산하는 함수
const calendarDays = computed(() => {
  const days = []; // 날짜를 저장할 배열
  const year = currentYear.value; // 현재 연도 ( 2024 )
  const month = currentMonth.value; // 현재 월 ( 5 )( 0부터 시작, ex: 0은 1월 )
  // console.log("days :", days);
  // console.log("year : ", year);
  // console.log("month : ", month);

  // 현재 월의 시작 날짜와 요일을 계산
  const startDate = new Date(year, month, 1); // ( Sat Jun 01 2024 00:00:00 GMT+0900 (한국 표준시) , ex: 2024년 1월 1일 )
  const startDay = startDate.getDay(); // 6 ( 6월의 시작일이 토요일 , 예: startDate가 월요일이면 startDay는 1)

  // 현재 월의 끝 날짜를 계산
  const endDate = new Date(year, month + 1, 0); // Sun Jun 30 2024 00:00:00 GMT+0900 (한국 표준시)
  const totalDays = endDate.getDate(); // 현재 달의 마지막 달

  // 이전 달의 날짜들을 계산하여 추가
  for (let i = startDay - 1; i >= 0; i--) {
    const prevDate = new Date(year, month, -i); // 현재 월의 첫 요일 기준으로 이전 날짜 계산
    days.push({ date: prevDate, isCurrentMonth: false }); // 이전 달의 날짜 추가
    // console.log("prevDate :", prevDate);
    // 사용 예시
    //   console.log("endDate : ", new Date(year, month + 1, -5));
    // console.log("endDate : ", new Date(year, month + 1, -4));
    // console.log("endDate : ", new Date(year, month + 1, -3));
    // console.log("endDate : ", new Date(year, month + 1, -2));
    // console.log("endDate : ", new Date(year, month + 1, -1));
  }

  // 현재 달의 날짜들을 추가 1~마지막날까지
  for (let i = 1; i <= totalDays; i++) {
    const currentDate = new Date(year, month, i); // 현재 달의 날짜 생성
    days.push({ date: currentDate, isCurrentMonth: false }); // 현재 달의 날짜 추가
    // console.log("currentDate :", currentDate);
  }

  // 다음 달의 날짜들을 계산하여 추가
  const remainingDays = 42 - days.length; // 달력 그리드를 6주(42일)로 맞추기 위해 남은 날짜 계산
  for (let i = 1; i <= remainingDays; i++) {
    const nextDate = new Date(year, month + 1, i); // 다음 달의 날짜 생성
    days.push({ date: nextDate, isCurrentMonth: false }); // 다음 달의 날짜 추가
    // console.log("nextDate :", nextDate);
    // 사용 예시
    //   console.log("endDate : ", new Date(year, month + 2, 1));
    // console.log("endDate : ", new Date(year, month + 2, 2));
    // console.log("endDate : ", new Date(year, month + 2, 3));
  }

  return days;
});
const prevMonth = () => {
  currentDate.value = new Date(currentYear.value, currentMonth.value - 1, 1);
};
const nextMonth = () => {
  currentDate.value = new Date(currentYear.value, currentMonth.value + 1, 1);
};
const setToday = () => {
  currentDate.value = new Date();
};
</script>

<style scoped>
.toyCalendarWarrper {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  height: 100%;
}
.toyCalendar-controls {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 10px;
}
.calendar-grid {
  display: grid;
  grid-template-columns: repeat(7, 1fr);
  text-align: center;
}
.calendar-days {
  border: 1px dotted gray;
  padding: 10px;
}
.weekDays {
  color: #56b984;
  font-weight: bold;
}
.day-selected {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 24px;
  height: 24px;
  border-radius: 50%;
}
.day-selected:hover {
  background-color: #56b984;
  outline: rgb(23, 128, 23);
  box-shadow: 0 0 5px 1px var(--green); /* 하이라이트 효과 추가 */
}

.day-btn {
  display: flex;
  border: none;
  border-radius: 10px;
  color: #56b984;
  margin-top: 10px;
  background-color: rgb(241, 238, 238);
  transition: background-color 0.04s ease-in;
}
.day-btn:active {
  background-color: rgb(229, 227, 227);
}
i {
  color: #56b984;
  transition: color 0.12s ease-in;
}
i:active {
  color: rgb(126, 226, 126);
}

.control-btn {
  border: none;
  background-color: white;
}
.fa-solid {
  font-weight: bold;
}
</style>
