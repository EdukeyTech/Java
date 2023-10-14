public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Орын ауыстыру
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    System.out.println("Ауысқан элементтеп: arr[" + j + "] және arr[" + (j + 1) + "]");
                }
            }
            // Егерде 1 циклде элементтер орны ауыспаса массив сұрыпталды деген сөз
            if (!swapped) {
                break;
            }
        }

        System.out.println("Сұрыпталғын массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
