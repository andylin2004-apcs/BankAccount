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
  public void setPassword(String newPass){
    password = newPass;
  }
  public boolean deposit(double amount){
    if (amount >= 0){
      balance += amount;
      return true;
    }
    return false;
  }
  public boolean withdraw(double amount){
    if (balance < amount || balance < 0){
      return false;
    }
    balance -= amount;
    return true;
  }
}
