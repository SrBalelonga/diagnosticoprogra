using System;

namespace PolindromoQadir
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string word, lurk, charac;
            int i;
            Console.WriteLine("Ingrese una palabra:");
            word = Console.ReadLine();
            i = word.Length;
            lurk = "";
            for (int x = 0; x < i; x++)
            {
                charac = word.Substring(x, 1);
                lurk = lurk + charac;
            }
            if (word == lurk)
            {
                Console.WriteLine("Es un palindromo");
            }
            else
            {
                Console.WriteLine("No es un palindromo");
            }




        }
    }
} 