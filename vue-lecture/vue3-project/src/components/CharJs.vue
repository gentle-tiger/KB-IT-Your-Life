<template>
  <div>
    <h1>가계부</h1>
    <canvas id="myChart"></canvas>
    <div>
      <label for="income">수입: </label>
      <input type="number" id="income" v-model.number="income" />
    </div>
    <div>
      <label for="expense">지출: </label>
      <input type="number" id="expense" v-model.number="expense" />
    </div>
  </div>
</template>

<script setup>
import Chart from 'chart.js/auto'
import { onMounted, ref, watch } from 'vue'

const income = ref(500)
const expense = ref(300)
let myChart

const renderChart = () => {
  const ctx = document.getElementById('myChart').getContext('2d')
  if (myChart) {
    myChart.data.datasets[0].data = [income.value, expense.value]
    myChart.update({
      duration: 2000, // 애니메이션의 지속 시간 (밀리초)
      easing: 'easeOutBounce' // 애니메이션의 속도 곡선
    })
  } else {
    myChart = new Chart(ctx, {
      type: 'doughnut',
      data: {
        labels: ['수입', '지출'],
        datasets: [
          {
            data: [income.value, expense.value],
            backgroundColor: ['#36A2EB', '#FF6384'],
            hoverBackgroundColor: ['#36A2EB', '#FF6384']
          }
        ]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        animation: {
          animateScale: true,
          animateRotate: true,
          duration: 5000
          // easing: 'easeOutBounce'
        }
      }
    })
  }
}

onMounted(() => {
  renderChart()
})

watch([income, expense], renderChart)
</script>

<style scoped>
canvas {
  max-width: 500px;
  max-height: 500px;
}
</style>
