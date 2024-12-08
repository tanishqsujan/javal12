import java.util.*;

public class bnkappl{
    public static void main(String[] args){
        boolean infiniteloop= true;
        double[] accountBalance= new double[1000];
        String[] accountName= new String[1000];
        int option;
        int size=100;
        while(infiniteloop){
            System.out.println("Welcome to Coding Banking Services");
            System.out.println("Banking Menu: ");
            System.out.println("Select any one option from below: ");
            System.out.println("1-> Add Customer: ");
            System.out.println("2-> Change Customer Name: ");
            System.out.println("3-> Check Account Balance: ");
            System.out.println("4-> Update Account Balance: ");
            System.out.println("5-> Summary of all Accounts: ");
            System.out.println("6-> Quit");

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter option to proceed ahead: ");
            option= sc.nextInt();
            if(option==1){
                System.out.println("Add Customer: ");
                sc.nextLine();
                System.out.println("\nEnter Customer Name: ");
                String name= sc.nextLine();
                accountName[size]= name;
                System.out.println("Enter Opening Balance Account: ");
                accountBalance[size]= sc.nextDouble();
                System.out.println("Account created Successfully. \n");
                System.out.println("Account details. \n");
                System.out.println("Accouunt number: " +(size));
                System.out.println("Account name: " +accountName[size]);
                System.out.println("Account Balance: " +accountBalance[size]+ "Rs \n");
                System.out.println("------------------");
                size= size+1;
            }
            else if(option==2){
                System.out.println("\nChange Customer Name Menu: ");
                System.out.println("\nEnter Account Number: ");
                int accountIndex;
                String temp;

                accountIndex= sc.nextInt();
                sc.nextLine();
                if(accountIndex>size){
                    System.out.println("Account does not exist");
                    System.out.println("Terminating...");
                }
                else{
                    temp= accountName[accountIndex];
                    System.out.println("Enter the new name");
                    String name= sc.nextLine();
                    accountName[accountIndex]= name;
                    System.out.println("Nmae is successfully updated from" +temp+ "to" +name+ ".\n");
                }
                System.out.println("-------------");
            }
            else if(option==3){
                System.out.println("\nCheck Account Balance Menu" );
                System.out.println("Enter Account Number: ");
                int accountIndex;
                accountIndex= sc.nextInt();
                if(accountIndex> size){
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                }
                else{
                    System.out.println(accountName[accountIndex]+ "your balance is" +accountBalance[accountIndex]+ "Rs.")
                }
                System.out.println("---------------");
            }
            else if(option==4){
                System.out.println("\nUpdate Account Balance Menu");
                System.out.println("\nEnter Account Number: ");

                int accountIndex;
                accountIndex= sc.nextInt();
                if(accountIndex>size){
                    System.out.println("Account does not exist");
                    System.out.println("Terminating.....");
                }
                else{
                    System.out.println("\nEnter Amount to be deposited.");
                    double amt= sc.nextDouble();
                    accountBalance[accountIndex] +=amt;
                    
                }
            }
        }
    }
}
