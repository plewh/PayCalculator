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

        private double             dollarsEarnt;
        private JRadioButton    no;
        private JRadioButton    am;
        private JRadioButton    pm;
        private JRadioButton	ss;
        private JRadioButton    nd;
        private JLabel          dayLabel;
        
        private double			amPay;
        private double			pmPay;
        private double			ssPay;
        private double			ndPay;
        
        public DayClicky() {
                setLayout(new FlowLayout());
                dayLabel = new JLabel("x");
                dayLabel.setFont(new Font("DejaVu Sans Mono", Font.PLAIN, 18));
                no = new JRadioButton("N/A", true);
                no.addItemListener(this);
                am = new JRadioButton("AM");
                am.addItemListener(this);
                pm = new JRadioButton("PM");
                pm.addItemListener(this);
                ss = new JRadioButton("SS");
                ss.addItemListener(this);
                nd = new JRadioButton("ND");
                nd.addItemListener(this);
                
                dollarsEarnt = 0;
                
                ButtonGroup grp = new ButtonGroup();
                grp.add(no);
                grp.add(am);
                grp.add(pm);
                grp.add(ss);
                grp.add(nd);
                
                add(dayLabel);
                add(no);
                add(am);
                add(pm);
                add(ss);
                add(nd);
                
                amPay = 164.85;
                pmPay = 173.04;
                ssPay = 109.90;
                ndPay = 202.16;
                
        }
        
        public void itemStateChanged(ItemEvent e) {
                Object button = e.getItemSelectable();
                
                if (button == no) {
                        dollarsEarnt = 0;
                } else if (button == am) {
                        dollarsEarnt = amPay;
                } else if (button == pm) {
                        dollarsEarnt = pmPay;
                } else if (button == ss) {
                		dollarsEarnt = ssPay;
                } else if (button == nd) {
                        dollarsEarnt = ndPay;
                }
        }
        
        public void SetLabelText(String labelText) {
                dayLabel.setText(labelText);
        }
        
        public double GetDailyDollars() {
                return dollarsEarnt;
        }
        
        public void SetAMPay(double pay) {
        	amPay = pay;
        }
        public void SetPMPay(double pay) {
        	pmPay = pay;
        }
        public void SetSSPay(double pay) {
        	ssPay = pay;
        }
        public void SetNDPay(double pay) {
        	ndPay = pay;
        }
}