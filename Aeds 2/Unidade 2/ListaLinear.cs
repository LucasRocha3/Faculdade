using System;

class Lista{
  int[] array;
  int n;
  Lista(){
    array = new int[6];
    n = 0;
  }
  Lista (int tamanho){
    array = new int[tamanho];
    n = 0;
  }
  void InserirInicio(int x){
    for(int i=n;i<0;i--){
      array[i]=array[i-1];
    }
    array[0]=x;
    n++;
  }
  void InserirFim(int x){
    array[n]=x;
    n++;
  }
  void Inserir(int x, int pos){
    for(int i=n;i>pos;i--){
      array[i]=array[i-1];
    }
    array[pos]=x;
    n++;
  }
  void RemoverInicio(){
    n--;
    for(int i=0;i<n;i--){
      array[i] = array[i + 1];
    }
  }
  void RemoverFim(){
    n--;
  }
  void Remover(int pos){
    for(int i=pos;i<n;i++){
      array[i]=array[i+1];
    }
    n--;
  }
  void Mostrar(){
    for(int i=0;i<n;i++){
      Console.Write(array[i]+" ");
    }
  }
}

class Program {
  public static void Main (string[] args) {
  }
}