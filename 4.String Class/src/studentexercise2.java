public class studentexercise2 {
    public static void main(String[] args) {
        int b = 101010011;
        String str = b + "";
        System.out.println(str.matches("[01]*"));

        int h = 0X0012;
        String str1 = h + "";
        System.out.println(str1.matches("[A-Z 0-9]+"));

        String date = "13/12/2009";
        System.out.println(date.matches("[0-3][0-9]/[01][1-9]/[0-9]{4}"));
    }
}
