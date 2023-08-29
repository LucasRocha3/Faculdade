#include <stdio.h>
#include <string.h>

int IsPalindromo(char str[1000]){
  int tam;
  char strr[1000];
  tam=strlen(str);
  for(int i=0;i<tam;i++){
    strr[tam-1-i]=str[i];
  }
  if(strcmp(str,strr)==0){
    return 0;
  }else{
    return 1;
  }
}

int main(void) {
  char str[1000];

  scanf(" %[^\n]",str);

  while((strcmp(str,"FIM")!=0)){
    if(IsPalindromo(str)==0){
      printf("SIM\n");
    }else{
      printf("NAO\n");
    }
    scanf(" %[^\n]",str);
    
  }
  
  return 0;
}