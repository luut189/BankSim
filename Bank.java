public class Bank {
  private String name;
  public int age;
  private int balance;
  public int checking;
  private double growthRate;
  private int gain;
  public int income;
  public int yearOfInvest;

  public void TFSA(String inputName, int inputAge, int inputChecking,int inputBalance, double inputGrowth, int yearOfInvest) {
    name = inputName;
    age = inputAge;
    balance = inputBalance;
    checking = inputChecking;
    growthRate = inputGrowth;
    this.yearOfInvest = yearOfInvest;
  }

  public int addBalance(int addedBalance) {
    checking -= addedBalance;
    return balance += addedBalance;
  }

  public double getReturn() {
    gain += (balance * growthRate);
    return balance += (balance * growthRate);
  }

  public int yearlyIncome(int intputIncome) {
    income = intputIncome;
    return checking += income;
  }

  public int aging() {
    return age++;
  }
  
  public void getInfo() {
    System.out.println("\n\nCustomer Name: " + name + " (" + age + ")");
    System.out.println("Balance: " + "$" + checking);
    System.out.println("TFSA: " + "$" + balance + " ($" + gain + ")");
  }
}