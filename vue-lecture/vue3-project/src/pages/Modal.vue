<template>
  <div class="main">
    <button class="button" @click="changeModal">모달 열기</button>
    <!-- isModalVisible은 props로 보냄.  -->
    <ModalComponent :visible="isModalVisible" @close-modal="changeModal">
      <h1>잘 내려가니?</h1>
    </ModalComponent>
    <ModalParent />
  </div>
</template>

<script setup>
import ModalComponent from "@/pages/modal/ModalComponent.vue";
import ModalParent from "@/pages/modal/ModalParent.vue";
import { ref } from "vue";
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
  justify-content: center;
  align-items: center;
}
.button {
  display: flex;
  justify-content: center;
  align-items: center;
  border: none;
  width: 200px;
  height: 100px;
  font-weight: bold;
  font-size: 26px;
  background-color: skyblue;
  transition: 0.5s;
}
.button:hover {
  background-color: rgb(85, 85, 241);
  color: white;
}
.button:active {
  background-color: rgb(200, 200, 209);
  color: black;
}
</style>
