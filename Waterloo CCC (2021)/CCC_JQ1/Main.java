import java.util.*;

class Main
{
   public static void main(String[] args)
   {
      Scanner kbReader = new Scanner(System.in); 
      
      int b = kbReader.nextInt();
      
      int p = 5 * b - 400;
      System.out.println(p);
      
      if(p > 100)
         System.out.println(-1);
      else if(p < 100)
         System.out.println(1);
      else
         System.out.println(0);
   }

}