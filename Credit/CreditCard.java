public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);  
        this.balance = new Money(0.0);  // The initial balance starts at 0
    }

    public Money getBalance() {
        return new Money(this.balance);  // Return the balance
    }

    public Money getCreditLimit() {
        return new Money(this.creditLimit);  // Return the credit limit
    }

    public String getPersonals() {
        return owner.toString();  // This one prints the owner's personal information
    }

    public void charge(Money amount) {
        Money newBalance = this.balance.add(amount);
        if (newBalance.compareTo(this.creditLimit) > 0) {
            System.out.println("Exceeds credit limit"); //The error message
        } else {
            this.balance = newBalance;  // Update the balance
            System.out.println("Charge: " + amount);
        }
    }

    public void payment(Money amount) {
        this.balance = this.balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}



