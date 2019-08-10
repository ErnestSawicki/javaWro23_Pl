package IterationAndRecursion;

public class TwoToPower {
    public int toPowerOfTwo(int power){
        int TwoToPower = 1;
        while (power > 0){
            TwoToPower *= 2;
            power--;
        }
        return TwoToPower;
    }

    public int powRecursion(int power){
        if (power ==0)
            return 1;
        return powRecursion(power -1) *2;
    }

    public int powBite(int pow){
        return 1<<pow;
    }

}
