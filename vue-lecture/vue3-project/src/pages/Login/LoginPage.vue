<template>
  <div>
    <div>LoginPage입니다.</div>
    아이디 <input type="text" v-model.trim="userId" /> <br />패스워드
    <input type="password" v-model.trim="userPassword" />
    <br />
    <button @click="login">로그인</button>
    <button @click="logout">로그아웃</button>
  </div>
</template>

<script setup>
import axios from "axios";
import { ref } from "vue";
const userPassword = ref("");
const userId = ref("");
async function login() {
  try {
    const url = "http://localhost:3000/user";
    const loginRes = await axios.get(url); // 객체 자체를 가져옴
    // console.log(loginRes);

    const userData = loginRes.data; // 배열에 담아 가져온다.
    // console.log(userData);

    // userId 찾기 / userId가 동일하다면 해당 Id와 passwod를 내보냄 {id: '1125', password: '1125'}
    const findedUser = userData.find((item) => item.id === userId.value);
    console.log(findedUser);

    if (findedUser === undefined)
      return console.log("아이디가 일치하지 않습니다.");
    localStorage.setItem("auth", "true"); // 해당 값이 있는지 확인하고 있으면 통과.
    console.log("로그인 성공");

    if (findedUser.password !== userPassword.value)
      return console.log("비밀번호가 다릅니다.");
  } catch (error) {
    console.log("로그인 과정에서 오류 발생");
    console.log("error :", error);
  }
}
function logout() {
  localStorage.removeItem("auth");
  return console.log("로그아웃 완료!");
}
</script>

<style scoped></style>
