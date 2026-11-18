public interface IProduct {
    int GetTotalProductSales();

    // Adds up every monthly sale for every product
    int GetTotalProductsSold();

    double GetAverageProductSold();
    String GetMostPopularProduct();

}