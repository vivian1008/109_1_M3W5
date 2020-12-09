import java.util.Scanner;
 
public class M3Q17{
   public static void main(String[]args){
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int m = scn.nextInt();
       System.out.println(fun(n)/(fun(m)*fun(n-m)));

   
   }

   public static int fun(int x){
       int sun = 1;
       for(int i = 1; i <= x ; i++){
           sun = sun * i;
       }
       return sun;
   }
}
