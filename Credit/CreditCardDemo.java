public class CreditCardDemo {
    public static void main(String[] args) {
        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);
        Person owner = new Person("Christie", "Diane", //Here and the next line have the names for this person
            new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));
        CreditCard visa = new CreditCard(owner, LIMIT);
        System.out.println(visa.getPersonals()); //This gets the personal information
        System.out.println("Balance: " + visa.getBalance()); //This gets the balance of a whopping 0.00
        System.out.println("Credit Limit : " + visa.getCreditLimit()); //Which is 1000 dollars
        System.out.println();
        
        System.out.println("Attempt to charge " + FIRST_AMOUNT); //This is the charge to add 200
        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());
        
        System.out.println("Attempt to charge " + SECOND_AMOUNT); //This is the 10.02 charge, at this point it's 210.02 in total
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());
        
        System.out.println("Attempt to pay " + THIRD_AMOUNT); //This is where 25.00 is paid off from the credit limit
        visa.payment(THIRD_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());
        
        System.out.println("Attempt to charge " + FOURTH_AMOUNT); //This one is the one that doesn't work, hence the exceeds credit limit message
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());
    }
}



