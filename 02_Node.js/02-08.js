function makeStudent(name, korean, math, english, science) {
  let student = {
    이름: name,
    국어: korean,
    수학: math,
    영어: english,
    과학: science,

    getSum: function () {
      return this.국어 + this.수학 + this.영어 + this.과학;
    },

    getAverage: function () {
      return this.getSum() / 4;
    },

    toString: function () {
      return this.이름 + '\t' + this.getSum() + '\t' + this.getAverage();
    },
  };
  return student;
}

// Student.prototype.getSum = function () {};

console.log(Student.prototype);
