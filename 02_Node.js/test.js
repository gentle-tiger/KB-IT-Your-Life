const a = function () {
  console.log('a : ', this);
};
const b = () => {
  console.log('b : ', this);
};

a();
b();
