import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reserve PRS = new Reserve();
        PRS.run();
    }
}
class Reserve {}

public class BUS ReservationSystem {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    static class seat {
        static int Seat;
        String reservedBy;

        public seat(int seat, String reservedBy) {
            this reservedBy = null;
            Seat = seat;
        }

    
        public boolean isReseved() {
            return reservedBy != null;
        }

        public void reserve(String name) {
            this.reservedBy = name;
        }

        public String getReservedBy() {
            return reservedBy;
        }
    }
        
        public String toString() {
             return "Seat: " + Seat;
        }

        public static void main(String[] name) {
        this reserved By ! = null;
    }
        Reserve seat = new Reserve();
        seat.run();
    }
}
  class Reserve {
        public void run() {
          static int Total_seat = 20;
          static Scanner scanner = new Scanner(System.in);
          static Random random = new Random();

         Scanner sc = new Scanner(System.in);
         switch (busRoute) {
             case 1 :
                busRoute = 정문 - 생활관;
                break;
             case 2 :
                busRoute = 생활관 - 정문;
                break;
        }
    import java.util.*;

public class BusDirectionChecker {
    public static void main(String[] 
        List<String> busRoute = Arrays.asList(
            "정문", "중앙도서관", "학생회관", "본관", "기숙사"
        );


        String currentStop = "학생회관";
        String nextStop = "기숙사";

        String direction = getBusDirection(busRoute, currentStop, nextStop);
        System.out.println("버스는 현재 " + direction + " 중입니다.");
    }

    public static String getBusDirection(List<String> route, String current, String next) {
        int currentIndex = route.indexOf(current);
        int nextIndex = route.indexOf(next);

        if (currentIndex == -1 || nextIndex == -1) {
            return "정류장 정보를 찾을 수 없습니다.";
        }

        if (nextIndex > currentIndex) {
            return "상행 (기숙사 방향)";
        } else if (nextIndex < currentIndex) {
            return "하행 (정문 방향)";
        } else {
            return "정차 중";
        }
    }
}
    public class  Reserve extends SeatType;

         int run(){
         int num;
     while(true){
         Scanner input = new Scanner(System.in);
         System.out.print("버스 예약(1), 조회(+2), 취소(3)");
         num = input.nextInt();
         switch(num){
             case 1:
             book(1,2,3,4,5,6,7,8,9,10);
             break;
             case 2:
             cheak(1,2,3,4,5,6,7,8,9,10);
             break;
             case 3:
                cancel(1,2,3,4,5,6,7,8,9,10);
                break;
            default:
                System.out.println("정확하지 않은 접근입니다.");
                break;
        }
 
        System.out.print("좌석의 행 수를 입력하시오");
        int rows = 20
        int rows = sc.nextInt();

        System.out.println("좌석의 열 수를 입력하시오");
        int cols= 20;
        int cols = sc.nextInt();

        int[][] seats = new int[rows][cols];

        while (true) {
            System.out.println("\n좌석 예약을 하세요.(종료: 0 0 입력)");
            System.out.println("좌석의 행 번호 입력 (1~" + rows + "): ");
            int row = sc.nextInt();
            System.out.println("좌석의 열 번호 입력 (1~" + cols + "): ");
            int col = sc.nextInt();

            if (row == 0 && col == 0) {
                break;
            }

            if (row < 1 || row > rows || col < 1 || col > cols) {
                System.out.println("잘못된 접근입니다. 다시 입력해 주세요");
                continue;
            }
            int rowIndex = row - 1;
            int colIndex = col - 1;

            if (seats[rowIndex][colIndex] == 1) {
                System.out.println("이미 예약된 좌석입니다.");
            } else {
                seats[rowIndex][colIndex] = 1;
                System.out.println("예약이 완료되었습니다.");
            }
        }
        System.out.println("\n--- 현재 좌석 배치도 (0: 예약가능, 1: 예약석)---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}

        





    
