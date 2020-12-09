import java.util.Scanner;

public class M3Q18{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        decomp(n);
    }

    public static void decomp(long n){
        String str = "";
        while(n > 0){
            str = n % 10 + " " + str;
            n = n/10;
        }
        System.out.println(str);
    }

    public static void decomp2(long n){
        String str = Long.toString(n);
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}