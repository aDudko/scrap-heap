// /**
//  * ===== Соответствие типов =====
//  * 
//  *    TypeScript      JavaScript
//  * 
//  *     number          number
//  *     string          string
//  *     boolean         boolean
//  *     object          object
//  *     Array           Array
//  *     Tuples          Array
//  *     Enum  
//  */
//
// /**
//  * === Использование типов ===
//  */
//
// let num: number = 500;
// let str: string = "500";
// let bool: boolean = true;
//
//
// /**
//  * === Типы в функциях ===
//  */
//
// function getFullName(firstname: string, surname: string): string {
//     return `${firstname} ${surname}`
// }
//
// // Стрелочная функция
// const getFullNameArrow = (firstname: string, surname: string): string => {
//     return `${firstname} ${surname}`
// }
//
//
// /**
//  * === Объекты ===
//  */
//
// const user = {
//     firstname: "Name",
//     surname: "Famuly_Name",
//     city: "City",
//     age: 37,
//     skills: {
//         dev: true,
//         devops: true
//     }
// }
//
// function getFullName(userEntity: { firstname: string, surname: string }): string {
//     return `${userEntity.firstname} ${userEntity.surname}`
// }
//
// console.log(getFullName(user));
//
//
// /**
//  * УПРАЖНЕНИЕ: Типизация объектов
//  * Типизировать объект из файла test_01.json
//  */
//
// let info: {
//     officeId: number,
//     isOpened: boolean,
//     contacts: {
//         phone: string,
//         email: string,
//         address: {
//             city:string
//         }
//     }
// }
//
//
// /**
//  * === Массивы ===
//  */
//
// const skills: string[] = ['Dev', 'DevOps', 'Testing'];
//
// for (const skill of skills) {
//     console.log(skill.toLowerCase());
// }
//
// const result = skills
//     .filter((s: string) => s !== 'DevOps')
//     .map(s => s + '! ')
//     .reduce((a, b) => a + b);
//
// console.log(result);
//
//
// /**
//  * === Tuples ===
//  * Кортежи
//  */
//
// const skill: [number, string] = [1, 'Dev'];
// const id = skill[0];
// const skillName = skill[1];
// const [id, skillName] = skill;
//
// const array: [number, string, ...boolean[]] = [1, 'Dev', true, false, true];
//
//
// /**
//  * === ReadOnly ===
//  * Как для массива, так и для Tupple
//  */
//
// const skill: readonly [number, string] = [1, 'Dev'];
// const skills: ReadonlyArray<string> = ['Dev', 'DevOps'];
//
//
// /**
//  * === Enums ===
//  */
//
// function compute() {
//     return 3;
// }
//
// enum StatusCode {
//     SUCCESS = 1,
//     IN_PROGRESS = compute(),
//     FAILED = 'failed'
// }
//
// const result = {
//     message: 'Платеж успешен',
//     statusCode: StatusCode.SUCCESS
// };
//
// if (result.statusCode === StatusCode.SUCCESS) {}
//
// function action(status: StatusCode) {}
//
// // Константный enum
// const enum Roles {
//     ADMIN = 1,
//     USER = 2
// }
//
// const result2 = Roles.ADMIN;
//
//
// /**
//  * УПРАЖНЕНИЕ: Переписать функцию с JS на TS
//  * См. test_02.json
//  */
//
// enum QuestionStatus {
//     PUBLISHED = 'published',
//     DRUFT = 'druft',
//     DELETED = 'deleted'
// }
//
// async function getFaqs(req: {
//     topicId: number,
//     status?: QuestionStatus
// }): Promise<{
//     question: string,
//     answer: string,
//     tags: string[],
//     likes: number,
//     status: QuestionStatus
// }[]> {
//     const res = await fetch('/faqs', {
//         method: 'POST',
//         body: JSON.stringify(req)
//     });
//     const data = await res.json();
//     return data;
// }