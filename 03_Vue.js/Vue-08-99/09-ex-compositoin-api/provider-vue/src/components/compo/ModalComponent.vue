<template>
  <!-- 부모가 visible을 내려준다.  -->
  <div class="modal-overlay" v-if="visible">
    <div class="modal">
      <button class="close-button" @click="sandClose">X</button>
      <div class="modal-content"></div>
      <slot></slot>
    </div>
  </div>
</template>

<script setup>
import { defineProps, defineEmits } from 'vue';

const emit = defineEmits(['close-modal']); // 이벤트 명 정하기
const props = defineProps({
  visible: {
    type: Boolean,
    required: true,
  },
});

function sandClose() {
  emit('close-modal'); // defineEmits에서 설정한 이벤트명으로 부모 컴포넌트에 이벤트 명 전달.
}
</script>

<style scoped>
.modal-overlay {
  position: fixed;

  display: flex;
  justify-content: center;
  align-items: center;

  /* 화면이 꽉 차도록 한다.  */
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: rgba(0, 0, 0, 0.5);
}

.modal {
  position: relative;
  background: rgb(230, 207, 207);
  padding: 20px;
  border-radius: 5px;
}

.close-button {
  position: absolute;
  top: 10px;
  right: 10px;
  background: transparent;
  border: none;
  font-size: 20px;
  font-weight: 700;
}

.modal-content {
  margin-top: 30px;
}
</style>
