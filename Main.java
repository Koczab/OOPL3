package pl.edu.ur.oopl3;

import pl.edu.ur.oopl3.Zad3_1.RecursionFactorial;
import pl.edu.ur.oopl3.Zad3_2.NoRecursionFactorial;
import pl.edu.ur.oopl3.Zad3_4.Fibonacci;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by mchyl on 28/07/2018.
 */
public class Main {

    public static void main(String[] args) {
     /*   Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        // pobieramy liczbę
        int liczba = sc.nextInt();
        RecursionFactorial rc = new RecursionFactorial();

        // wyświetlamy obliczoną silnię
        System.out.println(liczba + "! = " + rc.factorial(liczba));

        System.out.println("Podaj liczbe rebiit: ");
        int a = sc.nextInt();
        NoRecursionFactorial rc2 = new NoRecursionFactorial();

        System.out.println(a + "! wynosi: "+ rc2.factorial(a));

        Power rebit= new Power();

        System.out.println((2,4));
        */

        Fibonacci fib = new Fibonacci();
        System.out.println(fib.sumOfFicbonacci(10));
    }
}
