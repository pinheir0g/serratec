const container = document.getElementById('container');
const titulo = document.createElement('h2');
titulo.textContent = "Tarefas da equipe";
const form = `
<div class="nova">
<input type="text" id="texto" placeholder="tarefa">
<button onclick="criarNota()">Criar</button>
</div>
`;

container.appendChild(titulo);

const area = document.createElement('ul');
container?.appendChild(area)

const div = document.createElement('div');
div.innerHTML = form
container.appendChild(div)

function novaNota(texto){
    const item = document.createElement('li');
    area?.appendChild(item);
    item.textContent = texto;
}

const lista = [];

lista.push("Estudar JS");
lista.push("Cria elementos");
lista.push("Trafegar JSON");
lista.push("Seletores irmão adjacente");

for(let i = 0; i < lista.length; i++){
    const item = lista[i];
    novaNota(item)
}

const texto = document.getElementById("texto");
function criarNota(){
    let valor = texto.value;
    lista.push(valor)
    novaNota(valor);
    texto.value = "";
}