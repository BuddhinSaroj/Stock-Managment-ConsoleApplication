public class Stocks {


    //stock details
    private  int stockId;
    private String stockCategory;
    private String nameOfItems;
    private int quantityOfItems;
    //other details
    private int stockPurchase;
    private int stockSales;
    private int stockEntries;
    private int stockEntriesPayments;
    private int stockSalesPayments;
    //customer details
    private String customerName;
    private String customerAddress;
    //supplier details
    private String supplierName;
    private String supplierAddress;

    public Stocks(int stockId, String stockCategory, String nameOfItems, int quantityOfItems, int stockPurchase, int stockSales, int stockEntries, int stockEntriesPayments, int stockSalesPayments,
                  String customerName, String customerAddress, String supplierName, String supplierAddress) {
        this.stockId = stockId;
        this.stockCategory = stockCategory;
        this.nameOfItems = nameOfItems;
        this.quantityOfItems = quantityOfItems;
        this.stockPurchase = stockPurchase;
        this.stockSales = stockSales;
        this.stockEntries = stockEntries;
        this.stockEntriesPayments = stockEntriesPayments;
        this.stockSalesPayments = stockSalesPayments;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
    }

    public int getStockId() {
        return stockId;
    }

    public String getStockCategory() {
        return stockCategory;
    }

    public String getNameOfItems() {
        return nameOfItems;
    }

    public int getQuantityOfItems() {
        return quantityOfItems;
    }

    public int getStockPurchase() {
        return stockPurchase;
    }

    public int getStockSales() {
        return stockSales;
    }

    public int getStockEntries() {
        return stockEntries;
    }

    public int getStockEntriesPayments() {
        return stockEntriesPayments;
    }

    public int getStockSalesPayments() {
        return stockSalesPayments;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    @Override
    public String toString() {
        return "Stocks{" +
                "stockId=" + stockId +
                ", stockCategory='" + stockCategory + '\'' +
                ", nameOfItems='" + nameOfItems + '\'' +
                ", quantityOfItems=" + quantityOfItems +
                ", stockPurchase=" + stockPurchase +
                ", stockSales=" + stockSales +
                ", stockEntries=" + stockEntries +
                ", stockEntriesPayments=" + stockEntriesPayments +
                ", stockSalesPayments=" + stockSalesPayments +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", supplierAddress='" + supplierAddress + '\'' +
                '}';
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public void setStockCategory(String stockCategory) {
        this.stockCategory = stockCategory;
    }

    public void setNameOfItems(String nameOfItems) {
        this.nameOfItems = nameOfItems;
    }

    public void setQuantityOfItems(int quantityOfItems) {
        this.quantityOfItems = quantityOfItems;
    }

    public void setStockPurchase(int stockPurchase) {
        this.stockPurchase = stockPurchase;
    }

    public void setStockSales(int stockSales) {
        this.stockSales = stockSales;
    }

    public void setStockEntries(int stockEntries) {
        this.stockEntries = stockEntries;
    }

    public void setStockEntriesPayments(int stockEntriesPayments) {
        this.stockEntriesPayments = stockEntriesPayments;
    }

    public void setStockSalesPayments(int stockSalesPayments) {
        this.stockSalesPayments = stockSalesPayments;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }
}
