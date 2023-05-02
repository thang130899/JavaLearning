package Exercise1;

public class Engineer extends Officer {
    private String Major;

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        this.Major = major;
    }

    public Engineer(String Name, int age, String Address, String Gender, String Major) {
        super(Name, age, Address, Gender);
        this.Major = Major;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", Major=" + getMajor() +
                '}';
    }
}
