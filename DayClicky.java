import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class DayClicky extends JPanel implements ItemListener {
        private static final long serialVersionUID = 1L;

        private double          dollarsEarnt;
        private JCheckBox    	am;
        private JCheckBox    	pm;
        private JCheckBox    	nd;
        private JCheckBox    	RAO4;
        private JCheckBox    	RAO6;
        private JCheckBox    	RAO8;
        private JCheckBox    	CSSAM;
        private JCheckBox    	CSSPM;
        private JCheckBox		PHOLS;
        private JLabel          dayLabel;
        
        private double			amPay;
        private double			pmPay;
        private double			ndPay;
        private double			RAO4Pay;
        private double			RAO6Pay;
        private double			RAO8Pay;
        private double			CSSAMPay;
        private double			CSSPMPay;
        
        public DayClicky() {
                setLayout(new FlowLayout());
                dayLabel = new JLabel("x");
                dayLabel.setFont(new Font("DejaVu Sans Mono", Font.PLAIN, 18));
                
                am = new JCheckBox("  AM  ");
                am.addItemListener(this);
                am.setHorizontalTextPosition(SwingConstants.CENTER);
                am.setVerticalTextPosition(SwingConstants.TOP);

                pm = new JCheckBox("  PM  ");
                pm.addItemListener(this);
                pm.setHorizontalTextPosition(SwingConstants.CENTER);
                pm.setVerticalTextPosition(SwingConstants.TOP);

                nd = new JCheckBox("  ND  ");
                nd.addItemListener(this);
                nd.setHorizontalTextPosition(SwingConstants.CENTER);
                nd.setVerticalTextPosition(SwingConstants.TOP);

                RAO4 = new JCheckBox(" RAO4 ");
                RAO4.addItemListener(this);
                RAO4.setHorizontalTextPosition(SwingConstants.CENTER);
                RAO4.setVerticalTextPosition(SwingConstants.TOP);

                RAO6 = new JCheckBox(" RAO6 ");
                RAO6.addItemListener(this);
                RAO6.setHorizontalTextPosition(SwingConstants.CENTER);
                RAO6.setVerticalTextPosition(SwingConstants.TOP);

                RAO8 = new JCheckBox(" RAO8 ");
                RAO8.addItemListener(this);
                RAO8.setHorizontalTextPosition(SwingConstants.CENTER);
                RAO8.setVerticalTextPosition(SwingConstants.TOP);

                CSSAM = new JCheckBox("CSS-AM");
                CSSAM.addItemListener(this);
                CSSAM.setHorizontalTextPosition(SwingConstants.CENTER);
                CSSAM.setVerticalTextPosition(SwingConstants.TOP);

                CSSPM = new JCheckBox("CSS-PM");
                CSSPM.addItemListener(this);
                CSSPM.setHorizontalTextPosition(SwingConstants.CENTER);
                CSSPM.setVerticalTextPosition(SwingConstants.TOP);

                PHOLS = new JCheckBox("  P/H  ");
                PHOLS.setHorizontalTextPosition(SwingConstants.CENTER);
                PHOLS.setVerticalTextPosition(SwingConstants.TOP);
                
                dollarsEarnt = 0;

                add(dayLabel);
                add(am);
                add(pm);
                add(nd);
                add(RAO4);
                add(RAO6);
                add(RAO8);
                add(CSSAM);
                add(CSSPM);
                add(PHOLS);
                
                amPay = 164.85;
                pmPay = 173.04;
                ndPay = 202.16;
                RAO4Pay = 98.40;
                RAO6Pay = 147.60;
                RAO8Pay = 184.50;
                CSSAMPay = 87.92;
                CSSPMPay = 98.91;
                
        }
        
        public void itemStateChanged(ItemEvent e) {
                Object button = e.getItemSelectable();

                if (button == am) {
                	if (am.isSelected()) {
                		dollarsEarnt += amPay;
                	} else {
                		dollarsEarnt -= amPay;
                	}
                }
                
                if (button == pm) {
                	if (pm.isSelected()) {
                		dollarsEarnt += pmPay;
                	} else {
                		dollarsEarnt -= pmPay;
                	}
                }

                if (button == nd) {
                	if (nd.isSelected()) {
                		dollarsEarnt += ndPay;
                	} else {
                		dollarsEarnt -= ndPay;
                	}
                }

                if (button == RAO4) {
                	if (RAO4.isSelected()) {
                		dollarsEarnt += RAO4Pay;
                	} else {
                		dollarsEarnt -= RAO4Pay;
                	}
                }

                if (button == RAO6) {
                	if (RAO6.isSelected()) {
                		dollarsEarnt += RAO6Pay;
                	} else {
                		dollarsEarnt -= RAO6Pay;
                	}	
                }

                if (button == RAO8) {
                	if (RAO8.isSelected()) {
                		dollarsEarnt += RAO8Pay;
                	} else {
                		dollarsEarnt -= RAO8Pay;
                	}	
                }

                if (button == CSSAM) {
                	if (CSSAM.isSelected()) {
                		dollarsEarnt += CSSAMPay;
                	} else {
                		dollarsEarnt -= CSSAMPay;
                	}	
                }

                if (button == CSSPM) {
                	if (CSSPM.isSelected()) {
                		dollarsEarnt += CSSPMPay;
                	} else {
                		dollarsEarnt -= CSSPMPay;
                	}	
                }
        }
        
        public void SetLabelText(String labelText) {
                dayLabel.setText(labelText);
        }
        
        public double GetDailyDollars() {
        		if (PHOLS.isSelected()) {
        			return dollarsEarnt * 2;
        		}
                return dollarsEarnt;
        }
        
        public void SetAMPay(double pay) {
        	amPay = pay;
        }
        public void SetPMPay(double pay) {
        	pmPay = pay;
        }
        
        public void SetNDPay(double pay) {
        	ndPay = pay;
        }
        
        public void SetRAO4Pay(double pay) {
        	RAO4Pay = pay;
        }
        
        public void SetRAO6Pay(double pay) {
        	RAO6Pay = pay;
        }
        
        public void SetRAO8Pay(double pay) {
        	RAO8Pay = pay;
        }
        
        public void SetCSSAMPay(double pay) {
        	CSSAMPay= pay;
        }
        
        public void SetCSSPMPay(double pay) {
        	CSSPMPay = pay;
        }
        
        public void ClearCheckBoxes() {
             am.setSelected(false);
             pm.setSelected(false);
             nd.setSelected(false);
             RAO4.setSelected(false);
             RAO6.setSelected(false);
             RAO8.setSelected(false);
             CSSAM.setSelected(false);
             CSSPM.setSelected(false);
             PHOLS.setSelected(false);;
        }
}