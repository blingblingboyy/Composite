package principal;

import java.util.List;
import java.util.ArrayList;

public class EmployeeComposite implements EmployeeComponent {

    private String name;
    private String depto;
    private List<EmployeeComponent> subordinates = new ArrayList<>();

    public EmployeeComposite(String name, String depto) {
        this.name = name;
        this.depto = depto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public void add(EmployeeComponent component) {
        subordinates.add(component);

    }

    public void remove(EmployeeComponent component) {
        subordinates.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Name:" + getName() + " /Depto: " + getDepto());
        for (EmployeeComponent employee : subordinates) {
            employee.showDetails();
        }
    }

    @Override
    public int getSubordinateCount() {
        int count = 0;
        for (EmployeeComponent employee : subordinates) {
            count = count + employee.getSubordinateCount();
        }
        return count;
    }

    @Override
    public int getEmployeeCount() {
        int count = 1;
        for (EmployeeComponent employee : subordinates) {
            count = count + employee.getEmployeeCount();
        }
        return count;
    }
}
