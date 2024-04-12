public class ConditionalStatements {
    public static void main(String[] args) {
        int age1 = 10;
        int age2 = 20;
        if(age1 > age2 ){
            System.out.println("First person is older");
        }else{
            System.out.println("Second person is older");
        }

        if (age1>=10 && age2<=20){
            System.out.println("Age is between 10 and 20");
        }

        int x = 8;
        int y = 7;
        int z = 6;
        if(x>y && x>z)
            System.out.println(x);
        else if (y > z && y > z) {
            System.out.println(y);
        }else{
            System.out.println(z);
        }
    }
}
