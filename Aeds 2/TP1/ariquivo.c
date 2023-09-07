#include <stdio.h>

void imprimirReverso(int pos) {
  FILE *arq = fopen("exemplo.txt", "r");

  double num;

  fseek(arq, 0, SEEK_END);

  int tamanho = ftell(arq);

  // posição especificada
  fseek(arq, pos, SEEK_SET);

  fscanf(arq, "%lf", &num);

  // posição inicial
  fseek(arq, pos, SEEK_SET);

  for (int i = 0; i < tamanho; i++) {
    pos++;
    char c;
    fscanf(arq, "%c", &c);
    if (c == '\n' || c == EOF) {
      i = tamanho;
    }
  }

  if (pos < tamanho) {
    imprimirReverso(pos);
  }

  if (num == (int)num) {
    printf("%d\n", (int)num);
  } else if ((num * 10) - (int)(num * 10) == 0) {
    printf("%.1f\n", num);
  } else if ((num * 100) - (int)(num * 100) == 0) {
    printf("%.2f\n", num);
  } else {
    printf("%.3f\n", num);
  }

  fclose(arq);
}

int main(void) {
  int n;
  double num;
  scanf("%d", &n);
  FILE *arq = fopen("exemplo.txt", "w");

  for (int i = 0; i < n; i++) {
    scanf("%lf", &num);
    fprintf(arq, "%lf\n", num);
  }

  fclose(arq);

  imprimirReverso(0);

  return 0;
}