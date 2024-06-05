import { defineStore } from 'pinia';
import { reactive, computed } from 'vue';

export const useTodoListStore = defineStore('todolist', () => {
  const state = reactive({
    todoList: [
      { id: '1', todo: 'ES6 학습', done: false },
      { id: '2', todo: 'React 학습', done: true },
      { id: '3', todo: 'ContextAPI 학습', done: false },
      { id: '4', todo: '야구 경기 관람', done: false },
    ],
  });

  // computed 방식을 통해 외부에서 변경할 수 없도록 한다.
  const todoList = computed(() => state.todoList);
  const doneCount = computed(() => {
    return state.todoList.filter((todoItem) => todoItem.done).length;
  }); // 리턴 꼭 써야함

  // todo 추가
  const addTodo = (todo) => {
    const newTodo = { id: new Date().getTime(), todo, done: false };
    state.todoList.push(newTodo);
  };

  const deleteTodo = (id) => {
    // index가 어디에 있는지 확인하는 메서드
    const index = state.todoList.findIndex((todo) => todo.id === id);
    state.todoList.splice(index, 1); // 첫 번째 매개변수에서 1개의 데이터를 지움
  };

  const toggleDone = (id) => {
    const index = state.todoList.findIndex((todo) => todo.id === id);
    state.todoList[index].done = !state.todoList[index].done;
  };

  return { todoList, doneCount, addTodo, deleteTodo, toggleDone };
});
