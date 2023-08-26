using System;
using System.Collections;

class Fila{
  private ArrayList elementos = new ArrayList();

  public void Inserir(object item){
    elementos.Add(item);
  }

  public object Remover(){
  object primeiro = elementos[0];
  elementos.RemoveAt(0);
  return primeiro;
  }

  public void MostrarElementos(){
    Console.WriteLine("Elementos na fila:");
    foreach (var item in elementos){
      Console.WriteLine(item);
    }
  }
}

class Program{
  static void Main(string[] args){
    Fila minhaFila = new Fila();

    minhaFila.Inserir("Item 1");
    minhaFila.Inserir("Item 2");
    minhaFila.Inserir("Item 3");

    minhaFila.MostrarElementos();

    Console.WriteLine("Removendo item: " + minhaFila.Remover());

    minhaFila.MostrarElementos();
  }
}
