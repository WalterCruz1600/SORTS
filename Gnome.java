import java.util.Arrays;
import java.io.*;
import java.util.*;

public class Gnome implements ISort <E>{
 void gnomeSort(int[] nums)
  {
  int i=1;
  int j=2;
 
  while(i < nums.length) {
    if ( nums[i-1] <= nums[i] ) 
	{
      i = j; j++;
    } else {
      int tmp = nums[i-1];
      nums[i-1] = nums[i];
      nums[i--] = tmp;
      i = (i==0) ? j++ : i;
    }
  }
}

// Método 
    public static void main(String args[])
    {
        gnomeSort ob = new gnomeSort();
        int nums[] = {70, 500, 250, 200, 150, 10, 300};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));
        ob.gnomeSort(nums);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(nums));
    }
}
