public class Main {
    public static void main(String[] args) {
        int[] arr1 = {11, 8, -19, 15, -24, 18, -36};
        int[] arr2 = {-14, -11, -22, 15, 23, -13, 9};
        int[] arr3 = {85, 4, -21, 15, 7, -6, 36};


        //checking if sum of arr1 is divided by 3
        if (divideByN(sumCount(arr1), 3))
            System.out.println("Divided by 3");
        else
            System.out.println("Not divided");

        System.out.println("------------------------");

        //checking if sum of arr2 is positive
        if (isPositive(sumCount(arr2)))
            System.out.println("The sum is positive");
        else
            System.out.println("The sum is negative");

        System.out.println("------------------------");

        //checking if sum of arr 3 is divided by 4 and 15
        int sum = sumCount(arr3);

        if (divideByN(sum, 4) && divideByN(sum, 15))
            System.out.println("Divided by 4 and 15");
        else
            System.out.println("Not divided");


        System.out.println("------------------------");


        //comparing sums of 2 arrays
        int sum1 = sumCount(arr1);
        int sum2 = sumCount(arr2);
        System.out.println("Sum of arr1 is: " + sum1);
        System.out.println("Sum of arr2 is: " + sum2);
        System.out.println(compare(sum1, sum2));

        System.out.println("------------------------");

        //checking max values and comparing them

        int max2 = maxValue(arr2);
        int max3 = maxValue(arr3);

        System.out.println("Max of arr2 is: " + max2);
        System.out.println("Max of arr3 is: " + max3);

        System.out.println(compare(max2,max3));


    }

    static int sumCount(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }


    static boolean divideByN(int a, int b) {
        return a % b == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }

    static String compare(int a, int b) {
        if (a > b)
            return a + " is bigger than " + b;
        else
            return a + " is smaller than " + b;
    }


    static int maxValue(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }


}