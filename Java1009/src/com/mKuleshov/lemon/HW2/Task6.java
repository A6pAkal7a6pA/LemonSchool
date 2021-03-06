package lemon.mKuleshov.HW2;

public class Task6 {
    public static void main(String[] args) {
        //create array
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        selectionSort(arr);
        bubbleSort(arr);
    }

    //сортировка выбором
    public static void selectionSort(int[] arr) {
        System.out.println("сортировка выбором");
// По очереди будем просматривать все подмножества элементов массива (0 - последний, 1-последний, 2-последний,...)
        for (int i = 0; i < arr.length; i++) {
            /*Предполагаем, что первый элемент (в каждом подмножестве элементов) является минимальным */
            int min = arr[i];
            int min_i = i;
// В оставшейся части подмножества ищем элемент, который меньше предположенного минимума
            for (int j = i + 1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
// Если нашелся элемент, меньший, чем на текущей позиции, меняем их местами
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }

            System.out.print(arr[i] + " ");
        }
        System.out.println("");

    }

    // СОРТИРОВКА ПУЗЫРЬКОМ
    public static void bubbleSort(int[] arr) {
        System.out.println("sort puzirkom");
// Внешний цикл каждый раз сокращает фрагмент массива, так как внутренний цикл каждый раз ставит в конец фрагмента максимальный элемент
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
// Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            } System.out.print(arr[i]+ " ");
        }

    }
}
