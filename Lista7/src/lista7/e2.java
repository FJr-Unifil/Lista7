package lista7;

import java.util.Scanner;

public class e2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numMultiploDe7[] = new int[100];
		int i=0, j=0;
         do {
        	 while (i < 100) {
             if (j == 0 && i == 0) {
            	 numMultiploDe7[i] = 2;
            	 System.out.println("numMultiploDe7["+i+"] = "+numMultiploDe7[i]);
            	 break;
             } else {
            	 if (j > numMultiploDe7[i-1] && j % 7 != 0 && j != 17 && j != 27 && j != 37 && j != 47
            			 && j != 57 && j != 67 && j != 87 && j != 97 && j != 107 && j != 117 && j != 127) {
            		 numMultiploDe7[i] = j;
            		 System.out.println("numMultiploDe7["+i+"] = "+numMultiploDe7[i]);
            		 break;
            	 }
             }
        		 
        		 
        		 
        		 j++;
        	 }
        	 i++;
         } while(i < 100);
		ler.close();
	}
}
