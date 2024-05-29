<script setup>
import ProviderEx from "./components/ProviderEx.vue";
import TodoList from "./components/TodoList.vue";
</script>

<template>
  <TodoList />
  <ProviderEx />
</template>

<script>
export default {
  name: "App",
  components: { TodoList, ProviderEx },
};
</script>
<style scoped></style>
