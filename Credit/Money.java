public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount) { //Function to add money
        long totalCents = (this.dollars * 100 + this.cents) + (otherAmount.dollars * 100 + otherAmount.cents);
        return new Money(totalCents / 100.0);
    }

    public Money subtract(Money otherAmount) { //The function for subtracting
        long totalCents = (this.dollars * 100 + this.cents) - (otherAmount.dollars * 100 + otherAmount.cents);
        return new Money(totalCents / 100.0);
    }

    public int compareTo(Money otherObject) { //The part that compares the totals
        long thisTotalCents = this.dollars * 100 + this.cents;
        long otherTotalCents = otherObject.dollars * 100 + otherObject.cents;
        return Long.compare(thisTotalCents, otherTotalCents);
    }

    public boolean equals(Money otherObject) { //Here is the equals boolean
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString() {
        return String.format("$%d.%02d", dollars, cents); //The format for the money's display, leading zero uncluded
    }
}


