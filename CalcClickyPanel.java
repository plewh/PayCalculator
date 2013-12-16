import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
=======
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
>>>>>>> 92b7038991c13585432c5b657556317ed8e58ba7
import java.awt.FlowLayout;
import java.awt.Font;

public class CalcClickyPanel extends JPanel implements ActionListener {
        private static final long serialVersionUID = 1L;

        private JLabel text;
<<<<<<< HEAD
        private JButton calcButt;
        private JButton clearButt;
=======
        private JButton butt;
>>>>>>> 92b7038991c13585432c5b657556317ed8e58ba7
        private DayClickyPanel dPanel;
        
        public CalcClickyPanel(DayClickyPanel dcp) {
                dPanel = dcp;
                setLayout(new FlowLayout());
<<<<<<< HEAD
                setBackground(Color.LIGHT_GRAY);
=======
>>>>>>> 92b7038991c13585432c5b657556317ed8e58ba7

                text = new JLabel("$0.00     ");
                text.setFont(new Font("DejaVu Sans Mono", Font.PLAIN, 18));
                add(text);
                
<<<<<<< HEAD
                calcButt = new JButton("Calculate");
                calcButt.addActionListener(this);
                add(calcButt);
                
                clearButt = new JButton("Clear All");
                clearButt.addActionListener(this);
                add(clearButt);
        }

        public void actionPerformed(ActionEvent l) {
        		if (l.getSource() == calcButt) {
        			double temp = dPanel.CalculateWeeklyDollarTotal();
                	String dubTxt = String.format("%.2f", temp);
        			text.setText("$" + dubTxt + "  ");
        		}
        		
        		if (l.getSource() == clearButt) {
        			dPanel.ClearAllCheckBoxes();
        			double temp = dPanel.CalculateWeeklyDollarTotal();
                	String dubTxt = String.format("%.2f", temp);
        			text.setText("$" + dubTxt + "  ");
        		}
=======
                butt = new JButton("Calculate");
                butt.addActionListener(this);
                add(butt);
        }

        public void actionPerformed(ActionEvent l) {
        		double temp = dPanel.CalculateWeeklyDollarTotal();
                String dubTxt = String.format("%.2f", temp);
        		text.setText("$" + dubTxt + "  ");
>>>>>>> 92b7038991c13585432c5b657556317ed8e58ba7
        }
}