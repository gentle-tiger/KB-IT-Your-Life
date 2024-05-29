// setInterval(() => {
//   try {
//     const random = parseInt(Math.random() * 10);
//     console.log('random : ', random);
//     if (random > 5) {
//       return console.log('성공하면 승리자 ');
//     }
//     // throw new Error('실패하면 패배자');
//   } catch (error) {
//     console.log('패배자 ');
//   }
// }, 1000);

const promise = new Promise((resolve, reject) => {
  setTimeout(() => {
    //0 ~ 10 사이의 난수 발생
    let num = parseInt(Math.random() * 10);
    if (num >= 5) {
      reject(num);
    }
    resolve(num);
  }, 1000);
});
async function func() {
  try {
    const result = await promise;
    console.log('무사 통과! 생성된 숫자 :', result);
  } catch (error) {
    console.log('Error 발생! 생성된 숫자 :', error);
  }
}
func();
console.log('## Promise 객체 생성!');
