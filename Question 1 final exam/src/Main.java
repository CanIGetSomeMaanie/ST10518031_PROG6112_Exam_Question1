import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Single-dimensional array: the mattress names
        String[] productNames = {
                "Cozy Nights Monarch",
                "Restonic Barbados",
                "Sealy Phuket"
        };
        final int MONTHS = 3;

        // Two-dimensional array: rows = products, columns = months
        int[][] sales = new int[productNames.length][MONTHS];

        // Populate the array from user input
        for (int product = 0; product < productNames.length; product++) {
            for (int month = 0; month < MONTHS; month++) {
                System.out.print("Enter number of sales for month " + (month + 1)
                        + " for " + productNames[product] + " mattress: ");
                sales[product][month] = input.nextInt();
            }
            System.out.println();
        }

        // Calculate and print the report
        Product product = new Product(productNames, sales) {
            @Override
            public int GetTotalProductSales() {
                return 0;
            }
        };
        PrintProduct printer = new PrintProduct(product);

        printer.PrintHeading();
        printer.PrintTotalProductSales();
        printer.PrintAverageProductSales();
        printer.PrintMostPopularProduct();

        input.close();
    }
}