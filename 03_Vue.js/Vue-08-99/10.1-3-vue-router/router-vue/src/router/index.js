import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/pages/Home.vue';
import Dynamic from '@/pages/Dynamic.vue';
import NotFound from '@/pages/NotFound.vue';

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
    {
      path: '/dynamic/:mood', // dynamic 뒤에 오는 값을 mode라는 파라미터로 받기로 했다.
      name: 'Dynamic',
      component: Dynamic,
      props: true,
    },
    { path: '/:pathMatch(.*)*', name: 'NotFound', component: NotFound }, // 무조건 맨 아래에 작성
  ],
});

export default router;
