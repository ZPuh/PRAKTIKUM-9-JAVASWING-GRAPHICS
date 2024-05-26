package No_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIKoversiNilai extends JFrame {

    private JTextField inputanNilai;
    private JTextField inputanHuruf;
    private JButton konversiHurufButton;
    private JButton konversiAngkaButton;
    private JButton clearButton;

    public GUIKoversiNilai() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Konversi Nilai");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 10, 10));

        JLabel jLabel3 = new JLabel("Nilai Angka");
        JLabel jLabel4 = new JLabel("Nilai Huruf");

        inputanNilai = new JTextField();
        inputanHuruf = new JTextField();

        konversiHurufButton = new JButton("Konversi Huruf");
        konversiHurufButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                konversiHurufButtonActionPerformed(evt);
            }
        });

        konversiAngkaButton = new JButton("Konversi Angka");
        konversiAngkaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                konversiAngkaButtonActionPerformed(evt);
            }
        });

        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        panel.add(jLabel3);
        panel.add(inputanNilai);
        panel.add(konversiHurufButton);
        panel.add(jLabel4);
        panel.add(inputanHuruf);
        panel.add(konversiAngkaButton);
        panel.add(new JLabel()); // Empty cell for alignment
        panel.add(clearButton);

        add(panel, BorderLayout.CENTER);
    }

    private void konversiHurufButtonActionPerformed(ActionEvent evt) {
        try {
            int nilai = Integer.parseInt(inputanNilai.getText());
            inputanHuruf.setText(nilaiHuruf(nilai));
        } catch (NumberFormatException e) {
            inputanHuruf.setText("Nilai Tidak Valid");
        }
    }

    private void konversiAngkaButtonActionPerformed(ActionEvent evt) {
        String nilai = inputanHuruf.getText();
        inputanNilai.setText(nilaiAngka(nilai));
    }

    private void clearButtonActionPerformed(ActionEvent evt) {
        inputanHuruf.setText("");
        inputanNilai.setText("");
    }

    private String nilaiHuruf(int nilai) {
        if (nilai <= 100 && nilai >= 85) {
            return "A";
        } else if (nilai <= 84 && nilai >= 80) {
            return "A-";
        } else if (nilai <= 79 && nilai >= 75) {
            return "B+";
        } else if (nilai <= 74 && nilai >= 70) {
            return "B";
        } else if (nilai <= 69 && nilai >= 65) {
            return "B-";
        } else if (nilai <= 64 && nilai >= 50) {
            return "C";
        } else if (nilai <= 49 && nilai >= 40) {
            return "D";
        } else if (nilai <= 39 && nilai >= 0) {
            return "E";
        } else {
            return "Nilai Tidak Valid";
        }
    }

    private String nilaiAngka(String nilai) {
        switch (nilai.toUpperCase()) {
            case "A":
                return "85-100";
            case "A-":
                return "80-84";
            case "B+":
                return "75-79";
            case "B":
                return "70-74";
            case "B-":
                return "65-69";
            case "C":
                return "50-64";
            case "D":
                return "40-49";
            case "E":
                return "0-39";
            default:
                return "Huruf Tidak Valid";
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIKoversiNilai().setVisible(true);
            }
        });
    }
}
