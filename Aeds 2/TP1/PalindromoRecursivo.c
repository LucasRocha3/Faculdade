#include <stdio.h>
#include <string.h>

int isPalindromo(char text[1000], int i){
  if((strlen(text)/2)==i){
    return 1;
  }else if (text[i]==text[strlen(text)-1-i]){
    return isPalindromo(text,i+1);
  }else{
    return 0;
  }
}

int main(void) {
  char text[1000];
  scanf(" %[^\n]",text);

  while(strcmp(text,"FIM")!=0){
    int i=0;
    if(isPalindromo(text,i)){
      printf("SIM\n");
    }else{
      printf("NAO\n");
    }
    scanf(" %[^\n]",text);
  }
  
  
  return 0;
}