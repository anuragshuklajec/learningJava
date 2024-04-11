public class TypeConvertion {
    public static void main(String[] args) {
        int a = 12;
        byte b = 127;
        b = (byte)a; /* will not work without explicit type casting */
        System.out.println(b);

        // implcit type casting
        byte c = 127;
        int d = 234;
        d = c;
        System.out.println(d);

        // Assigning value of double 5.6 to integer
        float f = 5.6f;
        int x = (int)f;
        System.out.println(x); /* It will cut values after . */

        // Case of coverting int to byte - Concept of modulo
        int y  = 257;
        byte z = (byte)y;
        System.out.println(z);

        // Type promotion
        byte l = 10;
        byte m = 30;
        int result = l * m; /*Just because multiplication of these two will exceed the limit of byte it can be promoted to int */
        System.out.println(result);
    }
}
