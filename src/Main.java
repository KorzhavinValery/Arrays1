public class Main {
    public static void main(String[] args) {
        task1();
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
    }

}
