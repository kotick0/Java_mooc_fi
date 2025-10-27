public class Country {
    private String name;
    private int year;
    private String sex;
    private double literacyPercent;

    public Country(String name, int year, String sex, double literacyPercent) {
        this.name = name;
        this.year = year;
        this.sex = sex;
        this.literacyPercent = literacyPercent;
    }

    public double getLiteracyPercent() {
        return this.literacyPercent;
    }

    @Override
    public String toString() {
        return this.name + " (" +  this.year + ")," + this.sex + ", " + this.literacyPercent;
    }

    
}
