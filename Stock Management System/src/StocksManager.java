public interface StocksManager {

    void enterStocks(Stocks stocks);
    void viewStocks(int stockId);
    void dispatchStock(int stockId);
    void editStock(int stockId);
}
