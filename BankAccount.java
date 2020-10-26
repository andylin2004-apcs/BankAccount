public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public void credentials(int a, String b){
    accountID = a;
    password = b;
    balance = 0;
  }
}
