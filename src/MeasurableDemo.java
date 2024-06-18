import java.util.Arrays;

public class MeasurableDemo {
    public static void main(String[] args) {
//        Measurable[] accounts = new Measurable[3];
//        accounts[0] = new BankAccount(0);
//        accounts[1] = new BankAccount(10000);
//        accounts[2] = new BankAccount(2000);

       // System.out.println("Average balance: " + average(accounts));

        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(0);
        accounts[1] = new BankAccount(10000);
        accounts[2] = new BankAccount(2000);
        Arrays.sort(accounts);

    }

    public static double average (Measurable[] objs){
        if(objs.length == 0){return 0;}
        double sum = 0;
        for(Measurable obj : objs){
            sum = sum + obj.getMeasure();
        }
        return sum / objs.length;
    }
}
