// /**
//  * === Inner Generics ===
//  */
//
// async function test() {
//     const a = await new Promise<number>((resolve, reject) => {
//         resolve(1);
//     });
// }
//
// const check: Record<string, boolean> = {
//     drive: true,
//     kpp: false
// }
//
//
// /**
//  * === Function with generics ===
//  */
//
// function logMiddleware<T>(data: T): T {
//     console.log(data);
//     return data;
// }
//
// const res1 = logMiddleware<number>(10);
// const res2 = logMiddleware<string>('test');
//
// function getSplitedHalf<T>(data: Array<T>): Array<T> {
//     const len = data.length / 2;
//     return data.splice(0, len);
// }
//
// getSplitedHalf([1, 2, 3]);
// getSplitedHalf(['a', 'b', 'c']);
//
//
// /**
//  * Упражнение: Функция преобразования в строку
//  * Необходимо написать функцию toString, которая принимает любой тип
//  * и возвращает его строковое представление. Если не может, то
//  * возвращает undefined
//  */
//
// function toString<T>(data: T): string | undefined {
//     if (Array.isArray(data)) {
//         return data.toString();
//     }
//     switch (typeof data) {
//         case 'string':
//             return data;
//         case 'number':
//         case 'symbol':
//         case 'bigint':
//         case 'boolean':
//         case 'function':
//             return data.toString();
//         case 'object':
//             return JSON.stringify(data);
//         default:
//             return undefined;
//     }
// }
//
//
// /**
//  * === Generics в типах ===
//  */
//
// interface ILogLine<T> {
//     timeStamp: Date;
//     data: T;
// }
//
// const logLine1: ILogLine<{ a: number }> = {
//     timeStamp: new Date(),
//     data: {
//         a: 1
//     }
// }
//
// type LogLineType<T> = {
//     timeStamp: Date;
//     data: T;
// }
//
// const logLine2: LogLineType<{ a: number }> = {
//     timeStamp: new Date(),
//     data: {
//         a: 1
//     }
// }
//
//
// /**
//  * === Ограничение Generics ===
//  */
//
// class Vehicle {
//     run: number;
// }
//
// class LCV extends Vehicle {
//     capacity: number;
// }
//
// function kmToMiles<T extends Vehicle>(vehicle: T): T {
//     vehicle.run = vehicle.run / 0.62;
//     return vehicle;
// }
//
// const vehicle = kmToMiles(new Vehicle());
// const lcv = kmToMiles(new LCV());
// const other = kmToMiles({ run: 1 });
//
// function logId<T extends string | number, Y>(id: T, additionalData: Y): {id: T, data: Y} {
//     console.log(id);
//     console.log(additionalData);
//     return { id, data: additionalData }
// }
//
//
// /**
//  * Упражнение: Функция сортировки id
//  * Необходимо написать функцию сортировки любых
//  * объектов, которые имеют id по убыванию и по возрастанию
//  */
//
// const data = [
// 	{ id: 2, name: 'Петя' },
// 	{ id: 1, name: 'Вася' },
// 	{ id: 3, name: 'Надя' },
// ];
//
// interface ID {
//     id: number;
// }
//
// function sort<T extends ID>(data: T[], type: 'ask' | 'desc' = 'ask'): T[] {
//     return data.sort((a, b) => {
//         switch (type) {
//             case 'ask':
//                 return a.id - b.id;
//             case 'desc':
//                 return b.id - a.id;
//         }
//     });
// }
//
// console.log(sort(data, 'desc'));
// console.log(sort(data));
//
//
// /**
//  * === Generic классы ===
//  */
//
// class Resp<D, E> {
//     data?: D;
//     error?: E;
//
//     constructor(data?: D, error?: E) {
//         if (data)  { this.data = data; }
//         if (error) { this.error = error; }
//     }
// }
//
// const resp1 = new Resp<string, number>('data');
//
// // Наследник не может переопределить generic родителя,
// // но может добавить свой generic
// class HTTPResp<T> extends Resp<string, number> {
//     code: T;
//
//     setCode(code: T) {
//         this.code = code;
//     }
// }
//
// const resp2 = new HTTPResp();
//
//
// /**
//  * === Mixins ===
//  * Позволяет наследоваться от нескольких классов одновременно
//  */
//
// type Constructor = new (... args: any[]) => { }
// type GenericConstructor<T = {}> = new (... args: any[]) => T
//
// class List {
//     constructor(public items: string[]) { }
// }
//
// class Accordion {
//     isOpened: boolean;
// }
//
// type ListType = GenericConstructor<List>;
// type AccordionType = GenericConstructor<Accordion>;
//
// class ExtendedListClass extends List {
//     first() {
//         return this.items[0];
//     }
// }
//
// // Миксины часто пишут с большой буквы
// function ExtendedList<TBase extends ListType & AccordionType>(Base: TBase) {
//     return class ExtendedList extends Base {
//         first() {
//             // Доступен и this.isOpened
//             return this.items[0];
//         }
//     }
// }
//
// class AccordeonList {
//     isOpened: boolean;
//     constructor(public items: string[]) { }
// }
//
// const list = ExtendedList(AccordeonList);
// const res = new list(['first', 'second']);
// console.log(res.first());