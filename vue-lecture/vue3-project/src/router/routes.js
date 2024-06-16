import Calender from "@/pages/Calender.vue";
import CharJs from "@/pages/CharJs.vue";
import CombinedStyle from "@/pages/CombinedStyle.vue";
import ErrorMsg from "@/pages/ErrorMsg.vue";
import Filter from "@/pages/Filter.vue";
import GlobalStyle from "@/pages/GlobalStyle.vue";
import Home from "@/pages/Home.vue";
import LocalStyle from "@/pages/LocalStyle.vue";
import Login from "@/pages/Login.vue";
import LoginHome from "@/pages/Login/LoginHome.vue";
import LoginPage from "@/pages/Login/LoginPage.vue";
import LoginTodo from "@/pages/Login/LoginTodo.vue";
import Modal from "@/pages/Modal.vue";
import MyEvent from "@/pages/MyEvent.vue";
import NotFound from "@/pages/NotFound.vue";
import Reactive from "@/pages/Reactive.vue";
import VCalender from "@/pages/VCalendar.vue";
import DynamicContent from "@/pages/dynamicContent/DynamicContent.vue";
const routes = [
  { path: "/home", component: Home },
  { path: "/errorMsg", component: ErrorMsg },
  { path: "/charJs", component: CharJs },
  { path: "/myEvent", component: MyEvent },
  { path: "/globalStyle", component: GlobalStyle },
  { path: "/localStyle", component: LocalStyle },
  { path: "/combinedStyle", component: CombinedStyle },
  { path: "/reactive", component: Reactive },
  { path: "/filter", component: Filter },
  { path: "/modal", component: Modal },
  { path: "/dynamicContent/:mood", component: DynamicContent }, // dynamic 뒤에 오는 값을 mode라는 파라미터로 받기로 했다. :mood가 겂다면 NotFound 가 뜬다.
  { path: "/calender", component: Calender },
  { path: "/vcalender", component: VCalender },
  { path: "/login", component: Login }, // login에서도 동적으로 ~
  { path: "/login/home", component: LoginHome }, // login에서도 동적으로 ~
  { path: "/login/loginPage", component: LoginPage }, // login에서도 동적으로 ~
  {
    path: "/login/loginTodo",
    // name: "/login/loginTodo",
    component: LoginTodo,
    meta: { requiresAuth: true },
  }, // login에서도 동적으로 ~
  // { path: "/login/LoginHome", component: LoginHome }, // login에서도 동적으로 ~
  { path: "/:pathMatch(.*)*", component: NotFound }, // 맨 아래에 작성
];

export default routes;
