import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.Font;


public class CalcClickyPanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JLabel text;
	private JButton butt;
	private DayClickyPanel dPanel;
	
	public CalcClickyPanel(DayClickyPanel dcp) {
		dPanel = dcp;
		setLayout(new FlowLayout());

		text = new JLabel("$0.00");
		text.setFont(new Font("Anonymous Pro", Font.PLAIN, 18));
		add(text);
		
		butt = new JButton("Calculate");
		butt.addActionListener(this);
		add(butt);
	}

	public void actionPerformed(ActionEvent l) {
		text.setText(Integer.toString(dPanel.CalculateWeeklyDollarTotal()));
	}
}
