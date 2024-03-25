// /**
//  * ===================================
//  * === Partial, Required, Readonly ===
//  * ===================================
//  */
//
// interface User {
//     name: string;
//     age?: number;
//     email: string;
// }
//
// // Все поля интерфейса не обязательны
// type partial = Partial<User>;
// // Нужно применять аккуратно, т.к. const p: partial = { } - валидно,
// // но это не всегда верно (нафиг нам пустой валидный объект).
//
// // Все поля интерфейса обязательны
// type required = Required<User>;
//
// // Все поля интерфейса не изменяемы
// type readonly = Readonly<User>;
//
//
// /**
//  * ====================================
//  * === Pick, Omit, Extract, Exclude ===
//  * ====================================
//  */
//
// interface PaymentPersistance {
//     id: number;
//     sum: number;
//     from: string;
//     to: string;
// }
//
// //Исключаем id
// type OmitPayment = Omit<PaymentPersistance, 'id'>;
//
// // Берем только поля from и to
// type PickPayment = Pick<PaymentPersistance, 'from' | 'to'>;
//
// // Вытаскиваем из Union типа только строки
// type ExtractPayment = Extract<'from' | 'to' | PaymentPersistance, string>;
//
// // Исключаем из Union типа все строки
// type ExcludePayment = Exclude<'from' | 'to' | PaymentPersistance, string>;
//
//
// /**
//  * =====================================================
//  * === ReturnType, Parameters, ConstructorParameters ===
//  * =====================================================
//  */
//
// class User {
//     constructor(public id: number, public name: string) { }
// }
//
// function getUser(id: number): User {
//     return new User(id, 'Vasya');
// }
//
// // Возвращаемый функцией тип
// type RT = ReturnType<typeof getUser>;
//
// // Параметры функции
// type PT = Parameters<typeof getUser>;
//
// // Параметры конструктора класса
// type CP = ConstructorParameters<typeof User>;
//
//
// /**
//  * ===============
//  * === Awaited ===
//  * ===============
//  */
//
// // Получить тип, который возвращает Promise
// type A1 = Awaited<Promise<string>>;
// type A2 = Awaited<Promise<Promise<string>>>;
//
// // Пример 1
// interface IMenu {
//     name: string;
//     url: string;
// }
//
// async function getMenu(): Promise<IMenu[]> {
//     return [{name: 'Аналитика', url: 'analytics'}];
// }
//
// type R = Awaited<ReturnType<typeof getMenu>>;
//
// // Пример 2
// async function getArray<T>(x:T): Promise<Awaited<T>[]> {
//     return [await x];
// }