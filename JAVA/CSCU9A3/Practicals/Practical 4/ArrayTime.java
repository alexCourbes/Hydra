import java.util.Random;
//i did this in another class Arraytime so i can call it in my main method in the main class
public class ArrayTime {
    public int[] array_generator(int x) {
        int[] numbers = new int[x];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(x);
        }
        return numbers;
    }


    public void sort(int list[]) {
        // this is the bubble sort, the simplest sorting algorithm
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }


    public static void Swap(int[] array, int i, int j) {
        int temp;


        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static int[] Partition(int[] array, int low, int high) {
        if (low < high) {
            int pivot = array[high];

            int i = (low - 1);

            for (int j = low; j < high; j++) {

                if (array[j] < pivot) {
                    i++;

                    Swap(array, i, j);
                }
            }
            Swap(array, i + 1, high);
//
            Partition(array, low, i);
            Partition(array, i + 2, high);   //13  12 10 1 4 3 6 7 9
        }

        return array;
    }

    public int binary_Search(int arr[], int firstElement, int lastElement, int index) {
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;


            if (arr[mid] == index)
                return mid;


            if (arr[mid] > index)
                return binary_Search(arr, firstElement, mid - 1, index); //recursive method


            return binary_Search(arr, mid + 1, lastElement, index);
        }

        return -1;
    }


    public int find_sequential(int s , int arr[]) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                index = i;
            }
        }
        return index;
    }
}
