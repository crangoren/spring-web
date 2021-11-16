package R.K.Suleimanov.springweb.model;

public class Student {
    private Long id;
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
