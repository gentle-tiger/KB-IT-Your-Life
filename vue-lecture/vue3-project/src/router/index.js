import { createRouter, createWebHistory } from "vue-router";
import routes from "./routes.js";

// createRouter()를 통해 router 인스턴스 생성.
const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
