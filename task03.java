import java.util.Scanner;

public class task03{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int balance=10000, deposit, withdraw;
        while(true){
            System.out.println("Choose 1 for deposit");
            System.out.println("Choose 2 for withdraw");
            System.out.println("Choose 3 for balance inquiry");
            System.out.println("Choose 4 for Exit");
            System.out.println();
            System.out.println("Choose correct operation to perform: ");

            int choice=sc.nextInt();

            switch(choice){
                case 1:
                System.out.println("Enter amount you want to deposit: ");
                deposit=sc.nextInt();
                balance=balance+deposit;
                System.out.println("Your updated balance is: "+balance);
                System.out.println();
                break;

                case 2:
                System.out.println("Enter amount to withdraw: ");
                withdraw=sc.nextInt();
                withdraw=balance-withdraw;
                if(withdraw>=balance){
                    System.out.println("insufficient withdraw: ");
                }
                else{
                System.out.println("Your updated balance is: "+withdraw);
                }
                break;

                case 3:
                System.out.println("your balace is: "+balance);
                System.out.println();
                break;

                case 4:
                System.exit(0);
           

        }


    }
}
}