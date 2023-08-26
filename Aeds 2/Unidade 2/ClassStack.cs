using System;
using System.Collections.Generic;

class Stack{
  private
  Stack<int>elementos = new Stack<int>();

  public void Inserir(int n){
    elementos.Push(n);
  }

  public void Remover(){ 
    elementos.Pop();
  }

  public void MostrarElementos(){
    Console.WriteLine("Elementos na pilha:");
    foreach(int n in elementos){
      Console.WriteLine(n);
    }
  }
}

class Program{
  static void Main(string[] args){

  }
}
