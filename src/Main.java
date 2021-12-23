import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("введите число");
      String  num = scanner.nextLine();
String x ="";
if (num.length()<=3){x = num;} else {
    for (int i = 3; i <= num.length(); i+=3) {

        x = x + num.substring(i-3, i) + ",";

    }
}
        System.out.println(x);
    }
}
