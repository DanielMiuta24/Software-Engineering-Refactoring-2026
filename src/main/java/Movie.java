public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    double getCharge(int daysRented) {
        double charge = 0;

        switch (priceCode) {
            case REGULAR:
                charge = 2;
                if (daysRented > 2) {
                    charge += (daysRented - 2) * 1.5;
                }
                break;

            case NEW_RELEASE:
                charge = daysRented * 3;
                break;

            case CHILDRENS:
                charge = 1.5;
                if (daysRented > 3) {
                    charge += (daysRented - 3) * 1.5;
                }
                break;
        }

        return charge;
    }

    int getFrequentRenterPoints(int daysRented) {
        if (priceCode == NEW_RELEASE && daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
