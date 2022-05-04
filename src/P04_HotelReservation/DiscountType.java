package P04_HotelReservation;

public enum DiscountType {
    None(0),
    SecondVisit(10),
    VIP(20);

    private int discount;

    DiscountType(int discount){
        this.discount = discount;
    }
    public int getDiscount() {
        return this.discount;
    }
}
