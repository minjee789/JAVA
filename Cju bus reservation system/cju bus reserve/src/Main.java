import java.util.Scanner;

public class seatType {
    System.out.println("방향 선택");
    private char seat;
    private seat[] seats;

    public seatType(char type, int num) {
        this.type = type;
        aseat = new seat[num];

        for (int i = 0; i < num; i++) {
            aseat[i] = new seat();
        }
    }
    public boolean seatReserve() {
        Scanner sc = new Scanner(System.in);
        int seatNum = sc.nextInt();
        String name;
        show();
        System.out.println("이름 입력");


        }
    }
}
