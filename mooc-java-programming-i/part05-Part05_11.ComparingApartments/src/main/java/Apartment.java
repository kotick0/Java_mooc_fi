
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        } 
    }
    public int priceDifference(Apartment compared) {
        if (this.princePerSquare > compared.princePerSquare) {
            return this.princePerSquare - compared.princePerSquare;
        } else {
            return compared.princePerSquare - this.princePerSquare;
        } 
    }
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.princePerSquare > compared.princePerSquare) {
            return false;
        } else {
            return true;
        } 
    }
}
