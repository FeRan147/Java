public class Task9 {

	 public static void main(String[] args) {

	  int[] mass = new int[10];
	  int[] massTemp = new int[10];
	  int notZeroCounter = 0;
	  for (int i = 0; i < mass.length; i++) {
	   mass[i] = (int) Math.floor(Math.random() * 10);
	   if (mass[i] != 0) {
	    massTemp[notZeroCounter] = mass[i];
	    notZeroCounter++;
	   }
	   System.out.printf("%4d", mass[i]);
	  }
	  System.out.println();
	  for (int i = notZeroCounter; i < massTemp.length; i++) {
	   massTemp[i] = 0;
	  }
	  for (int i = 0; i < mass.length; i++) {
	   System.out.printf("%4d", massTemp[i]);
	  }
	 }

	}