#include <stdio.h>
int main()
{
   int idade;
    scanf("%d", &idade);
     printf("Qual a sua idade? %d\n");
     
    if (idade < 18) {
    printf ("Você é menor de idade");

  }
  else{
        printf("Você é maior de idade ");

  }
  return 0;
    }