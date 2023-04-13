package BackEnd;

import java.io.Serializable;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BankAccount implements Serializable {

    public void setBalance(int balance) {
        Balance = balance;
    }

    protected int Balance;
    public   int Id;

    protected ArrayList<String> Transaction;

    public ArrayList<String> getLoan() {
        return Loan;
    }

    protected ArrayList<String> Loan;

    public BankAccount() {

    }


    public int getBalance() {
        return Balance;
    }

    public ArrayList<String> getTransaction() {
        return Transaction;
    }

    public Customer customer;
    protected static ArrayList<BankAccount> accounts = new ArrayList<>();

    public BankAccount(String Name, String Email, String Password, String Income, String Address, int ID) {
        Balance = 5000;
        customer=new Customer(Name, Email,Password,Income,Address);
        Id=ID;
        Transaction=new ArrayList<>();
        Loan=new ArrayList<>();
    }

    protected abstract boolean checkExist(String Email);
    protected abstract int addAcc(String Name, String Email, String Password, String Income, String Address);


    protected abstract boolean login(int Id, String Password);

    protected abstract boolean close(int acc);

    public boolean transfer(int Sender, int Receiver, int amount) {
        BankAccount sender = null;
        BankAccount receiver = null;

        for(BankAccount account: accounts)
        {
            if(account.Id==Sender)
                sender=account;
            else if(account.Id==Receiver)
                receiver=account;
        }

        if(sender.getBalance()>=amount)
        {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            sender.setBalance(sender.Balance-amount);
            receiver.setBalance((receiver.Balance)+amount);
            String Transaction="Amount: "+ amount+" transferred to Account:  "+receiver.Id+ "on : "+formatter.format(date);
            String Transaction2="Amount: "+ amount+" received from Account:  "+sender.Id+ "on : "+formatter.format(date);
            sender.getTransaction().add(Transaction);
            receiver.getTransaction().add(Transaction2);
            return true;
        }
        return false;
    }

    public void addLoan(int Id, int Amount)
    {
        for(BankAccount bankAccount: accounts)
        {
            if(bankAccount.Id==Id)
            {
                bankAccount.getLoan().add(Integer.toString(Amount));
                break;
            }
        }
    }

    public void acceptedLoan(int Id, int Amount)
    {
        for(BankAccount bankAccount: accounts)
        {
            if(bankAccount.Id==Id)
            {
                bankAccount.getLoan().clear();
                bankAccount.Transaction.add("Loan of Rs"+ Amount +"Accepted Successfully");
                bankAccount.setBalance(bankAccount.getBalance()+Amount);
                break;
            }
        }
    }












}
