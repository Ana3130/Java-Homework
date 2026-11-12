//// 1 დავალება
//void main() {
//
//  int sum = 0;
//  for (int i = 10; i <= 100; i++) {
//    if (i % 5 == 0) {
//      sum += i;
//
//    }
//
//  }
//  System.out.println(sum);
//
//}
//
//// 2 დავალება
//void main() {
//
//  int num = 54321;
//  int digits = 0;
//  if (num == 0) {
//    digits = 1;
//  } else {
//    while (num != 0) {
//
//      num /= 10;
//      digits++;
//
//    }
//
//  }
//
//  System.out.println(digits);
//
//}
//
//// 3 დავალება
//void main() {
//
//  int num = 29;
//  boolean isPrime = num > 1;
//  for (int i = 2; i <= Math.sqrt(num); i++) {

//    if (num % i == 0) {
//      isPrime = false;
//      break;
//
//    }
//
//  }
//  System.out.println(isPrime ? "მარტივია" : "არ არის მარტივი");
//
//}
//
//// 4 დავალება
//void main() {
//
//  int a = 48;
//  int b = 18;
//  while (b != 0) {
//
//    int temp = b;
//    b = a % b;
//    a = temp;
//
//  }
//
//  System.out.println("უსგ: " + a);
//
//}
//
//// 5 დავალება
//void main() {
//
//  for (int i = 100; i <= 999; i++) {
//    int d1 = i / 100;
//    int d2 = (i / 10) % 10;
//    int d3 = i % 10;
//    int digitSum = d1 + d2 + d3;
//    if (i % digitSum == 0) {
//      System.out.print(i + " ");

//    }

//  }

//}

// 6 დავალება
void main() {

  int first = 0;
  int second = 1;
  System.out.print(first + " " + second + " ");
  for (int i = 3; i <= 10; i++) {
    int next = first + second;
    System.out.print(next + " ");
    first = second;
    second = next;

  }

}