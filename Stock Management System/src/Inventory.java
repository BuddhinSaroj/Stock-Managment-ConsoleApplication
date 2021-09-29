import java.util.ArrayList;
import java.util.Scanner;

public class Inventory implements StocksManager {

    public static ArrayList<Stocks> inventoryArray = new ArrayList<>();

    @Override
    public void enterStocks(Stocks stocks) {
        inventoryArray.add(stocks);
        System.out.println("*****************************************************************************");
        System.out.println("*********************      Successfully added      **************************");
        System.out.println("*****************************************************************************\n" );
    }

    @Override
    public void viewStocks(int stockId) {
        for (Stocks stocks : inventoryArray) {
            if (stocks.getStockId() == stockId) {
                System.out.println("\n****************************** Stock Details  *******************************\n");
                System.out.println("Stock Category : " + stocks.getStockCategory());
                System.out.println("Name Of Item : " + stocks.getNameOfItems());
                System.out.println("Quantity Of Items : " + stocks.getQuantityOfItems());
                System.out.println("Stock Purchase : " + stocks.getStockPurchase());
                System.out.println("Stock Sales : " + stocks.getStockSales());
                System.out.println("Stock Entries : " + stocks.getStockEntries());
                System.out.println("Stock Entries Payments : " + stocks.getStockEntriesPayments());
                System.out.println("Stock Sales Payments : " + stocks.getStockSalesPayments());
                System.out.println("Customer Name : " + stocks.getCustomerName());
                System.out.println("Customer Address : " + stocks.getCustomerAddress());
                System.out.println("Supplier Name : " + stocks.getSupplierName());
                System.out.println("Supplier Address : " + stocks.getSupplierAddress());
                return;
            }
        }
        System.out.println("Stock Id " + stockId + " Cant find from the inventory...Please Retry...");
        return;
    }

    @Override
    public void dispatchStock(int stockId) {

        for (Stocks stocks : inventoryArray) {
            if (stocks.getStockId() == stockId) {
                inventoryArray.remove(stocks);
                System.out.println(stocks.getStockId() + "  deleted successfully...");
                return;
            }
        }
        System.out.println("Stock Id " + stockId + " Cant find from the inventory...Please Retry...");
        return;

    }

    @Override
    public void editStock(int stockId) {
        String RED = "\033[0;31m";     // RED
        String def = "\u001B[0m";  //default color
        String stockCategory;
        String nameOfItems;
        int quantityOfItems;
        int stockPurchase;
        int stockSales;
        int stockEntries;
        int stockPayments;
        int stockSalesPayments;
        String customerName;
        String customerAddress;
        String supplierName;
        String supplierAddress;

        Scanner scanner = new Scanner(System.in);
        for (Stocks stocks : inventoryArray) {
            if (stocks.getStockId() == stockId) {
                System.out.println("\n***************************Edit Stock Details  *****************************\n");

                System.out.println("If you want to edit below fields\n  *** Press Y to edit the field\n  *** Press S to skip without edit\n");
                System.out.println(RED+"Stock Category : " + stocks.getStockCategory() + def);
                System.out.print("Select your option here(Y/S) -> ");
                String option = scanner.next();
                if (option.equalsIgnoreCase("y")) {
                    System.out.print("Enter new category field -> ");
                    stockCategory = scanner.next();
                    stocks.setStockCategory(stockCategory);
                    System.out.println("Category updated successfully.");
                }
                option = "s";
                if (option.equalsIgnoreCase("s")) {
                    System.out.println(RED+"\nName of items : " + stocks.getNameOfItems()+def);
                    System.out.print("Select your option here(Y/S) -> ");
                    option = scanner.next();
                    if (option.equalsIgnoreCase("y")) {
                        System.out.print("Enter new Name for Item -> ");
                        nameOfItems = scanner.next();
                        stocks.setNameOfItems(nameOfItems);
                        System.out.println("Store items updated successfully.");
                    }
                    option = "s";
                    if (option.equalsIgnoreCase("s")) {
                        System.out.println(RED+"\nQuantity Of Items : " + stocks.getQuantityOfItems()+def);
                        System.out.print("Select your option here(Y/S) -> ");
                        option = scanner.next();
                        if (option.equalsIgnoreCase("y")) {
                            System.out.print("Enter new quantity of items -> ");
                            quantityOfItems = scanner.nextInt();
                            stocks.setQuantityOfItems(quantityOfItems);
                            System.out.println("Store item quantity updated successfully.");
                        }
                        option = "s";
                        if (option.equalsIgnoreCase("s")) {
                            System.out.println(RED+"\nStock Purchase : " + stocks.getStockPurchase()+def);
                            System.out.print("Select your option here(Y/S) -> ");
                            option = scanner.next();
                            if (option.equalsIgnoreCase("y")) {
                                System.out.print("Enter new stocks purchase -> ");
                                stockPurchase = scanner.nextInt();
                                stocks.setStockPurchase(stockPurchase);
                                System.out.println("Stock purchase updated successfully.");
                            }
                            option = "s";
                            if (option.equalsIgnoreCase("s")) {
                                System.out.println(RED+"\nStock Sales : " + stocks.getStockSales()+def);
                                System.out.print("Select your option here(Y/S) -> ");
                                option = scanner.next();
                                if (option.equalsIgnoreCase("y")) {
                                    System.out.print("Enter new stocks Sales -> ");
                                    stockSales = scanner.nextInt();
                                    stocks.setStockSales(stockSales);
                                    System.out.println("Stock Sales updated successfully.");
                                }
                                option = "s";
                                if (option.equalsIgnoreCase("s")) {
                                    System.out.println(RED+"\nStock Entries : " + stocks.getStockEntries()+def);
                                    System.out.print("Select your option here(Y/S) -> ");
                                    option = scanner.next();
                                    if (option.equalsIgnoreCase("y")) {
                                        System.out.print("Enter new stocks Entries -> ");
                                        stockEntries = scanner.nextInt();
                                        stocks.setStockEntries(stockEntries);
                                        System.out.println("Stock entries updated successfully.");
                                    }
                                    option = "s";
                                    if (option.equalsIgnoreCase("s")) {
                                        System.out.println(RED+"\nStock Entries Payments : " + stocks.getStockEntriesPayments()+def);
                                        System.out.print("Select your option here(Y/S) -> ");
                                        option = scanner.next();
                                        if (option.equalsIgnoreCase("y")) {
                                            System.out.print("Enter new stocks entries payments -> ");
                                            stockPayments = scanner.nextInt();
                                            stocks.setStockEntriesPayments(stockPayments);
                                            System.out.println("Stock entries payments updated successfully.");
                                        }
                                        option = "s";
                                        if (option.equalsIgnoreCase("s")) {
                                            System.out.println(RED+"\nStock Sales Payments : " + stocks.getStockSalesPayments()+def);
                                            System.out.print("Select your option here(Y/S) -> ");
                                            option = scanner.next();
                                            if (option.equalsIgnoreCase("y")) {
                                                System.out.print("Enter new stocks Sales payments -> ");
                                                stockSalesPayments = scanner.nextInt();
                                                stocks.setStockSalesPayments(stockSalesPayments);
                                                System.out.println("Stock Sales payments updated successfully.");
                                            }
                                            option = "s";
                                            if (option.equalsIgnoreCase("s")) {
                                                System.out.println(RED+"\nCustomer Name : " + stocks.getCustomerName()+def);
                                                System.out.print("Select your option here(Y/S) -> ");
                                                option = scanner.next();
                                                if (option.equalsIgnoreCase("y")) {
                                                    System.out.print("Enter new Customer Name -> ");
                                                    customerName = scanner.next();
                                                    stocks.setCustomerName(customerName);
                                                    System.out.println("Customer Name updated successfully.");
                                                }
                                                option = "s";
                                                if (option.equalsIgnoreCase("s")) {
                                                    System.out.println(RED+"\nCustomer Address : " + stocks.getCustomerAddress()+def);
                                                    System.out.print("Select your option here(Y/S) -> ");
                                                    option = scanner.next();
                                                    if (option.equalsIgnoreCase("y")) {
                                                        System.out.print("Enter new Customer Address -> ");
                                                        customerAddress = scanner.next();
                                                        stocks.setCustomerAddress(customerAddress);
                                                        System.out.println("Customer Address updated successfully.");
                                                    }
                                                    option = "s";
                                                    if (option.equalsIgnoreCase("s")) {
                                                        System.out.println(RED+"\nSupplier Name : " + stocks.getSupplierName()+def);
                                                        System.out.print("Select your option here(Y/S) -> ");
                                                        option = scanner.next();
                                                        if (option.equalsIgnoreCase("y")) {
                                                            System.out.print("Enter new Supplier Name -> ");
                                                            supplierName = scanner.next();
                                                            stocks.setSupplierName(supplierName);
                                                            System.out.println("Customer Name Supplier successfully.");
                                                        }
                                                        option = "s";
                                                        if (option.equalsIgnoreCase("s")) {
                                                            System.out.println(RED+"\nSupplier Address : " + stocks.getSupplierAddress()+def);
                                                            System.out.print("Select your option here(Y/S) -> ");
                                                            option = scanner.next();
                                                            if (option.equalsIgnoreCase("y")) {
                                                                System.out.print("Enter new Supplier Address -> ");
                                                                supplierAddress = scanner.next();
                                                                stocks.setSupplierAddress(supplierAddress);
                                                                System.out.println("Supplier Address updated successfully.");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }else {
                System.out.println("Stock Id " + stockId + " Cant find from the inventory...Please Retry...");
                return;
            }
        }
        System.out.println("\n*****************************************************************************");
        System.out.println("****************    Edited fields Successfully updated    *******************");
        System.out.println("*****************************************************************************\n" );
    }
}
