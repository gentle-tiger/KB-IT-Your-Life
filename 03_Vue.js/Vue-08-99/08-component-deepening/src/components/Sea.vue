<template>
  <div class="header">
    <h1 class="headerText">태평양 전쟁의 해전</h1>
    <p>- tabs라는 배열을 li태그에서 for문을 돌려주며 각 요소를 tab이라고 정의한다.</p>
    <p>- li 태그를 클릭하면 changeTap메서드가 실행되며, 클릭한 li 태그의 id 값이 매개변수로 들어간다.</p>
    <p>- changeTap메서드는 클릭된 탭의 idx값을 currentTab 데이터 속성에 할당합니다</p>
    <p>- idx의 값은 tab.id의 값이 들어가게 되며, currentTab의 값에 따라 `is="currentTab"`부분에서 해당 컴포넌트가 동적으로 렌더링 된다.</p>

    <p>
      - 요약 정리 : 사용자가 특정 탭을 클릭하면 @click 이벤트 핸들러가 실행되고, changeTab 메서드가 호출되며, 클릭된 텝의 id가 currentTab에 저장된다.
      이로 인해 현재 탭이 변경됨과 동시에 해당 탭의 콘텐츠가 동적으로 렌더링된다.
    </p>
    <nav>
      <ul class="nav nav-tabs nav-fill">
        <li v-for="tab in tabs" :key="tab.id" class="nav-item">
          <a style="cursor: pointer" class="nav-link" :class="{ active: tab.id === currentTab }" @click="changeTab(tab.id)">{{ tab.label }}</a>
        </li>
      </ul>
    </nav>
  </div>
  <div class="container">
    <keep-alive include="MidwayTab,CoralSeaTab">
      <component :is="currentTab"></component>
    </keep-alive>
  </div>
</template>

<script>
import CoralSeaTab from './CoralSeaTab.vue';
import LeyteGulfTab from './LeyteGulfTab.vue';
import MidwayTab from './MidwayTab.vue';

export default {
  name: 'App',
  components: {
    CoralSeaTab,
    LeyteGulfTab,
    MidwayTab,
  },
  data() {
    return {
      currentTab: 'CoralSeaTab',
      tabs: [
        { id: 'CoralSeaTab', label: '산호해 해전' },
        { id: 'MidwayTab', label: '미드웨이 해전' },
        { id: 'LeyteGulfTab', label: '레이테만 해전' },
      ],
    };
  },
  methods: {
    changeTab(idx) {
      this.currentTab = idx;
    },
  },
};
</script>

<style>
.header {
  padding: 20px 0px 0px 20px;
}
.headerText {
  padding: 0px 20px 40px 20px;
}
.tab {
  padding: 30px;
}
</style>
