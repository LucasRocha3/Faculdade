using System;
using System.Collections.Generic;

class Queue{
  private
  Queue<int>elementos = new Queue<int>();

  public void Inserir(int n){
    elementos.Enqueue(n);
  }

  public void Remover(){ 
    elementos.Dequeue();
  }

  public void MostrarElementos(){
    Console.WriteLine("Elementos na fila:");
    foreach(int n in elementos){
      Console.WriteLine(n);
    }
  }
}

class Program{
  static void Main(string[] args){

  }
}
