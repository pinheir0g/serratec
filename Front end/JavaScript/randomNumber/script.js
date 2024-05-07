// RANDOM NUMBER GENERATOR
// let randomNum = Math.floor(Math.random() * 6 + 1); gera um número random entre 0 e 6

const min = 1;
const max = 6;
const myButton = document.getElementById("myButton");
const Label1 = document.getElementById("myLabel1");
const Label2 = document.getElementById("myLabel2");
const Label3 = document.getElementById("myLabel3");
let randomNum1;
let randomNum2;
let randomNum3;

myButton.onclick = function(){
    randomNum1 = Math.floor(Math.random() * max) + min; 
    randomNum2 = Math.floor(Math.random() * max) + min; 
    randomNum3 = Math.floor(Math.random() * max) + min; 
    Label1.textContent = randomNum1;
    Label2.textContent = randomNum2;
    Label3.textContent = randomNum3;
}


