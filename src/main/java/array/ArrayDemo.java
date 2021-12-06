package array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] myFirstArray = {4, 5, 10};
        String [] mySecondArray = {"Europe","Africa", "America"};
        int[] myDefoultArray = new int[5];

        System.out.println("Print the array directly");
        System.out.println(myFirstArray);

        System.out.println("Print the elemenst using indexes manual");
        System.out.println(myFirstArray[0]);
        System.out.println(myFirstArray[1]);
        System.out.println(myFirstArray[2]);

        System.out.println("Print the elements using for loop");
        for (int i = 0; i < myFirstArray.length; i++){
            System.out.println(myFirstArray[i]);
        }
                System.out.println("Sorted:");
            Arrays.sort(mySecondArray);
            for (int i = 0; i < myFirstArray.length; i++){
            System.out.println(myFirstArray[i]);
        }
        System.out.println("Default values");
            for (int i = 0; i < myDefoultArray.length; i++){
            System.out.println((myDefoultArray[1]));

        }
    }
}
