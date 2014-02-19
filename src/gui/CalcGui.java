package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcGui extends JFrame{
	
	
	final int WINDOWX = 420;
	final int WINDOWY = 320;
	
	CalcGui(){
		setBounds(50,50,WINDOWX,WINDOWY);
		
		
		
	}
	
	
	public static void main(String args[]){
		CalcGui cg = new CalcGui();
		cg.setTitle("Nishant's Calculator");
		cg.setVisible(true);
        cg.setResizable(false);
        cg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
