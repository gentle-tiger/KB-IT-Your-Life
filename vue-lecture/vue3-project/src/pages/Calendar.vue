<template>
  <div class="container">
    <div class="row">
      <div class="col border p-3 m-1 text-center" v-for="(day, index) in days" :key="index">
        <div>{{ day.date }}</div>
        <div>Income: {{ day.income }}</div>
        <div>Expense: {{ day.expense }}</div>
        <button class="btn btn-primary btn-sm mt-2" @click="addTransaction(day, 'income')">Add Income</button>
        <button class="btn btn-danger btn-sm mt-2" @click="addTransaction(day, 'expense')">Add Expense</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      days: this.generateDays(),
    };
  },
  methods: {
    generateDays() {
      const days = [];
      for (let i = 1; i <= 30; i++) {
        days.push({
          date: `2024-06-${i.toString().padStart(2, '0')}`,
          income: 0,
          expense: 0,
        });
      }
      return days;
    },
    addTransaction(day, type) {
      const amount = prompt(`Enter ${type} amount:`);
      if (amount) {
        if (type === 'income') {
          day.income += parseFloat(amount);
        } else if (type === 'expense') {
          day.expense += parseFloat(amount);
        }
      }
    },
  },
};
</script>

<style scoped>
.container {
  max-width: 1200px;
  margin: 0 auto;
}
.row {
  display: flex;
  flex-wrap: wrap;
}
.col {
  flex: 0 0 30%;
  box-sizing: border-box;
}
</style>
