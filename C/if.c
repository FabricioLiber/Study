#include<stdio.h>
main(){
	int num;
	printf("Digite o numero: ");
	scanf("%d",&num);
	if(num>0)
	  printf("Numero positivo, acima de 0");
	if(num<0)
	  printf("Numero negativo, abaixo de 0");
	if(num==0)
	  printf("Numero nulo");
}
