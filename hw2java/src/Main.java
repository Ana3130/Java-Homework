public class Main {
    public static void main(String[] args) {
        //  1
        System.out.println("--- დავალება 1 ---");
        double celsius = 25.0;
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        System.out.println("ცელსიუსი: " + celsius);
        System.out.println("ფარენჰაიტი: " + fahrenheitResult);

        System.out.println();

        //  2
        System.out.println("--- დავალება 2 ---");
        double fahrenheit = 77.0;
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        System.out.println("ფარენჰაიტი: " + fahrenheit);
        System.out.println("ცელსიუსი: " + celsiusResult);

        System.out.println();

        // 3

        System.out.println("--- დავალება 3 ---");
        int year = 1900;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " არის ნაკიანი");
            } else {
                System.out.println(year + " არ არის ნაკიანი");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println(year + " არის ნაკიანი");
            } else {
                System.out.println(year + " არ არის ნაკიანი");
            }
        }

        System.out.println();

        // 4
        System.out.println("--- დავალება 4 ---");
        double x = -5.5;
        double y = 12.0;

        if (x > 0 && y > 0) {
            System.out.println("პირველი მეოთხედი");
        } else if (x < 0 && y > 0) {
            System.out.println("მეორე მეოთხედი");
        } else if (x < 0 && y < 0) {
            System.out.println("მესამე მეოთხედი");
        } else if (x > 0 && y < 0) {
            System.out.println("მეოთხე მეოთხედი");
        } else if (x == 0 && y == 0) {
            System.out.println("კოორდინატთა სათავე");
        } else {
            System.out.println("მდებარეობს ღერძზე");
        }

        System.out.println();

        //  5
        System.out.println("--- დავალება 5 ---");
        String operation = "+";
        double num1 = 20.0;
        double num2 = 10.0;
        switch (operation) {
            case "+":
                System.out.println("პასუხი: " + (num1 + num2));
                break;
            case "-":
                System.out.println("პასუხი: " + (num1 - num2));
                break;
            case "*":
                System.out.println("პასუხი: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("პასუხი: " + (num1 / num2));
                } else {
                    System.out.println("ნულზე გაყოფა არ შეიძლება!");
                }
                break;
            default:
                System.out.println("განსხვავებული მნიშვნელობა");

                break;


        }
    }
}