

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class GUI extends JFrame
{
		public GUI()
	    {
	    	super("Weather Program");//window title
	    }
		
	    //Output area
	    static JTextArea outputTextArea = new JTextArea();
	    JButton forecastButton = new JButton("Check Weather");
	    JButton exitButton = new JButton("Exit Program");
	    JScrollPane scrollPane = new JScrollPane(outputTextArea); 
	    
		public void runGUI()
		{
		    	outputTextArea.setEditable(false);
		        outputTextArea.setBorder(BorderFactory.createTitledBorder("Weather & Notifications"));
		        outputTextArea.setVisible(true);
		        
		        forecastButton.setVisible(true);
		        exitButton.setVisible(true);
		         
		        //add everything to JPanel
		        JPanel panel = new JPanel();
		        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		        panel.add(forecastButton);
		        panel.add(exitButton);
		        
		        //JFrame layout
		        setLayout(new BorderLayout());
		        add(panel, BorderLayout.PAGE_START);
		        add(outputTextArea, BorderLayout.CENTER);
		       
		        //scrollPane settings
		        add(scrollPane);
		        scrollPane.setViewportView(outputTextArea);
		        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		        
		        setVisible(true);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        setSize(500, 700); 
		        
       	        //event handling for Buttons
		        forecastButton.addActionListener(new ForecastButtonListener());
		        exitButton.addActionListener(new StopButtonListener());
		    }
		    
				//exit the GUI
				public void CloseFrame(){
		    		super.dispose();
				}
	
				    public class StopButtonListener implements ActionListener
				    {
					    	@Override
							public void actionPerformed(ActionEvent e) 
							{
					    		CloseFrame();
							}
					}
				    
				    public class ForecastButtonListener implements ActionListener
				    {
						@Override
						public void actionPerformed(ActionEvent e) 
						{
							outputTextArea.setText("");
							WeatherSimulator.checkRules();
							WeatherSimulator.displayApplicableLocations();
					        outputTextArea.setCaretPosition(0);  //scroll bar set to top of page
						}
				    }
}