// script.js

document.addEventListener("DOMContentLoaded", function() {
    const numbers = document.querySelectorAll('.number');

    numbers.forEach(number => {
        const finalNumber = parseInt(number.dataset.number);
        const duration = 2000; // Duración de la animación en milisegundos
        const step = finalNumber / duration * 20; // Paso para aumentar el número en cada iteración

        let currentNumber = 0;

        const updateNumber = () => {
            number.textContent = Math.floor(currentNumber);
            if (currentNumber < finalNumber) {
                currentNumber += step;
                setTimeout(updateNumber, 10);
            } else {
                number.textContent = finalNumber;
            }
        };

        updateNumber();
    });
});
