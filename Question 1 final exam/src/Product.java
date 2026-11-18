public abstract class Product implements IProduct {

    private final String[] productNames;
    private final int[][] sales;

    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }

    // Adds up every monthly sale for every product
    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int[] productSales : sales) {
            for (int monthSale : productSales) {
                total += monthSale;
            }
        }
        return total;
    }

    // Total divided by the number of sales values (products x months)
    @Override
    public double GetAverageProductSold() {
        int count = 0;
        for (int[] productSales : sales) {
            count += productSales.length;
        }
        return count == 0 ? 0 : (double) GetTotalProductsSold() / count;
    }

    // Finds the product with the highest sale and returns its name and that sale
    @Override
    public String GetMostPopularProduct() {
        int highestSale = 0;
        int highestIndex = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int monthSale : sales[i]) {
                if (monthSale > highestSale) {
                    highestSale = monthSale;
                    highestIndex = i;
                }
            }
        }
        return productNames[highestIndex] + "(" + highestSale + ")";
    }
}