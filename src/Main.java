public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача1");
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        System.out.println(firstArray[0]);
        System.out.println(firstArray[1]);
        System.out.println(firstArray[2]);
        float[] secondArray = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < secondArray.length; i++) {
            System.out.println(secondArray[i]);
        }
        int[] thirdArray = {57, 14, 78};
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i] + " ");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача2");
        int[] firstArray1 = new int[3];
        firstArray1[0] = 1;
        firstArray1[1] = 2;
        firstArray1[2] = 3;
        System.out.print(firstArray1[0] + ", ");
        System.out.print(firstArray1[1] + ", ");
        System.out.print(firstArray1[2]);
        System.out.println();
        float[] secondArray1 = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < secondArray1.length; i++) {
            if (i == secondArray1.length - 1) {
                System.out.println(secondArray1[i]);
                break;
            }
            System.out.print(secondArray1[i] + ", ");
        }
        int[] thirdArray1 = {57, 14, 78};
        for (int i = 0; i < thirdArray1.length; i++) {
            if (i == thirdArray1.length - 1) {
                System.out.println(secondArray1[i]);
                break;
            }
            System.out.print(thirdArray1[i] + ", ");
        }
    }
}
