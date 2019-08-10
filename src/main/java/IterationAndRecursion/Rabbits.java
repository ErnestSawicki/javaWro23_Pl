package IterationAndRecursion;

public class Rabbits {

    public int rabbitsPairAfterMonths(int months){
        if (months == 0)
            return 0;
        if (months == 1)
            return 1;
        return rabbitsPairAfterMonths(months -2) + rabbitsPairAfterMonths(months -1);
    }

    public int rabbitsAfterMonths(int months){
        if (months == 0)
            return 0;
        if (months == 1)
            return 1;

        int p = 1;
        int pp = 0;
        int tmp;

        for (int i = 2; i < months; i++){
            tmp = p + pp;
            pp = p;
            p = tmp;
        }
        return p + pp;
    }


}