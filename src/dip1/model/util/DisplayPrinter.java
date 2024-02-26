package dip1.model.util;

import dip1.model.ReportItem;
import dip1.model.ReportManager;

import java.util.List;

public class DisplayPrinter implements ReportManager {
    public void output(List<ReportItem> items) {
        System.out.println("Output to DISPLAY");
        for (ReportItem item : items) {
            System.out.format("display %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
