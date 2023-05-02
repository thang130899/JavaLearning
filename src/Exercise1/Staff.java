package Exercise1;

public class Staff extends Officer {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Staff(String Name, int age, String Address, String Gender, String job) {
        super(Name, age, Address, Gender);
        this.job = job;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", job=" + getJob() +
                '}';
    }
}
