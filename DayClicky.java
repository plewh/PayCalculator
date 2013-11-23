import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup; 

public class DayClicky extends JPanel implements ItemListener {
	private static final long serialVersionUID = 1L;

	private int 			dollarsEarnt;
	private JRadioButton 	no;
	private JRadioButton 	am;
	private JRadioButton 	pm;
	private JRadioButton 	nd;
	private JLabel			dayLabel;
	
	public DayClicky() {
		setLayout(new FlowLayout());
		dayLabel = new JLabel("x");
		dayLabel.setFont(new Font("Anonymous Pro", Font.PLAIN, 18));
		no = new JRadioButton("N/A", true);
		no.addItemListener(this);
		am = new JRadioButton("AM");
		am.addItemListener(this);
		pm = new JRadioButton("PM");
		pm.addItemListener(this);
		nd = new JRadioButton("ND");
		nd.addItemListener(this);
		
		dollarsEarnt = 0;
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(no);
		grp.add(am);
		grp.add(pm);
		grp.add(nd);
		
		add(dayLabel);
		add(no);
		add(am);
		add(pm);
		add(nd);
	}
	
	public void itemStateChanged(ItemEvent e) {
		Object button = e.getItemSelectable();
		
		if (button == no) {
			dollarsEarnt = 0;
		} else if (button == am) {
			dollarsEarnt = 10;
		} else if (button == pm) {
			dollarsEarnt = 20;
		} else if (button == nd) {
			dollarsEarnt = 40;
		}
	}
	
	public void SetLabelText(String labelText) {
		dayLabel.setText(labelText);
	}
	
	public int GetDailyDollars() {
		return dollarsEarnt;
	}
}