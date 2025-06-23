package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Primo_Frame extends JFrame {

        public Primo_Frame() {

            super("La mia prima finestra");

            // to stop app once we click on 'exit'
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // set size of the app frame
            setSize(800,600);

            //to locate the frame in the center when opening
            setLocationRelativeTo(null);

            // to see the frame once we run the app (always last)
            setVisible(true);

            initComponents();
        }

        private void initComponents() {
            // container
            JPanel panel = new JPanel();

            JLabel label = new JLabel("Come ti chiami?");

            JTextField text = new JTextField(20);

            // creation of a button
            JButton button = new JButton("Saluta");

            // adding button to app
            add(button,BorderLayout.PAGE_START);

            JLabel nameLabel = new JLabel("");

            add(text);

            // aggiungi tutti gli elementi al pannello
            panel.add(label);
            panel.add(text);
            panel.add(button);
            panel.add(nameLabel);

            // aggiungi il pannello al frame
            add(panel);

            button.addActionListener( e -> {
                String helloText = text.getText();  // prende il testo dal campo
                nameLabel.setText("Ciao " + helloText + " <3");
            });

        }
}

