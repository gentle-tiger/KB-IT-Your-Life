<template>
  <ChildProvider></ChildProvider>
</template>

<script>
import ChildProvider from "./ChildProvider.vue";

export default {
  name: "ProviderEx",
  components: { ChildProvider },
  //-------------------------- 핵심

  provide() {
    return {
      message: "이것은 제공된 메시지입니다.",
    };
  },
};
</script>

<style lang="scss" scoped></style>
