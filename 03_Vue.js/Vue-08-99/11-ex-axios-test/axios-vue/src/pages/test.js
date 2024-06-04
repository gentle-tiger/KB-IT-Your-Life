const todo = {
  id: '1',
  todo: '오브젝트 이해하기',
  done: false,
};

const todo1 = todo; // 얕은 복사

const todo2 = {
  ...todo,
  done: true, // 덮어 씌워진다. done : false가 사라짐.
};

console.log(todo === todo2);
console.log(todo2);
