public class stringpractise2 {
    public static void main(String[] args) {
        String str = "Netbeans";
        int len = str.length();
        System.out.println(len);
        str = str.toLowerCase();
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);
        String str1 = "        Welcome     ";
        System.out.println(str1);
        str1 = str1.trim();
        System.out.println(str1);
        str = str.substring(4);
        System.out.println(str);
        if (str.length() >= 6) {
            str = str.substring(4, 6);
            System.out.println(str);
        }

        str = str.replace('E', 'A');
        System.out.println(str);
    }
}
