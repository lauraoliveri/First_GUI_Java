package GUI;

import javax.swing.*;


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
        }
}

