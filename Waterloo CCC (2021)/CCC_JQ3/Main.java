import java.util.*;

class Main
{
   public static void main(String[] args)
   {
      Scanner kbReader = new Scanner(System.in); 
      
      String[] code = new String[1000];
      String counter = "";
         
      for(int i = 0; !(counter.equals("99999")); i++)
      {
         code[i] = kbReader.nextLine();
         counter = code[i];
      }
      
      String previous = "";
      
      for(int i = 0; !(code[i].equals("99999")); i++)
      {
         int x = Integer.parseInt(code[i].substring(0,2));
         int sum = (x % 10) + (x / 10);
         
         if(sum % 2 == 0 && sum != 0)
         {
            System.out.print("right ");
            previous = "right ";
         }
         else if(sum % 2 != 0)
         {
            System.out.print("left ");
            previous = "left ";
         }
         else
            System.out.print(previous);
         
         int y = Integer.parseInt(code[i].substring(2));
         System.out.println(y);
      }  
   }

}