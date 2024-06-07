import Home from '@/pages/Home.vue';
import CharJs from '@/pages/CharJs.vue';
import CombinedStyle from '@/pages/CombinedStyle.vue';
import GlobalStyle from '@/pages/GlobalStyle.vue';
import LocalStyle from '@/pages/LocalStyle.vue';
import MyEvent from '@/pages/MyEvent.vue';
import ErrorMsg from '@/pages/ErrorMsg.vue';
import Reactive from '@/pages/Reactive.vue';
import Filter from '@/pages/Filter.vue';
const routes = [
  { path: '/home', component: Home },
  { path: '/errorMsg', component: ErrorMsg },
  { path: '/charJs', component: CharJs },
  { path: '/myEvent', component: MyEvent },
  { path: '/globalStyle', component: GlobalStyle },
  { path: '/localStyle', component: LocalStyle },
  { path: '/combinedStyle', component: CombinedStyle },
  { path: '/reactive', component: Reactive },
  { path: '/filter', component: Filter },
];

export default routes;
