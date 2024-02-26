package homework;


import homework.extend.LecturerUser;
import homework.extend.StudentUser;
import homework.util.impl.DocumentReport;
import homework.util.impl.UserReport;

public class Main{
    public static void main(String[] args){
        User lector = new LecturerUser("Bob");
        UserReport reportLector = new UserReport(lector);
        reportLector.report(lector);
        lector.save();

        User student = new StudentUser("Maks");
        UserReport reportStudent = new UserReport(student);
        reportStudent.report(student);
        student.save();

        Document document = new Document("Outline");
        DocumentReport documentReport= new DocumentReport(document);
        documentReport.report(document);
        document.save();


        //report(user);
        //user.save();

    }

}