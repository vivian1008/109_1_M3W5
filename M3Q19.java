import java.util.Scanner;

public class M3Q19{

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        long n=scn.nextLong();
        System.out.println(fun(n));
    }
    public static int fun(long n){
        if(n > 0){
            return fun(n/10)+1;
        }
        else {
            return 0;
        }
    }
}
