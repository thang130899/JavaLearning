package Exercise1;

public class Officer {
    private String name, Address, Gender;
    private int age;

    public Officer(String name, int age, String Address, String Gender) {
        this.name = name;
        this.age = age;
        this.Address = Address;
        this.Gender = Gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
}
