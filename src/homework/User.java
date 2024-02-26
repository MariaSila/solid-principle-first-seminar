package homework;

import homework.util.Persister;

public class User implements Persister {
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void save() {
        System.out.println("Save user: " + name);
    }


/*    public void save(){
        Persister persister = new Persister(this);
        persister.save();
    }*/


}
