package Exercise1;

import javax.lang.model.element.Name;

public class Worker extends Officer {
    private int level;

    public Worker(String name, int age, String Address, String Gender, int level) {
        super(name, age, Address, Gender);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "level=" + level +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}
