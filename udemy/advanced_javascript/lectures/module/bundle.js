(function () {
    'use strict';

    // /**
    //  * === IIFE в модулях (устаревший способ) ===
    //  */
    //
    // const APP = {};
    //
    // (function() {
    //     const a = 1;
    //
    //     function add(first, second) {
    //         return first + second;
    //     }
    //
    //     function sub(first, second) {
    //         return first - second;
    //     }
    //
    //     APP.calc = {
    //         add,
    //         sub
    //     }
    // })();
    
    
    // /**
    //  * === Модули commonjs ===
    //  * Пример работает только в NodeJS
    //  */
    //
    // function add(first, second) {
    //     return first + second;
    // }
    //
    // function sub(first, second) {
    //     return first - second;
    // }
    //
    // module.exports = { add, sub }
    
    
    // /**
    //  * === ES6 Модули ===
    //  */
    //
    // export function add(first, second) {
    //     return first + second;
    // }
    //
    // export function sub(first, second) {
    //     return first - second;
    // }
    //
    // console.log('module');
    //
    // setTimeout(() => {
    //     add = function(first, second) {
    //         return first * second;
    //     }
    // }, 1500);
    
    
    // /**
    //  * === Await на верхнем уровне ===
    //  */
    //
    // async function getProducts() {
    //     const response = await fetch('https://dummyjson.com/products');
    //     return response.json();
    // }
    //
    // export const products = await getProducts();
    
    
    // /**
    //  * === Процесс сборки ===
    //  */
    //
    function add(first, second) {
        return first + second;
    }

    function sub(first, second) {
        return first - second;
    }

    console.log(add(1, 3));
    console.log(sub(1, 3));

})();
