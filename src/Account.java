import static Account.balance;
import java.util.Scanner;
abstract class Account {
    protected int account_number;
    protected String customer_name;
    protected static float balance=500;
    Scanner sc=new Scanner(System.in);
    
    float deposit() {
        System.out.println("Enter your amount : RM ");
        float deposit=sc.nextFloat();
        balance=balance+deposit;
        System.out.println("Successful, Your new balance is : RM "+balance);
        return balance;
    }
    float withdrawal () {
        System.out.println("Enter your amount : RM ");
        float wd=sc.nextFloat();
        balance=balance-wd;
        System.out.println("Successful, Your new balance is : RM "+balance);
        return balance;
    }
    void checkBalance() {
        System.out.println("Your account Balance : RM "+balance);
    }
    abstract void calculateInterest();
}
class Saving_Account extends Account {
    Saving_Account() {
        super();
    }
    void calculateInterest(){
        float interests = ((3*balance)/100);
        System.out.println("Saving Account Interest is : "+interests);
    }
}
class Current_Account extends Account {
    Current_Account() {
        super();
    }
    void calculateInterest() {
        float interest = ((2*balance)/100);
        System.out.println("Current Account Interest is :"+interest);
    }
}class CreditCard_Account extends Account {
    CreditCard_Account() {
        super();
    }
    void calculateInterest(){
        float interests = ((8*balance)/100);
        System.out.println("Saving Account Interest is : "+interests);
    }
}

class TestAccount {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Account obj1=new Saving_Account();
        System.out.println("Enter Your Account Number : ");
        obj1.account_number=sc1.nextInt();
        sc1.nextLine();
        System.out.println("Enter Customer Name : ");
        obj1.customer_name=sc1.nextLine();
        System.out.println("Your Account Balance is : RM"+obj1.balance);
        
        for(int i=1;i<=10;i++){
            operation obj2=new operation();
            obj2.input();
        }
    }
}
class operation {
    Scanner sc1=new Scanner(System.in);
    Saving_Account op = new Saving_Account();
    Current_Account op1=new Current_Account();
    CreditCard_Account op2=new CreditCard_Account();
    operation() {
        System.out.println("\n Select Account Type : ");
        System.out.println("--------------------------");
        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");
        System.out.println("--------------------------");
        System.out.println("\n Enter Your Account Type : ");
        int input = sc1.nextInt();
        
        if(input==1 ){
            System.out.println("\nYour Selection is : Saving Account");
        }
        else if (input==2){
            System.out.println("\nYour Selection is : Curret Account");
        }
        else {
            System.exit(0);
        }
    }
    void input () {
        System.out.println("\nSelect the operation : ");
        System.out.println(" ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Check Balance");
        System.out.println("4. Check Interest");
        System.out.println("5. Exit");
        System.out.println("\nOption is : ");
        int input = sc1.nextInt();
        
        if(input==1){
            op.deposit();
        }
        else if (input==2){
            op.withdrawal();
        }
        else if (input==3){
            op.checkBalance();
        }else if (input==4){
            op.calculateInterest();
        }
        else if (input==4){
            op1.calculateInterest();
        }else if (input==5){
            System.exit(0);
        }
    }
}
