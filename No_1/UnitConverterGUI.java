package No_1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UnitConverterGUI extends JFrame {

    private JPanel basePanel = null;
    private JComboBox<String> jComboBoxR = null;
    private JTextField jTextFieldInput = null;
    private JButton jButtonConvert = null;
    private JComboBox<String> jComboBoxS = null;
    private JTextField jTextFieldOutput = null;
    private String[] label = new String[]{
        "KM", "HM", "DAM", "M", "DM", "CM", "MM"
    };

    public UnitConverterGUI() {
        initUI();
    }

    private void initUI() {
        setContentPane(getBasePanel());
        setSize(600, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JPanel getBasePanel() {
        if (basePanel == null) {  
            basePanel = new JPanel();
            basePanel.setBackground(Color.RED);
            basePanel.add(getJComboBoxR());
            basePanel.add(getJTextFieldInput());
            basePanel.add(getJButtonConvert());
            basePanel.add(getJComboBoxS());
            basePanel.add(getJTextFieldOutput());
        }
        return basePanel;
    }

    private JComboBox<String> getJComboBoxR() {
        if (jComboBoxR == null) {
            jComboBoxR = new JComboBox<>(label);
        }
        return jComboBoxR;
    }

    private JTextField getJTextFieldInput() {
        if (jTextFieldInput == null) {
            jTextFieldInput = new JTextField();
            jTextFieldInput.setPreferredSize(new Dimension(80, 28));
        }
        return jTextFieldInput;
    }

    private JComboBox<String> getJComboBoxS() {
        if (jComboBoxS == null) {
            jComboBoxS = new JComboBox<>(label);
        }
        return jComboBoxS;
    }

    private JTextField getJTextFieldOutput() {
        if (jTextFieldOutput == null) {
            jTextFieldOutput = new JTextField();
            jTextFieldOutput.setPreferredSize(new Dimension(80, 28));
        }
        return jTextFieldOutput;
    }

    private JButton getJButtonConvert() {
        if (jButtonConvert == null) {
            jButtonConvert = new JButton("Convert -->");
            jButtonConvert.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int indexIn = jComboBoxR.getSelectedIndex();
                    int indexOut = jComboBoxS.getSelectedIndex();
                    String sInput = jTextFieldInput.getText();
                    double input = Double.parseDouble(sInput);
                    double output = convert(indexIn, indexOut, input);
                    jTextFieldOutput.setText(new DecimalFormat("#.#########").format(output));
                }

            });
        }
        return jButtonConvert;
    }
    
    private double convert(int dari, int ke, double value){
        double km = value / Math.pow(10, dari);
        double result = km * Math.pow(10, ke);
        return result;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                UnitConverterGUI ucgui = new UnitConverterGUI();
            }
        });
    }

}