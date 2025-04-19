import java.util.*;


class Employee{
    private String name;
    private String department;

    Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

public class GroupObjects {
    public static void main(String[] args) {
        Employee bob = new Employee("Bob", "IT");
        Employee peter = new Employee("Peter", "IT");
        Employee rick = new Employee("Rick", "HR");
        Employee morty = new Employee("Morty", "Sales");
        Employee james = new Employee("James", "IT");
        Employee jack = new Employee("Jack", "Sales");


        ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(bob,peter,rick,morty,james,jack)); 
        Map<String,ArrayList<String>> map = new HashMap<>();new ArrayList<String>();
        for(Employee emp: empList){
            if(map.containsKey(emp.getDepartment())){
                map.get(emp.getDepartment()).add(emp.getName());
            }
            else{
                map.put(emp.getDepartment(),new ArrayList<String>());
                map.get(emp.getDepartment()).add(emp.getName());
            }
        }

        System.out.println(map);
    }
}