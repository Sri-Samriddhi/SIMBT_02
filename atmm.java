// java program for atm interface   
import java.util.Scanner;  
//create ATMExample class to implement the ATM functionality  
public class atmm  
{  
        public static void main(String args[] )  
        {  
            //declare and initialize balance, withdraw, and deposit  
            int balance = 100000, withdraw, deposit,transfer;
            long accno;  
              
            //create scanner class object to get choice of user  
            Scanner sc = new Scanner(System.in);  
            
            System.out.println("Welcome to ---* PUNJAB NATIONAL BANK*---"); 
            System.out.println( );
            System.out.println("Enter the PIN to continue-- ");
            int PIN=sc.nextInt();
            
            while(true)  
            {  
                System.out.println("Welcome User to Automated Teller Machine");  
                System.out.println("Choose 1 for Withdraw");  
                System.out.println("Choose 2 for Deposit");  
                System.out.println("Choose 3 for Check Balance"); 
                System.out.println("Choose 4 for Transfer Money"); 
                System.out.println("Choose 5 for EXIT");  
                System.out.print("Choose the operation you want to perform:");  
                  
                //get choice from user  
                int choice = sc.nextInt();  
                switch(choice)  
                {  
                    case 1:  
                    System.out.print("Enter money to be withdrawn:");  
                          
                    //get the withdrawl money from user  
                    withdraw = sc.nextInt();  
                          
                    //check whether the balance is greater than or equal to the withdrawal amount  
                    if(balance >= withdraw)  
                    {  
                        //remove the withdrawl amount from the total balance  
                        balance = balance - withdraw;  
                        System.out.println("Please collect your money");  
                    }  
                    else  
                    {  
                       //show custom error message   
                       System.out.println("Insufficient Balance");  
                    }  
                    System.out.println("");  
                    break;  
       
                    case 2: 
                    System.out.print("Enter money to be deposited:");  
                          
                    //get deposite amount from te user  
                    deposit = sc.nextInt();  
                           
                    //add the deposit amount to the total balanace  
                    balance = balance + deposit;  
                    System.out.println("Your Money has been successfully depsited");  
                    System.out.println("");  
                    break;  
       
                    case 3:  
                    //displaying the total balance of the user  
                    System.out.println("Balance : "+balance);  
                    System.out.println("");  
                    break;  
                    
                    case 4:
                    //to transfer the money
                    System.out.println("Enter the amount to be trannsfer");
                    transfer= sc.nextInt();

                    System.out.println("Enter the account number of another customer for transfer");
                    accno= sc.nextLong();
                    if(balance >= transfer)  
                    {  
                        //remove the trasfer amount from the total balance  
                        balance = balance - transfer;  
                        System.out.println("Money transfered successfully !!");  
                    }  
                    else  
                    {  
                       //show custom error message   
                       System.out.println("Insufficient Balance");  
                    }  
                    System.out.println("");  
                    break; 
                    
                    
                    case 5: 
                    //exit from the menu  
                    System.exit(0);  
                }  
            }  
        }  
    }      

