// import { createApp } from 'vue'; // 경로 없이 vue라는 이름만 있다면, node_modules에서 vue를 찾으라는 뜻.
// import App from './App.vue'; // export default로 내보내는 것은 {}중괄호가 없음.

// createApp(App).mount('#app');

createApp(App).mount('#app');

import { createApp } from 'vue';
import App from './App5.vue';
// import App from './App.vue';
// import App from './App2.vue';
// import App from './App4.vue';
import mitt from 'mitt';
const emitter = mitt();
emitter.on('*', (type, e) => console.log(`## 이벤트 로그: ${type} ->`, e));
const app = createApp(App);
app.config.globalProperties.emitter = emitter;
app.mount('#app');
