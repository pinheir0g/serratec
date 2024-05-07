// COUNTER PROGRAM

const paçocaBtn = document.getElementById("pacocaBtn");
const pacocaCont = document.getElementById("paçocaCont");
const shoppiBtn = document.getElementById("shoppiBtn");
const shoppiCont = document.getElementById("shoppiCont");
let countPacoca = 0;
let countShoppi = 0;


paçocaBtn.onclick = function(event){
    countPacoca ++;
    pacocaCont.textContent = countPacoca;
    if (countPacoca % 5 != 0) {
        mostrarImagem("paçoca", event.clientX, event.clientY);
    }
    if (countPacoca % 5 == 0) {
        iniciarAnimacao("paçoca",  event.clientX, event.clientY);
    }
}

shoppiBtn.onclick = function(event){
    countShoppi ++;
    shoppiCont.textContent = countShoppi;
    if (countShoppi % 5 != 0) {
        mostrarImagem("shopee", event.clientX, event.clientY);
    }
    if (countShoppi % 5 == 0) {
        iniciarAnimacao("shopee", event.clientX, event.clientY);
    }
}

function iniciarAnimacao(item, x, y) {
   
    for (let i = 0; i < 10; i++) {
        const img = document.createElement("img");
        img.src = `/${item}.png`; 
        img.classList.add("voando");
        document.body.appendChild(img);
        
        const offsetX = Math.random() * 100 - 50; 
        const offsetY = Math.random() * 100 - 50; 
        img.style.position = "absolute";
        img.style.left = `${x + offsetX}px`;
        img.style.top = `${y + offsetY}px`;
       
        img.style.width = "100px";
        img.style.height = "100px";
        
        setTimeout(() => {
            img.style.transition = "transform 3s linear, opacity 2s ease-out";
            const endX = Math.random() * window.innerWidth - 100; 
            const endY = Math.random() * window.innerHeight - 100; 
            img.style.transform = `translate(${endX}px, ${endY}px)`;
            img.style.opacity = "0";
        }, 10);
        
        setTimeout(() => {
            img.remove();
        }, 5000);
    }
}

let imagemAtual = null;


function mostrarImagem(item, x, y) {

    if (imagemAtual) {
        imagemAtual.remove();
    }


    const img = document.createElement("img");
    img.src = `/${item}.png`; 
    img.style.position = "absolute";
    img.style.width = "100px";
    img.style.height = "100px";
    img.style.left = `${x}px`; 
    img.style.bottom = `${y}px`; 
    img.style.transform = "translateX(-50%)"; 
    document.body.appendChild(img);

 
    img.classList.add("subindo");

 
    setTimeout(() => {
        img.remove();
    }, 3000);   
    imagemAtual = img;
}