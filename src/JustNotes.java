public class JustNotes {
    /*
    Assuming SavingsAccount is a subclass of BankAccount, which of the following code fragments are valid in Java?
    a. BankAccount account = new SavingsAccount(); -> correct
    b. SavingsAccount account2 = new BankAccount(); -> won't work
    c. BankAccount account = null; -> correct
    d. SavingsAccount account2 = account; -> won't work
     */

    /*
    compare to !!
    called on object a, is passed b, and return values include:
    Negative: a comes before b
    Positive: a comes after b
    0: a is the same as b
     */


    //pass by reference examples
    //up on board
    /*
    BankAccount acc = new BankAccount(100,100);
    BankAccount acc1 = acc;
    acc1.getBalance() - > 1000;
    m1(acc);
    acc.getBalance  - > 1000;


    BankAccount a = acc;
    BankAccount acc2 = new BankAccount(100,200);
    a = acc2;
    a.getBalance() - > 200;

    m1(BankAccount a){
        BankAccount acc2 = new BankAccount (100,200);
        a = acc2;
    }


     */
}
