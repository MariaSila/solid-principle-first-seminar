package homework.util.impl;

import homework.Document;
import homework.util.Report;

public class DocumentReport implements Report {
    private Document document;

    public DocumentReport(Document document) {
        this.document = document;
    }

    @Override
    public void report(Object el) {
        System.out.println("Report for " + document.getClass().getSimpleName() + " : " + document.getName());
    }
}
