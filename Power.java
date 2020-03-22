package pl.edu.ur.oopl3.Zad3_3;

import pl.edu.ur.oopl3.Interfaces.PowerInterface;

/**
 * Created by mchyl on 28/07/2018.
 */
public class Power implements PowerInterface {

    @Override
    public double recursionPow(double a, double b) {

        if(b==0)
            return 1;
        if(b%2==1)
            return a*recursionPow(a, b-1);
        else
        {
             double x= recursionPow(a, b/2);
            return x*x;
        }

    }

    @Override
    public double noRecursionPow(double a, double b) {
        double pom=a;
        if(b==1)
            return a;
        for(int x=1; x<b; x++)
        {
            pom= pom*a;
        }
        return pom;
    }
}
