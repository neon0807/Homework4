import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int [] array1 = new int [3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        float [] array2 = {1.57f, 7.654f, 9.986f};
        int [] array3 = {0, 8, 7};
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int [] array1 = new int [3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        float [] array2 = {1.57f, 7.654f, 9.986f};
        int [] array3 = {0, 8, 7};
        System.out.print(array1[0] + ", ");
        System.out.print(array1[1] + ", ");
        System.out.println(array1[2]);
        System.out.print(array2[0] + ", ");
        System.out.print(array2[1] + ", ");
        System.out.println(array2[2]);
        System.out.print(array3[0] + ", ");
        System.out.print(array3[1] + ", ");
        System.out.println(array3[2]);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int [] array1 = new int [3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        float [] array2 = {1.57f, 7.654f, 9.986f};
        int [] array3 = {0, 8, 7};
        for (int i = 2; i >= 0; i --) {
            if (i == 0){
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }
        for (int i = 2; i >= 0; i --) {
            if (i == 0){
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }
        for (int i = 2; i >= 0; i --) {
            if (i == 0){
                System.out.println(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int [] array1 = new int [3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        for (int i = 0; i < 3; i ++){
            if (array1[i] % 2 != 0){
                array1[i] ++;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int [] array = generateRandomArray();
        int sum = 0;
        for (int cost : array){
            sum += cost;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int [] array = generateRandomArray();
        int maxSum = 0;
        for (int cost : array) {
            if (maxSum < cost) {
                maxSum = cost;
            }
        }
        int minSum = maxSum;
        for (int cost : array) {
            if (minSum > cost){
                minSum = cost;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");
    }
    public static void task7 () {
        System.out.println("Задача 5");
        int [] array = generateRandomArray();
        float sum = 0f;
        for (int cost : array){
            sum += cost;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / 30 + " рублей");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i --) {
            System.out.print(reverseFullName[i]);
        }
    }
}
