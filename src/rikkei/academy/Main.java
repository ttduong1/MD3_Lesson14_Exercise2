package rikkei.academy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void insertionSort(int[] list){
        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;

            // Di chuyển các phần tử của list[0...i-1], lớn hơn key, đến vị trí cao hơn để tạo chỗ trống cho phần tử key
            while (j >= 0 && list[j] > key){
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }
}