<template>
  <div>
    <nav class="componentsAssets">
      <router-link v-for="link in links" :key="link.to" :to="link.to">{{
        link.label
      }}</router-link>
    </nav>
  </div>
</template>

<script setup>
const links = [
  { to: "/home", label: "Home" },
  { to: "/errorMsg", label: "ErrorMsg" },
  { to: "/charJs", label: "CharJs" },
  { to: "/myEvent", label: "MyEvent" },
  { to: "/globalStyle", label: "GlobalStyle" },
  { to: "/localStyle", label: "LocalStyle" },
  { to: "/combinedStyle", label: "CombinedStyle" },
  { to: "/reactive", label: "Reactive" },
  { to: "/filter", label: "Filter" },
  { to: "/modal", label: "Modal" },
  { to: "/calender", label: "Calender" },
  { to: "/vcalender", label: "VCalender" },

  // DynamicContent 컴포넌트에서 전부 처리
  { to: "/dynamicContent", label: "DynamicContent" },
  { to: "/dynamicContent/welcome", label: "DC/welcome" },
  { to: "/dynamicContent/goodbye", label: "DC/goodbye" },

  { to: "/login", label: "Login" },

  { to: "/axiosTodoList", label: "AxiosTodoList" },
  { to: "/toyCalender", label: "ToyCalender" },
  //  /notFound/404는 없는 경로
  { to: "/notFound/404", label: "404 Not Found" },
];
</script>

<style scoped>
.componentsAssets {
  background-color: black;

  display: flex;
  align-items: center;
  gap: 30px;
  font-size: 30px;
  height: 200px;
  flex-wrap: wrap;
  text-decoration-line: none;
  padding: 0px 20px;
}
.componentsAssets > a {
  color: white;
  font-weight: bold;
  text-decoration-line: none;
  transition: all 0.2s ease-in;
}
.componentsAssets > a:hover {
  color: rgb(226, 77, 77);
  text-decoration-line: none;
  /* transform: scale(1.1); */
}
button {
  display: inline-flex;
  gap: 10px;
  font-size: 20px;
  margin-left: 10px;
  padding: 10px;
}
</style>
