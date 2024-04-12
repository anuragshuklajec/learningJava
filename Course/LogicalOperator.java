public class LogicalOperator {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        
        int a = 2;
        int b = 1;

        // AND OPERATOR
        boolean and = x < y && a > b;
        System.out.println(and);

        // OR OPERATOR
        boolean or = x < y || a < b;
        System.out.println(or);

        // NOT OPERATOR
        boolean not = !(x < y);
        System.out.println(not);

        // XOR OPERATOR
        int xor = x ^ y;
        System.out.println(xor);


    }
}
