import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private final static Inventory INVENTORY = new Inventory();
    static boolean option;
    static RegisteredUsers registeredUsers = new RegisteredUsers();

    public static void main(String[] args) {



        while (true) {
            signUp();
            Scanner sc = new Scanner(System.in);
             if (option) {
                if (registeredUsers.getLoginDetails() == null) {
                    System.out.println("No users");
                } else {
                    boolean success = false;

                    System.out.print("\nPlease Enter registered user name -> ");
                    String userName = sc.next();
                    if (registeredUsers.getLoginDetails().containsKey(userName)) {
                        System.out.print("Please Enter registered user password -> ");
                        String userPassword = sc.next();
                        if (registeredUsers.getLoginDetails().containsValue(userPassword)) {
                            System.out.println("\n*****************************************************************************");
                            System.out.println("********************       Log in successfully       ************************");
                            System.out.println("*****************************************************************************" );
                            success = true;
                        } else {
                            System.out.println("\n********************** Incorrect password...Try again  ***********************");
                            System.out.println("");
                        }
                    } else {
                        System.out.println("User cannot find from the store...please enter registered user name...");
                    }
                    if (success) {
                        while (true) {
                            System.out.println();
                            System.out.println("1 - Enter Stock");
                            System.out.println("2 - View Stock");
                            System.out.println("3 - Dispatch Stock");
                            System.out.println("4 - Edit Stock");
                            System.out.println("5 - Sign Out");
                            System.out.print("\nPlease select your option ->");
                            int option_2 = 0;
                            try {
                                option_2 = sc.nextInt();
                            }catch (InputMismatchException e){
                                System.out.println("\n***************** Please enter numeric value between 1 - 4  ******************");
                                break;
                            }
                            switch (option_2){
                                case 1:
                                    enterStocks();
                                    break;
                                case 2:
                                    viewStocks();
                                    break;
                                case 3:
                                    dispatchStock();
                                    break;
                                case 4:
                                    editStock();
                                    break;
                                case 5:
                                    System.out.print("Are you sure?(Press Y/N)");
                                    String signOut = sc.next();
                                    if (signOut.equalsIgnoreCase("y")){
                                        System.out.println("\n**************************** Sign out success  *****************************");
                                        signUp();
                                    }else if (signOut.equalsIgnoreCase("n")){
                                        continue;
                                    }
                                    break;
                                default:
                                    System.out.println("\n****************************** Invalid input  *******************************");
                                    System.out.println("");
                            }
                        }
                    }
                }
            }

        }
        
    }

    private static void signUp(){

        //change font color in console
        String cyan = "\033[0;96m";
        String def = "\u001B[0m";  //default color
        String green = "\033[1;92m";

        System.out.println(green + "\n*****************************************************************************" + green);
        System.out.println(green + "******************    ABX Store management System    ************************" + green);
        System.out.println(green + "*****************************************************************************" + def);

        Scanner sc = new Scanner(System.in);

        System.out.println(cyan + "\n1 - Register user to the system                 ***" + cyan);
        System.out.println("2 - Continue the programme with registered user ***" + cyan);
        System.out.println("3 - Exit from the store ***" + def);
        System.out.print("\nEnter your option here -> ");
        int option_1 = sc.nextInt();


        if (option_1 == 1) {
            System.out.println("\n*****************************************************************************");
            System.out.println("****************      Store ABX user registration      *********************");
            System.out.println("*****************************************************************************\n" );

            System.out.print("Please enter user name -> ");
            String newUserName = sc.next();
            System.out.print("Create new password for user -> ");
            String newUserPassword = sc.next();
            registeredUsers.setLoginDetails(newUserName,newUserPassword);
        }else if (option_1 == 2){
            option = true;
        }else if (option_1 == 3){
            System.out.println("\n*****************************************************************************");
            System.out.println("************************      See you again      *****************************");
            System.out.println("*****************************************************************************\n" );
            System.exit(0);
        }
        else {
            System.out.println("\n****************************** Invalid input  *******************************");
        }
    }

    private static void enterStocks() {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease enter stock Id : ");
        int stockId = scanner.nextInt();
        for (Stocks stocks : inventory.inventoryArray) {
            if (stocks.getStockId() == stockId) {
                System.out.println("\n*************************  Your entered Id already used  *************************");
                return;
            }
        }
        System.out.print("Please enter stock Category : ");
        String category = scanner.next();
        System.out.print("Please enter items name : ");
        String itemsName = scanner.next();
        try {
            System.out.print("Please enter quantity Of Items : ");
            int quantityOfItems = scanner.nextInt();
            System.out.print("Please enter stock purchase : ");
            int stockPurchase = scanner.nextInt();
            System.out.print("Please enter stock sales : ");
            int stockSales = scanner.nextInt();
            System.out.print("Please enter stock entries : ");
            int stockEntries = scanner.nextInt();
            System.out.print("Please enter stock entries payments : ");
            int stockEntriesPayments = scanner.nextInt();
            System.out.print("Please enter stock sales payments : ");
            int stockSalesPayments = scanner.nextInt();

            System.out.print("Please enter customer name : ");
            String customerName = scanner.next();
            System.out.print("Please enter customer address : ");
            String customerAddress = scanner.next();

            System.out.print("Please enter supplier name : ");
            String supplierName = scanner.next();
            System.out.print("Please enter supplier address : ");
            String supplierAddress = scanner.next();
            Stocks stocks = new Stocks(stockId,category,itemsName,quantityOfItems,stockPurchase,stockSales,stockEntries,stockEntriesPayments,
                    stockSalesPayments,customerName,customerAddress,supplierName,supplierAddress);
            INVENTORY.enterStocks(stocks);
        }catch (InputMismatchException e){
            System.out.println("\n***** Please enter numerical values *****\n");
        }



    }

    private static void viewStocks() {
        Inventory inventory = new Inventory();
        System.out.println("------------------------------");
        System.out.printf("%12s %16s", " | Stock IDs"," | Category");
        System.out.println();
        System.out.println("------------------------------");
        for(Stocks stocks : inventory.inventoryArray){
            System.out.format("\n%10s %14s",stocks.getStockId(),stocks.getStockCategory());
        }
        System.out.println("\n------------------------------\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your stock Id here -> ");
        int stockId = scanner.nextInt();
        INVENTORY.viewStocks(stockId);
    }

    private static void dispatchStock() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your stock Id if you want to delete -> ");
        int stockId = scanner.nextInt();
        INVENTORY.dispatchStock(stockId);
    }

    private static void editStock() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your stock Id if you want to Update -> ");
        int stockId = scanner.nextInt();
        INVENTORY.editStock(stockId);
    }
}
