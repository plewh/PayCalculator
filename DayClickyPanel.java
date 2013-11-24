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
                dayClickyList.get(3).SetSSPay(137.40);
                dayClickyList.get(3).SetNDPay(247.32);
                
                dayClickyList.get(4).SetLabelText("SUN");
                dayClickyList.get(4).SetAMPay(240.45);
                dayClickyList.get(4).SetPMPay(224.42);
                dayClickyList.get(4).SetSSPay(160.03);
                dayClickyList.get(4).SetNDPay(215.74);
                
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
}