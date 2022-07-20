import java.util.*;

class Main
{
   public static void main(String[] args)
   {
      Scanner kbReader = new Scanner(System.in);
      
      int m = kbReader.nextInt();
      int n = kbReader.nextInt();
      int k = kbReader.nextInt();
      String bugFix = kbReader.nextLine();
      int counter = 1;
      int[][] canvas = new int[m][n];
      
      while(counter <= k)
      {
         counter++;
         
         String input = kbReader.nextLine();
         String[] values = input.split(" ");
         int num = Integer.parseInt(values[1]);
         
         if(values[0].equals("R"))
         {
            for(int i = 0; i < n; i++)
            {
               swap(canvas,num-1,i);
            }
         }
         
         if(values[0].equals("C"))
         {
            for(int i = 0; i < m; i++)
            {
               swap(canvas,i,num-1);
            }
         }
      }
      
      int gold = 0;
      for(int i = 0; i < canvas.length; i++) 
      {
         for (int j = 0; j < canvas[i].length; j++) 
         {
            if(canvas[i][j] == 1)
               gold++;
         }
      }
      
      System.out.println(gold);
   }
   
   public static void swap(int[][] ar, int num1, int num2)
   {
      if(ar[num1][num2] == 1)
         ar[num1][num2] = 0;
      else
         ar[num1][num2] = 1;
   }
}