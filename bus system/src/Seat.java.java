public class Seat {
    private int seatNumber;
    private String reservedBy;  // 예약자 이름

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.reservedBy = null;
    }

    public boolean isReserved() {
        return reservedBy != null;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getReservedBy() {
        return reservedBy;
    }

    public void reserve(String name) {
        this.reservedBy = name;
    }
}
