<template>
  <div class="checkbox-container">
    <!-- <input type="checkbox" :value="id" :checked="checked" @change="onCheckChanged" /> -->
    <label :for="id" :class="{ checked: checked }">
      <slot>Default Item</slot>
      <!-- <span v-if="checked" class="icon">✔️</span> -->
    </label>
  </div>
</template>

<script>
export default {
  name: 'CheckBox_GPT',
  props: {
    id: {
      type: String,
      required: true,
    },
    checked: {
      type: Boolean,
      default: false,
    },
  },
  methods: {
    onCheckChanged(event) {
      this.$emit('check-changed', { id: this.id, checked: event.target.checked });
    },
  },
};
</script>

<style scoped>
.checkbox-container {
  display: inline-flex;
  align-items: center;
}

input[type='checkbox'] {
  margin-right: 0.5em;
}

label {
  display: flex;
  align-items: center;
}

label.checked {
  color: blue;
}

.icon {
  margin-left: 0.5em;
}
</style>
