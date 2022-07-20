import java.util.*;

class Main
{
   public static void main(String[] args)
   {
      Scanner kbReader = new Scanner(System.in);
      
      int n = kbReader.nextInt();
      String bugFix = kbReader.nextLine();
      
      String heights = kbReader.nextLine();
      String[] nums = heights.split(" ");
      int[] numbers = new int[nums.length];
      for(int i = 0; i < nums.length; i++)
      {
         numbers[i] = Integer.parseInt(nums[i]);
      }
      
      String base = kbReader.nextLine();
      String[] nums2 = base.split(" ");
      int[] numbers2 = new int[nums2.length];
      for(int i = 0; i < nums2.length; i++)
      {
         numbers2[i] = Integer.parseInt(nums2[i]);
      }
      
      double[] areas = new double[n];
      double totalArea = 0;
      
      for(int i = 0; i < areas.length; i++)
      {
         areas[i] = (numbers2[i]*(numbers[i] + numbers[i+1]))/2.0;
         totalArea += areas[i];
      }
      
      if(totalArea % 1 == 0)
      {
         int tArea = (int)totalArea;
         System.out.println(tArea);
      }
      else  
         System.out.println(totalArea);
   }
}