<template>
  <div class="container">
    <v-calendar v-model="selectedDate" is-expanded :attributes="attrs" @dayclick="handleDayClick" />
  </div>
</template>

<script>
export default {
  data() {
    return {
      selectedDate: new Date(),
      days: this.generateDays(),
    };
  },
  computed: {
    attrs() {
      return this.days.map((day) => ({
        key: day.date,
        highlight: {
          contentStyle: {
            backgroundColor: day.income > 0 ? 'lightgreen' : day.expense > 0 ? 'lightcoral' : '',
          },
          popover: {
            label: `Income: ${day.income}, Expense: ${day.expense}`,
          },
        },
      }));
    },
  },
  methods: {
    generateDays() {
      const days = [];
      const currentDate = new Date();
      const year = currentDate.getFullYear();
      const month = currentDate.getMonth();
      const daysInMonth = new Date(year, month + 1, 0).getDate();
      for (let i = 1; i <= daysInMonth; i++) {
        days.push({
          date: new Date(year, month, i).toISOString().split('T')[0],
          income: 0,
          expense: 0,
        });
      }
      return days;
    },
    handleDayClick(day) {
      const selectedDay = this.days.find((d) => d.date === day.date);
      const type = prompt('Enter "income" or "expense":').toLowerCase();
      if (type === 'income' || type === 'expense') {
        const amount = parseFloat(prompt(`Enter ${type} amount:`));
        if (!isNaN(amount)) {
          selectedDay[type] += amount;
        }
      } else {
        alert('Invalid type. Please enter either "income" or "expense".');
      }
    },
  },
};
</script>

<style scoped>
.container {
  max-width: 1200px;
  margin: 0 auto;
  padding: 20px;
}
</style>
