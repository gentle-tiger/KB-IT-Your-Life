import { createMemoryHistory, createRouter } from 'vue-router';
import Home from '@/pages/Home.vue';
// createRouter()를 통해 router 인스턴스 생성.
const routes = [{ path: '/home', component: Home }];

const router = createRouter({
  history: createMemoryHistory(),
  routes,
});

export default router;
