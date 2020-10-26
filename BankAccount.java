public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int a, String b){
    accountID = a;
    password = b;
    balance = 0;
  }
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }
}
