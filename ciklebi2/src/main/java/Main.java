//// 1 დავალება
//void main() {
//
//    Scanner scanner = new Scanner(System.in);
//    int n = scanner.nextInt();
//    double sum = 0;
//    for (int i = 1; i <= n; i++) {
//        sum += i;
//    }
//
//    System.out.println(sum / n);
//
//}
//// 2
//void main() {
//
//    int n = 27;
//    int power = 1;
//    while (power * 2 <= n) {
//        power *= 2;
//    }
//    while (n > 0) {
//        if (n >= power) {
//
//            System.out.print(power + " ");
//            n -= power;
//        }
//        power /= 2;
//
//    }
//}
////3
//void main() {
//
//    for (int i = 1; i <= 15; i++) {
//        if (i % 2 == 0 || i == 5 || i == 7 || i == 11) {
//            continue;
//
//        }
//
//        System.out.print(i + " ");
//
//    }
//
//}
//// 4
//void main() {
//    Scanner scanner = new Scanner(System.in);
//    String binary = scanner.next();
//    int decimal = 0;
//    int power = 1;
//    for (int i = binary.length() - 1; i >= 0; i--) {
//        if (binary.charAt(i) == '1') {
//
//            decimal += power;
//
//        }
//
//        power *= 2;
//
//    }
//
//    System.out.println(decimal);
//
//}
//// 5
//void main() {
//
//    Scanner scanner = new Scanner(System.in);
//    int decimal = scanner.nextInt();
//    String binary = "";
//    if (decimal == 0) {
//
//        binary = "0";
//    }
//
//    while (decimal > 0) {
//
//        binary = (decimal % 2) + binary;
//        decimal /= 2;
//    }
//
//    System.out.println(binary);
//
//}

// 6
void main() {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int numToGuess = random.nextInt(1, 101);
    int userNumber = scanner.nextInt();
    while (userNumber != numToGuess) {
        if (userNumber < numToGuess) {
            System.out.println("Try Higher!");
        } else {
            System.out.println("Try Lower!");
        }

        userNumber = scanner.nextInt();

    }
    System.out.println(userNumber + " was the correct answer!");

}