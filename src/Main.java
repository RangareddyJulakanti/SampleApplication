import com.jpmc.employee.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee ranga  =    new Employee();




        
        ranga.setId("10");
        ranga.setName("RangaReddy");
        ranga.setSalary(1000000.50);

        System.out.println(System.identityHashCode(ranga));
        ranga.organization="JPMC";

        System.out.println(ranga.getId());
        System.out.println(ranga.getName());
        System.out.println(ranga.getSalary());
        System.out.println(ranga.organization);

        Employee sai  =    new Employee();
        System.out.println(System.identityHashCode(sai));
        sai.setId("10");
        sai.setName("Sai");
        sai.setSalary(1000000.50);
        sai.organization="Welsfago";
        System.out.println(sai.getId());
        System.out.println(sai.getName());
        System.out.println(sai.getSalary());
        System.out.println(sai.organization);
        System.out.println(ranga.organization);




    }
}
