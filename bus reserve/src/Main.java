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
        } else if (hourChoice == 2) {
            selectedHour = 9;
        } else {
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
            case 1:
                selectedMinute = 10;
                break;
            case 2:
                selectedMinute = 20;
                break;
            case 3:
                selectedMinute = 30;
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

        BusReservation.main(null);
    }

    public class BusReservation {
        public static void main(String[] args) {
            boolean[] seats = new boolean[20];
            Scanner scanner = new Scanner(System.in);
            int choice;

            while (true) {
                System.out.println("\n[좌석 현황]");
                for (int i = 0; i < seats.length; i++) {
                    if (seats[i]) {
                        System.out.print("[X] ");
                    } else {
                        System.out.print("[" + (i + 1) + "] ");
                    }
                    if ((i + 1) % 5 == 0) System.out.println();
                }


                System.out.print("\n예약할 좌석 번호를 입력하세요 (1~20, 0은 종료): ");
                choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("예약 프로그램을 종료합니다.");
                    break;
                }

                if (choice < 1 || choice > 20) {
                    System.out.println("유효하지 않은 좌석 번호입니다. 다시 입력하세요.");
                } else if (seats[choice - 1]) {
                    System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하세요.");
                } else {
                    seats[choice - 1] = true;
                    System.out.println("좌석 " + choice + "번이 예약되었습니다.");
                    break;
                }
            }
            System.out.println("     좌석 정보 확인     ");
            System.out.println("좌석 번호  : " + choice + "번");

            System.out.println("확인을 완료했으면 Y를 눌러주세요");
            scanner.nextLine();
            String again = scanner.nextLine().trim().toLowerCase();
            if (!again.equals("Y")) {
                System.out.println("예약이 완료되었습니다. 감사합니다.");
                return;
            }
            scanner.close();
        }

    }
}

