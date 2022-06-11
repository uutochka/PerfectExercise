package pupupu;

public class Symmetry {
    public String symmetry(int n) {

        String UwU = "The number is symmetric";
        String TT = "The number isn't symmetric";
        int a = (n / 1000 - n % 10) * (n / 1000 - n % 10);
        int b = (n / 100 % 10 - n % 100 / 10) * (n / 100 % 10 - n % 100 / 10);
        if (a+b == 0) return UwU;
        else return TT;


    }

}
