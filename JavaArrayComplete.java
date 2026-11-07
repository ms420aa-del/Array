
import java.util.Arrays;
import java.util.ArrayList;

public class JavaArrayComplete {

    public static void main(String[] args) {

        // =========================================
        // ১. ARRAY তৈরি করা
        // =========================================

        int[] numbers = { 10, 20, 30, 40, 50 };

        System.out.println("\n১. ARRAY তৈরি");

        System.out.println("সম্পূর্ণ Array: " + Arrays.toString(numbers));

        System.out.println("মোট Element: " + numbers.length);

        // =========================================
        // ২. ARRAY ACCESS করা
        // =========================================

        System.out.println("\n২. ARRAY ACCESS");

        System.out.println("প্রথম সংখ্যা: " + numbers[0]);

        System.out.println("দ্বিতীয় সংখ্যা: " + numbers[1]);

        System.out.println("শেষ সংখ্যা: " + numbers[numbers.length - 1]);

        // =========================================
        // ৩. ARRAY UPDATE করা
        // =========================================

        System.out.println("\n৩. ARRAY UPDATE");

        numbers[2] = 100;

        System.out.println("আপডেট করা Array: " + Arrays.toString(numbers));

        // =========================================
        // ৪. ARRAY TRAVERSAL করা
        // =========================================

        System.out.println("\n৪. ARRAY TRAVERSAL");

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("সংখ্যা: " + numbers[i]);

        }

        // =========================================
        // ৫. ENHANCED FOR LOOP
        // =========================================

        System.out.println("\n৫. ENHANCED FOR LOOP");

        for (int value : numbers) {

            System.out.println("বর্তমান সংখ্যা: " + value);

        }

        // =========================================
        // ৬. ARRAY-এর SUM বের করা
        // =========================================

        System.out.println("\n৬. ARRAY SUM");

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

        }

        System.out.println("মোট যোগফল: " + sum);

        // =========================================
        // ৭. ARRAY-এর AVERAGE বের করা
        // =========================================

        System.out.println("\n৭. ARRAY AVERAGE");

        double average = (double) sum / numbers.length;

        System.out.println("গড়: " + average);

        // =========================================
        // ৮. MAXIMUM এবং MINIMUM বের করা
        // =========================================

        System.out.println("\n৮. MAXIMUM AND MINIMUM");

        int max = numbers[0];

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {

                max = numbers[i];

            }

            if (numbers[i] < min) {

                min = numbers[i];

            }

        }

        System.out.println("সবচেয়ে বড়: " + max);

        System.out.println("সবচেয়ে ছোট: " + min);

        // =========================================
        // ৯. ARRAY SEARCH করা
        // =========================================

        System.out.println("\n৯. ARRAY SEARCH");

        int target = 40;

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {

                System.out.println("সংখ্যাটি পাওয়া গেছে");

                System.out.println("Index: " + i);

                found = true;

                break;

            }

        }

        if (!found) {

            System.out.println("সংখ্যাটি পাওয়া যায়নি");

        }

        // =========================================
        // ১০. ARRAY SORTING করা
        // =========================================

        System.out.println("\n১০. ARRAY SORTING");

        int[] sortArray = { 50, 10, 40, 20, 30 };

        Arrays.sort(sortArray);

        System.out.println("ছোট থেকে বড়: " + Arrays.toString(sortArray));

        // =========================================
        // ১১. DESCENDING SORTING
        // =========================================

        System.out.println("\n১১. DESCENDING SORTING");

        Integer[] descending = { 50, 10, 40, 20, 30 };

        Arrays.sort(descending, java.util.Collections.reverseOrder());

        System.out.println("বড় থেকে ছোট: " + Arrays.toString(descending));

        // =========================================
        // ১২. ARRAY REVERSE করা
        // =========================================

        System.out.println("\n১২. ARRAY REVERSE");

        int[] reverseArray = { 10, 20, 30, 40, 50 };

        int left = 0;

        int right = reverseArray.length - 1;

        while (left < right) {

            int temp = reverseArray[left];

            reverseArray[left] = reverseArray[right];

            reverseArray[right] = temp;

            left++;

            right--;

        }

        System.out.println("উল্টো Array: " + Arrays.toString(reverseArray));

        // =========================================
        // ১৩. ARRAY COPY করা
        // =========================================

        System.out.println("\n১৩. ARRAY COPY");

        int[] original = { 10, 20, 30, 40 };

        int[] copy = Arrays.copyOf(original, original.length);

        copy[0] = 100;

        System.out.println("মূল Array: " + Arrays.toString(original));

        System.out.println("Copy Array: " + Arrays.toString(copy));

        // =========================================
        // ১৪. ARRAY INSERT করা
        // =========================================

        System.out.println("\n১৪. ARRAY INSERT");

        int[] oldArray = { 10, 20, 30, 40 };

        int position = 2;

        int value = 99;

        int[] newArray = new int[oldArray.length + 1];

        for (int i = 0; i < position; i++) {

            newArray[i] = oldArray[i];

        }

        newArray[position] = value;

        for (int i = position; i < oldArray.length; i++) {

            newArray[i + 1] = oldArray[i];

        }

        System.out.println("নতুন Array: " + Arrays.toString(newArray));

        // =========================================
        // ১৫. ARRAY DELETE করা
        // =========================================

        System.out.println("\n১৫. ARRAY DELETE");

        int[] deleteArray = { 10, 20, 30, 40, 50 };

        int deletePosition = 2;

        int[] result = new int[deleteArray.length - 1];

        for (int i = 0; i < deletePosition; i++) {

            result[i] = deleteArray[i];

        }

        for (int i = deletePosition; i < result.length; i++) {

            result[i] = deleteArray[i + 1];

        }

        System.out.println("Delete করা Array: " + Arrays.toString(result));

        // =========================================
        // ১৬. DUPLICATE সংখ্যা বের করা
        // =========================================

        System.out.println("\n১৬. DUPLICATE DETECTION");

        int[] duplicateArray = { 10, 20, 30, 20, 40, 10 };

        System.out.print("Duplicate সংখ্যা: ");

        for (int i = 0; i < duplicateArray.length; i++) {

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {

                if (duplicateArray[k] == duplicateArray[i]) {

                    alreadyPrinted = true;

                    break;

                }

            }

            if (!alreadyPrinted) {

                for (int j = i + 1; j < duplicateArray.length; j++) {

                    if (duplicateArray[i] == duplicateArray[j]) {

                        System.out.print(duplicateArray[i] + " ");

                        break;

                    }

                }

            }

        }

        System.out.println();

        // =========================================
        // ১৭. EVEN এবং ODD সংখ্যা বের করা
        // =========================================

        System.out.println("\n১৭. EVEN AND ODD");

        int[] evenOdd = { 10, 15, 20, 25, 30, 35 };

        System.out.print("জোড় সংখ্যা: ");

        for (int n : evenOdd) {

            if (n % 2 == 0) {

                System.out.print(n + " ");

            }

        }

        System.out.print("\nবিজোড় সংখ্যা: ");

        for (int n : evenOdd) {

            if (n % 2 != 0) {

                System.out.print(n + " ");

            }

        }

        System.out.println();

        // =========================================
        // ১৮. ARRAY MERGE করা
        // =========================================

        System.out.println("\n১৮. ARRAY MERGE");

        int[] a = { 10, 20, 30 };

        int[] b = { 40, 50, 60 };

        int[] merged = new int[a.length + b.length];

        System.arraycopy(a, 0, merged, 0, a.length);

        System.arraycopy(b, 0, merged, a.length, b.length);

        System.out.println("Merged Array: " + Arrays.toString(merged));

        // =========================================
        // ১৯. ARRAY-এর ELEMENT COUNT
        // =========================================

        System.out.println("\n১৯. ELEMENT COUNT");

        int[] countArray = { 10, 20, 10, 30, 10, 40 };

        int count = 0;

        for (int n : countArray) {

            if (n == 10) {

                count++;

            }

        }

        System.out.println("১০ কতবার আছে: " + count);

        // =========================================
        // ২০. SECOND LARGEST সংখ্যা
        // =========================================

        System.out.println("\n২০. SECOND LARGEST");

        int[] secondArray = { 10, 50, 30, 50, 40, 20 };

        int largest = Integer.MIN_VALUE;

        int secondLargest = Integer.MIN_VALUE;

        for (int n : secondArray) {

            if (n > largest) {

                secondLargest = largest;

                largest = n;

            }

            else if (n > secondLargest && n < largest) {

                secondLargest = n;

            }

        }

        if (secondLargest == Integer.MIN_VALUE) {

            System.out.println("দ্বিতীয় বৃহত্তম সংখ্যা নেই");

        } else {

            System.out.println("দ্বিতীয় বৃহত্তম: " + secondLargest);

        }

        // =========================================
        // ২১. 2D ARRAY / MATRIX
        // =========================================

        System.out.println("\n২১. TWO DIMENSIONAL ARRAY");

        int[][] matrix = {

                { 10, 20, 30 },

                { 40, 50, 60 },

                { 70, 80, 90 }

        };

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println("নির্দিষ্ট Element: " + matrix[0][1]);

        // =========================================
        // ২২. MATRIX-এর SUM
        // =========================================

        System.out.println("\n২২. MATRIX SUM");

        int matrixSum = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                matrixSum += matrix[i][j];

            }

        }

        System.out.println("Matrix-এর যোগফল: " + matrixSum);

        // =========================================
        // ২৩. প্রতিটি ROW-এর SUM
        // =========================================

        System.out.println("\n২৩. ROW WISE SUM");

        for (int i = 0; i < matrix.length; i++) {

            int rowSum = 0;

            for (int j = 0; j < matrix[i].length; j++) {

                rowSum += matrix[i][j];

            }

            System.out.println("Row " + (i + 1) + " এর যোগফল: " + rowSum);

        }

        // =========================================
        // ২৪. ARRAY SQUARE
        // =========================================

        System.out.println("\n২৪. ARRAY SQUARE");

        int[] squareArray = { 1, 2, 3, 4, 5 };

        for (int n : squareArray) {

            System.out.println(n + " এর Square = " + (n * n));

        }

        // =========================================
        // ২৫. BINARY SEARCH
        // =========================================

        System.out.println("\n২৫. BINARY SEARCH");

        int[] searchArray = { 10, 20, 30, 40, 50, 60, 70 };

        int searchValue = 50;

        int index = Arrays.binarySearch(searchArray, searchValue);

        if (index >= 0) {

            System.out.println("সংখ্যাটি পাওয়া গেছে। Index: " + index);

        } else {

            System.out.println("সংখ্যাটি পাওয়া যায়নি");

        }

        // =========================================
        // ২৬. ARRAY CLEAR-এর মতো কাজ
        // =========================================

        System.out.println("\n২৬. ARRAY CLEAR");

        int[] clearArray = { 10, 20, 30, 40 };

        Arrays.fill(clearArray, 0);

        System.out.println("সব Value শূন্য: " + Arrays.toString(clearArray));

        // =========================================
        // ২৭. DYNAMIC ARRAY - ARRAYLIST
        // =========================================

        System.out.println("\n২৭. ARRAYLIST");

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // শেষে সংখ্যা যোগ

        list.add(20);

        list.add(30);

        list.add(1, 99); // নির্দিষ্ট Index-এ যোগ

        list.set(0, 100); // Value পরিবর্তন

        list.remove(2); // Index অনুযায়ী Delete

        System.out.println("ArrayList: " + list);

        System.out.println("প্রথম সংখ্যা: " + list.get(0));

        System.out.println("মোট সংখ্যা: " + list.size());

        System.out.println("৩০ আছে কি না: " + list.contains(30));

        list.add(50);

        System.out.println("নতুন ArrayList: " + list);

        list.clear();

        System.out.println("Clear করার পর: " + list);

        System.out.println("খালি কি না: " + list.isEmpty());

    }
}
