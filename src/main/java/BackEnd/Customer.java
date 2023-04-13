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
public class Customer extends User {


    private String Income;
    private String Address;

    private  String name;

    //private ArrayList<BankAccount> accounts;
    public Customer(String name, String email, String password,String income,String address) {

        super(email, password);
        this.Income = income;
        this.Address = address;
        this.name=name;
      //  accounts=new ArrayList<>();

    }

    public String getIncome() {
        return Income;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }



    public Customer() {

    }


}
