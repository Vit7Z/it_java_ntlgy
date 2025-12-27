import java.util.Objects;

public class Adress {
    private String country;
    private String city;

    public Adress (String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Adress adress = (Adress) o;
        return Objects.equals(country, adress.country) && Objects.equals(city, adress.city);
    }

    @Override
    public int hashCode() {
       return Objects.hash(country, city);
    }
}