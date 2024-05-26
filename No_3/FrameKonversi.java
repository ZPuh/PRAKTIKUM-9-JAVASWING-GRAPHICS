package No_3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameKonversi extends JFrame {

    private JPanel jPanel1;
    private JComboBox<String> mataUang1;
    private JComboBox<String> mataUang2;
    private JTextField inputanTextField;
    private JTextField outputTextField;
    private JButton konversiButton;

    public FrameKonversi() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Konversi Mata Uang");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        jPanel1 = new JPanel();
        jPanel1.setBackground(new Color(255, 0, 0));
        jPanel1.setLayout(new GridLayout(3, 2, 10, 10));

        mataUang1 = new JComboBox<>(new String[] { "Rupiah", "Dollar" });
        mataUang2 = new JComboBox<>(new String[] { "Rupiah", "Dollar" });

        inputanTextField = new JTextField();
        outputTextField = new JTextField();
        outputTextField.setEditable(false);

        konversiButton = new JButton("Konversi");
        konversiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                konversiButtonActionPerformed(evt);
            }
        });

        jPanel1.add(mataUang1);
        jPanel1.add(inputanTextField);
        jPanel1.add(mataUang2);
        jPanel1.add(outputTextField);
        jPanel1.add(new JLabel()); // Placeholder for layout alignment
        jPanel1.add(konversiButton);

        add(jPanel1, BorderLayout.CENTER);
    }

    private void konversiButtonActionPerformed(ActionEvent evt) {
        try {
            double input = Double.parseDouble(inputanTextField.getText());
            int uang1 = mataUang1.getSelectedIndex();
            int uang2 = mataUang2.getSelectedIndex();
            double output;

            if (uang1 == 0 && uang2 == 1) {
                output = input / 16067;
            } else if (uang1 == 1 && uang2 == 0) {
                output = input * 16067;
            } else {
                output = input;
            }

            outputTextField.setText(String.format("%.2f", output));
        } catch (NumberFormatException e) {
            outputTextField.setText("Nilai Tidak Valid");
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameKonversi().setVisible(true);
            }
        });
    }
}
