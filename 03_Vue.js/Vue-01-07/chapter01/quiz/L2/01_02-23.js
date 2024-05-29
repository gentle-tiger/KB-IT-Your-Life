const tiger = {
  name: '호진',
  home: '서울시 금천구',
  age: 28,
};

const copyTiger = tiger;

console.log(tiger);
console.log(copyTiger);
console.log('얕은 복사 ', tiger === copyTiger);

const copyTiger1 = {
  ...tiger,
};

console.log(tiger);
console.log(copyTiger1);
console.log('깊은 복사 ', tiger === copyTiger1);
