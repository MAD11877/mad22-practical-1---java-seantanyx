import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
    int loops = in.nextInt();

    int[] num_list = new int[loops];
    for(int i = 0; i < loops; i++) {
      
      num_list[i] = in.nextInt();
    }

    int count = 0;
    int maxCount = 0;
    int maxValue = 0;
    
    for(int i = 0; i < num_list.length; i++){
      count = 0;
      int value = num_list[i];
      for (int u = 0; u < num_list.length; u++){
        if(num_list[u] == value) {
          count++;
          if(count > maxCount){
            maxCount = count;
            maxValue = num_list[u];
          }
        }
      }
    }
    System.out.println(maxValue); 
  }
}
