/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package FrontEnd;

import BackEnd.BankAccount;
import BackEnd.SavingAccount;

import javax.swing.*;
import java.io.*;

/**
 *
 * @author syeda
 */
public class Bank {
    public static void write()
    {
        try
        {
            SavingAccount account=new SavingAccount();
            FileOutputStream file=new FileOutputStream("Account.txt");
            ObjectOutputStream outFile=new ObjectOutputStream(file);
            for(int i=0;i< account.getAllAccounts().size();i++)
            {
                outFile.writeObject( account.getAllAccounts().get(i));
            }
            //JOptionPane.showMessageDialog(null, "Congratulation, saved successfully");
            outFile.close();


        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    public static void read()
    {

        try
        {
            FileInputStream file=new FileInputStream("Account.txt");
            ObjectInputStream  InputFile= new ObjectInputStream(file);
            boolean end=false;
            while(!end)
            {

                try
                {

                    //   System.out.println((Customer)InputFile.readObject());
                    SavingAccount account=new SavingAccount();
                    account.getAllAccounts().add ((BankAccount) InputFile.readObject());

                }
                catch(EOFException e)
                {
                    end=true;
                }
                catch(Exception f)
                {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            InputFile.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void writeCustomer()
    {
        try
        {
            SavingAccount account=new SavingAccount();
            FileOutputStream file=new FileOutputStream("Customer.txt");
            ObjectOutputStream outFile=new ObjectOutputStream(file);
            for(int i=0;i< account.getAllAccounts().size();i++)
            {
                outFile.writeObject( account.getAllAccounts().get(i).customer);
            }
            //JOptionPane.showMessageDialog(null, "Congratulation, saved successfully");
            outFile.close();


        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    public static void main(String[] args) {

        read();
        new HomePage().setVisible(true);
    }
}
