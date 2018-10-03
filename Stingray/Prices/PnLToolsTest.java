package Prices;

public class PnLTools {
			public String priceDate_T3;
			public double openPrice_T3;
			public double highPrice_T3;
			public double lowPrice_T3;
			public double closePrice_T3;
			public String priceDate_T2;
			public double openPrice_T2;
			public double highPrice_T2;
			public double lowPrice_T2;
			public double closePrice_T2;
			public String priceDate_T1;
			public double openPrice_T1;
			public double highPrice_T1;
			public double lowPrice_T1;
			public double closePrice_T1;
			public String priceDate_T;
			public double openPrice_T;
			public double highPrice_T;
			public double lowPrice_T;
			public double closePrice_T;

		
 public PnLTools(String priceDate_T3, double openPrice_T3, double highPrice_T3,double lowPrice_T3,double closePrice_T3, String priceDate_T2, double openPrice_T2, double highPrice_T2,double lowPrice_T2,double closePrice_T2, String priceDate_T1, double openPrice_T1,double highPrice_T1,double lowPrice_T1,double closePrice_T1, String priceDate_T, double openPrice_T, double highPrice_T,double lowPrice_T,double closePrice_T)
		{
		this.priceDate_T = priceDate_T;
		this.openPrice_T = openPrice_T;
		this.highPrice_T = highPrice_T;
		this.lowPrice_T = lowPrice_T;
		this.closePrice_T = closePrice_T;
		this.priceDate_T1 = priceDate_T1;
		this.openPrice_T1 = openPrice_T1;
		this.highPrice_T1 = highPrice_T1;
		this.lowPrice_T1 = lowPrice_T1;
		this.closePrice_T1 = closePrice_T1;
		this.priceDate_T2 = priceDate_T2;
		this.openPrice_T2 = openPrice_T2;
		this.highPrice_T2 = highPrice_T2;
		this.lowPrice_T2 = lowPrice_T2;
		this.closePrice_T2 = closePrice_T2;
		this.priceDate_T3 = priceDate_T3;
		this.openPrice_T3 = openPrice_T3;
		this.highPrice_T3 = highPrice_T3;
		this.lowPrice_T3 = lowPrice_T3;
		this.closePrice_T3 = closePrice_T3;
		
		
		// Calculate P&L Dots
    	double priceAvg_T = ((highPrice_T + lowPrice_T + closePrice_T)/3);
    	double priceAvg_T1 = ((highPrice_T1 + lowPrice_T1 + closePrice_T1)/3);
    	double priceAvg_T2 = ((highPrice_T2 + lowPrice_T2 + closePrice_T2)/3);
    	double priceAvg_T3 = ((highPrice_T3 + lowPrice_T3 + closePrice_T3)/3);
    	double plDot_T = ((priceAvg_T+priceAvg_T1+priceAvg_T2)/3);
    	double plDot_T1 = ((priceAvg_T1+priceAvg_T2+priceAvg_T3)/3);
    	double $1_1_Dot = ((highPrice_T + lowPrice_T + closePrice_T)/3);

    	System.out.println("PLDot_T = "+plDot_T);
    	System.out.println("PLDot_T1 = "+plDot_T1);
    	System.out.println("$1_1_Dot = "+$1_1_Dot);
		
		//Calculate 5/1 Up, 5/2 Down, 5/3 Down
    	double $5_1_Up = (highPrice_T * 2) - highPrice_T1;
    	double $5_2_Down = (highPrice_T * 2) - highPrice_T1;
    	double $5_3_Down = (highPrice_T * 2) - highPrice_T1;

    	//Calculate 5/1 Down, 5/2 Up, 5/3 Up
    	double $5_1_Down = (lowPrice_T * 2) - lowPrice_T1;
    	double $5_2_Up = (lowPrice_T * 2) - lowPrice_T1;
    	double $5_3_Up = (lowPrice_T * 2) - lowPrice_T1;

    	//Calculate 5/9's 
    	double $5_9_Up = (lowPrice_T * 2) - highPrice_T1;
    	double $5_9_Down = (highPrice_T * 2) - lowPrice_T1;

    	//Calculate 6/1 Up, 6/5 Down, 6/7 Down
    	double $6_1_Up = (plDot_T * 2) - highPrice_T;
    	double $6_5_Down = (plDot_T * 2) - highPrice_T;
    	double $6_7_Down = (plDot_T * 2) - highPrice_T;
    	
    	//Calculate 6/1 Down, 6/5 Up, 6/7 Up
    	double $6_1_Down = (plDot_T * 2) - lowPrice_T;
    	double $6_5_Up = (plDot_T * 2) - lowPrice_T;
    	double $6_7_Up = (plDot_T * 2) - lowPrice_T;
    	
    	//Calculate 6/1 Down, 6/5 Up, 6/7 Up
    	double $6_2_Up = ((highPrice_T * 4) - (plDot_T1 *2) - highPrice_T);
    	double $6_4_Down = ((highPrice_T * 4) - (plDot_T1 *2) - highPrice_T);
    	double $6_6_Down = ((highPrice_T * 4) - (plDot_T1 *2) - highPrice_T);
    	
    	//Calculate 6/1 Up, 6/5 Down, 6/7 Down
    	double $6_2_Down = ((lowPrice_T * 4) - (plDot_T1 *2) - lowPrice_T);
    	double $6_4_Up = ((lowPrice_T * 4) - (plDot_T1 *2) - lowPrice_T);
    	double $6_6_Up = ((lowPrice_T * 4) - (plDot_T1 *2) - lowPrice_T);

    	//Calculate 1/1 High and 1/1 Low
    	double $1_1_High = (($1_1_Dot * 2) - lowPrice_T);
    	double $1_1_Low = (($1_1_Dot * 2) - highPrice_T);;
    	
    	//Calculate Main Channel Line
    	double mcLine = (plDot_T * 2) - plDot_T1;
   
    	//Calculate 5/2 Extensions
    	double $5_2_Up_Ext = ($5_2_Up *2) - lowPrice_T;
    	double $5_2_Down_Ext = ($5_2_Down *2) - highPrice_T; 	

    	//Define Boolean values for PL Dot analysis results
    	boolean PLDot_Momentum_Increasing;
    	boolean PLDot_Momentum_Decreasing;
    	boolean PLDot_Exhausting;
    	boolean Close_Above_PLDot;
    	boolean Close_Below_PLDot;
    	boolean Block_Level;
    	boolean Isolated_High;
    	boolean Isolate_Low;
    	
    	if (closePrice_T > plDot_T)
    		{
    		Close_Above_PLDot = true;
    		Close_Below_PLDot = false;
    		}
    	else
    		{
    		Close_Above_PLDot = false;
    		Close_Below_PLDot = true;
    		}
    	    
    	if (closePrice_T > plDot_T)
    		{
    		Close_Above_PLDot = true;
    		Close_Below_PLDot = false;
    		}
    	else
			{
    		Close_Above_PLDot = false;
    		Close_Below_PLDot = true;
			}
    	
    	//System.out.println("mcLine = "+mcLine);
    	//System.out.println("$1_1_Dot = "+$1_1_Dot);
    	//System.out.println("$1_1_Low = "+$1_1_Low);
    	//System.out.println("$1_1_High = "+$1_1_High);
    	//System.out.println("$5_1_Up = "+$5_1_Up);
    	//System.out.println("$5_1_Down = "+$5_1_Down);
    	//System.out.println("$5_3_Up = "+$5_3_Up);
    	//System.out.println("$5_3_Down = "+$5_3_Down);
    	//System.out.println("$5_9_Up = "+$5_9_Up);
    	//System.out.println("$5_9_Down = "+$5_9_Down);
    	//System.out.println("$5_2_Up = "+$5_2_Up);
    	//System.out.println("$5_2_Down = "+$5_2_Down);
    	//System.out.println("$5_2_Up_Ext = "+$5_2_Up_Ext);
    	//System.out.println("$5_2_Down_Ext = "+$5_2_Down_Ext);
    	//System.out.println("$6_1_Up = "+$6_1_Up); 	
    	//System.out.println("$6_1_Down = "+$6_1_Down);
    	//System.out.println("$6_2_Up = "+$6_2_Up);
    	//System.out.println("$6_2_Down = "+$6_2_Down);
    	//System.out.println("$6_4_Up = "+$6_4_Up);
    	//System.out.println("$6_4_Down = "+$6_4_Down);
    	//System.out.println("$6_5_Up = "+$6_5_Up);
    	//System.out.println("$6_5_Down = "+$6_5_Down);
    	//System.out.println("$6_6_Up = "+$6_6_Up);
    	//System.out.println("$6_6_Down = "+$6_6_Down);
    	//System.out.println("$6_7_Up = "+$6_7_Up);
    	//System.out.println("$6_7_Down = "+$6_7_Down);
    	//System.out.println("Close_Above_PLDot = "+Close_Above_PLDot);
    	//System.out.println("Close_Below_PLDot = "+Close_Below_PLDot);
		}

}
