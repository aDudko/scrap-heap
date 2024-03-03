'use strict'

// /**
//  * === SET ===
//  * - unique items
//  * - iterable elements
//  * - hadn't item's indexes
//  * - add(), delete(), size(), has() и т.д
//  */


// /**
//  *  === Array ===
//  */
//
// const flights = ['Russia', 'NY', 'London', 'USA', 'London', 1, false];
//
// // Array to Set
// const setFlights = new Set(flights);
// setFlights.add('Paris');
// setFlights.delete('London');
// console.log(setFlights.size);
// console.log(setFlights.has('USA'));
// console.log(setFlights.has('UAR'));
//
// // Iteration
// for (const flight of setFlights) {
//     console.log(flight);
// }
//
// // Set to Array
// console.log([...setFlights]);
//
// // Objects Set
// const setObjects = new Set([{a: 1}, {b: 2}, {b: 2}]);
// console.log(setObjects);
//
// // Set of String
// const setStrings = new Set('abcd');
// console.log(setStrings);
//
// // WeakSet
// let a = {a: 1};
// let b = {b: 2};
// const set = new WeakSet([a, b]);
// a = null; // Хранит значение пока существует ссылка на объект
// setTimeout(() => {
//     console.log(set);
// }, 1000);


// /**
//  * === MAP ===
//  * - key-value
//  * - keys is unique
//  * - set с тем же key перезапишет value
//  * - set(), get(), delete(), has(), size(), keys(), values() и т.д
//  */
//
// // == ways to create 1 ==
// const wetherMap1 = new Map();
// wetherMap1
//     .set('London', '10')
//     .set('Moscow', '7');
// console.log(wetherMap1);
//
// // == ways to create 2 ==
// const wetherMap2 = new Map([
//     ['London', '10'],
//     ['Moscou', '7'],
//     ['Paris', '14']
// ]);
// console.log(wetherMap2);
//
// // == ways to create 3 ==
// const wetherObject = {
//     london: 10,
//     moscou: 7,
//     paris: 14
// }
// let wetherMap3 = new Map(Object.entries(wetherObject));
// console.log(wetherMap3);
//
// // Iterations
// for (const [key, value] of wetherMap3) {
//     console.log(key);
//     console.log(value);
// }
//
// // Map to Array
// console.log([...wetherMap3]);
// console.log([...wetherMap3.keys()]);
// console.log([...wetherMap3.values()]);
//


// /**
//  * УПРАЖНЕНИЕ: Необходимо поменять местами ключи и значения
//  */
//
// wetherMap3 = new Map([...wetherMap3].map(el => el.reverse()));
// console.log(wetherMap3);
//
// // WeakMap
// const map = new WeakMap(); // В качестве ключа может иметь только объект
// let a = {a: 1};
// let b = {b: 2};
//
// map
//     .set(a, 'testA')
//     .set(b, 'testB');
//
// console.log(map);
//
// a = null; // Хранит значение пока существует ссылка на объект
// console.log(map);