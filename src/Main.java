import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 2 ,0, 8, 3, 4};
        System.out.println("This is array before sorting");
        printArray(array);
        int low = 0;
        int high = array.length - 1;
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("1 - bubble sort \n" + "2 - shell sort \n");
        choice = in.nextInt();
        switch (choice) {
            case 1 -> quickSort(array, low, high);
            case 2 -> shellSorting(array);
        }
        System.out.println("This is array after sorting");
        printArray(array);
    }

        public static void quickSort(int[] array, int low, int high) {

            if (array.length == 0)
                return;//завершить выполнение, если длина массива равна 0

            if (low >= high)
                return;//завершить выполнение если уже нечего делить

            // выбрать опорный элемент
            int middle = low + (high - low) / 2;
            int opora = array[middle];

            // разделить на подмассивы, который больше и меньше опорного элемента
            int i = low, j = high;
            while (i <= j) {
                while (array[i] < opora) {
                    i++;
                }

                while (array[j] > opora) {
                    j--;
                }

                if (i <= j) {//меняем местами
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }

            // вызов рекурсии для сортировки левой и правой части
            if (low < j)
                quickSort(array, low, j);

            if (high > i)
                quickSort(array, i, high);
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
