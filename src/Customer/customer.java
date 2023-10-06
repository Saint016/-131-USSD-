package Customer;
import java.util.Scanner;

public class customer {

	public static void main(String[] args) {
		
			

			
			   
			        Scanner scanner = new Scanner(System.in);

			        System.out.print("Enter USSD code: ");
			        String ussdCode = scanner.nextLine();

			        if (ussdCode.equals("*131#")) {
			            displayMainOptions();
			        } else {
			            System.out.println("Invalid USSD code. Please try again.");
			        }

			        scanner.close();
			    }

			    private static void displayMainOptions() {
			        while (true) {
			          
			            System.out.println("1. check balance");
			            System.out.println("2. sms and unlimited calls");
			            System.out.println("3. Data Bundles");
			            System.out.println("4. customer self desk");
			            System.out.println("0. Exit");

			            System.out.print("Enter your choice: ");
			            Scanner scanner = new Scanner(System.in);
			            int choice = scanner.nextInt();

			            switch (choice) {
			                case 1:
			                    displayCheckBalanceOptions();
			                    break;
			                case 2:
			                    displaysmsandunlimitedcallsOptions();
			                    break;
			                case 3:
			                    displayDataBundleOptions();
			                    break;
			                case 4:
			                    System.out.println("please dial *200# for self customerhel or visit our nearest customer care...");
			                    break;
			                case 0:
			                    System.out.println("exiting main menu.");
			                    return;
			                default:
			                    System.out.println("Invalid choice. Please try again.");
			                    break;
			            }
			        }
			    }

			    private static void displayCheckBalanceOptions() {
			        while (true) {
			            System.out.println("Check Balance Options:");
			            System.out.println("1. Main balance");
			            System.out.println("2. Data balance");
			            System.out.println("3. SMS balance");
			            System.out.println("0. Go back to the main menu");

			            System.out.print("Enter your choice: ");
			            Scanner scanner = new Scanner(System.in);
			            int choice = scanner.nextInt();

			            switch (choice) {
			                case 1:
			                    System.out.println("Checking main balance...");
			                    break;
			                case 2:
			                    System.out.println("Checking data balance...");
			                    break;
			                case 3:
			                    System.out.println("Checking SMS balance...");
			                    break;
			                case 0:
			                    return;
			                default:
			                    System.out.println("Invalid choice. Please try again.");
			                    break;
			            }
			        }
			    }

			    private static void displaysmsandunlimitedcallsOptions() {
			        while (true) {
			            System.out.println("1.sms and calls:");
			            System.out.println("2. hot minutes");
			            System.out.println("3. mwitu sms");
			            System.out.println("0. Go back to the main menu");

			            System.out.print("Enter your choice: ");
			            Scanner scanner = new Scanner(System.in);
			            int choice = scanner.nextInt();

			            switch (choice) {
			                case 1:
			                    System.out.println("sms and calls...");
			                    break;
			                case 2:
			                	System.out.println("hot minutes...");
			                    break;
			                case 3:
			                	System.out.println("mwitu sms...");
			                case 0:
			                    return;
			                default:
			                    System.out.println("Invalid choice. Please try again.");
			                    break;
			            }
			        }
				}

			    private static void displayDataBundleOptions() {
			        while (true) {
			            System.out.println("Data Bundles Options:");
			            System.out.println("1. Buy daily data bundle");
			            System.out.println("2. Buy weekly data bundle");
			            System.out.println("3. Buy monthly data bundle");
			            System.out.println("0. Go back to the main menu");

			            System.out.print("Enter your choice: ");
			            Scanner scanner = new Scanner(System.in);
			            int choice = scanner.nextInt();

			            switch (choice) {
			                case 1:
			                    System.out.println("Buying daily data bundle...");
			                    break;
			                case 2:
			                    System.out.println("Buying weekly data bundle...");
			                    break;
			                case 3:
			                    System.out.println("Buying monthly data bundle...");
			                    break;
			                case 0:
			                    return;
			                default:
			                    System.out.println("Invalid choice. Please try again.");
			                    break;
			            }
			        }
			    }
			

	}


