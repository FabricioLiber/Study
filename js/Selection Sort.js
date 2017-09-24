let numbers = [2, 3, 5, 6, 1];
console.log(numbers);
let menor, aux;
for (let i = 0; i < numbers.length; i++) {
  for (let j = 1; j < (numbers.length); j++) {
    if (numbers[i] < numbers[j]) {
      menor = i;
    } else {
      menor = j;
    }
  }
  aux = numbers[menor];
  numbers[menor] = numbers [i];
  numbers[i] = aux;
}
console.log(numbers);