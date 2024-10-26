#include <stdio.h>
#include <stdlib.h>

int main(){
	char c;
	printf("Introduce un caracter :");
	scanf(" %c", &c);
	//Verificar numero
	if (c >=0 && c <=9){
printf("Es un numero\n");
}
	//Verificamos si es letra
	else if(((c>= 'A' && c<='Z') || (c>= 'a' && c<= 'z')){
printf("Es una letra");
}
	else {
printf("No es ni numero ni letra");
}

return 0;
}
