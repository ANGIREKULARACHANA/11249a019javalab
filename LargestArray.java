class LargestArray {

    public static void main(String[] args) {

        int[] numbers = { 25, 12, 45, 67, 34 };

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element in the array = " + largest);
    }
}