import { createApp } from 'vue';
import App from './App.vue';

// import router from './router';
// import routes from './routes';
// import router from './router';
import router from '@/router/index.js';
// use()를 호출하여 router 플러그인 등록
createApp(App).use(router).mount('#app');

// 위와 동일
// const app = createApp(App);
// app.use(router);
// app.mount('#app');

// 플러그인이 하는 일
// 1 . RouterView와 RouterLink 컴포넌트를 전역으로 등록합니다.
// 2 . 전역 $router와 $route 속성을 추가합니다.
// 3 . useRouter() 및 useRoute() 컴포저블을 사용할 수 있게 합니다.
// 4 . 초기 라우트를 해결하기 위해 라우터를 트리거합니다.
