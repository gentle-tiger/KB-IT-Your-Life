<template>
  <div>
    <button @click="openModal" class="modalParent">ModalParent</button>
    <ModalChild :isModal="isModal" @close-modal="openModal"> </ModalChild>
  </div>
</template>

<script setup>
import { ref } from "vue";
import ModalChild from "./ModalChild.vue";

const isModal = ref(false);
const openModal = () => {
  isModal.value = !isModal.value;
  console.log(isModal.value);
};
</script>

<style scoped>
.modalParent {
  border: none;
  background: lightcoral;
  font-weight: bold;
  padding: 20px 10px;
  border-radius: 5px;
  transition: all 0.3s ease-in;
}
.modalParent:hover {
  background: rgb(236, 96, 96);
  color: white;
}
</style>
