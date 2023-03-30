package com.ct.vlevy.ForArrayBasic;

//Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
// Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].

public class ArrayMinMaxMid {
    static final int MAX_ARRAY_LENGTH = 100;
    static final int MIN_ARRAY_LENGTH = 10;
    static final int MAX_ARRAY_VALUE = 1000;

    public static void main(String[] args) {
        int[] array = getRandomArray();
        findMinMaxMidValues(array);
    }

    static int[] getRandomArray() {
        int arraySize = (int) (Math.random() * (MAX_ARRAY_LENGTH - MIN_ARRAY_LENGTH + 1) + MIN_ARRAY_LENGTH);
        int[] arrayRand = new int[arraySize];

        for (int i = 0; i < arrayRand.length; i++) {
            arrayRand[i] = (int) (Math.random() * (MAX_ARRAY_VALUE + 1));
        }

        return arrayRand;
    }

    static void findMinMaxMidValues(int[] arr) {
        //sort array
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array MIN value = " + arr[0]);
        System.out.println("Array MID value = " + arr[arr.length / 2]);
        System.out.println("Array MAX value = " + arr[arr.length - 1]);
    }
}
