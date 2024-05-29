const list = [100, 200, 300];

const list1 = ['hello', ...list, 'world'];
const list2 = [...list]; // 깊은 복사
const list3 = list; // 앝은 복사
console.log(list);
console.log(list1);
console.log(list2);
console.log('list === list2 배열에 직접 할당(깊은복사) : ', list === list2);
console.log('list === list3 list 자체를 할당(얕은복사) : ', list === list3);
