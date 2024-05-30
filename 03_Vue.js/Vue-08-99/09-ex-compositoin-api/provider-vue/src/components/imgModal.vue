<template>
  <div class="main">
    <button @click="changeModal">모달 열기</button>
    <ModalComponent :visible="isModalVisible" @close-modal="changeModal">
      <h1>잘 내려가니?</h1>
    </ModalComponent>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import ModalComponent from './compo/ModalComponent.vue';
// boolean은 앞에 is가 붙음
const isModalVisible = ref(false);

function changeModal() {
  isModalVisible.value = !isModalVisible.value;
}

// function showModal() {
//     isModalVisible.value = true;
// }

// function hideModal() {
//     isModalVisible.value = false;
// }
</script>

<style scoped>
.main {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
button {
  border: none;
  width: 200px;
  height: 100px;
  font-weight: bold;
  font-size: 26px;
  background-color: skyblue;
  transition: 0.5s;
}
button:hover {
  background-color: rgb(85, 85, 241);
  color: white;
}
button:active {
  background-color: rgb(200, 200, 209);
  color: black;
}
</style>
