// const tiger = {
//   name: '호진',
//   isOld: true,
//   sayHello: function () {
//     console.log(`tiger fn : ${this.name}님 say hello~ `);
//   },
//   nestedObj: {
//     name: '방시혁',
//     isOld: true,
//     sayHello: function () {
//       console.log(`nestObj fn : ${this.name}님 say hello~`);
//     },
//   },
// };

// tiger.sayHello();
// tiger.nestedObj.sayHello();
// console.log('tiger.name', tiger.name);
// console.log('tiger["isOld"] : ', tiger['isOld']);

// for 문에서 객체의 key,value 값에 접근하기.
// const obj = {
//   name: '최호진',
//   isOld: true,
//   condition: false,
// };

// for (let key in obj) {
//   console.log(`key 값은 ${key}이고, value는 ${obj[key]}입니다. `);
// }

// 매개변수만으로 obj의 값 가져오가.
// function getKeyValue(obj, key) {
//   if (key in obj) {
//     console.log(obj[key]);
//     // console.log(obj['name']); // 위 코드와 동일
//   } else {
//     console.log('nono');
//   }
// }

// getKeyValue(obj, 'name');

let student = {};
student.이름 = '홍길동';
student.취미 = '악기';
student.특기 = '프로그래밍';
student.장래희망 = '생명공학과';

student.toString = function () {
  for (let key in this) {
    if (key != 'toString') {
      console.log(key + '\t' + this[key]);
    }
  }
};
student.toString();
