package BackEnd;

public class IdGenerator {
    private static int Id;

    public void setup()
    {
        SavingAccount bank=new SavingAccount();
        Id=bank.getAllAccounts().size();
    }

    public int ID()
    {
        setup();      Id=Id+1;
        return Id;
    }
}
