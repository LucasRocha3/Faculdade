using System;

class Program{
    static bool IsPalindromo(string input){
        string cleanedInput = "";
        foreach (char c in input){
            if (char.IsLetter(c)){
                cleanedInput += char.ToLower(c);
            }
        }
        int left = 0;
        int right = cleanedInput.Length - 1;
        while (left < right){
            if (cleanedInput[left] != cleanedInput[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
    static void Main(string[] args){
        string text;
        do{
            text = Console.ReadLine();
            if (text!= "FIM"){
                bool isPalindromo;
                isPalindromo= IsPalindromo(text);
                Console.WriteLine(isPalindromo ? "SIM" : "NAO");
            }
        } while (text != "FIM");
    }
}

