public class Main {
    public static void main(String[] args) {
        int[] array = {3, 2 ,0, 8, 3, 4};
        System.out.println("This is array before sorting");
        printArray(array);
        bubbleSorting(array);
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
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}