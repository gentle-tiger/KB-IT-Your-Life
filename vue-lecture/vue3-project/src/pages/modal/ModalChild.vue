<template>
  <div class="isModal" v-if="props.isModal">
    <div class="modal">
      <div class="modalContent">
        <div class="modalBtnWarpper">
          <div @click="closedModal" class="modalClosedBtn">X</div>
        </div>
        <hr style="margin: 10px; border: 1px solid black" />
        <div>Hello Modal!</div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { defineEmits, defineProps } from "vue";

const emitClose = defineEmits(["close-modal"]);
const props = defineProps({
  isModal: Boolean,
});

const closedModal = () => {
  emitClose("close-modal");
};
</script>

<style scoped>
.isModal {
  position: fixed;
  display: flex;
  justify-content: center;
  align-items: center;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: rgba(0, 0, 0, 0.5);
}
.modal {
  background-color: skyblue;
  width: 300px;
  height: 200px;
  padding: 10px 20px;
  border: 1px solid white;
}

.modalContent {
  display: flex;
  flex-direction: column;
}
.modalBtnWarpper {
  display: flex;
  justify-content: end;
}
.modalClosedBtn {
  display: flex;
  justify-content: center;
  align-content: center;
  width: 30px;
  height: 30px;
  cursor: pointer;
}
</style>
