import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }




    public static void task1 () {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 1 ===========");
        System.out.println("============================");
        int [] figureOne = new int []{1, 2, 3};
        double [] figureTwo = new double []{1.57, 7.654, 9.986};
        int [] figureThree= new int []{76, 64, 89, 78};
        System.out.println("===== Конец задачи 1 =======");
    }

    public static void task2 () {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 2 ===========");
        System.out.println("============================");
        int [] figureOne = new int []{1, 2, 3};
        for (int i=0; i< figureOne.length; i++){
            System.out.print(figureOne[i]);
            if (i < figureOne.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        double [] figureTwo = new double []{1.57, 7.654, 9.986};
        for (int i=0; i< figureTwo.length; i++) {
            System.out.print(figureTwo[i]);
            if (i < figureTwo.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        int [] figureThree= new int []{76, 64, 89, 78};
        for (int i=0; i< figureThree.length; i++) {
            System.out.print(figureThree[i] );
            if (i < figureThree.length-1) {
                System.out.print(", ");

            }
        }
        System.out.println("");
        System.out.println("===== Конец задачи 2 =======");
    }
    private static void task3() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 3 ===========");
        System.out.println("============================");
        int [] figureOne = new int []{1, 2, 3};
        for (int i= figureOne.length-1; i>= 0; i=i-1){
            System.out.print(figureOne[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        double [] figureTwo = new double []{1.57, 7.654, 9.986};
        for (int i= figureTwo.length-1; i>=0; i=i-1) {
            System.out.print(figureTwo[i]);
            if (i >0) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        int [] figureThree= new int []{76, 64, 89, 78};
        for (int i= figureThree.length-1; i>=0; i=i-1) {
            System.out.print(figureThree[i] );
            if (i > 0) {
                System.out.print(", ");

            }
        }
        System.out.println("");
        System.out.println("===== Конец задачи 3 =======");
    }
    private static void task4() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 4 ===========");
        System.out.println("============================");
        int[] figureOne = new int[]{1, 2, 3};
        for (int i = 0; i < figureOne.length; i++) {
            if (figureOne[i] % 2 != 0) {
                figureOne[i] = figureOne[i] + 1;
            }
        }
        System.out.println(Arrays.toString(figureOne));
        System.out.println("===== Конец задачи 4 =======");

    }

}