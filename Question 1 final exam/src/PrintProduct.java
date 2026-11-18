public class PrintProduct {

    private final IProduct product;

    public PrintProduct(IProduct product) {
        this.product = product;
    }

    public void PrintHeading() {
        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("**************************************************");
    }

    public void PrintTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void PrintAverageProductSales() {
        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n", product.GetAverageProductSold());
    }

    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}