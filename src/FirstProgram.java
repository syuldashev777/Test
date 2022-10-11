import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("insert first : ");
//        int first = input.nextInt();
//        System.out.print("insert first : ");
//        int second = input.nextInt();
//        System.out.printf("first: %d", first);

//        System.out.println("");
//        System.out.printf("first: %d second: %d", first++, second++);

//        int a=9;
//        int b=4;
//        System.out.println("Addition = "+a+"+"+b+" = "+ (a+b)  );
//        System.out.println("Subtraction = "+a+"-"+b+" = "+ (a-b));
//        System.out.println("Multiplication = "+a+"*"+b+" = "+ (a*b));
//        System.out.println("Division = "+a+"/"+b+" = "+ (a/b));
//        System.out.println("Remainder = "+a+"/"+b+" = "+ (a%b)+"\n");
//
//        System.out.println("Unary minus = "+(-b));
//        System.out.print("Post-Increment a++ = "+(a++));
//        System.out.println(" and Pre-Increment ++a = "+(++a));
//
//        System.out.print("Post-Decrement b-- = "+(b--));
//        System.out.println(" and Pre-Decrement --b = "+(--b));

//        int a=9;
//        float b=7;
//        System.out.println("Addition = "+a+"+"+b+" = "+ (a+b));
//        System.out.println("Subtraction = "+a+"-"+b+" = "+ (a-b));
//        System.out.println("Multiplication = "+a+"*"+b+" = "+ (a*b));
//        System.out.print("Division = "+a+"/"+b+" = "+ (a/b));
//        System.out.printf(" or %.4f \n", (a/b)); //show formatted result
//        System.out.println("Remainder = "+a+"/"+b+" = "+ (a%b)+"\n");
//        int $a = 2;
//        int _2 = 3;
//        int * per;
//        int z;
//        int q;
//        int c;
//        z = 150;
//        q = 200;
//        c = z + q;
//        System.out.println(c);
        int numberOfSeconds = 0;
        int hour, min, sec;

        int saveNumberOfSeconds;

        numberOfSeconds = 3405;
        saveNumberOfSeconds = numberOfSeconds;

        if ((numberOfSeconds > 86400) || (numberOfSeconds < 0)) {
            System.out.println("Incorrect value.");
            return;
        }

        hour = numberOfSeconds / 3600;
        numberOfSeconds = numberOfSeconds - hour * 3600;
        min = numberOfSeconds / 60;
        numberOfSeconds = numberOfSeconds - min * 60;
        sec = numberOfSeconds;

        System.out.println("In " + saveNumberOfSeconds + " seconds: " + hour + " h " + min + " min " + sec + " sec");
    }


}
