<script setup>
import InputTodo from './components/InputTodo.vue';
import TodoList from './components/TodoList.vue';
import TodoListItem from './components/TodoListItem.vue';
</script>

<template>
  <div class="body">
    <h1>My TodoList</h1>
    <!-- @addTodo는  Inputodo 에서 받는 이벤트 명, addoTodo는 현재 파일의 메서드 -->
    <InputTodo @addTodo="addTodo" />
    <!-- v-bind로 :을 써야 배열 자체가 전달됨. -->
    <TodoList :todoList="todoList" @toggleCompleted="toggleCompleted" @deleteTodo="deleteTodo" />
  </div>
</template>

<script>
export default {
  components: { InputTodo, TodoList },

  data() {
    return {
      todoList: [
        { id: 1, todo: 'HTML', completed: false },
        { id: 2, todo: 'CSS', completed: true },
        { id: 3, todo: 'JavaScript', completed: false },
        { id: 4, todo: 'Vue', completed: false },
      ],
    };
  },
  methods: {
    // input의 값을 가져와야 하기 때문에 emit으로 매개변수를(todo) 받아야 함.
    addTodo(todo) {
      let id = this.todoList.lenth + 1;
      this.todoList.push({ id: id, todo: todo.todo, completed: false });
    },
    toggleCompleted(id) {
      // 1번째 방법
      // const idx = this.todoList.findIndex((item, index) => item.id === id);
      // this.todoList[idx].completed = !this.todoList[idx].completed;

      // 2번째 방법
      this.todoList = this.todoList.map((item) => {
        return item.id === id ? { ...item, completed: !item.completed } : item;
      });
    },
    deleteTodo(id) {
      // 1번째 방법
      // const idx = this.todoList.findIndex((item, index) => item.id === id);
      // this.todoList.splice(idx, 1);

      //2번째 방법
      // filter 함수는 조건에 맞는 배열만 반환한다.
      this.todoList = this.todoList.filter((item) => item.id !== id);
    },
  },
};
</script>

<style scoped>
.body {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  background-color: #69626d;
}
h1 {
  /* google font */
  font-family: 'Black Han Sans', sans-serif;
  font-weight: bold;
  font-style: normal;

  color: white;
  border: 1px solid;
  border-radius: 20px;
  padding: 10px 20px;
}
</style>
