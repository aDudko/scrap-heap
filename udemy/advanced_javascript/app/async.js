'use strict'

/**
 * Конкуретность - за промежуток времени выполняется N задач
 * Параллельность - выполняется кем-то еще
 * Многопоточность - способ конкурентного выполнения выделением рабочих потоков
 * Асинхронная операция - передача операций для выполнения на стороне
 */

/**
 * === Запросы на сервер XMLHttpRequest ===
 * AJAX (Asynchronous JaavaScript and XML) - позволяет нам асинхронно
 * взаимодействовать с удаленным сервером для получения или отправки
 * данных
 * JSON (JavaScript Object Notation) - формат описания объектов в JS
 */
// function req(id) {
//     // Пример отправки XMLHttpRequest
//     const request = new XMLHttpRequest();
//     request.open('GET', 'https://dummyjson.com/products/' + id);
//     request.send();
//     // Пример обработки ответа от XMLHttpRequest
//     request.addEventListener('load', function() {
//         const data = JSON.parse(this.responseText);
//         console.log(data);
//     });
// }
// req(1);
// console.log('end');
/**
 * Получить среднюю цену из 30 продуктов из API
 * https://dummyjson.com/products
 */
// const request = new XMLHttpRequest();
// request.open('GET', 'https://dummyjson.com/products');
// request.send();
// request.addEventListener('load', function() {
//     const {products} = JSON.parse(this.responseText);
//     const sum = products.reduce((acc, product) => acc += product.price, 0);
//     console.log(sum / products.length);
// });
/**
 * Callback Hell - при большом количестве вложенных запросов
 * из глаз начинает сочиться кровища 
 */
// const request = new XMLHttpRequest();
// request.open('GET', 'https://dummyjson.com/products');
// request.send();
// request.addEventListener('load', function() {
//     const {products} = JSON.parse(this.responseText);
//     // Пример вложенного запроса - каждый следующий ждет предыдущий
//     const request = new XMLHttpRequest();
//     request.open('GET', 'https://dummyjson.com/products/' + products[0].id);
//     request.send();
//     request.addEventListener('load', function() {
//         const data = JSON.parse(this.responseText);
//         console.log(data);
//     });
// });

/**
 * === Promises and Fetch (ES6) ===
 * Если необходимо получать друг за другом несколько отложенных запросов
 * Promise - контейнер для значения, которое вернется в будущем
 * Не нужно использовать callback
 * Не нужно использовать события
 * У Promise есть состояния:
 * Pending - запрос отправлен
 * Settled - 
 * Fulfiled - все вернулось корректно
 * Rejected - произошла ошибка и ее нужно корректно обработать
 */
// Example 1 - отправка запроса
// const promise = fetch('https://dummyjson.com/products/1');
// console.log(promise);
// Example 2 - обработка результата
// fetch('https://dummyjson.com/products/1')
//     .then((response) => response.json())
//     .then((data) => {
//         console.log(data)
//     });
// Example 3 - вложенные запросы
// fetch('https://dummyjson.com/products')
//     .then((response) => response.json())
//     .then(({ products }) => {
//         console.log(products)
//         return fetch('https://dummyjson.com/products/' + products[0].id);
//     })
//     .then(product => product.json())
//     .then(data => console.log(data.title));
// Example 4 - обработка ошибок (локальная)
// fetch('https://dummyjson.com/productss')
//     .then(
//         response => {
//             console.log(response)
//             return response.json()
//         },
//         error => console.log(error) // Локальная обработка ошибок
//     )
//     .then(({ products }) => {
//             console.log(products)
//             return fetch('https://dummyjson.com/products/' + products[0].id);
//         },
//         error => console.log(error)
//     )
//     .then(product => product.json())
//     .then(data => console.log(data.title));
// // Example 4 - обработка ошибок (локальная)
// fetch('https://dummyjson.com/productss')
//     .then(
//         response => {
//             console.log(response)
//             return response.json()
//         }
//     )
//     .catch(error => console.log(error)) // Обработает ошибку и пойдет дальше
//     .then(({ products }) => {
//             console.log(products)
//             return fetch('https://dummyjson.com/products/' + products[0].id);
//         }
//     )
//     .then(product => product.json())
//     .then(data => console.log(data.title))
//     .catch(error => console.log(error)) // Глобальная обработка ошибок
// Example 4 - Finally
// fetch('https://dummyjson.com/productss')
//     .then(
//         response => {
//             console.log(response);
//             return response.json();
//         }
//     )
//     .then(({ products }) => {
//             console.log(products);
//             return fetch('https://dummyjson.com/products/' + products[0].id);
//         }
//     )
//     .then(product => product.json())
//     .then(data => console.log(data.title))
//     .catch(error => console.log(error))
//     .finally(() => {    // Отработает всегда
//         console.log('Finally');
//     });
/**
 * Сделать запрос на https://dummyjson.com/products/categories,
 * получить список категорий и отобразить <select> выбора категорий.
 */
// function createSelect(array) {
//     const element = document.querySelector('.filter');
//     element.innerHTML = `<select>
//         ${array.map(arrElem => `<option value=${arrElem}>${arrElem}</option>`)}
//     </select>`
// }
// function getCategories() {
//     fetch('https://dummyjson.com/products/categories')
//         .then(response => response.json())
//         .then(data => {
//             createSelect(data);
//         })
//         .catch(error => console.error(`Ошибка: ${error}`));
// }
// getCategories();
// Ручное создание ошибок
// fetch('https://dummyjson.com/productss')
//     .then(
//         response => {
//             if (!response.ok) {
//                 throw new Error(`Is error ${response.status}`)
//             }
//             return response.json();
//         }
//     )
//     .then(({ products }) => {
//             console.log(products);
//             return fetch('https://dummyjson.com/products/' + products[0].id);
//         }
//     )
//     .then(product => product.json())
//     .then(data => console.log(data))
//     .catch(error => {
//         const element = document.querySelector('.filter');
//         element.innerHTML = error.message;
//     });
/** 
 * Функция запросов 
 * Написать функцию, которая принимает строку и текст ошибки и
 * возвращает уже Promise с JSON из тела запроса
*/
// function getData(url, errorMsg, method = 'GET') {
//     return fetch(url, {method})
//         .then(response => {
//             if (!response.ok) {
//                 throw new Error(`${errorMsg} ${response.status}`)
//             }
//             return response.json();
//         })
// }
// getData('https://dummyjson.com/products', 'Can not get productS')
//     .then(({ products }) => {
//             console.log(products);
//             return getData('https://dummyjson.com/products/' + products[0].id, 'Can not get product');
//         }
//     )
//     .then(data => console.log(data))
//     .catch(error => {
//         const element = document.querySelector('.filter');
//         element.innerHTML = error.message;
//     });
/**
 * Event Loop
*/
// === Создание простого Promise ===
// Правильно использовать для оборачивания длительных операций с callback
// const promise = new Promise((resolve, reject) => {
//     // reject - в случае ошибки, когда хотим попасть в catch
//     if (new Date() < new Date('01/01/2024')) {
//         reject(new Error('Error'));
//     }
//     // resolve - когда мы успешно заканчиваем promise
//     resolve('Succes');
// });
// promise
//     // data содержит то, что переданно в аргумент resolve
//     .then(data => console.log(data))
//     .catch(error => console.log(error))
// function timeout(sec) {
//     return new Promise((resolve) => {
//         setTimeout(() => {
//             resolve();
//         }, sec * 1000);
//     });
// }
// timeout(1)
//     .then(() => {
//         console.log(1);
//         return timeout(1);
//     })
//     .then(() => {
//         console.log(1);
//     })
/**
 * Создать функцию myFetch, которая выполняет внутри XMLHttpRequest
 */
// function myFetch(url) {
//     return new Promise((resolve, reject) => {
//         const request = new XMLHttpRequest();
//         request.open('GET', url);
//         request.send();
//         request.addEventListener('load', function() {
//             if (this.status > 400) {
//                 reject(new Error(this.status));
//             }
//             resolve(this.responseText);
//         });
//         request.addEventListener('error', function() {
//             reject(new Error(this.status));
//         });
//         request.addEventListener('timeout', function() {
//             reject(new Error('Timeout'));
//         });
//     });
// }
// myFetch('https://dummyjson.com/products')
//     .then(data => console.log(JSON.parse(data)))
//     .catch(err => console.error(err))