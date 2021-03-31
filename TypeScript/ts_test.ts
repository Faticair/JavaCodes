let flag: boolean = true;
let num: number = 1.4396;
let str: string = "apple";
let sentence: string = "It will be ${ num + 1} ${ name } in the bag.";
console.log(sentence);

let numlist: number[] = [1, 2, 3.14];
let tuples: [number, string] = [10, "what"];

enum color {Red, Yellow, Green, Blue}
let colorname: color.Green;
let colorname0: string = color[2];
console.log(colorname);
console.log(colorname0);
