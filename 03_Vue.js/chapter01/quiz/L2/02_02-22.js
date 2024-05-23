const promise = new Promise((res, rej) => {
  res('first');
});

promise
  .then((msg) => {
    console.log(`second ${msg}`);
    return 'second';
  })
  .then((msg) => {
    console.log('third', msg);
    return 'third';
  })
  .then((res) => {
    console.log(`res : ${res}`);
  });
