package replitCode;

import java.util.*;
public class FilterMethod {
  public static void Filter(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    for (int i = list1.size()-1; i > -1; i--) {
      for (int k = 0; k < list2.size(); k++) {
        if (list1.get(i) == list2.get(k)) {
          list1.remove(i);
        }
      }
    }
  }

  public static void main(String []args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> compList = new ArrayList<Integer>();
    int place = 1;

    Scanner kboard = new Scanner(System.in);
    
    System.out.println("How many items would you like in your first list?");
    int items = kboard.nextInt();
    
    while (items > 0) {
      System.out.println("What is your #" + place + " term in the list?");
      int addNum = kboard.nextInt();
      list.add(addNum);
      place++;
      items--;
    }
    
    System.out.println("Your list: " + list);

    System.out.println("How many numbers would you like to check for and remove from that list?");
    int checkItems = kboard.nextInt();

    place = 1;
    
    while (checkItems > 0) {
      System.out.println("What is your #" + place + " term in the list?");
      int addNum = kboard.nextInt();
      compList.add(addNum);
      place++;
      checkItems--;
    }
    
    FilterMethod.Filter(list, compList);

    System.out.println("Your updated list: " + list);
    kboard.close();
  }
    
}