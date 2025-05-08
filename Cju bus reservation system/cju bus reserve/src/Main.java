import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class seatType {
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
        


        }
    }
}