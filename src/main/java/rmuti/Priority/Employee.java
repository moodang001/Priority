package rmuti.Priority;

public class Employee implements Comparable {
	private String empId;
    private String name;
    private int salary;
	
    public Employee(String empId, String name, int salary) {
    	this.empId = empId;
    	this.name = name;
    	this.salary = salary;
    }
    @Override
    public String toString() {
    	return "{empid = "+empId+", name ="+name+", salary ="+salary+"}";
    }
    public int compareTo(Object o) {
    	Employee otherEmp = (Employee) o;
    	if (this.salary > otherEmp.salary) {
    		return 1;
    	} else if (this.salary < otherEmp.salary) {
    		return -1;
    	}
    	return 0;
    }
}
