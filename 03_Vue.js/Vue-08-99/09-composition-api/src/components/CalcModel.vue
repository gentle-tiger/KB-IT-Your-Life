<template>
  <div>
    <h2>Calc</h2>
    <Calc />
    <hr />
    <h2>Calc2</h2>
    <Calc2 />
    <h2>Calc3</h2>
    <Calc3 />
    <h2>Calc4</h2>
    <Calc3 />
    <h2>Calc5</h2>
    <Calc5 />
    <h2>Calc8</h2>
    <Calc8 />
  </div>
</template>
<script>
import Calc from './Calc.vue';
import Calc2 from './Calc2.vue';
import Calc3 from './Calc3.vue';
import Calc4 from './Calc4.vue';
import Calc5 from './Calc5.vue';
import Calc8 from './Calc8.vue';
export default {
  name: 'CalcModel',
  components: { Calc, Calc2, Calc3, Calc4, Calc5, Calc8 },
};
</script>
