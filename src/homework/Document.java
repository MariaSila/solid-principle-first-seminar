package homework;

import homework.util.Persister;

public class Document implements Persister {
    private final String name;

    public Document(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void save() {
        System.out.println("Save document: " + name);
    }
}
