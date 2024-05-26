package No_6;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import No_6.DataFrekuensi;

public class FrameUtama extends JFrame {
    // https://en.wikipedia/org/
    private JLabel urlLabel;
    private JTextField inputanField;
    private JButton parseButton;
    private JTextArea textArea;
    private JScrollPane jScrollPane1;

    public FrameUtama() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Web Parser");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        urlLabel = new JLabel("URL");
        inputanField = new JTextField();
        parseButton = new JButton("PARSE");
        parseButton.setBackground(Color.BLACK);
        parseButton.setForeground(Color.WHITE);
        parseButton.setActionCommand("parseButton");

        textArea = new JTextArea();
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1 = new JScrollPane(textArea);

        JPanel inputPanel = new JPanel(new BorderLayout(10, 10));
        inputPanel.add(urlLabel, BorderLayout.WEST);
        inputPanel.add(inputanField, BorderLayout.CENTER);
        inputPanel.add(parseButton, BorderLayout.EAST);
        add(inputPanel, BorderLayout.NORTH);
        add(jScrollPane1, BorderLayout.CENTER);

        parseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                parseButtonActionPerformed(evt);
            }
        });
    }

    private void parseButtonActionPerformed(ActionEvent evt) {
        if (!inputanField.getText().isEmpty()) {
            String alamat = inputanField.getText();
            Document doc;
            try {
                doc = Jsoup.connect(alamat).get();
            String text = doc.text();

            // case folding 
            text = text.toLowerCase();
            // Tokenizing
            String[] kata = text.split("\\s");

            // Hitung Frekuensi
            ArrayList<DataFrekuensi> fKata = new ArrayList<>();
            for (String s : kata) {
                boolean cek = false;
                for (DataFrekuensi d : fKata) {
                    if (d.kata.equals(s)) {
                        d.incrementFrekuensi();
                        cek = true;
                        break;
                    }
                }
                if (!cek) {
                    DataFrekuensi kataBaru = new DataFrekuensi(s);
                    fKata.add(kataBaru);
                }
            }
            textArea.setText("Daftar Kata dan Frekuensi\n");
            for (DataFrekuensi d : fKata) {
                System.out.println(d.kata + " : " + d.frekuensi);
                textArea.append(d.kata+ '(' + d.frekuensi + ')' + "\n");
            }

//                doc = Jsoup.connect(alamat).get();
//                String textt = doc.text();
//                String text01 = textt.replaceAll("\u00A9|,|&|\\(|\\)|\\.|/|[0-9]|\\?|@|!|;", " ");
//                String text = text01.replaceAll("\\s+", " ");
//                String[] kata = text.split(" ");
//                ArrayList<DataFrekuensi> data = new ArrayList<>();
//
//                for (String kt : kata) {
//                    String lowerCaseKt = kt.toLowerCase();
//                    if (lowerCaseKt.equals("\u002d") || lowerCaseKt.equals("\u2013")) {
//                        continue;
//                    }
//                    boolean add = true;
//                    for (DataFrekuensi isi : data) {
//                        if (isi.nama.equalsIgnoreCase(lowerCaseKt)) {
//                            isi.incrementFrekuensi();
//                            add = false;
//                            break;
//                        }
//                    }
//
//                    if (add) {
//                        data.add(new DataFrekuensi(lowerCaseKt));
//                    }
//                }
//                textArea.setText("Daftar Kata dan Frekuensi\n");
//                for (DataFrekuensi x : data) {
//                    textArea.append(x.nama + '(' + x.frekuensi + ')' + "\n");
//                }

            } catch (IOException e) {
                e.printStackTrace();
                textArea.setText("Link tidak Terbaca");
            }
        } else {
            textArea.setText("URL Masih Kosong");
        }
    }

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameUtama fu = new FrameUtama();
                fu.setVisible(true);
            }
        });
    }
}
