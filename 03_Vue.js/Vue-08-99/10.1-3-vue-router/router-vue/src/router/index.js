import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/pages/Home.vue';
/// 절대 경로
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/about',
      name: 'about',
      // 직접 익명 함수로 연결
      component: () => import('@/pages/About.vue'),
    },
  ],
});

export default router;
