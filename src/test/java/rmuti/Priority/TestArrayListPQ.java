package rmuti.Priority;

public class TestArrayListPQ {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("001","name1",20_000);
		Employee emp2 = new Employee("002","name2",30_000);
		Employee emp3 = new Employee("003","name3",15_000);
		
		ArrayListPQ arrayListPQ = new ArrayListPQ();
		arrayListPQ.enqueue(emp1);
		arrayListPQ.enqueue(emp2);
		arrayListPQ.enqueue(emp3);
		
		System.out.println(arrayListPQ);
			
	    arrayListPQ.dequeue();
		System.out.println(arrayListPQ);
		
		arrayListPQ.dequeue();
		System.out.println(arrayListPQ);
		
		arrayListPQ.enqueue(new Employee("004","name4",40_000));
		System.out.println(arrayListPQ);
			
		
	}
}

  
