import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame implements ActionListener {
	JLabel tracking, parcelType, weight, cost ;
	JTextField tracking1, weight1 ;
	JComboBox <String> type;
	JButton calculate;
	JTextArea summary ;
	

	public GUI() {
		
		setTitle (" Courier Booking System ");
		setSize (250, 400);
		setLayout(new GridLayout (6, 4, 15, 15));
		
		// Setting Labels
		tracking = new JLabel (" Enter Tracking ID: ");
		parcelType = new JLabel (" Select parcel type: ");
		weight = new JLabel (" Enter weight (kg): ");
		cost = new JLabel ();
		
		// Setting Text Fields
		tracking1 = new JTextField ();
		weight1 = new JTextField ();
		
		summary = new JTextArea ();
		
		// Setting Combo Box
		type = new JComboBox <> (new String [] { "Local", "National", "International" });
		
		// Setting Button
		calculate = new JButton ("Calculate");
		
		// Adding
		add (tracking); add (tracking1);
		add (parcelType); add (type);
		add (weight); add (weight1);
		add(calculate); add (cost);
		add(summary);
		
		calculate.addActionListener(this);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String trackId = tracking1.getText();
		int parcelWeight = Integer.parseInt(weight1.getText());
		String selectedType = (String) type.getSelectedItem();
		double totalCost = 0.0 ;
		
		if (selectedType.equals("Local")) {
			
			LocalParcel p1 = new LocalParcel (trackId, parcelWeight);
			totalCost = p1.calculateCost();
			cost.setText(String.valueOf(totalCost));
			
		}
		
		else if (selectedType.equals("National")) {
			
			NationalParcel p2 = new NationalParcel (trackId, parcelWeight);
			totalCost = p2.calculateCost();
			cost.setText(String.valueOf(totalCost));
			
		}
		
		else if (selectedType.equals("International")) {
			
			InternationalParcel p3 = new InternationalParcel (trackId, parcelWeight);
			totalCost = p3.calculateCost();
			cost.setText(String.valueOf(totalCost));
			
		}
		
		summary.setText (
				"============ Booking Summary =========== \n" +
				" Tracking ID: " + trackId + "\n" +
				" Parcel Type: " + selectedType + "\n" +		
				" Parcel Weight: " + parcelWeight + " kg\n" +
				" Total Cost: Rs." + String.format( "%.2f" , totalCost) + "\n" +
				"======================================"
	             );
		
	}

}