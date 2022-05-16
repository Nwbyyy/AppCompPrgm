package replitCode;

import java.util.ArrayList;
import java.lang.Math;
public class ArrayListSmile {
  
  //Method to remove all 0's
  public static void RemoveZeros(ArrayList<Integer> a) {
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) == 0) {
        a.remove(i);
      }
    }
  }

  public static void main(String[] args) {
    ArrayList<Integer> elecMag = new ArrayList<Integer>(1000);

    for (int i = 0; i < 1000; i++) {
      elecMag.add((int)(Math.random()*101));
    }

  ArrayListSmile.RemoveZeros(elecMag);
    
    System.out.println("The list size is " + elecMag.size() + ".");
  }
}
