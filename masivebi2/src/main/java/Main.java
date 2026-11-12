//// 1
//void main(){
//
//    Scanner sc= new Scanner(System.in);
//    int[] arr= {4, 7, 2, 9};
//    int zeros= 0;
//    while (zeros < arr.length){
//        System.out.println(Arrays.toString(arr));
//        int input=sc.nextInt();
//        for (int i=0; i < arr.length; i++){
//
//            if (arr[i]==input && arr[i]!= 0){
//                arr[i]= 0;
//                zeros++;
//
//            }
//        }
//    }
//
//    System.out.println(Arrays.toString(arr));
//}
//
//// 2
//void main() {
//
//    int[] prices= {7, 1, 5, 3, 6, 4};
//    int minPrice= prices[0];
//    int buyDay= 0;
//    int bestBuyDay= 0;
//    int bestSellDay= 0;
//    int maxProfit= 0;
//    for (int i = 1; i < prices.length; i++){
//
//        if (prices[i]-minPrice > maxProfit){
//            maxProfit= prices[i] - minPrice;
//            bestBuyDay= buyDay;
//            bestSellDay= i;
//        }
//
//        if (prices[i] < minPrice){
//            minPrice= prices[i];
//            buyDay= i;
//
//        }
//    }
//
//    System.out.println( "ყიდვის დღე( ):  " + bestBuyDay + ",  გაყიდვის დღე: " + bestSellDay + ",  მოგება: " + maxProfit );
//}
//
//// 3
//void main(){
//
//    int[] arr= {1, 2, 0, 2, 1};
//    boolean isPalindrome=true ;
//    for (int i = 0; i < arr.length / 2; i++){
//
//        if (arr[i] != arr[arr.length -1- i]){
//            isPalindrome=false;
//            break;
//
//        }
//    }
//
//    System.out.println(isPalindrome ? "კი" : "არა");
//}
//
//// 4
//void main(){
//
//    Scanner sc=new Scanner(System.in);
//    int[] arr= {1, 2, 1, 1, 4, 5, 2, 1, 4, 2};
//    System.out.print("შეიყვანეთ მოსაშორებელი რიცხვი: ");
//    int numToRemove=sc.nextInt();
//    int countToRemove= 0;
//
//    for (int num:arr){
//        if (num== numToRemove){
//            countToRemove++;
//
//        }
//    }
//    int[] newArr=new int[arr.length-countToRemove ];
//    int index=0;
//    for (int num:arr){
//
//        if (num != numToRemove){
//            newArr[index]=num;
//            index++;
//
//        }
//    }
//
//    System.out.println(Arrays.toString(newArr));
//
//}

import java.util.Arrays;
import java.util.Scanner;
void main(){

    Scanner sc=new Scanner(System.in);
    System.out.println("---1---");
    task1(sc);
    System.out.println("\n--- 2---");
    task2();
    System.out.println("\n--- 3 ---");
    task3();
    System.out.println("\n--- 4 ---");
    task4(sc);


}
// 1
void task1(Scanner sc){

    int[] arr= {4, 7, 2, 9};
    int zeros= 0;
    while (zeros < arr.length) {

        System.out.println(Arrays.toString(arr));
        System.out.print("შეიყვანეთ გასანულებელი რიცხვი: ");
        int input = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==input && arr[i] != 0 ) {

                arr[i]= 0;
                zeros++;

            }

        }
    }

    System.out.println("ყველა წევრი განულდა:  " + Arrays.toString(arr)) ;

}
// 2
void task2(){

    int[] prices= {7, 1, 5, 3, 6, 4};
    int minPrice= prices[0];
    int buyDay= 0;
    int bestBuyDay= 0;
    int bestSellDay= 0;
    int maxProfit= 0;
    for (int i =1; i< prices.length; i++) {

        if (prices[i] -minPrice > maxProfit) {
            maxProfit =prices[i] - minPrice;
            bestBuyDay =buyDay;
            bestSellDay =i;

        }

        if (prices[i]< minPrice) {
            minPrice =prices[i];
            buyDay =i;

        }

    }

    System.out.println( "ყიდვის დღე( ):  " + bestBuyDay + ",  გაყიდვის დღე:  " + bestSellDay + ",  მოგება:  " + maxProfit );

}
// 3
void task3(){

    int[] arr= {1, 2, 0, 2, 1};
    boolean isPalindrome = true;
    for (int i =0; i < arr.length/2; i++) {

        if (arr[i] != arr[arr.length-1-i]) {
            isPalindrome=false;
            break;

        }

    }
    System.out.println(isPalindrome ? "კი" : "არა");

}
// 4
void task4(Scanner sc){

    int[] arr = {1, 2, 1, 1, 4, 5, 2, 1, 4, 2};
    System.out.println("საწყისი მასივი: " + Arrays.toString(arr));
    System.out.print("შეიყვანეთ მოსაშორებელი რიცხვი: ");
    int numToRemove = sc.nextInt();
    int countToRemove = 0;
    for (int num:arr) {

        if (num==numToRemove) {
            countToRemove++;

        }

    }
    int[] newArr = new int[ arr.length - countToRemove ];
    int index = 0;

    for (int num:arr) {

        if (num!=numToRemove) {
            newArr[index]=num;
            index++;

        }

    }

    System.out.println("განახლებული მასივი: " + Arrays.toString(newArr));

}