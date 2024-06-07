<template>
  <div>
    <div class="headLine">
      <h1 class="title">Components Assets</h1>
      <nav class="componentsAssets">
        <router-link to="/home">Home</router-link>
        <router-link to="/errorMsg">ErrorMsg</router-link>
        <router-link to="/charJs">CharJs</router-link>
        <router-link to="/myEvent">MyEvent</router-link>
        <router-link to="/globalStyle">GlobalStyle</router-link>
        <router-link to="/localStyle">LocalStyle</router-link>
        <router-link to="/combinedStyle">CombinedStyle</router-link>
        <router-link to="/reactive">Reactive</router-link>
        <router-link to="/filter">Filter</router-link>
      </nav>
    </div>
    <div class="componentPage"><router-view></router-view></div>
  </div>
</template>

<script setup></script>

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
}
.title {
  text-align: center;
  padding: 20px 0px 0px 0px;
  font-size: 50px;
  font-weight: bold;
  text-decoration-line: underline;
  font-family: 'Song Myung', serif;
  font-weight: 400;
  font-style: normal;
  margin: 0;
}
button {
  display: inline-flex;
  gap: 10px;
  font-size: 20px;
  margin-left: 10px;
  padding: 10px;
}
.componentsAssets {
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
.componentPage {
  /* border: 1px solid red; */
  margin: 20px 20px;
  height: 80vh;
}
</style>
