import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 2 ,0, 8, 3, 4};
        System.out.println("This is array before sorting");
        printArray(array);
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("1 - bubble sort \n" + "2 - shell sort \n");
        choice = in.nextInt();
        switch (choice) {
            case 1 -> bubbleSorting(array);
            case 2 -> shellSorting(array);
        }
        System.out.println("This is array after sorting");
        printArray(array);
    }

    public static void bubbleSorting(int[] array){
        int temp;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1] ;
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void shellSorting(int[] array) {
        boolean isSorted;
        int temp;
        int nMinusOne = array.length - 1;
        for(int i = 0; i < nMinusOne; i++) {
            isSorted = true;
            for (int j = 0; j < nMinusOne - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted)
                return;
        }
    }
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}