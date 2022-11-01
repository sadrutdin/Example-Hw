package sandro;

public class PeopleDto {
    private final int id;
    private final String name;

    public PeopleDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PeopleDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
