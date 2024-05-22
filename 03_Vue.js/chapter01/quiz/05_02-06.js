function foodReport(name, age, ...foodReport) {
  this.name = name;
  this.age = age;
  this.foodReport = foodReport;
  console.log(`${name}, age`);
  console.log(foodReport);
}

foodReport('이몽룡', 20, '짜장면', '냉면', '불고기');
foodReport('홍길동', 16, '초밥');
