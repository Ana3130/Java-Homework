import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
//
//// 1
//void main() {
//
//    int[] b = new int[12];
//    for (int i = 0; i < b.length; i++) {
//
//        b[i] = i + 1;
//
//    }
//    for (int i = 0; i < b.length; i++) {
//        System.out.print(b[i] + " ");
//    }
//
//    System.out.println();
//
//}
//        // 2
//        void main() {
//            int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//            float sum = 0;
//            int product = 1;
//            int length = b.length;
//            for (int i = 0; i < length; i++) {
//                sum += b[i];
//                product *= b[i];
//            }
//
//            System.out.println("sum: " + (int) sum +
//                    "\nproduct: " + product +
//                    "\naverage: " + sum / length);
//
//        }
//
//        // 3
//        void main() {
//
//            Random random = new Random();
//            int[] b = new int[20];
//            for (int i = 0; i < b.length; i++) {
//                b[i] = random.nextInt(21);
//
//            }
//            int min = b[0];
//            int max = b[0];
//            for (int i : b) {
//                System.out.print(i + " ");
//            }
//
//            for (int i = 0; i < b.length; i++) {
//                if (b[i] < min) {
//                    min = b[i];
//                }
//
//                if (b[i] > max) {
//                    max = b[i];
//                }
//            }
//
//            System.out.println("\nMin: " + min + "\nMax: " + max);
//
//        }
//
//        // 4
//        void main() {
//
//            int[] numbers = new int[15];
//            for (int index = 0; index < numbers.length; index++) {
//                numbers[index] = index + 1;
//            }
//
//            for (int i = 0; i < numbers.length; i++) {
//                System.out.print(numbers[i] + " ");
//            }
//
//            System.out.println();
//
//        }
//
//        // 5
//        void main() {
//
//            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//            float sum = 0;
//            int product = 1;
//            int length = numbers.length;
//            for (int i : numbers) {
//                sum += i;
//                product *= i;
//
//            }
//
//            System.out.println("Sum: " + (int) sum +
//                    "\nProduct: " + product +
//                    "\nAverage: " + sum / length);
//
//        }
//
//        // 6
//        void main() {
//
//            int[] numbers = {1, 2, 3, 4, 5};
//            int x = 10;
//            int counter = 0;
//            for (int i : numbers) {
//
//                if (i == x) {
//                    System.out.println("X is in the array!!!");
//                    break;
//                }
//
//                counter++;
//
//            }
//
//            if (counter == numbers.length) {
//                System.out.println("X is not in the array!!!");
//
//            }
//        }
//
//        // 7
//        void main() {
//
//            Scanner sc = new Scanner(System.in);
//            int[] numbers = {1, 2, 3, 4, 5};
//            System.out.println(Arrays.toString(numbers));
//            System.out.print("შეიყვანეთ დასამატებელი რიცხვი: ");
//            int numberToAdd = sc.nextInt();
//            int[] newNums = new int[numbers.length + 1];
//            newNums[0] = numberToAdd;
//            for (int i = 0; i < numbers.length; i++) {
//                newNums[i + 1] = numbers[i];
//            }
//
//            System.out.println(Arrays.toString(newNums));
//
//        }
//        void main() {
//
//            Scanner sc = new Scanner(System.in);
//            int[] numbers = {1, 2, 3, 4, 5};
//            System.out.println(Arrays.toString(numbers));
//            System.out.print("შეიყვანეთ ბოლოში დასამატებელი რიცხვი: ");
//            int numberToAdd = sc.nextInt();
//            int[] newNums = Arrays.copyOf(numbers, numbers.length + 1);
//            newNums[newNums.length - 1] = numberToAdd;
//            System.out.println(Arrays.toString(newNums));
//
//        }
//
//        // 8
//        void main() {
//
//            int[] numbers = {3, 4, 5};
//            int target = 8;
//            for (int i = 0; i < numbers.length; i++) {
//
//                for (int j = i + 1; j < numbers.length; j++) {
//
//                    if (numbers[i] + numbers[j] == target) {
//
//                        System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);
//                        break;
//
//                    }
//                }
//            }
//        }
//        // 9
//        void main() {
//
//            Scanner sc = new Scanner(System.in);
//            int[] numbers = {1, 2, 3, 4, 5};
//            System.out.println(Arrays.toString(numbers));
//            System.out.print("Please input number you want to remove: ");
//            int numToRemove = sc.nextInt();
//            int indexToDelete = -1;
//            for (int i = 0; i < numbers.length; i++) {
//
//                if (numbers[i] == numToRemove) {
//                    indexToDelete = i;
//                    break;
//
//                }
//            }
//            if (indexToDelete != -1) {
//
//                int[] newNumbers = new int[numbers.length - 1];
//                int currInd = 0;
//                for (int i = 0; i < numbers.length; i++) {
//                    if (i != indexToDelete) {
//                        newNumbers[currInd] = numbers[i];
//                        currInd++;
//
//                    }
//                }
//                System.out.println(Arrays.toString(newNumbers));
//
//            } else {
//                System.out.println("Number Is Not In The Array");
//
//            }
//        }

        // 10
        void main() {

            Scanner sc = new Scanner(System.in);
            int[] numbers = {1, 2, 3, 4, 5};
            int zeroCount = 0;
            while (zeroCount < numbers.length) {
                System.out.println(Arrays.toString(numbers));
                System.out.print("შეიყვანეთ გასანულებელი რიცხვი: ");
                int target = sc.nextInt();
                for (int i = 0; i < numbers.length; i++) {

                    if (numbers[i] == target && numbers[i] != 0) {
                        numbers[i] = 0;
                        zeroCount++;

                    }
                }
            }

            System.out.println("ყველა წევრი განულდა: " + Arrays.toString(numbers));

        }