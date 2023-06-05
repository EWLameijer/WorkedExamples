package objects.one;

public class Soldier {
    final private String firstName;

    final private String lastName;

    private String rank = "General";

    public Soldier(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "%s %s %s".formatted(rank, firstName, lastName);
    }
}
