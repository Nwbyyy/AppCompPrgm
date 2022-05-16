package replitCode;

import java.util.ArrayList;
public class SortingArrayList {
  //Method
  public static ArrayList<String> ReverseSort(ArrayList<String> a) {
    ArrayList<String> b = a;  
    int count = b.size()/2;
    int leftBound = 0;
    int rightBound = b.size() - 1;
   
    while(count > 0){
      String hold1 = b.get(leftBound);
      String hold2 = b.get(rightBound);

      b.set(leftBound, hold2);
      b.set(rightBound, hold1);

      leftBound++;
      rightBound--;
      count--;
    }
    return b;
  }

  //Tester
  public static void main(String[] args) {
    ArrayList<String> randomList = new ArrayList<String>();
    randomList.add("Apple");
    randomList.add("Banana");
    randomList.add("Pear");
    randomList.add("Orange");
    randomList.add("Grape");
    randomList.add("Strawberry");
    randomList.add("Watermelon");
    
    System.out.print(SortingArrayList.ReverseSort(randomList));
  }
}