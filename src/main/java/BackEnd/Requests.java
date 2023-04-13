/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.util.ArrayList;

/**
 *
 * @author syeda
 */
public class Requests {
    
    private String Name;
    private String Password;
    private String Email;
    private String Income;
    private String Address;
    private String Type;

    public Requests(String Name,  String Email,String Password, String Income, String Address, String Type) {
        this.Name = Name;
        this.Password = Password;
        this.Email = Email;
        this.Income = Income;
        this.Address = Address;
        this.Type = Type;
    }

    public static   ArrayList<Requests> requests=new ArrayList<Requests>();

    public ArrayList<Requests> getRequests() {
        return requests;
    }

    public Requests() {

    }

    public String getEmail() {
        return Email;
    }

    public String getIncome() {
        return Income;
    }

    public String getType() {
        return Type;
    }

    public boolean addRequest(Requests req)
    {

        if(requests.size()==0)
        {
            requests.add(req);
            return true;
        }
        for(Requests requests1:requests){
             if(req.Email.equals(requests1.Email) && req.Type.equals(requests1.Type))
                 return false;
             else {
                 requests.add(req);

                 break;
             }

        }
        return true;
    }

    public int AcceptRequest(String Email, String Type)
    {
        for(Requests requests: Requests.requests)
        {
            if(requests.getEmail().equals(Email)&& requests.getType().equals(Type))
            {

                if(Type.equals("Saving"))
                {
                        SavingAccount obj= new SavingAccount();
                        if(obj.checkExist(Email))
                        {Requests.requests.remove(requests); return -1;}
                        else
                        {
                            int id=obj.addAcc(requests.Name,requests.Email,requests.Password,requests.Income,requests.Address);
                            Requests.requests.remove(requests);
                            return  id;
                        }
                }
                else
                {
                    CurrentAccount obj= new CurrentAccount();
                    if(obj.checkExist(Email))
                    { Requests.requests.remove(requests); return -1;}
                    else
                    {
                        int id=obj.addAcc(requests.Name,requests.Email,requests.Password,requests.Income,requests.Address);
                        Requests.requests.remove(requests);
                        return id;
                    }
                }
            }
        }
        return 0;
    }
    public void DelRequest(String Email)
    {
            for(Requests requests1: requests)
            {
                if(requests1.getEmail().equals(Email))
                {
                   requests.remove(requests1);
                   return;
                }
            }
    }
    
    
}
