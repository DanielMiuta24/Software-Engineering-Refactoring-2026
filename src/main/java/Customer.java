import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        for (Rental rental : rentals) {
            result += "\t" + rental.getMovie().getTitle() + "\t" + "\t" +
                      rental.getDaysRented() + "\t" + rental.getCharge() + "\n";
        }

        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    private double getTotalCharge() {
        double total = 0;
        for (Rental rental : rentals) {
            total += rental.getCharge();
        }
        return total;
    }

    private int getTotalFrequentRenterPoints() {
        int total = 0;
        for (Rental rental : rentals) {
            total += rental.getFrequentRenterPoints();
        }
        return total;
    }
}
