import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Массив: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9");
        System.out.print("Введите количество сдвигов: ");
        int n = kb.nextInt();
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("Сдвиг влево: ");
        for(int i = 0; i < n; i++)
        {
            int left = arr[0];
            for(int j = 0; j < arr.length - 1; j++)
                arr[j] = arr[j + 1];
            arr[arr.length - 1] = left;
        }
        System.out.println(Arrays.toString(arr));

        System.out.print("Сдвиг вправо: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = i;
        }

        for(int i = 0; i < n; i++)
        {
            int right = arr[arr.length - 1];

            for(int j = arr.length - 1; j > 0; j--)
            {
                arr[j] = arr[j-1];
            }
            arr[0] = right;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("Сортировка массива в порядке возрастания: ");
        System.out.println("Массив: 23, 16, 456, 7, 11, 69, 5");
        int[] array = {23, 16, 456, 7, 11, 69, 5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}