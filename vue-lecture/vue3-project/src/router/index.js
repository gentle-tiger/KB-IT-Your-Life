import { createRouter, createWebHistory } from "vue-router";
import routes from "./routes.js";

// createRouter()를 통해 router 인스턴스 생성.
const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

// to : hoem , login, todo 순으로 진행된다.

router.beforeEach((to, from, next) => {
  // console.log("to", to); // /login/loginPage
  // console.log("from", from); //  /
  // console.log("next", next); // 함수?
  if (to.matched.some((item) => item.meta.requiresAuth === true)) {
    // true가 아닐 때
    if (localStorage.getItem("auth") !== "true") {
      console.log("로그인이 필요합니다.");
      next({ name: "login" }); // login으로 이동
    } else {
      next();
    }
  } else {
    next();
  }
});
export default router;
