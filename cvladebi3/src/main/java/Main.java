//// 1
//void main() {
//
//    int a = 5;
//    int b = 10;
//    int temp = a;
//    a = b;
//    b = temp;
//    System.out.println("a = " + a + ", b = " + b);
//
//}
//void main() {
//
//    int a = 5;
//    int b = 10;
//    a = a + b;
//    b = a - b;
//    a = a - b;
//    System.out.println("a = " + a + ", b = " + b);
//
//}
//
//// 2
//void main() {
//
//    double num = 10.234;
//    double fractionalPart = num - (int) num;
//    System.out.println(fractionalPart);
//
//}
//
//// 3
//void main() {
//
//    int num = 123;
//    boolean isThreeDigit = (num >= 100 && num <= 999) || (num <= -100 && num >= -999);
//    System.out.println(isThreeDigit);
//
//}
//
//// 4
//void main() {
//
//    char small = 'r';
//    char capital = (char) (small - 32);
//    System.out.println(capital);
//
//}
//
//// 5
//void main() {
//
//    double num = 11.5;
//    int rounded = (int) (num + 0.5);
//    System.out.println(rounded);
//
//}
//
//// 6
//void main() {
//
//    int a = 6;
//    int b = 6;
//    int k = 4;
//    int countA = (a + k - 1) / k;
//    int countB = (b + k - 1) / k;
//    int totalSquares = countA * countB;
//    System.out.println(totalSquares);
//
//}
//
//// 7
//void main() {
//
//    int totalSeconds = 2665;
//    int hours = totalSeconds / 3600;
//    int minutes = (totalSeconds % 3600) / 60;
//    int seconds = totalSeconds % 60;
//    if (hours >= 0 && minutes >= 0 && seconds >= 0) {
//
//        System.out.println(hours + ":" + minutes + ":" + seconds);
//
//    }
//
//}

// 8
void main() {

    int totalSeconds = 2665;
    int hours = totalSeconds / 3600;
    int minutes = (totalSeconds % 3600) / 60;
    int seconds = totalSeconds % 60;
    System.out.println(hours + ":" + minutes + ":" + seconds);


}