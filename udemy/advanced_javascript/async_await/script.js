'use strict'

// function getProducts() {
//     fetch('https://dummyjson.com/products')
//         .then(response => response.json())
//         .then(data => console.log(data));
// }
//
// getProducts();
// console.log('End');
//
// Перепишем эту функцию на Async Await
//
// async function getProducts() {
//     // Линейныйй код, как будто синхронный
//     const response = await fetch('https://dummyjson.com/products');
//     const data = await response.json();
//     console.log(data);
// }
//
// getProducts();
// console.log('End');


// /**
//  * Последовательный вызов нескольких запросов
//  */
//
// async function getProducts() {
//     // Линейныйй код, как будто синхронный
//     // Но общий поток не заблокирован
//     const produtsResponse = await fetch('https://dummyjson.com/products');
//     const { products } = await produtsResponse.json();
//     console.log(products);
//
//     const produtResponse = await fetch('https://dummyjson.com/products/' + products[0].id);
//     const product = await produtResponse.json();
//     console.log(product);
// }
//
// getProducts();
// console.log('End');


// /**
//  * Обработка ошибок
//  */
//
// async function getProducts() {
//     try {
//         const produtsResponse = await fetch('https://dummyjson.com/products');
//         if (!produtsResponse.ok) {
//             throw new Error(produtsResponse.status);
//         }
//         const { products } = await produtsResponse.json();
//         console.log(products);
//         const produtResponse = await fetch('https://dummyjson.com/products/' + products[0].id);
//         if (!produtResponse.ok) {
//             throw new Error(produtResponse.status);
//         }
//         const product = await produtResponse.json();
//         console.log(product);
//     } catch(e) {
//         console.error(e);
//     } finally {
//         console.log('Finally');
//     }
// }
//
// getProducts();
// console.log('End');


// /**
//  * УПРАЖНЕНИЕ: Получить геолокацию пользователя через
//  * Geolocation.getCurrentPosition() (Web API)
//  * и по координатам определить город, отправив запрос:
//  * https://api.bigdatacloud.net/data/reverse-geocode-client?latitude=00&longitude=00
//  */
//
// function getMyCoordinations() {
//     return new Promise((resolve, reject) => {
//         navigator.geolocation.getCurrentPosition(
//             ({ coords }) => {
//                 resolve({ 
//                     latitude: coords.latitude,
//                     longitude: coords.longitude
//                 })
//             }, 
//             (error) => {
//                 reject(error);
//             } 
//         );
//     });
// }
//
// async function getMyCity() {
//     try {
//         const { latitude, longitude } = await getMyCoordinations();
//         const response = await fetch(`https://api.bigdatacloud.net/data/reverse-geocode-client?latitude=${latitude}&longitude=${longitude}`);
//         if (!response.ok) {
//             throw new Error(response.status);
//         }
//         const data = await response.json();
//         console.log(data.city);
//     } catch (e) {
//         console.error(e);
//     }
// }
//
// getMyCity();


// /**
//  * Асинхронные методы
//  */
//
// // Обычный метод
//
// class ProductRepository {
//     async getProducts() {
//         const response = await fetch('https://dummyjson.com/products/');
//         console.log(await response.json());
//     }
// }
//
// const repo = new ProductRepository();
// repo.getProducts();
//
// // Стрелочная функция
//
// const asyncArrow = async () => {
//     const response = await fetch('https://dummyjson.com/products/');
//     console.log(await response.json());
// }
//
// asyncArrow();
//
// /**
//  * Последовательность выполнения
//  */
//
// const asyncArrow = async () => {
//     try {
//         const response = await fetch('https://dummyjson.com/products');
//         const data = await response.json();
//         return data;
//     } catch(e) {
//         console.error(e);
//         throw e;
//     }
// }
//
// // console.log('1');
// // asyncArrow()
// //     .then(data => {
// //         console.log(data)
// //     })
// //     .catch(e => console.error(e))
// //     .finally(() => {
// //         console.log('2');
// //     });
// // console.log('3');
//
// (async () => {
//     console.log('1');
//     const response = await asyncArrow();
//     console.log(response);
//     console.log('2');
// })();


// /**
//  * Параллельное выполнение
//  */
//
// Последовательное получение данных (как в дампах mlg)
//
// async function getAllProducts() {
//     const response = await fetch('https://dummyjson.com/products');
//     return response.json();
// }
//
// async function getProduct(id) {
//     const response = await fetch('https://dummyjson.com/products/' + id);
//     return response.json();
// }
//
// async function main() {
//     const { products } = await getAllProducts();
//     for (const product of products) {
//         const res = await getProduct(product.id);
//         console.log(res);
//     }
// }
//
// main();
//
// Параллельно получение данных
//
// async function getAllProducts() {
//     const response = await fetch('https://dummyjson.com/products');
//     return response.json();
// }
//
// async function getProduct(id) {
//     const response = await fetch('https://dummyjson.com/products/' + id);
//     return response.json();
// }
//
// async function main() {
//     const { products } = await getAllProducts();
//     // const res = await Promise.all([ // Параллельное выполнение. Но падает один = падают все
//     //     getProduct(1),
//     //     getProduct(2),
//     //     getProduct(3),
//     // ]);
//     const res = await Promise.all(products.map(product => getProduct(product.id)));
//     console.log(res);
//     // for (const product of products) {
//     //     const res = await getProduct(product.id);
//     //     console.log(res);
//     // }
// }
//
// main();


// /**
//  * Другие комбинации Promise
//  */
//
// async function getAllProducts() {
//     const response = await fetch('https://dummyjson.com/products');
//     return response.json();
// }
//
// async function getProduct(id) {
//     const response = await fetch('https://dummyjson.com/products/' + id);
//     return response.json();
// }
//
// async function getProductError(id) {
//     const response = await fetch('https://dummyjson.com/productss/' + id);
//     return response.json();
// }
//
// async function main() {
//     const { products } = await getAllProducts();
//
//     // Параллельно получение. Если падает один, то падают все
//     const response1 = await Promise.all([
//         getProduct(1),
//         getProduct(2)
//     ]);
//
//     console.log(response1);
//
//     // Параллельное получение. Если один упадет, остальные вернутся
//     // Ответ обернут новым объектом: status, value
//     const response2 = await Promise.allSettled([
//         getProduct(1),
//         getProductError(2)
//     ]);
//
//     // Можно пройтись циклом по response2 и проверить статусы
//     // Вот так должно было быть в дампах mlg
//     console.log(response2);
//
//     // Параллельное получение самого быстрого
//     // Полезно, например для разных локаций серверов
//     const response3 = await Promise.race([
//         getProduct(1),
//         getProduct(2)
//     ]);
//
//     console.log(response3);
// }
//
// main();


// /**
//  * Все возможности Fetch
//  */
//
// async function main() {
//     const response = await fetch('https://dummyjson.com/auth/login', {
//         method: 'POST',
//         headers: {
//             'Content-Type': 'application/json'
//         },
//         body: JSON.stringify({
//             username: 'kminchelle',
//             password: '0lelplR',
//         })
//     });
//
//     const data = await response.json();
//     console.log(data);
// }
//
// main();


// /**
//  * УПРАЖНЕНИЕ: Создать генератор 3-х идей от скуки
//  * https://www.boredapi.com/api/activity
//  * с отображением на странице
//  */
//
// const wrapper = document.querySelector('.wrapper');
//
// async function getActivity() {
//     const response = await fetch('https://www.boredapi.com/api/activity');
//     return response.json();
// }
//
// async function generate() {
//     try {
//         wrapper.innerHTML = '';
//         const data = await Promise.all([
//             getActivity(),
//             getActivity(),
//             getActivity(),
//         ]);
//         for (const item of data) {
//             const element = document.createElement('div');
//             element.innerHTML = `${item.activity}`;
//             wrapper.appendChild(element);
//         }
//     } catch(e) {
//         console.error(e);
//     }
// }