import Home from '@/pages/Home.vue';
// import Header from '@/components/Header.vue';
import About from '@/pages/About.vue';
import Reactive from '@/pages/Reactive.vue';
import MemberInfo from '@/pages/MemberInfo.vue';
const routes = [
  {
    path: '/',
    name: 'home',
    component: Home,
  },
  {
    path: '/about',
    name: 'about',
    component: About,
  }, // About 컴포넌트가 없는 경우 주석 처리
  {
    path: '/reactive',
    name: 'reactive',
    component: Reactive,
  }, // About 컴포넌트가 없는 경우 주석 처리
  {
    path: '/memberInfo',
    name: 'memberInfo',
    component: MemberInfo,
  }, // About 컴포넌트가 없는 경우 주석 처리
];

export default routes;
