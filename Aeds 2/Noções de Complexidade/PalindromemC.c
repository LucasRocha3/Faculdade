#include <stdio.h>
#include <string.h>


int main(void) {
  char str[10000],strr[10000];
  int n=100000,tam;

  while((strcmp(str,"fim")!=0)){
    scanf("%s",str);
    tam=strlen(str);
    for(int i=0;i<tam;i++){
      strr[tam-1-i]=str[i];
    }
    if(strcmp(str,strr)==0){
      printf("SIM\n");
    }else{
      printf("NAO\n");
    }
  }
  
  return 0;
}