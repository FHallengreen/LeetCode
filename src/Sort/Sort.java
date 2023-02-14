package Sort;

import java.util.Arrays;
import java.util.Random;

public class Sort {

    public int[] bubbleSort(int[] list) {

        for (int i = 0; i < list.length; i++) {
            int index = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    int temp = list[index];
                    list[index] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }

    public int[] selectionSort(int[] list) {


        for (int i = 0; i < list.length; i++) {
            int index = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[index]) {
                    index = j;
                }
            }
            int min = list[index];
            list[index] = list[i];
            list[i] = min;

        }

        return list;
    }

    public int[] insertionSort(int[] list) {

        for (int i = 1; i < list.length; i++) {
            while (list[i] < list[i - 1]) {
                int temp = list[i];
                list[i] = list[i - 1];
                list[i - 1] = temp;
            }
        }
        return list;
    }

    public void mergeSort(int[] list) {

        int mid = list.length / 2;
        int[] left = new int[mid + list.length % 2];
        int[] right = new int[list.length - left.length];

        if (list.length < 2) {
            return;
        }
        for (int i = 0; i < left.length; i++) {
            left[i] = list[i];
        }
        int nr = 0;
        for (int i = left.length; i < list.length; i++) {
            right[nr] = list[i];
            nr++;
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, list);
    }

    public void merge(int[] left, int[] right, int[] res) {

 /*          6532 4321
            62 32 43 21
          6 2 3 2 4 3 2 1
            26 23 34 12
             2236 1234
              1222346
 */

        int leftPointer = 0;
        int rightPointer = 0;
        int maxSize = right.length + left.length;

        for (int i = 0; i < maxSize; i++) {
            if (left[leftPointer] < right[rightPointer]) {
                res[i] = left[leftPointer];
                leftPointer++;
            } else {
                res[i] = right[rightPointer];
                rightPointer++;
            }

            if (leftPointer == left.length) {
                break;
            } else if (rightPointer == right.length) {
                break;
            }
        }

        int currentPosInRes = leftPointer + rightPointer;

        if (rightPointer < right.length) {
            for (int i = rightPointer; i < right.length; i++) {
                res[currentPosInRes] = right[rightPointer];
                rightPointer++;
                currentPosInRes++;
            }
        } else {
            for (int i = leftPointer; i < left.length; i++) {
                res[currentPosInRes] = left[leftPointer];
                leftPointer++;
                currentPosInRes++;
            }
        }
        int x = 4;
    }


    public static void main(String[] args) {
        Sort sort = new Sort();

        long startTime = System.currentTimeMillis();
        Random random = new Random();
        int[] rand = new int[100000];
        for (int i = 0; i < rand.length; i++) {
            rand[i] = random.nextInt(0, 100000);
        }

//        int[] list = {6, 2, 3, 2, 4, 3, 2, 1};
//        System.out.println(Arrays.toString(rand));
        sort.mergeSort((rand));
//        System.out.println(Arrays.toString(list));

//        sort.selectionSort(rand);
//        System.out.println(Arrays.toString(sort.bubbleSort(rand)));
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println(endTime);
    }


}


