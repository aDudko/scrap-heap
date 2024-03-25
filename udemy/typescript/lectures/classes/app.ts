// /**
//  * =================================
//  * === Класс и его контструкторы ===
//  * =================================
//  */
//
// class User {
//     name: string;
//     age: number;
//
//     // Конструкторы реализации
//     // Перегрузка конструкторов
//     constructor();
//
//     constructor(name: string);
//
//     constructor(age: number);
//
//     constructor(name: string, age: number);
//    
//     // Конструктор имплементации
//     // Нужен только для совместимости с остальными конструкторами
//     constructor(ageOrName?: string | number, age?: number) {
//         if (typeof ageOrName === 'string') {
//             this.name = ageOrName;
//         } else if (typeof ageOrName === 'number') {
//             this.age = ageOrName;
//         }
//         if (typeof age === 'number') {
//             this.age = age;
//         }
//     }
// }
//
// const user1 = new User('Vasya');
// const user2 = new User();
// const user3 = new User(33);
// const user4 = new User('Vasya', 33);
//
//
// /**
//  * ==============
//  * === Методы ===
//  * ==============
//  */
//
// enum PaymentStatus {
//     HOLDED,
//     PROCESSED,
//     REVERSED
// }
//
// class Payment {
//     id: number;
//     status: PaymentStatus = PaymentStatus.HOLDED;
//     createdAt: Date = new Date();
//     updatedAt: Date;
//
//     constructor(id: number) {
//         this.id = id;
//     }
//
//     getPaymentLifeTime(): number {
//         return new Date().getTime() - this.createdAt.getTime();
//     }
//
//     unholdPayment(): void {
//         if (this.status == PaymentStatus.PROCESSED) {
//             throw new Error('Платеж не может быть возвращен');
//         }
//         this.status = PaymentStatus.REVERSED;
//         this.updatedAt = new Date();
//     }
// }
//
// const payment = new Payment(1);
// payment.unholdPayment();
// const time = payment.getPaymentLifeTime();
//
//
// /**
//  * Упражнение: Перегрузка методов
//  */
//
// class User {
//     skills: string[];
//
//     // Перегрузка методов класса
//     addSkill(skill: string): void;
//     addSkill(skill: string[]): void;
//     addSkill(skillOrSkills: string | string[]): void {
//         if (typeof skillOrSkills == 'string') {
//             this.skills.push(skillOrSkills);
//         } else {
//             this.skills.concat(skillOrSkills)
//         }
//     }
// }
//
// // Перегрузка функции
// function run(distance: number): number;
// function run(distance: string): string;
// function run(distance: number | string): number | string {
//     if (typeof distance == 'number') {
//         return 1;
//     } else {
//         return '';
//     }
// }
//
//
// /**
//  * ==========================
//  * ===  Getter and Setter ===
//  * ==========================
//  * Не должны быть асинхронными
//  */
//
// class User {
//     _login: string;
//     password: string;
//
//     set login(login: string) {
//         this._login = 'user-' + login;
//     }
//
//     get login() {
//         return 'no_login';
//     }
// }
//
// const user = new User();
// user.login = 'myLogin';
// console.log(user);
// console.log(user.login);
//
//
// /**
//  * ==================
//  * === Implements ===
//  * ==================
//  */
//
// interface ILogger {
//     log(...args: any[]): void;
//     error(...args: any[]): void;
// }
//
// class Logger implements ILogger {
//     log(...args: any[]): void {
//         console.log(...args);
//     }
//     async error(...args: any[]): Promise<void> {
//         console.log(...args);
//     }  
// }
//
// interface IPayable {
//     pay(paymentId: number): void;
//     price?: number; // Не обязательное поле
// }
//
// interface IDeleteble {
//     delete(): void;
// }
//
// class User implements IPayable, IDeleteble {
//     pay(paymentId: number): void {
//         //
//     }
//     delete(): void {
//         //
//     }
// }
//
//
// /**
//  * ===============
//  * === Extends ===
//  * ===============
//  */
//
// type PaymentStatus = 'new' | 'paid';
//
// class Payment {
//     id: number;
//     status: PaymentStatus = 'new';
//
//     constructor(id: number) {
//         this.id = id;
//     }
//
//     pay() {
//         this.status = 'paid';
//     }
// }
//
// class PersistedPayment extends Payment {
//     paidAt: Date;
//
//     constructor() {
//         super(Math.random());
//     }
//
//     // Расширение метода
//     override pay(date?: Date) {
//         super.pay();
//         if (date) {
//             this.paidAt = date;
//         }
//     }
//
//     save() {}
// }
//
//
// /**
//  * =================================
//  * === Видимость полей и методов ===
//  * =================================
//  * public       - доступ везде
//  * protected    - доступ из наследников
//  * private      - доступ только внутри класса (в JS устанавливается #data)
//  * По умолчанию public
//  */
//
//
// /**
//  * Упражнение: Корзина товаров
//  * Необходимо сделать корзину (Cart) на сайте,
//  * которая имееет список продуктов (Product), добавленных в корзину
//  * и переметры доставки (Delivery). Для Cart реализовать методы:
//  * - Добавить продукт в корзину
//  * - Удалить продукт из корзины по ID
//  * - Посчитать стоимость товаров в корзине
//  * - Задать доставку
//  * - Checkout - вернуть что всё ок, если есть продукты и параметры доставки
//  * Product: id, название и цена
//  * Delivery: может быть как до дома (дата и адрес) или до пункта выдачи (дата = Сегодня и Id магазина)
//  */
//
// class Product {
//     constructor(
//         public id: number,
//         public title: string,
//         public price: number
//     ) { }
// }
//
// class Delivery {
//     constructor(
//         public date: Date
//     ) { }
// }
//
// class HomeDelivery extends Delivery {
//     constructor(
//         date: Date,
//         public address: string
//     ) {
//         super(date);
//     }
// }
//
// class ShopDelivery extends Delivery {
//     constructor(
//         public shopId: number
//     ) {
//         super(new Date());
//     }
// }
//
// type DeliveryOptions = HomeDelivery | ShopDelivery;
//
// class Cart {
//     private products: Product[] = [];
//     private delivery: DeliveryOptions;
//
//     public addProduct(product: Product): void {
//         this.products.push(product);
//     }
//
//     public deleteProduct(productId: number): void {
//         this.products = this.products.filter((product: Product) => product.id !== productId);
//     }
//
//     public getSum(): number {
//         return this.products
//             .map((product: Product) => product.price)
//             .reduce((price1: number, price2: number) => price1 + price2);
//     }
//
//     public setDelivery(delivery: DeliveryOptions): void {
//         this.delivery = delivery;
//     }
//
//     public checkOut() {
//         if (this.products.length == 0) {
//             throw new Error('Корзина пуста');
//         }
//         if (!this.delivery) {
//             throw new Error('Не указан способ доставки');
//         }
//         return { success: true };
//     }
// }
//
//
// /**
//  * ==============
//  * === Static ===
//  * ==============
//  */
//
//
// /**
//  * ============
//  * === This ===
//  * ============
//  * Ссылается на текущий объект
//  */
//
// class Payment {
//     private date: Date = new Date();
//
//     getDate(this: Payment) {
//         return this.date;
//     }
//
//     // Не теряется контекст
//     getDateArrow = () => {
//         return this.date;
//     }
// }
//
// const payment = new Payment();
//
// const user = {
//     id: 1,
//     paymentDate: payment.getDate.bind(payment), // Передача контекста this
//     paymentDateArrow: payment.getDateArrow
// }
//
// console.log(payment.getDate());
// console.log(user.paymentDate());
// console.log(user.paymentDateArrow());
//
// class PaymentPersistens extends Payment {
//     save() {
//         return this.getDateArrow();
//     }
// }
//
// console.log(new PaymentPersistens().save());
//
//
// /**
//  * ===================================
//  * === Абстрактные методы и классы ===
//  * ===================================
//  */
//
// abstract class Controller {
//     abstract handle(req: any): void;
//
//     handleWithLogs(req: any): void {
//         console.log('Start');
//         this.handle(req);
//         console.log('End');
//     }
// }
//
// class UserController extends Controller {
//     handle(req: any): void {
//         console.log(req);
//     }
// }
//
// const c = new UserController();
// c.handleWithLogs('Request');
//
//
// /**
//  * Упражнение: Адстрактный logger
//  * Необходимо реализовать абстрактный класс Logger с 2-мя методами
//  * абстрактным - log(message): void
//  * printDate - выводящий в log дату
//  * К нему необходимо сделать реальный класс, который бы имел метод: logWithDate,
//  * выводящий сначала дату, а потом заданное сообщение
//  */
//
// abstract class Logger {
//     abstract log(message: string): void;
//
//     printDate(date: Date) {
//         this.log(date.toString());
//     }
// }
//
// class LoggerImpl extends Logger {
//     log(message: string): void {
//         console.log(message);
//     }
//
//     logWithDate(message: string) {
//         this.printDate(new Date());
//         this.log(message);
//     }
// }
//
// const logger = new LoggerImpl();
// logger.logWithDate('My Message');