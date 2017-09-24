let numbers = [4, 35, 5, -14, 1];
console.log(numbers);
for (let i = 0; i < numbers.length; i++) {
  for (let j = 0; j < (numbers.length -1); j++) {
    //console.log(numbers[i]+"+"+numbers[j]);
    if (numbers[i] < numbers [j]) {
      let aux = numbers[i];
      numbers[i] = numbers[j];
      numbers[j] = aux;
    }
  }
}
console.log(numbers);
