import java.util.ArrayList;

public class Student implements Comparable <Student>{

	private String name;
	private int grad;
	private int ID;
	
	public Student(int ID, int grad, String name) {
		if(grad <= 100 || grad >= 0)
			this.grad = grad;
		else
			System.out.println("grad must be between 0 to 100");
		
		this.ID = ID;
		
		this.name = name;
		
	}
	public <E extends Comparable <E>> void reduce(SortedGroup sGroup, E x) {
		
		int i;
		
		for( i = 0; i < sGroup.size(); i++) {
			
			if( ( sGroup.get(i)).compareTo(x) <= 0) {
		
				 sGroup.remove(i);
			
			}
			
		}
		
	}
	
	public String toString() {
		
		return name +" "+ ID +" " + grad;
	}
	
	
	
	public int compareTo(Student other) {
		
		if(this.grad > other.grad)
			
			return 1;
		
		if(this.grad < other.grad)
			
			return -1;
			
		
		return 0;
	}
}
