package kiosk;

public class Menu {
    private String name;
    private  String description;
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return getName() + " | " + getDescription();
    }
}
