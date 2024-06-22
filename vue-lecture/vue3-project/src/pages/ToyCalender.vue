<template>
  <div class="toyCalenderWarrper">
    <div class="toyCalender-controls">
      <button class="control-btn" @click="prevMonth">
        <i class="fa-solid fa-chevron-left"></i>
      </button>
      <span>{{ currentYear }}년 {{ currentMonth + 1 }}월</span>
      <button class="control-btn" @click="nextMonth">
        <i class="fa-solid fa-chevron-right"></i>
      </button>
    </div>
    <div class="calender-grid">
      <div class="weekDays" v-for="(day, index) in weekDays" :key="index">
        {{ day }}
      </div>
      <div>여기에 달력~</div>
    </div>
    <div><button class="day-btn" @click="setToday">Day</button></div>
  </div>
</template>

<script setup>
import { computed, ref } from "vue";

const weekDays = ["일", "월", "화", "수", "목", "금", "토"];
// const daysGrid = computed(() => {
//   const year = currentYear.value;
//   const month = currentMonth.value;
//   const date = new Date(year, month, 1);
//   const days = [];

//   while (date.getMonth() === month) {
//     days.push({ date: new Date(date), isCurrentMonth: true });
//     date.setDate(date.getDate() + 1);
//   }

//   console.log(days);
//   return [...days];
// });

const prevMonth = () => {
  currentDate.value = new Date(currentYear.value, currentMonth.value - 1, 1);
};
const nextMonth = () => {
  currentDate.value = new Date(currentYear.value, currentMonth.value + 1, 1);
};
const setToday = () => {
  currentDate.value = new Date();
};

// 현재 날짜
const currentDate = ref(new Date());
const currentYear = computed(() => currentDate.value.getFullYear());
const currentMonth = computed(() => currentDate.value.getMonth());
</script>

<style scoped>
.toyCalenderWarrper {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  border: 1px solid red;
  height: 100%;
}
.toyCalender-controls {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 10px;
}
.calender-grid {
  display: grid;
  grid-template-columns: repeat(7, 1fr);
  text-align: center;
}
.weekDays {
  display: flex;
  border: 1px solid red;
}
.day-btn {
  display: flex;
  border: none;
  border-radius: 10px;
  color: green;
  background-color: lightgray;
  transition: background-color 0.04s ease-in;
}
.day-btn:active {
  background-color: rgb(229, 227, 227);
}
i {
  color: rgb(29, 180, 29);
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
