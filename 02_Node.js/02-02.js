let msg = 'GLOBAL'; // 전역변수. 프리미티브

function outer() {
  let msg = 'OUTER'; // 지역변수. 참조
  console.log(msg);
  if (true) {
    // 블럭에 의해서 스코프가 하나 더 새임
    let msg = 'BLOCK'; // 지역변수
    console.log(msg);
  }
}
outer();
