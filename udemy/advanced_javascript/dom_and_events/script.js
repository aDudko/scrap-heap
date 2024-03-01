'use strict'

// /**
//  * === Всплытие событий ===
//  */
//
// const button = document.querySelector('.button');
// const inner = document.querySelector('.inner');
// const wrapper = document.querySelector('.wrapper');
//
// button.addEventListener('click', function (event) {
//     console.log('button');
//     console.log(event.currentTarget);
//     this.style.backgroundColor = 'purple';
// });
//
// inner.addEventListener('click', function (event) {
//     console.log('inner');
//     console.log(event.currentTarget);
//     this.style.backgroundColor = 'blue';
//     // event.stopPropagation();    // Останавливает всплытие
// });
//
// wrapper.addEventListener('click', function (event) {
//     console.log('wrapper');
//     console.log(event.currentTarget);
//     this.style.backgroundColor = 'green';
// });


// /**
//  * === Делегирование событий ===
//  */
//
// const wrapper = document.querySelector('.wrapper');
// wrapper.style.color = 'white';
// wrapper.style.flexDirection = 'column';
//
// for (let i = 0; i < 100; i++) {
//     const element = document.createElement('div');
//     element.innerHTML = `User id: ${i}`;
//     // Отдельная функция на каждый элемент
//     // element.addEventListener('click', () => {
//     //     console.log(`Deleted user id: ${i}`);
//     // });
//     element.setAttribute('data-id', i);
//     wrapper.append(element);
// }
//
// // Одна функция на все элементы
// wrapper.addEventListener('click', (event) => {
//     const element = event.target;
//     const id = element.getAttribute('data-id');
//     element.remove();
//     console.log(`Deleted user id: ${id}`);
// });


// /**
//  * === Перемещение по DOM-дереву ===
//  */
//
// const button = document.querySelector('.button');
// const inner = document.querySelector('.inner');
// const wrapper = document.querySelector('.wrapper');
//
// // Поиск вниз по дереву
// console.log(inner.children[0]);
// // Поиск вверх по дереву
// console.log(inner.parentElement);
// console.log(button.closest('.wrapper'));
// // Поиск соседей
// console.log(button.nextElementSibling);
// console.log(button.parentElement.children);


// /**
//  * === Жизненный цикл событий DOM ===
//  */
//
// // Загрузился контент документа
// document.addEventListener('DOMContentLoaded', function(event) {
//     console.log('DOMContentLoaded');
//     console.log(event);
// });
//
// // Загрузилось все
// window.addEventListener('load', function(event) {
//     console.log('load');
//     console.log(event);
// });
//
// // При выгрузке страницы: уходим на другую страницу и т.п.
// window.addEventListener('beforeunload', function(event) {
//     event.preventDefault();
//     event.returnValue = '';
// });


// /**
//  * УПРАЖНЕНИЕ: Поиск по списку
//  * Динамически создать N элементов с текстом и поле
//  * для поиска. При вводе в поле, выделять элементы,
//  * которые содержат введенный текст.
//  */
//
// const wrapper = document.querySelector('.wrapper');
// wrapper.style.color = 'white';
// wrapper.style.flexDirection = 'column';
//
// for (let i = 0; i < 100; i++) {
//     const element = document.createElement('div');
//     element.innerHTML = i;
//     wrapper.append(element);
// }
//
// function search(event) {
//     const inputValue = event.target.value;
//     for (const element of [...wrapper.children]) {
//         if (element.innerHTML.includes(inputValue) && inputValue != '') {
//             element.classList.add('yellow');
//             continue;
//         } else {
//             element.classList.remove('yellow');
//         }
//     }
// }


// /**
//  * === Async и defer ===
//  */
// defer - использовать для скриптов полагающихся на DOM-дерево
// async - для скриптов не полагающихся на DOM-дерево: метрики и т.п.