<script setup>
import InputTodo from './components/InputTodo.vue';
import TodoList from './components/TodoList.vue';
</script>
<style>
* {
  -webkit-user-select: none; /* Chrome, Safari, Opera */
  -moz-user-select: none; /* Firefox */
  -ms-user-select: none; /* IE 10+ */
  user-select: none; /* 표준 문법 */
}
</style>
<template>
  <div id="app" class="container">
    <div class="toodListContainer">
      <div><h1>할일 목록</h1></div>
      <InputTodo @add-todo="addTodo" />
      <TodoList :todoList="todoList" @delete-todo="deleteTodo" @toggle-completed="toggleCompleted" />
    </div>
  </div>
</template>

<script>
let ts = new Date().getTime();
export default {
  components: { InputTodo, TodoList },
  name: 'App',
  data() {
    return {
      todo: '',
      todoList: [
        { id: ts, todo: '자전거 타기', completed: false },
        { id: ts + 1, todo: '딸과 공원 산책', completed: true },
        { id: ts + 2, todo: '일요일 애견 카페', completed: false },
        { id: ts + 3, todo: 'Vue 원고 집필', completed: false },
      ],
    };
  },
  methods: {
    // list 생성
    addTodo() {
      if (this.todo !== '') {
        const list = {
          // li마다 고유의 id 생성
          id: new Date().getTime(),
          // innput value를 todo의 값으로 지정
          todo: this.todo,
          // list의 completed 값은 false를 기본값으로 지정.
          completed: false,
        };
        // 하나의 list를 기존의 todoList에 push한다.
        this.todoList.push(list);
        console.log(list);
        // input의 값을 초기화 시켜준다. 없다면 해당 목록이 만들어졌음에도 불구하고 input 태그에는 값이 남아있다.
        this.todo = '';
      }
    },
    // list 삭제
    deleteTodo(id) {
      // 함수의 인자로 delete할 목록의 id값을 받은 후에
      // findIndex 함수를 통해 기존의 todoList에서 delete할 id값의 목록을 찾는다.
      const index = this.todoList.findIndex((item) => id === item.id);
      console.log('delete index :', index);
      // delete 할 목록을 삭제
      this.todoList.splice(index, 1); // splice의 두 번째 인자값으로 1을 주면 현재 가리키는 객체를 삭제한다.
    },
    // list 완료
    toggleCompleted(id) {
      // 완료된 목록을 기존 todoList에서 찾아 인덱스 값을 받는다.
      const index = this.todoList.findIndex((item) => id === item.id);
      console.log('complete index :', index);
      // todoList에서 완료된 목록의 completed 값을 !으로 반전시켜준다. true -> false, false -> true
      this.todoList[index].completed = !this.todoList[index].completed;
    },
  },
};
</script>
<style lang="scss" scoped></style>
