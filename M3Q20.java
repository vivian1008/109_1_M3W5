import java.util.Scanner;
 
public class M3Q20{
 
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int m = scn.nextInt();
       if(m < n){
           int tmp = m;
           m = n;
           n = tmp;

       }
       System.out.println(fun(m,n));
   }
   public static int fun(int m,int n){
       if(m % n == 0){
           return n;
       }else{
           return fun(n,m%n);
       }
   }
}

