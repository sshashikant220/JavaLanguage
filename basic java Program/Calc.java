public class Calc {

    public int add(int n1, int n2) {

        int n = n1 + n2;
        return n;

    }

    public int add(int n1, int n2, int n3) {
        int n = n1 + n2 + n3;
        return n;
    }

    public double add(double n1, double n2) {
        double n = n1 + n2;
        return n;
    }

    public static void main(String[] args) {

        Calc c = new Calc();
        int result = c.add(10, 20);
        int res = c.add(10, 20, 30);
        double res2 = c.add(10.5, 11.0);
        System.out.println(result);
        System.out.println(res);
        System.out.println(res2);

    }

}
