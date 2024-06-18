public class BankAccount implements Comparable{
    double balance;
//    public double getMeasure(){
//        return balance;
//    }
    public BankAccount(double balance){
        this.balance = balance;
    }

    public int compareTo(Object otherObject)
    {
        BankAccount other = (BankAccount) otherObject;
        if (balance < other.balance) { return 1; }
        if (balance > other.balance) { return 1; }
        return 0;
    }
}
