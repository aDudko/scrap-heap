// /**
//  * === Keyof ===
//  * Позволяет вытащить ключи из класса или объекта
//  * Отсылка к ключам объекта
//  */
//
// interface IUser {
//     name: string;
//     age: number;
// }
//
// type KeysOfUser = keyof IUser;
//
// const key: KeysOfUser = 'age';
//
// function getValue<T, K extends keyof T>(obj: T, key: K) {
//     return obj[key];
// }
//
//
// /**
//  * Упражнение: Функция группировки
//  * Необходимо написать функцию группировки, которая принимает массив объектов
//  * и его ключ, производит группировку по указанному ключу и возращает
//  * сгруппированный объект.
//  * Пример:
//  * ``` js
//  * [
//  *  { group: 1, name: 'a' },
//  *  { group: 1, name: 'b' },
//  *  { group: 2, name: 'c' },
//  * ];
//  * ```
//  * При группироке по 'group' ---->
//  * ``` js
//  * {
//  * 	'1': [ { group: 1, name: 'a' }, { group: 1, name: 'b' } ],
//  * 	'2': [ { group: 2, name: 'c' } ]
//  * }
//  * ```
//  */
//
// interface Data {
//     group: number;
//     name: string;
// }
//
// const data: Data[] = [
//     { group: 1, name: 'a' },
//     { group: 1, name: 'b' },
//     { group: 2, name: 'c' },
// ];
//
// interface IGroup<T> {
//     [key: string]: T[];
// }
//
// type key = string | number | symbol;
//
// function group<T extends Record<key, any>>(array: T[], key: keyof T): IGroup<T> {
//     return array.reduce<IGroup<T>>((map: IGroup<T>, item) => {
//         const itemKey = item[key];
//         let curEl = map[itemKey];
//         if (Array.isArray(curEl)) {
//             curEl.push(item);
//         } else {
//             curEl = [item];
//         }
//         map[itemKey] = curEl;
//         return map;
//     }, {});
// }
//
// const res = group<Data>(data, 'group');
// console.log(res);
//
//
// /**
//  * === Typeof ===
//  */
//
// let strOrNum1: string | number;
// let strOrNum2: typeof strOrNum1;    // Возьми тип от strOrNum1
//
// const user = {
//     name: 'Vasya'
// };
//
// type keyOfUser = keyof typeof user; // Берем ключи от типа
//
// enum Direction {
//     UP,
//     DOWN
// }
//
// type dir = keyof typeof Direction;  // 'UP' | 'DOWN'
//
//
// /**
//  * === Indexed Acceess Types ===
//  * Обращение по индексу в типах
//  */
//
// interface Role {
//     name: string;
// }
//
// interface Permitions {
//     endDate: Date;
// }
//
// interface User {
//     name: string;
//     roles: Role[];
//     permition: Permitions;
// }
//
// const user: User = {
//     name: 'Vasya',
//     roles: [],
//     permition: {
//         endDate: new Date()
//     }
// }
//
// const userName = user['name'];          // Значение
// type userRoles = User['roles'];         // Тип
// type roleType = User['roles'][number];
// type dateType = User['permition']['endDate'];
//
// // Union-тип элементов массива
// const roles = ['user', 'admin', 'root'] as const;
// type roleTypes = typeof roles[number];  // Строковые типы
//
//
// /**
//  * === Conditional Types ===
//  */
//
// interface HTTPResponse<T extends 'success' | 'failed'> {
//     code: number;
//     data: T extends 'success' ? string : Error;
// }
//
// const suc: HTTPResponse<'success'> = {
//     code: 200,
//     data: 'done'
// }
//
// const err: HTTPResponse<'failed'> = {
//     code: 400,
//     data: new Error()
// }
//
//
// /**
//  * === Infer ===
//  * Псевдообъявляет переменную типа внутри extends
//  * Вытаскивает тип для последующего использования в Conditional Types
//  */
//
// function runTransaction(transaction: {
//     fromTo: [string, string]
// }) {
//     console.log(transaction);
// }
//
// const transaction: GetFirstArg<typeof runTransaction> = {
//     fromTo: ['1', '2']
// }
//
// runTransaction(transaction);
//
// type GetFirstArg<T> = T extends (first: infer First, ... args: any[]) => any ? First : never;
//
//
// /**
//  * === Mapped Types ===
//  */
//
// type Modifier = 'read' | 'update' | 'create';
//
// type UserRoles = {
//     customers?: Modifier,
//     projects?: Modifier,
//     adminPanel?: Modifier
// }
//
// type ModifierToAccess<Type> = {
//     // Синтаксический УЖАС O_O
//     +readonly [Property in keyof Type as `canAccess${string & Property}`]-?: boolean;
// }
//
// type UserAcceess = ModifierToAccess<UserRoles>;
//
//
// /**
//  * Упражнение: Валидация форм
//  * Необходимо сделать тип для результата валидации
//  * формы, основываясь на типе формы
//  */
//
// interface IForm {
//     name: string;
//     password: string;
// }
//
// const form: IForm = {
//     name: 'Wasya',
//     password: '123'
// }
//
// const formValidation: Validation<IForm> = {
//     name: { isValid: true },
//     password: { isValid: false, errorMessage: 'Должен быть длинее 5 символов' }
// }
//
// type Validation<T> = {
//     [K in keyof T]: {
//         isValid: true;
//     } | {
//         isValid: false;
//         errorMessage: string;
//     }
// }
//
//
// /**
//  * === Template Literal Types ===
//  */
//
// // Пример 1
// type ReadOrWrite = 'read' | 'write';
// type Bulk = 'bulk' | '';
//
// type Access = `can${Capitalize<ReadOrWrite>}${Capitalize<Bulk>}`;   // Запаковка типов
//
// type ReadOrWriteBulk<T> = T extends `can${infer R}` ? R : never;    // Распаковки типов
// type T = ReadOrWriteBulk<Access>;
//
// // Пример 2
// type ErrorOrSuccess = 'error' | 'success';
//
// interface ResponceType {
//     result: `http${Capitalize<ErrorOrSuccess>}`
// }
//
// const a: ResponceType = {
//     result: 'httpError'
// }