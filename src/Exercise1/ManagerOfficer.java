package Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerOfficer {

    private List<Officer> officers;

    public ManagerOfficer() {
        this.officers = new ArrayList<>();
    }

    public void AddNewOfficer(Officer officer) {
        this.officers.add(officer);
    }

    public List<Officer> FindByName(String Name) {
        return this.officers.stream().filter(o -> o.getName().contains(Name))
                .collect(Collectors.toList());
    }

    public void FindByInfo() {
        this.officers.forEach(o -> System.out.println(o.toString()));
    }
}
