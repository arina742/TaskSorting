import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] array = {3, 2 ,0, 8, 3, 4};
        System.out.println("This is array before sorting");
        printArray(array);
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("1 - bubble sort \n" + "2 - insertion sort \n");
        choice = in.nextInt();
        switch (choice) {
            case 1 -> bubbleSorting(array);
            case 2 -> insertionSorting(array);
        }
        System.out.println("This is array after sorting");
        printArray(array);
    }

    public static void bubbleSorting(int[] array){
        int temp;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1] ;
                    array[j+1] = temp;
                }
            }
        }
    }

    public  static void insertionSorting(int[] array){
        for (int left = 0; left < array.length; left++){
            int value = array[left];
            int i = left - 1;
            for(; i >=0; i--)
            {
                if(value < array[i]){
                    array[i+1] = array[i];
                }
                else break;
            }

            array[i+1] = value;
        }
    }
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}