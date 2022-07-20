import java.util.*;

class Main
{
   public static void main(String[] args)
   {
      Scanner kbReader = new Scanner(System.in); 
      
      int counter = 1;
      int total = kbReader.nextInt();
      String bugFix = kbReader.nextLine(); // fixing nextInt() bug
      int current = 0;
      String highest = "";
      
      while(counter <= total)
      {
         counter++;
         
         String name = kbReader.nextLine();
         int price = kbReader.nextInt();
         bugFix = kbReader.nextLine();
         
         if(price > current)
         {
            current = price;
            highest = name;
         }
      }
      
      System.out.println(highest);
   }

}