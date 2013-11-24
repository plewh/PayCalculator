import javax.swing.JFrame;

import java.awt.BorderLayout;

public class App {
        private JFrame frame;
        private DayClickyPanel dayClickyPanel;
        private CalcClickyPanel calcClickyPanel;
        //private int hollaForADollaHoneyBooBooChild;

        public App() {
                frame = new JFrame("Maras Monies");
                frame.setLayout(new BorderLayout());
                dayClickyPanel = new DayClickyPanel();
                calcClickyPanel = new CalcClickyPanel(dayClickyPanel);
                frame.add(dayClickyPanel, BorderLayout.CENTER);
                frame.add(calcClickyPanel, BorderLayout.SOUTH);
                //hollaForADollaHoneyBooBooChild = 0;

                frame.setSize(320, 320);
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