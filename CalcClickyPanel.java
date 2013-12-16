import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

public class CalcClickyPanel extends JPanel implements ActionListener {
        private static final long serialVersionUID = 1L;

        private JLabel text;
        private JButton calcButt;
        private JButton clearButt;
        private DayClickyPanel dPanel;
        
        public CalcClickyPanel(DayClickyPanel dcp) {
                dPanel = dcp;
                setLayout(new FlowLayout());
                setBackground(Color.LIGHT_GRAY);

                text = new JLabel("$0.00     ");
                text.setFont(new Font("DejaVu Sans Mono", Font.PLAIN, 18));
                add(text);
                
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
        }
}