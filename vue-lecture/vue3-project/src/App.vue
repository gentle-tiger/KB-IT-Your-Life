<script setup>
import NavMenu from "@/NavMenu.vue";
</script>
<template>
  <div>
    <div class="headLine">
      <h1 class="title">Components Assets</h1>
      <NavMenu />
    </div>

    <div class="componentPage"><router-view></router-view></div>
  </div>
</template>

<style>
* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
  overflow: hidden;
}
.headLine {
  background-color: black;
  color: white;
  border: 1px solid red;
}

.title {
  text-align: center;
  padding: 20px 0px 0px 0px;
  font-size: 50px;
  font-weight: bold;
  text-decoration-line: underline;
  font-family: "Song Myung", serif;
  font-weight: 400;
  font-style: normal;
  margin: 0;
}
.componentPage {
  /* border: 1px solid red; */
  margin: 20px 20px;
  height: 80vh;
}
</style>
