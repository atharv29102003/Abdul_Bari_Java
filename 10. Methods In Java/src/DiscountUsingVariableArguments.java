public class DiscountUsingVariableArguments {
    static double discount(double... P) {
        double discount = 0;

        for (int i = 0; i < P.length; i++)
            discount += P[i];

        if (discount < 500)
            return discount * 0.10;
        else if (discount >= 500 && discount < 1000)
            return discount * 0.15;
        else
            return discount * 0.20;

    }

    public static void main(String[] args) {

        System.out.println(discount());
        System.out.println(discount(100));
        System.out.println(discount(500, 200));
        System.out.println(discount(100, 200, 3000));

    }
}
