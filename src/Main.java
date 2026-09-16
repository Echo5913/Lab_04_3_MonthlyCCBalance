//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double balance = 5000.00;
    double interestRate = 0.17;

    double oneMonthInterest = balance * interestRate;
    double balanceAfterOneMonth = balance + oneMonthInterest;

    double twoMonthInterest = balanceAfterOneMonth * interestRate;
    double balanceAfterTwoMonths = balanceAfterOneMonth + twoMonthInterest;

    System.out.println("Starting balance: $" + balance);
    System.out.println("Interest after one month: $" + oneMonthInterest);
    System.out.println("Balance after one month: $" + balanceAfterOneMonth);
    System.out.println("Interest after two months: $" + twoMonthInterest);
    System.out.println("Balance after two months: $" + balanceAfterTwoMonths);
}
