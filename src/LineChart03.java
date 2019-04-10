package PetWeight;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;

public class LineChart03 implements ExampleChart<XYChart> {
	 
	  public static void main(String[] args) {
	 
	    ExampleChart<XYChart> exampleChart = new LineChart03();
	    XYChart chart = exampleChart.getChart();
	    new SwingWrapper<XYChart>(chart).displayChart();
	  }
	 
	  @Override
	  public XYChart getChart() {
	 
	    // Create Chart
	    XYChart chart = new XYChartBuilder().width(800).height(600).title("LineChart03").xAxisTitle("X").yAxisTitle("Y").build();
	 
	    // Customize Chart

	    chart.getStyler().setDatePattern("dd-MMM");
	    chart.getStyler().setDecimalPattern("#0.000");

	 
	    // generates linear data
	    List<Date> xData = new ArrayList<Date>();
	    List<Double> yData = new ArrayList<Double>();
	 
	    DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
	    Date date = null;
	    for (int i = 1; i <= 10; i++) {
	 
	      try {
	        date = sdf.parse(i + ".10.2008");
	      } catch (ParseException e) {
	        e.printStackTrace();
	      }
	      xData.add(date);
	      yData.add(Math.random() * i);
	    }
	 
	    // Series
	    XYSeries series = chart.addSeries("Fake Data", xData, yData);

	 
	    return chart;
	  }
	}