package PetWeight;

import java.io.File;
import java.util.Scanner;

import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;



public class xchart_test {
	  public static void main(String[] args) throws Exception {
		  
		  final Scanner lukija = new Scanner(new File("C:\\Users\\Eve\\Documents\\TurkuAMK\\Ohjelmoinnin perusteet toisto\\PetWeight\\dates.txt"));
			double rivi = 0;
			double[] xData = new double[5];
			//double[] yData = new double[] {};
			int i = 0;
			while (lukija.hasNext() ) {
				rivi = lukija.nextDouble();
				xData[i] = rivi;
				i++;
			}//while
			lukija.close();

		    //double[] xData = new double[] { 20190401,20190402,20190403,20190404,20190405}; //Time axis
		    double[] yData = new double[] { 10,20,30,40,50 }; //Value axis
		 
		    // Create Chart
		    XYChart chart = QuickChart.getChart("Sample Chart", "X", "Y", "y(x)", xData, yData);
		 
		    // Show it
		    new SwingWrapper(chart).displayChart();
		 
		  }

	private static double[] appendValue(double[] rivit, double rivi) {
		// TODO Auto-generated method stub
		return null;
	}
	  }
