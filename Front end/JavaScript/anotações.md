- `` permite formatar variaveis dentro das strings como f string


- How to accept user input

1. EASY WAY = window prompt
2. PROFESSIONAL WAY = HTML textbox - form
let username;
document.getElementById("mySubmit").onclick = function(){
    username = document.getElementById("myText").value;
    document.getElementById("myH1").textContent = `Hello ${username}`
    console.log(username);
}

- type conversion = change the datatype of a value to another

let age = String(25);

console.log(age + 1);
console.log(Number(age) + 1);


- Check data type
console.log(typeof age)
console.log(typeof Number(age))