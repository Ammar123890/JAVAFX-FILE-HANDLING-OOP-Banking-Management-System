/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

/**
 *
 * @author syeda
 */
public class Banker extends User {


    public Banker(String email, String password) {
        super(email, password);
    }

    public Banker() {
        super();
    }

    public String getEmail() {
        return "banker";
    }

    public String getPassword() {
        return "banker1234";
    }
    

    public boolean Login(String User, String Pass)
    {
        return User.equals("banker") && Pass.equals("banker1234");
    }


    public boolean closeAccount(int Id)
    {
        SavingAccount account=new SavingAccount();
        if(account.close(Id))
        {
            return true;
        }
        CurrentAccount account1=new CurrentAccount();
        return account1.close(Id);

    }


}
