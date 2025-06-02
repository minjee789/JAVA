import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=== bus reserve system ===");
        System.out.println("1. 상행 (\"정문\", \"도서관\", \"보건대학\", \"학생회관\", \"기숙사\")");
        System.out.println("2. 하행 (\"기숙사\", \"학생회관\", \"보건대학\", \"도서관\", \"정문\")");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("상행을 선택했습니다.");
        } else if (choice == 2) {
            System.out.println("하행을 선택했습니다.");
        } else {
            System.out.println("잘못된 접근입니다.");
            return;
        }
        System.out.println();
        System.out.println("시간을 선택해 주세요");
        System.out.println("1. 8시");
        System.out.println("2. 9시");
        int hourChoice = sc.nextInt();

        int selectedHour;
        if (hourChoice == 1) {
            selectedHour = 8;
        }
        else if (hourChoice == 2) {
            selectedHour = 9;
        }
        else {
            System.out.println("잘못된 접근입니다");
            return;
        }
        System.out.println("세부 시간을 선택해 주세요");
        System.out.println("1. 10분");
        System.out.println("2. 20분");
        System.out.println("3. 30분");
        int minuteChoice = sc.nextInt();

        int selectedMinute;
        switch (minuteChoice) {
            case 1: selectedMinute = 10;
            break;
            case 2: selectedMinute = 20;
            break;
            case 3: selectedMinute = 30;
            break;
            default: {
                System.out.println("잘못된 접근입니다.");
                return;
            }
        }
        String timeStr = String.format("%02d:%02d", selectedHour, selectedMinute);
        System.out.println();
        System.out.println("시간 선택 확인");
        System.out.println("예약 시간 : " + timeStr);
        sc.close();
    }
}





