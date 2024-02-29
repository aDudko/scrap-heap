'use strict'

// /**
//  * === Constructor Functions ===
//  * - Создается пустой объект
//  * - Вызывается User функция
//  * - this = пустому объекту
//  * - Объект связывается с prototype
//  * - Возвращается объект 
//  */
//
// const User = function(email, password) {
//     this.email = email;
//     this.password = password;
// }
//
// const user1 = new User('a@a.ru', '123');
// console.log(user1);
//
// const user2 = new User('b@b.ru', '456');
// console.log(user2);
// console.log(user2 instanceof User);


// /**
//  * === Prototype ===
//  * 
//  */
//
// const Book = function(title, author) {
//     this.title = title;
//     this.author = author;
//     this.isRead = false;
// }
//
// Book.prototype.read = function() {
//     this.isRead = true;
// }
//
// const lordOfTheRing = new Book('Lord of the ring', 'Tolkien');
// lordOfTheRing.read();
// console.log(lordOfTheRing);
// console.log(lordOfTheRing.__proto__);
// console.log(lordOfTheRing.__proto__ === Book.prototype);
// console.log(Book.prototype.isPrototypeOf(lordOfTheRing));
// console.log(Book.prototype.isPrototypeOf(Book));


// /**
//  * УПРАЖНЕНИЕ: Корзина товаров
//  * Реализовать с помощью функций и прототипов корзину товаров с методами:
//  * - Добавить товар
//  * - Увеличить число товаров
//  * - Уменьшить число товаров (удалить, если их 0)
//  */
//
// const product = {id : 1, name: 'Bread', count: 1};
//
// const Cart = function() {
//     this.products = [];
// }
//
// Cart.prototype.addProduct = function(product) {
//     if (this.products.find(product => product.id === product.id)) {
//         return;
//     }
//     this.products.push(product);
// }
//
// Cart.prototype.increaseAmount = function(id) {
//     this.products = this.products.map(product => {
//         if (product.id == id) {
//             product.count++;
//             return product;
//         }
//         return product;
//     })
// }
//
// Cart.prototype.decreaseAmount = function(id) {
//     this.products = this.products.map(product => {
//         if (product.id == id) {
//             product.count--;
//             return product;
//         }
//         return product;
//     }).filter(product => product.count > 0);
// }
//
// const cart = new Cart();
// cart.addProduct(product);
// cart.increaseAmount(1);
//
// console.log(cart);


/**
 * === ES6 Classes ===
 * - Классы не поднимаются наверх
 * - Классы как и функции могут быть переданы и возвращены из функции
 * - Тело класса всегда исполняется в strict режиме
 */
// // Getter and Setter
//
// class Book {
//     isRead = false
//
//     constructor(title, author) {
//         this.title = title;
//         this.author = author;
//     }
//
//     read() {
//         this.isRead = true;
//     }
//
//     get isRead() {                  // Getter
//         return this.isRead;
//     }
//
//     set isRead(read) {              // Setter
//         this.isRead = read;
//     }
// }
//
// const lordOfTheRings = new Book('Lord of the rings', 'Tolkien');
// console.log(lordOfTheRings);
// console.log(lordOfTheRings.isRead); // Вызов Getter
//
// lordOfTheRings.isRead = true;       // Вызов Setter - Гавно какое-то!!!
// console.log(lordOfTheRings.isRead);
//
// // Static
//
// class Book {
//     constructor(title, author) {
//         this.title = title;
//         this.author = author;
//     }
//
//     static a = 1;                   // Статичная переменная
//
//     static hello() {                // Статичный метод
//         console.log('Hello!');
//     }
//
//     static {                        // Статичный блок
//         this.a = 5;
//         let b = 5;
//     }
// }
//
// Book.hello(); // Вызов статического метода
// console.log(Book.a);
//
// // Private
//
// class Car {
//     #vin = 6;                       // private field
//
//     #changeVin() {
//         console.log('changed');
//     }
//
//     test() {
//         this.#changeVin();
//     }
//
//     static #field = 3;
// }
//
// const car = new Car();
// car.test();


// /**
//  * УПРАЖНЕНИЕ: Реализовать класс пользователя, со свойствами
//  * - логин
//  * - пароль
//  * Причем пароль при установке должен переворачиваться и в таком виде храниться.
//  * Пароль и логин после создания изменить нельзя. Так же классу добавить методы
//  * - Смена пароля (передаем старый и новый пароль)
//  * - Сверка пароля
//  */
//
// class User {
//
//     #login;
//     #_password;
//
//     constructor(login, password) {
//         this.#login = login;
//         this.#password = password;
//     }
//
//     set #password(pass) {
//         this.#_password = pass.split('').reverse().join('');
//     }
//
//     get #password() {
//         return this.#_password.split('').reverse().join('');
//     }
//
//     get login() {
//         return this.#login;
//     }
//
//     checkPassword(pass) {
//         return this.#password === pass;
//     }
//
//     changePassword(oldPass, newPass) {
//         if (!this.checkPassword(oldPass)) {
//             return false;
//         }
//         this.#password = newPass;
//         return true;
//     }
// }
// const user = new User('a@a.', '123');
// console.log(user);
// console.log(user.checkPassword('234'));
// console.log(user.checkPassword('123'));
// console.log(user.changePassword('123', '234'));
// console.log(user);


// /**
//  * ===== Object.create() =====
//  */
//
// const User = {
//     init(email, password) {
//         this.email = email;
//         this.password = password;
//     },
//     log() {
//         console.log('Log');
//     }
// };
//
// const user = Object.create(User);       // Наследование
// console.log(user);
// user.log();
// user.init('a@a.ru', '123')
// console.log(user.__proto__ == User);
// const admin = Object.create(user);
// console.log(admin);
// admin.log();
// console.log(admin.email);


// /**
//  * === Абстракция и Инкапсуляция ===
//  */
//
// class Film {
//     #name;
//     #author;
//     rating;
//     #length;
//
//     constructor(name, author, length) {
//         this.#name = name;
//         this.#author = author;
//         this.#length = length;
//     }
//
//     get name() {
//         return this.#name;
//     }
//
//     get author() {
//         return this.#author;
//     }
//
//     get length() {
//         return this.#length;
//     }
// }
//
// console.log(new Film('Avatar', 'Cameron', 240));


// /**
//  * === Наследование ===
//  */
//
// const Book = function(title, author) {
//     this.title = title;
//     this.author = author;
// }
//
// Book.prototype.buy = function() {
//     console.log('Buy');
// }
//
// const AudioBook = function(title, author, lenMin) {
//     Book.call(this, title, author);
//     this.lenMin = lenMin;
// }
//
// AudioBook.prototype = Object.create(Book.prototype);
// AudioBook.prototype.constructor = AudioBook;
//
// AudioBook.prototype.log = function() {
//     console.log(`${this.title} - ${this.lenMin}`);
// }
//
// const book = new AudioBook('Lord of the Rings', 'Tolkien', 20 * 60);
//
// console.log(book);
// console.log(book instanceof AudioBook);
// console.log(book instanceof Book);


// /**
//  *=== Наследование в ES6 ===
//  */
//
// class Book {
//     constructor(title, author) {
//         this.title = title;
//         this.author = author;
//     }
//
//     buy = function() {
//         console.log('Buy');
//     }
// }
//
// class AudioBook extends Book {      // Вот это норм
//     constructor(title, author, lenMin) {
//         super(title, author);
//         this.lenMin = lenMin;
//     }
//
//     log() {
//         console.log(`${this.title} - ${this.lenMin}`);
//     }
// }
//
// const book = new AudioBook('Lord of the Rings', 'Tolkien', 20 * 60);
//
// console.log(book);
// console.log(book instanceof AudioBook);
// console.log(book instanceof Book);


// /**
//  * === Перегрузка методов и свойств ===
//  */
//
// class Book {
//     constructor(title, author) {
//         this.title = title;
//         this.author = author;
//     }
//
//     info() {
//         console.log(`${this.title} - ${this.author}`);
//     }
// }
//
// const book1 = new Book('Lord of the Rings', 'Tolkien');
// book1.info();
//
// class EBook extends Book {
//     constructor(title, author, pages) {
//         super(title, author);
//         this.pages = pages;
//     }
//
//     info() {
//         console.log(`${this.title} - ${this.author} - ${this.pages}`);
//     }
// }
//
// const book2 = new EBook('Lord of the Rings', 'Tolkien', 100);
// book2.info();


// /**
//  * === УПРАЖНЕНИЕ: Удар по орку ===
//  * - Создать класс врага со здоровьем и методом получения урона
//  * - Создать класс меча, который имеет силу и метод нанесения урона
//  * - Создать класс орка, который в 50% случаев не получает урон
//  */
//
// class Enemy {
//     health = 50;
//     constructor(health) {
//         this.health = health;
//     }
//
//     recieveDamage(damage) {
//         this.health = this.health - damage;
//         console.log(this.health);
//     }
// }
//
// class Sword {
//     #damage;
//
//     constructor(damage) {
//         this.#damage = damage;
//     }
//
//     strike(enemy) {
//         enemy.recieveDamage(this.#damage);
//     }
// }
//
// class Orc extends Enemy {
//     constructor(health) {
//         super(health);
//     }
//
//     recieveDamage(damage) {
//         if (Math.random() > 0.5) {
//             this.health = this.health - damage;
//         }
//         console.log(this.health);
//     }
// }
//
// const enemy = new Orc(10);
// const sword = new Sword(3);
// sword.strike(enemy);
// sword.strike(enemy);
// sword.strike(enemy);
// sword.strike(enemy);


// /**
//  * === Полиморфизм ===
//  * - Ad-hock полиморфизм - возможность по разному исполнять функцию в зависимости от типов данных
//  * - Параметрический полимрфизм - выполнение одной и той же функции с разным типом аргументов
//  * - Полиморфизм подтипов <-- ООП
//  */


// /**
//  * === Паттерн Builder и Chaining
//  * - Chaining - последовательное применение методов к одному и тому же объекту
//  * let arr = [1, 2, 3];
//  * arr = arr.map(a => a * 2).filter(a => a > 0).find(a => a < 100);
//  * console.log(arr);
//  */
// // - Builder
// class Builder {
//     house = {};
//
//     addRoof() {
//         this.house.roof = 'Roof';
//         return this;
//     }
//
//     addFloor() {
//         this.house.floor = 'Floor';
//         return this;
//     }
//
//     execute() {
//         return this.house;
//     }
// }
//
// const builder = new Builder().addRoof().addFloor().execute();
// console.log(builder);