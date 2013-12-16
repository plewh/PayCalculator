import javax.swing.JFrame;

import java.awt.BorderLayout;

public class App {
        private JFrame frame;
        private DayClickyPanel dayClickyPanel;
        private CalcClickyPanel calcClickyPanel;
<<<<<<< HEAD

        public App() {
                frame = new JFrame("Maras Monies V3");
=======
        //private int hollaForADollaHoneyBooBooChild;

        public App() {
                frame = new JFrame("Maras Monies");
>>>>>>> 92b7038991c13585432c5b657556317ed8e58ba7
                frame.setLayout(new BorderLayout());
                dayClickyPanel = new DayClickyPanel();
                calcClickyPanel = new CalcClickyPanel(dayClickyPanel);
                frame.add(dayClickyPanel, BorderLayout.CENTER);
                frame.add(calcClickyPanel, BorderLayout.SOUTH);
<<<<<<< HEAD

                frame.setSize(600, 400);
=======
                //hollaForADollaHoneyBooBooChild = 0;

                frame.setSize(320, 320);
>>>>>>> 92b7038991c13585432c5b657556317ed8e58ba7
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.setVisible(true);
        }

        @SuppressWarnings("unused")
		public static void main(String[] args) {
                App app = new App();
        }
}