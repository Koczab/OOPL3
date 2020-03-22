package pl.edu.ur.oopl3.Zad3_4;

import pl.edu.ur.oopl3.Interfaces.FibonacciInterface;

/**
 * Created by mchyl on 28/07/2018.
 */
public class Fibonacci implements FibonacciInterface {
    @Override
    public int sumOfFicbonacci(int numberOfElement) {

        if (numberOfElement==0)
            return 0;
        if(numberOfElement==1)
            return 1;
        else
        {
            int x=0, y=1 , m,wynik=1;
            for(int i=2;i<=numberOfElement;i++)
            {
                m=x+y;
                x=y;
                y=m;
                wynik=wynik + y;
            }
            return wynik;
        }
    }
}
