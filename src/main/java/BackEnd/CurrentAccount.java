package BackEnd;

import java.io.Serializable;
import java.util.ArrayList;

public class CurrentAccount extends BankAccount implements Serializable {



    public CurrentAccount(String Name, String Email, String Password, String Income, String Address, int ID) {
        super(Name, Email, Password, Income, Address, ID);
    }

    public CurrentAccount() {

    }

    @Override
    protected boolean checkExist(String Email) {
        for(BankAccount bankAccount:accounts)
            if(bankAccount instanceof  CurrentAccount)
                if(Email.equals(bankAccount.customer.Email))
                     return true;
        return false;
    }


    @Override
    protected int addAcc(String Name, String Email, String Password, String Income, String Address) {
          IdGenerator obj=new IdGenerator();
          int ACC=obj.ID();
            BankAccount current=new CurrentAccount(Name,Email,Password,Income,Address,ACC);
            accounts.add(current);
            return ACC;
    }

    @Override
    public boolean login(int Id, String Password) {

        for(BankAccount account:accounts)
            if(account instanceof CurrentAccount)
                if(account.Id==Id && account.customer.Password.equals(Password))
                  return true;
        return false;
    }

    @Override
    protected boolean close(int acc) {
        for(BankAccount account:accounts)
        {
            if(account instanceof CurrentAccount)
            {
                if(account.Id==acc)
                {
                    accounts.remove(account);
                    return true;
                }
            }
        }
        return  false;
    }



    public ArrayList<BankAccount> getAllAccounts()
    {
        return accounts;
    }


}
