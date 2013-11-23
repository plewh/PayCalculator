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
		
		dayClickyList.get(0).SetLabelText("MON");
		dayClickyList.get(1).SetLabelText("TUE");
		dayClickyList.get(2).SetLabelText("WED");
		dayClickyList.get(3).SetLabelText("THU");
		dayClickyList.get(4).SetLabelText("FRI");
		dayClickyList.get(5).SetLabelText("SAT");
		dayClickyList.get(6).SetLabelText("SUN");
	}
	
	public int CalculateWeeklyDollarTotal() {
		int total = 0;

		for (int j = 0; j < 7; ++j) {
			total += dayClickyList.get(j).GetDailyDollars();
		}
		
		return total;
	}
}
