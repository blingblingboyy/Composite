package principal;

public class EmployeeLeaf implements EmployeeComponent {

    private String name;
    private String depto;

    public EmployeeLeaf(String name, String depto) {
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

    @Override
    public void showDetails() {
        System.out.println("Nome: " + getName() + " /Depto: " + getDepto());
    }

    @Override
    public int getSubordinateCount() {
        return 1;
    }

    @Override
    public int getEmployeeCount() {
        return 1;
    }

}
