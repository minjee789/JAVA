import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("좌석의 행 수를 입력하시오");
        int rows = sc.nextInt();

        System.out.println("좌석의 열 수를 입력하시오");
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
        System.out.println("\n--- 현재 좌석 배치도 (0: 비어있음, 1: 예약석)---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}


