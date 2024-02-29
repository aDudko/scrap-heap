'use strict'

// /**
//  * SOLID - это принципы, которые лежат в основе дизайна
//  * построения приложения и ООП
//  * S - принцип единой ответственности
//  * O - принцип открытости и закрытости
//  * L - принцип подстановки Барбабы Лисков
//  * I - принцип разделения интерфейса
//  * D - принцип инверсии зависимостей
//  */
//
// // === Принцип единой ответственности ===
// class Character {
//     #inventory = [];
//     #health = 10;
//
//     pickItem(item) {
//         this.#inventory.push(item);
//     }
//
//     recieveDamage(damage) {
//         this.#health -= damage;
//     }
//     // Если реализовать методы save и load тут, то мы нарушим принцип S
// }
//
// class DB {
//     save(item) {
//         localStorage.setItem('char', this);
//     }
//
//     load() {
//         // ...
//     }
// }

// // === Принцип открытости и закрытости ===
//
// class Treasure {
//     value = 0;
// }
//
// class Coin extends Treasure {
//     value = 1;
// }
//
// class Crystal extends Treasure {
//     value = 10;
// }
//
// class Briliant extends Treasure {
//     value = 20;
// }
//
// class Inventory {
//     #score;
//
//     pick(treasure) {
//         if (treasure instanceof Coin) {
//             this.#score += treasure.value;
//         }
//     }
// }

// // === Принцип подстановки Барбабы Лисков ===
//
// class User {
//     #role = 'user';
//     getRole() {
//         return this.#role;
//     }
// }
//
// class Admin extends User {
//     #role = ['user', 'admin'];
//
//     getRole() {
//         return this.#role.join(', ');
//     }
// }
//
// function logRole(user) {
//     console.log('Role: ' + user.getRole().toUpperCase());
// }
//
// logRole(new User());
// logRole(new Admin());

// // === Принцип разделения интерфейса ===
//
// class Weapon {
//     dealDamage() {}
// }
//
// class Rifle extends Weapon {
//     shoot() {
//         this.dealDamage();
//     }
// }
//
// class Sword extends Weapon {
//     strike() {
//         this.dealDamage();
//     }
// }

// // === Принцип инверсии зависимостей ===
//
// class DB {
//     save(items) {
//         console.log(`Saved: ${items}`);
//     }
// }
//
// class Mongo extends DB {
//     save(items) {
//         console.log(`Saved to Mongo: ${items}`);
//     }
// }
//
// class ToDoList {
//     db;
//     items = [1, 2, 3];
//
//     constructor(db) {
//         this.db = db;
//     }
//
//     saveToDB() {
//         this.db.save(this.items);
//     }
// }
//
// const list1 = new ToDoList(new DB());
// list1.saveToDB();
//
// const list2 = new ToDoList(new Mongo());
// list2.saveToDB();