import javax.swing.*;
import java.awt.*;

public class Main extends javax.swing.JFrame {
    public Main() {
        setTitle("버스 예약");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JButton clickMeBtn = new JButton("예약 진행");
        add(clickMeBtn);
        clickMeBtn.addActionListener(e -> {
            new BusReservationGUI().setVisible(true);
            dispose();
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}
class BusReservationGUI extends JFrame {
        private JComboBox<String> directionCombo;
        private JComboBox<String> hourCombo;
        private JComboBox<String> minuteCombo;
        private JButton confirmButton;
        private JPanel seatPanel;
        private JButton[] seatButtons = new JButton[20];
        private boolean[] seats = new boolean[20];
        private JLabel reservationLabel;

        public BusReservationGUI() {
            setTitle("버스 예약 시스템");
            setSize(800, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(new FlowLayout());

        JPanel topPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        topPanel.add(new JLabel("노선 선택"));
        directionCombo = new JComboBox<>(new String[]{"상행 (정문->기숙사", "하행 (기숙사->정문"});
        topPanel.add(directionCombo);

        topPanel.add(new JLabel("시간 선택"));
        hourCombo = new JComboBox<>(new String[]{"8", "9"});
        topPanel.add(hourCombo);

        topPanel.add(new JLabel("세부 시간 선택"));
        minuteCombo = new JComboBox<>(new String[]{"10", "20", "30"});
        topPanel.add(minuteCombo);

        confirmButton = new JButton("예약 하기");
        topPanel.add(confirmButton);
        add(topPanel, BorderLayout.NORTH);

        seatPanel = new JPanel(new GridLayout(4, 5, 5, 5));
        seatPanel.setBorder(BorderFactory.createTitledBorder("좌석 선택"));

        for (int i = 0; i < seats.length; i++) {
            int seatNum = i + 1;
            seatButtons[i] = new JButton(String.valueOf(seatNum));
            seatPanel.add(seatButtons[i]);
            seatButtons[i].addActionListener(e -> reserveSeat(seatNum - 1));
        }
        add(seatPanel, BorderLayout.CENTER);

        reservationLabel = new JLabel("예약 정보 선택");
        reservationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        reservationLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        add(reservationLabel, BorderLayout.SOUTH);

        confirmButton.addActionListener(e -> updateReservationInfo());
        }
        private void updateReservationInfo() {
            String direction = (String) directionCombo.getSelectedItem();
            String hour = (String) hourCombo.getSelectedItem();
            String minute = (String) minuteCombo.getSelectedItem();
            reservationLabel.setText("[" + direction + "] 예약시간: " + hour + ":" + minute);
        }
        private void reserveSeat(int index) {
            if (seats[index]) {
                JOptionPane.showMessageDialog(this, "이미 예약된 좌석입니다", "경고", JOptionPane.WARNING_MESSAGE);
            } else {
                int result = JOptionPane.showConfirmDialog(this,
                        (index + 1) + "번 좌석을 예약하시겠습니까?", "예약 확인", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    seats[index] = true;
                    seatButtons[index].setText("x");
                    seatButtons[index].setEnabled(false);
                    JOptionPane.showMessageDialog(this, "좌석" + (index + 1 + "번이 예약되었습니다"));

                }
            }
        }
    }