using System;
using System.Collections;

class Pilha{
  private ArrayList elementos = new ArrayList();

  public void Inserir(object item){
    elementos.Add(item);
  }

  public object Remover(){ 
    int ultimon = elementos.Count - 1;
    object ultimoItem = elementos[ultimon];
    elementos.RemoveAt(ultimon);
    return ultimoItem;
  }

  public void MostrarElementos(){
    Console.WriteLine("Elementos na fila:");
    for(int i=elementos.Count-1;i>= 0;i--){
      Console.WriteLine(elementos[i]);
    }
  }
}

class Program{
  static void Main(string[] args){

  }
}
