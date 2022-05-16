package replitCode;

public class FirstMilFibSeq {

	public static void main(String[] args) {
		 int[] listOne = new int[47];
		    listOne[0] = 0;
		    listOne[1] = 1;
		    

		    for (int index = 2; index < listOne.length; index++) {
		      listOne[index] = listOne[index-1] + listOne[index-2];
		    }

//		    for (int i = 0; i < listOne.length; i++) {
//		    System.out.println(listOne[i]);
//			}

		    System.out.println(listOne[20]);
		  }

	}
