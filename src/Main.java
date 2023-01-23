import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1, 2");
        int[] firstMass = new int[]{1, 2, 3};
        for (int i = 0; i < firstMass.length; i++) {
            if (i != firstMass.length - 1) {
                System.out.print(firstMass[i] + ", ");
            } else {
                System.out.print(firstMass[i]);
            }
        }
        System.out.println();

        double[] secondMass = {1.57, 7.654, 9.986};
        for (int i = 0; i < secondMass.length; i++) {
            if (i != secondMass.length - 1) {
                    System.out.print(secondMass[i] + ", ");
            } else {
                System.out.print(secondMass[i]);
            }
        }
        System.out.println();

        int[] thirdMass = new int[3];
        thirdMass[0] = 412;
        thirdMass[1] = 965;
        thirdMass[2] = 12;
        for (int i = 0; i < thirdMass.length; i++) {
            if (i != thirdMass.length - 1) {
                System.out.print(thirdMass[i] + ", ");
            } else {
                System.out.print(thirdMass[i]);
            }
        }
            System.out.println();

        System.out.println("Task 3");
        int[] firstMass1 = new int[]{1, 2, 3};
        for (int i = firstMass1.length - 1; i > -1 ;i = i - 1) {
            if (i != 0) {
                System.out.print(firstMass1[i] + ", ");
            } else {
                System.out.print(firstMass1[i]);
            }
        }
        System.out.println();

        double[] secondMass1 = {1.57, 7.654, 9.986};
        for (int i = secondMass1.length - 1; i > -1; i = i - 1) {
            if (i != 0) {
                System.out.print(secondMass1[i] + ", ");
            } else {
                System.out.print(secondMass1[i]);
            }
        }
        System.out.println();

        int[] thirdMass1 = new int[3];
        thirdMass1[0] = 412;
        thirdMass1[1] = 965;
        thirdMass1[2] = 12;
        for (int j = thirdMass1.length - 1; j > -1; j = j - 1) {
            if (j != 0) {
                System.out.print(thirdMass1[j] + ", ");
            } else {
                System.out.print(thirdMass1[j]);
            }
        }
        System.out.println();

        System.out.println("Task 4");
        int[] task4Mass = {1, 2, 3};
        for (int i =0; i < task4Mass.length; i++) {
            if (task4Mass[i] % 2 != 0) {
                task4Mass[i] = task4Mass[i] + 1;
            }
        }
            System.out.print(Arrays.toString(task4Mass));

    }
}

