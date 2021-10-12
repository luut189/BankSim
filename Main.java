class Main {
  public static void main(String[] args) {
    Bank TD = new Bank();
    TD.TFSA("Tuong Luu", 18, 0, 0, 0.08, 10);

    for(int i = 1; i <= TD.yearOfInvest; i++) {
      TD.yearlyIncome(60000);
      TD.addBalance(6000);
      TD.getReturn();
      TD.aging();
      TD.getInfo();
    }
  }
}