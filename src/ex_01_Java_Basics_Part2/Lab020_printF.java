package ex_01_Java_Basics_Part2;

public class Lab020_printF {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("You variable is %d", a);
        //printf is just used for formating
        //%d -> int, byte, long, short, - data type
        //%s -> String
        //%f -> floating, double,
        //%b -> boolean
        int b = 20;
        System.out.println("----");
        System.out.printf("%d + %d ", a,b);

    }
}
