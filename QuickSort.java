import java.util.Arrays;

public class QuickSort {

    // Организовать вызов фактического метода быстрой сортировки
    static void qsort(char items[]) {
        QuickSort.qs(items, 0, items.length - 1);

    }

    //Алгоритм метода быстрой сортировки с рекурсией
    private static void qs(char items[], int left, int right) {
        int l, r;
        char x, y;

        l = left;
        r = right;
        x = items[(left+right)/2];

        do {
            while ((items[l] < x) && (l < right)) l++;
            while (x < items[r] && (r > left)) r--;
            if (l <= r) {
                y = items[l];
                items[l] = items[r];
                items[r] = y;
                l++;
                r--;

            }


            if (left < r) qs(items, left, r);
            if (l < right) qs(items, l, right);
        } while (l <= r);


    }
}

    class QSDemo {
        public static void main(String[] args) {
            char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i','o'};

            System.out.println("Исходный массив: ");
            for (char x : a) {
                System.out.print(x);
            }

            System.out.println();

            //Отсортировать массив
            QuickSort.qsort(a);

            System.out.println("Отсортированный массив: ");
            for (char x : a) {
                System.out.print(x);
            }
        }
    }

