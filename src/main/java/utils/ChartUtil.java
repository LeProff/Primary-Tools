package utils;

import objects.charts.PieChartData;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.util.ArrayList;

public class ChartUtil {

    public static ChartFrame makePieChart(String title, ArrayList<PieChartData> values) {
        DefaultPieDataset data = new DefaultPieDataset();
        for (PieChartData p : values) {
            data.setValue(p.getName(), p.getValue());
        }
        JFreeChart chart = ChartFactory.createPieChart(title, data, true, true, true);
        ChartFrame frame = new ChartFrame(title, chart);
        frame.pack();
        return frame;
    }
}
