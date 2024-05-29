<template>
  <div><NoSlotTest /> <SlotTest /> <NamedSlotTest /> <Layout /> <ScopedSlotTest /><Sea /></div>
</template>
<script>
import NoSlotTest from './components/NoSlotTest.vue';
import SlotTest from './components/SlotTest.vue';
import NamedSlotTest from './components/NamedSlotTest.vue';
import Layout from './components/Layout.vue';
import ScopedSlotTest from './components/ScopedSlotTest.vue';
import Sea from './components/Sea.vue';
export default {
  name: 'App',
  components: { NoSlotTest, SlotTest, NamedSlotTest, Layout, ScopedSlotTest, Sea },
};
</script>
