public class Country {
    private String countryCode;
    private String countryName;
    private long population;

    public Country(String countryCode, String countryName, long population) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.population = population;
    }

    @Override
    public String toString() {
        return countryName +
                " (" + countryCode + ") " +
                "ma " +  population +
                " ludności.";
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
