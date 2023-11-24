package chapter9;

public class Employee extends Person{
    private String id;
    private String title;

    public Employee(){
        super("Amr");
        System.out.println("The is Employee constructor");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
