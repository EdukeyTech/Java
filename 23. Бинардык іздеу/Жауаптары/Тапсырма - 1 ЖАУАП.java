public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11, 12, 22, 25, 34, 64, 90};// реттелген массив
        int target = 25; // индексін іздеу керек элемент

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) { // табылған жағдайда
                System.out.println("Элемент индексі " + target + ": " + mid);
                return;
            } else if (arr[mid] < target) { // іздеп жатқан элемент mid индексінде тұрған элементтен үлкен кезде
                left = mid + 1;
            } else {// іздеп жатқан элемент mid индексінде тұрған элементтен кіші кезде
                right = mid - 1;
            }
        }

        System.out.println("Элемент " + target + " табылмады.");
    }
}
