import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
class ProductTest {

    private final String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
    private final int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
    };
    private final Product product = new Product(names, sales) {
        @Override
        public int GetTotalProductSales() {
            return 0;
        }
    };

    @Test
    void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        int expected = 153;
        int actual = product.GetTotalProductsSold();
        assertEquals(expected, actual);
    }

    @Test
    void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        double expected = 17.0;   // 153 / 9
        double actual = product.GetAverageProductSold();
        assertEquals(expected, actual, 0.001);
    }
}