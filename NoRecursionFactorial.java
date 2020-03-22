package pl.edu.ur.oopl3.Zad3_2;

import pl.edu.ur.oopl3.Interfaces.FactorialInterface;

/**
 * Created by mchyl on 28/07/2018.
 */
public class NoRecursionFactorial implements FactorialInterface {

    @Override
    public int factorial(int i) {

        int pom=1;
        for(int x=1; x<=i;x++)
            pom=pom*x;


        return pom;
    }
}
