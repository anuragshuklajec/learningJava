public class TernaryOperator {
    public static void main(String[] args) {
        int n = 4;
        boolean result = false;
        if(n%2==0)
            result = true;
        System.out.println(result);

        // use ternary operator to find if a number is even
        n = 5;
        result = n%2 == 0 ? true : false;
        System.out.println(result);

        

    }
    
}
