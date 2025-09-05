//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        {
            System.out.println("Задача 1");
            int[] number1 = new int[3];
            number1[0] = 1;
            number1[1] = 2;
            number1[2] = 3;

            double[] number2 = {1.57, 7.654, 9.986};

            int[] array = {10};
            System.out.println("Целочисленный массив: ");
            for (int num : number1) {
                System.out.println(num + " ");
            }
            System.out.println("Дробный массив: ");
            for (double num : number2) {
                System.out.println(num + " ");
            }
            System.out.println("Свой массив: ");
            for (int num : array) {
                System.out.println(num + " ");
            }
        }
        {
            System.out.println("Задача 2");
            int[] number1 = new int[3];
            number1[0] = 1;
            number1[1] = 2;
            number1[2] = 3;

            double[] number2 = {1.57, 7.654, 9.986};

            int[] array = {10};
            System.out.println("Целочисленный массив: ");
            for (int i = 0; i < number1.length; i++) {
                System.out.print(number1[i]);
                if (i < number1.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();

            System.out.println("Дробный массив:");
            for (int i = 0; i < number2.length; i++) {
                System.out.print(number2[i]);
                if (i < number2.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();

            System.out.println("Свой массив:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();

        }
        {
        System.out.println("Задача 3");

        int[] number1 = new int[3];
        number1[0] = 1;
        number1[1] = 2;
        number1[2] = 3;

        double[] number2 = {1.57, 7.654, 9.986};
        int[] array = {10};


        System.out.println("Целочисленный массив в обратном порядке:");
        for (int i = number1.length - 1; i >= 0; i--) {
            System.out.print(number1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        System.out.println("Дробный массив в обратном порядке:");
        for (int i = number2.length - 1; i >= 0; i--) {
            System.out.print(number2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        System.out.println("Свой массив в обратном порядке:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
        System.out.println();
        {
            System.out.println("Задача 4");
            int[] number1 = new int[3];
            number1[0] = 1;
            number1[1] = 2;
            number1[2] = 3;


            System.out.println("Исходный массив:");
            for (int i = 0; i < number1.length; i++) {
                System.out.print(number1[i] + " ");
            }
            System.out.println();

            System.out.println("Массив после преобразования:");
            for (int i = 0; i < number1.length; i++) {
                if (number1[i] % 2 != 0) {
                    number1[i] += 1;
                }
                System.out.print(number1[i] + " ");
            }
        }
    }
}