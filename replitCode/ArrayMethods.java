package replitCode;

import java.lang.Math;

public class ArrayMethods {
  public static double Average(int[] a) {    
    int total = 0;
    
    for(int i = 0; i < a.length; i++) {
      total += a[i];
    }

    double average = (total+0.0)/a.length;
    
    return Math.round(average * 100.0) / 100.0;
  }

  public static int Max(int [] a) {
    int max = 0;

    for(int i = 0; i < a.length; i++) {
      if(max < a[i]) {
        max = a[i];
      }
    }
    
    return max;
  }

  public static int Min(int [] a) {
    int min = a[0];

    for(int i = 1; i < a.length-1; i++) {
      if(min > a[i]) {
        min = a[i];
      }
    }
    
    return min;
  }

  public static void main(String[] args) {
    
    int[] listOne = new int[]{4,56,7,3,23,5,56,3,3,5,46,3,5};
    
    System.out.println("The average of the array is " + ArrayMethods.Average(listOne));
    System.out.println("The max of the array is " + ArrayMethods.Max(listOne));
    System.out.println("The min of the array is " + ArrayMethods.Min(listOne));
    
  }
}
