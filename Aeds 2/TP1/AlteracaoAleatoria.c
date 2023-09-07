#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
  char str[1000],x,y;
  int tam;
  srand(4);
  scanf(" %[^\n]",str);

  while(strcmp(str,"FIM")!=0){
    x=('a'+ (rand()%26));
    y=('a'+ (rand()%26));
    int tam=strlen(str);
    char text[tam+1];
    for(int i=0;i<tam;i++){
      if(str[i]==x){
        text[i]=y;
      }else{
        text[i]=str[i];
      }
    }
    text[tam] = '\0';
    printf("%s\n",text);
    scanf(" %[^\n]",str);
  }
  return 0;
}
