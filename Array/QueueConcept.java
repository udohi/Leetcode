import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueConcept {
public static void main(String[]args){
        // if the arguments(e1, e2) are in the same order as the statement(e1-e2), then the lowest value becomes the value of the highest priority.
        // if the arguments(e1, e2) are in the opposite order as the statement(e2-e1), then the highest value becomes the value of the highest priority.
        PriorityQueue<Employee>pr=new PriorityQueue<>((Employee e1,Employee e2)->
            e1.salary-e2.salary
        );
        pr.add(new Employee("A",300));
        pr.add(new Employee("B",200));
        pr.add(new Employee("C",4000));
        pr.add(new Employee("D",50));
        pr.add(new Employee("E",10));
        pr.add(new Employee("F",3500));
        pr.add(new Employee("G",50000));
        System.out.println(pr.poll());
}

} 

class Employee{
    String name;
    int salary;
    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString(){
        return"Employee[name="+name+",salary="+salary+"1";
    }
}

class EmpComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee el,Employee e2){
        return el.salary-e2.salary;
    }
}