package homework.util.impl;


import homework.User;
import homework.util.Report;

public class UserReport<T> implements Report<T> {
   private User user;

    public UserReport(User user) {
        this.user = user;
    }

    @Override
    public void report(Object el) {
        System.out.println("Report for " + user.getClass().getSimpleName() + " : " + user.getName());
    }
}
