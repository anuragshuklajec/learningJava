public class Operators {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;

        // Addition
        int add = num1 + num2;
        System.out.println(add);

        // Subtraction
        int sub = num1 - num2;
        System.out.println(sub);

        // Division
        int div = num1 / num2;
        System.out.println(div);

        // Remainder - Modulus
        int mod = num1 % num2;
        System.out.println(mod);

        // Increment
        num1 += 2; /* short-hand for num1 = num1 + 2 */
        System.out.println(num1); /* 9 */

        // OR

        num1++; /* Short-hand for num1+=2 POST-INCREMENT*/
        System.out.println(11);

        ++num1; /* PRE-INCREMENT */
        System.out.println(num1);

        num1-=1;
        System.out.println(num1);

        num1--; 
        System.out.println(num1);


        int result_post = num1++;
        System.out.println(result_post); /* num1 will be incremented after assignment */

        int result_pre = ++num1;
        System.out.println(result_pre); /* num1 will be incremented then assigned */






    }
}
