import java.awt.Container;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;

public class fx_window_layout extends JFrame {
    
      // action listeners method
           
	
	//text area
	private JTextArea details;
	
	//combo box
	private JComboBox pairs;
	
	//buttons in the window
	private JButton LB;
	private JButton RB;
	private JButton CB;
	private JButton DB;
	private JButton ET; // okay button
        private JButton CT; //cancel button
	private JRadioButton Buy;
	private JRadioButton sell;
	private ButtonGroup group;
	
	private FlowLayout layout;
	private FlowLayout label_layout;
	
	//Labels in the window
	private JLabel currencyPair;
	private JLabel lotsize;
	private JLabel atprice;
	private JLabel stoploss;
	private JLabel takeprofit;
	private JLabel equity;
	
	// text fields in the window
	private JTextField currPair;
	private JTextField lot;
	private JTextField price;
	private JTextField loss;
	private JTextField profit;
	private JTextField equ;
	
	private Container container;
	private Container labelcontainer; //container for labels
        
        
   // method for button action listeners     
public void setUpButtonListeners(){
           ActionListener buttonListener = new ActionListener(){
            
           @Override
           public void actionPerformed(ActionEvent event){
            
           if(event.getSource() == ET){
               //if OKAY buton is pressed      
               
                  }
           else if (event.getSource() == CT){
               System.exit(0);
           }
           else{
           
           }
                }
           };
           
          CT.addActionListener(buttonListener);
          ET.addActionListener(buttonListener);
        
        }
	
	
	public fx_window_layout() {
		super("Pip Calculator"); // title bar
		label_layout = new FlowLayout(); //layout for labels
		layout = new FlowLayout(); //general layout
		container = getContentPane();
		labelcontainer = getContentPane();
		
		setLayout(layout);
		layout.setAlignment(FlowLayout.LEFT);
		layout.layoutContainer(container);
		
		
		
		// curency pair label
	currencyPair = new JLabel("Currency Pair");
	add(currencyPair);
	
	label_layout.setAlignment(FlowLayout.LEFT); //left alignment
	
	label_layout.layoutContainer(labelcontainer);
	
	//currency pair combo box
	pairs = new JComboBox();
	pairs.setPreferredSize(new Dimension(300, 30));
	add(pairs);
	layout.setAlignment(FlowLayout.CENTER);
	
	//Radio buttons for buy and sell
	Buy = new JRadioButton("Buy/Ask",false);
	add(Buy);
	label_layout.setAlignment(FlowLayout.LEFT); //left alignment
	label_layout.layoutContainer(labelcontainer);
	
	sell = new JRadioButton("Sell/Bid",false);
	add(sell);
	label_layout.setAlignment(FlowLayout.LEFT); //left alignment
	label_layout.layoutContainer(labelcontainer);
	
	
	//group radio buttons
	
	group = new ButtonGroup();
	group.add(Buy);
	group.add(sell);
	
	
	// lot size label
	lotsize = new JLabel("Lot Size");
	add(lotsize);
	
	label_layout.setAlignment(FlowLayout.LEFT); //left alignment
	label_layout.layoutContainer(labelcontainer);
	
	//lot size text field
	lot = new JTextField();
	lot.setPreferredSize(new Dimension(100, 30));
	add(lot);
	
		// at price... label
	atprice = new JLabel("Entry Price");
	add(atprice);
	
	label_layout.setAlignment(FlowLayout.LEFT); //left alignment
	label_layout.layoutContainer(labelcontainer);
	
	//at price text field
		price = new JTextField();
		price.setPreferredSize(new Dimension(100, 30));
		add(price);
		
	
	// stop loss label
	stoploss = new JLabel("Stop Loss");
	add(stoploss);
	
	label_layout.setAlignment(FlowLayout.LEFT); //left alignment
	label_layout.layoutContainer(labelcontainer);

	//stop loss text field
		loss = new JTextField();
		loss.setPreferredSize(new Dimension(100, 30));
		add(loss);
	
	
	// take profit label
	takeprofit = new JLabel("Take Profit");
	add(takeprofit);
	
	label_layout.setAlignment(FlowLayout.LEFT); //left alignment
	label_layout.layoutContainer(labelcontainer);
	
	//take profit text field
		profit = new JTextField();
		profit.setPreferredSize(new Dimension(200, 30));
		add(profit);
	
	//equity label
	equity = new JLabel("Balance");
	add(equity);
	
	//equity text field
		equ = new JTextField();
		equ.setPreferredSize(new Dimension(200, 30));
		add(equ);
	
	
	
		
		
//		layout.setAlignment(FlowLayout.LEFT);
		//action listener
//		ET.addActionListener(
//				new ActionListener() {
//					public void actionPerformed(ActionEvent event) {
//						layout.setAlignment(FlowLayout.LEFT); //left alignment
//						layout.layoutContainer(container);
//						
//					}
					
				
				
//				);
	
		
		//Text area method
		details = new JTextArea("placeholder");
		details.setPreferredSize(new Dimension(300, 100));
	
		add(details);
				
                
                // OK button functions and methods
		ET =new JButton("OKAY");
		add(ET);
                
                 //cancel button functions and methods
                CT = new JButton("Cancel");
                add(CT);
                
               setUpButtonListeners();
                
             
        
                
	
      
       }
       
      
}
	
//        }

