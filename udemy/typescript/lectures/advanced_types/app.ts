// /**
//  * === Union ===
//  * Возможность сказать, что в переменной может находится
//  * тот или иной тип при различных обстоятельствах
//  */
//
// function logId(id: string | number | boolean) {
//     if (typeof id === 'string') {   // Сужение типа
//         console.log(id.toLowerCase());
//     } else {
//         console.log(id)
//     }
// }
//
// function logError(err: string | string[]) {
//     if (Array.isArray(err)) {
//         err.forEach(element => {
//             console.log(element);
//         });
//     } else {
//         console.log(err);
//     }
// }
//
// function logObject(obj: { a: number } | { b: number }) {
//     if ('a' in obj) {
//         console.log(obj.a);
//     } else {
//         console.log(obj.b);
//     }
// }
//
// // Пересекающееся скойство
// function logMultipleIds(
//     a: string | number,
//     b: string | boolean
// ) {
//     if (a === b) {
//         // Только строка
//     } else {
//         // Все остальные типы
//     }
// }
//
//
// /**
//  * === Literal Types ===
//  */
//
// // Вариант 1: Использование ENUM
// // но на каждый чих делать enum может быть утомительно
// enum RequestType {
//     GET = 'get',
//     POST = 'post'
// }
// function fetchWithAuth(url: string, method: RequestType) {}
//
// // Вариант 2: Использование литерального типа
// function fetchWithAuth(url: string, method: 'post' | 'get') {}
//
// let a: 'qwerty' = 'qwerty';
// a = 'ytrewq';   // Так уже нельзя, т.к. а имеет строгий литереальный тип
//
//
// /**
//  * === Type Aliases ===
//  */
//
// type httpMethod = 'post' | 'get';
//
// function fetchWithAuth(url: string, method: httpMethod) {}
//
// // Вариант 1: Для непересекающихся полей
//
// type User = {
//     name: string,
//     age: number,
//     skills: string[]
// }
//
// type Role = {
//     id: number
// }
//
// type UserWithRole = User & Role;
//
// let user: UserWithRole = {
//     name: 'Name',
//     age: 37,
//     skills: ['1', '2'],
//     id: 1 
// }
//
// // Вариант 2: Для пересекающихся полей
//
// type User = {
//     name: string,
//     age: number,
//     skills: string[]
// }
//
// type Role = {
//     name: string,
//     id: number
// }
//
// type UserWithRole = {
//     user: User,
//     role: Role
// }
//
// let user: UserWithRole = {
//     user: {
//         name: 'Name',
//         age: 37,
//         skills: ['1', '2']
//     },
//     role: {
//         name: 'Admin',
//         id: 1
//     }
// }
//
//
// /**
//  * === Interfaces ===
//  */
//
// interface User {
//     name: string,
//     age: number,
//     skills: string[],
//     log: (id: number) => string;     // function
// }
//
// interface Role {
//     roleId: number
// }
//
// interface UserWithRole extends User, Role {
//     createAt: Date
// }
//
// let user: UserWithRole = {
//     name: 'Name',
//     age: 37,
//     skills: ['1', '2'],
//     roleId: 1,
//     createAt: new Date(),
//
//     log(id) {
//         return '';
//     }
// }
// //
// interface UserDictionary1 {
//     [index: number]: User
// }
//
// type UserDictionary2 = {
//     [index: number]: User
// }
//
// type UserDictionary3 = Record<number, User>;
//
//
// /**
//  * === Types or Interface ===
//  * - У interface есть возможность его доопределить
//  * - Interface - хорош при работе с объектами
//  * - У type есть возможность union с простыми типами (string | number)
//  * - Type - хорош при работе с примитивными типами
//  */
//
// interface User {
//     name: string
// }
//
// interface User {    // Доопределение интерфейса
//     age: number
// }
//
// // Merge интерфейсов (у Type такого нет)
// const user: User = {
//     name: 'Name',
//     age: 37
// }
//
//
// /**
//  * === Optional ===
//  */
//
// interface User {
//     login: string,
//     password?: string   // ? - опциональное поле
// }
//
// const user: User = {
//     login: 'name@mail.com'
// }
//
// // Необязательное поле
// function multiply(first: number, second?: number): number {
//     return !second ? first * first : first * second;
// }
//
// // Значение по умолчанию
// function sum(first: number, second: number = 5): number {
//     return !second ? first + first : first + second;
// }
// //
// interface UserPro {
//     login: string,
//     password?: {
//         type: 'primary' | 'secondary'
//     };
// }
//
// function testPass(user: UserPro) {
//     const t = user.password?.type;  // Можем обратиться к типу, которого может не быть
// }
// //
// function test(param?: string) {
//     const t = param ?? multiply(5); // Если param = null или undifined, то выполняем функцию multiply
// }
//
//
// /**
//  * УПРАЖНЕНИЕ: Типизируем ответ сервера
//  * test_03.json
//  */
//
// enum PaymentStatus {
//     SUCCESS = 'success',
//     FAILED = 'failed'
// }
//
// interface IPayment {
//     sum: number,
//     from: number,
//     to: number
// }
//
// interface IDataSuccess extends IPayment {
//     databaseId: number
// }
//
// interface IDataFailed {
//     errorMessage: string,
//     errorCode: string
// }
//
// // Вариант не очень хорош, т.к. для IDataFailed 
// // можно подсунуть статус-код success
// interface IResponse {
//     status: PaymentStatus,
//     data: IDataSuccess | IDataFailed
// }
//
// interface IResponseSuccess {
//     status: PaymentStatus.SUCCESS,
//     data: IDataSuccess
// }
//
// interface IResponseFailed {
//     status: PaymentStatus.FAILED,
//     data: IDataFailed
// }
//
// function get(): IResponseSuccess | IResponseFailed {}
//
//
// /**
//  * === Void ===
//  * Функция ничего не возвращает
//  * Можно обозначить функцию, результат работы которой нам не важен
//  */
//
// function logId(id: string | number): void {
//     console.log(id);
// }
//
// type voidFunc = () => void;
//
// const f1: voidFunc = () => {}
//
// const f2: voidFunc = () => {
//     return true;    // Возврат будет игнорироваться
// }
//
//
// /**
//  * === Unknown ===
//  * Не путать с any
//  */
//
// let input: unknown;
//
// input = 3;
// input = ['dtg', 'drg'];
//
// // let res: string = input;    // Мы не можем так сделать пока не определим что это за тип
//
// function run(i: unknown) {
//     if (typeof i == 'number') {
//         // Здесь тип i - число
//         i++;
//     } else {
//         // Здесь тип i - unknown, т.е. сужения типа не происходит
//         i;
//     }
// }
//
// async function getData() {
//     try {
//         await fetch('');
//     } catch (error) {
//         // Тип error - unknown, а значит у него нет каких-либо полей,
//         // например message.  Поэтому нужно делать:
//         // явное приведение - только если 100% понимаем, что там Error
//         const e = error as Error;
//         // или проверку на тип - более безопасно
//         if (error instanceof Error) {
//             console.log(error.message);
//         }
//     }
// }
//
//
// /**
//  * === Never ===
//  */
//
// function generateError(message: string): never {
//     // Никогда ничего не возвращает
//     throw new Error(message);
// }
//
// function dumpError(): never {
//     // Никогда не выйдем из функции
//     while(true) {}
// }
//
// function recursion(): never {
//     // Бесконечная рекурсия. Закончится стек, но из функции мы не вернемся
//     return recursion();
// }
//
// // Пример использования 1
// type paymentAction = 'refund' | 'checkout';
//
// function processAction(action: paymentAction) {
//     switch (action) {
//         case 'refund':
//             // ...
//             break;
//         case 'checkout':
//             // ...
//             break;
//         default:
//             const _: never = action; // Если появится новый корректный paymentAction,
//                                      // то мы увидим ошибку на этапе компиляции
//             throw new Error('Нет такого action');
//     }
// }
//
//
// /**
//  * === Null ===
//  */
//
//
// /**
//  * === Приведение типов ===
//  */
//
//
// /**
//  * === Type Guard ===
//  * Помогают ограничить тип при проверке
//  */
//
// function logId(id: string | number) {
//     if (isString(id)) { // Пример использования Type Guard
//         console.log(id);
//     } else {
//         console.log(id++);
//     }
// }
//
// // Пример Type Guard
// function isString(x: string | number): x is string {
//     return typeof x === 'string';
// }
//
// interface User {
//     name: string;
//     email: string;
//     login: string;
// }
//
// interface Admin {
//     name: string;
//     role: number;
// }
//
// // Еще пример Type Guard
// function isAdmin(user: User | Admin): user is Admin {
//     return 'role' in user;
// }
//
// function setRoleZero(user: User | Admin) {
//     if (isAdmin(user)) {
//         user.role = 0;
//     } else {
//         throw new Error('Пользователь не админ');
//     }
// }
//
//
// /**
//  * === Asserts ===
//  * Должен кидать ошибку, если проверка не прошла
//  */
//
// interface User {
//     name: string;
// }
//
// const a = {};
// assertUser(a);
// a.name = 'Vasya';
//
// function assertUser(obj: unknown): asserts obj is User {
//     if (typeof obj === 'object' && !!obj && 'name' in obj) {
//         return;
//     }
//     throw new Error('Не пользователь');
// }