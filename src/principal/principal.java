package principal;

public class principal {

    public static void main(String[] args) {

        EmployeeComposite CEO = new EmployeeComposite("Rich", "CEO");

        EmployeeComposite managerSales = new EmployeeComposite("Joao", "Gerente de Vendas");
        EmployeeComposite managerMarketing = new EmployeeComposite("Maria", "Gerente de Marketing");
        CEO.add(managerSales);
        CEO.add(managerMarketing);

        EmployeeLeaf emp1 = new EmployeeLeaf("Jose", "Vendas");
        EmployeeLeaf emp2 = new EmployeeLeaf("Pedro", "Vendas");
        managerSales.add(emp1);
        managerSales.add(emp2);

        EmployeeLeaf emp3 = new EmployeeLeaf("Huguinho", "Marketing");
        EmployeeLeaf emp4 = new EmployeeLeaf("Zezinho", "Marketing");
        managerMarketing.add(emp3);
        managerMarketing.add(emp4);

        CEO.showDetails();
        System.out.println("Contagem de Subordinados: " + CEO.getSubordinateCount());
        System.out.println("Contagem de Funcionário: " + CEO.getEmployeeCount());
    }

}
