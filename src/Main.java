import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("введите число");

        //int myInt = scanner.nextInt();
        int myInt = 12345678;

        DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance();
        DecimalFormatSymbols symbols = formatter.getDecimalFormatSymbols();
        symbols.setGroupingSeparator(','); //разделитель тысяч: ,
        formatter.setDecimalFormatSymbols(symbols);
        System.out.println(formatter.format(myInt));
    }
}

