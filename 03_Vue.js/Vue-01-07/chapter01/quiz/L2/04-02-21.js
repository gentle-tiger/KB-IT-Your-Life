const promise1 = new Promise((resolve, reject) => {
  setTimeout(() => {
    const num = Math.random();

    if (num >= 0.8) return reject(`생성된 숫자는 ${num}입니다. `);
    return resolve(num);
  }, 100);
});

promise
  .then((result) => {
    console.log(`처리 결과 : ${result}`);
  })
  .catch((error) => {
    console.log(`오류 : ${error}`);
  });
console.log(`## Promise 생성`);

console.log(`## Promise 객체 생성`);
