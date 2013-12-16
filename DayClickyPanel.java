import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.GridLayout;

public class DayClickyPanel extends JPanel {
        private static final long serialVersionUID = 1L;
        private ArrayList<DayClicky> dayClickyList;
        
        public DayClickyPanel() {
                setLayout(new GridLayout(7, 0));
                dayClickyList = new ArrayList<DayClicky>();

                for (int j = 0; j < 7; ++j) {
                        dayClickyList.add(new DayClicky());
                        add(dayClickyList.get(j));
                }
                
                dayClickyList.get(0).SetLabelText("WED");
                dayClickyList.get(1).SetLabelText("THU");
                
                dayClickyList.get(2).SetLabelText("FRI");
                dayClickyList.get(2).SetNDPay(215.42);
                
                dayClickyList.get(3).SetLabelText("SAT");
                dayClickyList.get(3).SetAMPay(206.10);
                dayClickyList.get(3).SetPMPay(192.36);
<<<<<<< HEAD
                dayClickyList.get(3).SetNDPay(247.32);
                dayClickyList.get(3).SetRAO4Pay(123.00);
                dayClickyList.get(3).SetRAO6Pay(184.50);
                dayClickyList.get(3).SetRAO8Pay(230.62);
                dayClickyList.get(3).SetCSSAMPay(109.90);
                dayClickyList.get(3).SetCSSPMPay(109.90);
=======
                dayClickyList.get(3).SetSSPay(137.40);
                dayClickyList.get(3).SetNDPay(247.32);
>>>>>>> 92b7038991c13585432c5b657556317ed8e58ba7
                
                dayClickyList.get(4).SetLabelText("SUN");
                dayClickyList.get(4).SetAMPay(240.45);
                dayClickyList.get(4).SetPMPay(224.42);
<<<<<<< HEAD
                dayClickyList.get(4).SetNDPay(215.74);
                dayClickyList.get(4).SetRAO4Pay(147.60);
                dayClickyList.get(4).SetRAO6Pay(221.40);
                dayClickyList.get(4).SetRAO8Pay(267.75);
                dayClickyList.get(4).SetCSSAMPay(131.88);
                dayClickyList.get(4).SetCSSPMPay(131.88);
=======
                dayClickyList.get(4).SetSSPay(160.03);
                dayClickyList.get(4).SetNDPay(215.74);
>>>>>>> 92b7038991c13585432c5b657556317ed8e58ba7
                
                dayClickyList.get(5).SetLabelText("MON");
                dayClickyList.get(6).SetLabelText("TUE");	
        }
        
        public double CalculateWeeklyDollarTotal() {
                double total = 0;

                for (int j = 0; j < 7; ++j) {
                        total += dayClickyList.get(j).GetDailyDollars();
                }
                
                return total;
        }
<<<<<<< HEAD
        
        public void ClearAllCheckBoxes() {
        	for (int j = 0; j < 7; ++j) {
        		dayClickyList.get(j).ClearCheckBoxes();
        	}
        }
=======
>>>>>>> 92b7038991c13585432c5b657556317ed8e58ba7
}