package oops;

public class Building {
    public static void main(String[] args) {
        House apartment = new Apartment();
        System.out.println(apartment.getType());
        House bungalow = new Bunglow();
        System.out.println(bungalow.getType());
    }
}
