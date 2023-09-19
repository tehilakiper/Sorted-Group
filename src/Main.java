import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) { 
		
	
		SortedGroup <Student> sGroup = new SortedGroup <Student> ();
		
		
		Student s1 = new Student (31075, 90, "Tod");
		
		Student s2 = new Student (20723, 60, "Ted");
		
		Student s3 = new Student (15023, 80, "Tud");
		
		/*System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		*/
		sGroup.add(s1);
		sGroup.add(s2);
		sGroup.add(s3);
		
		/*for( int i = 0; i < sGroup.size(); i++) {
			
			System.out.println(sGroup.get(i).toString()+"\n");
		}
		*/
		//sGroup.remove(s1);
		//reduce(sGroup, s2);
		
	/*	for( int i = 0; i < sGroup.size(); i++) {
		
			System.out.println(sGroup.get(i).toString()+"\n");
		}
		*/
		
		System.out.println("" + sGroup.toString()+" \n"+ reduce(sGroup, s3).toString()  );
	}

	public static <T extends Comparable<T>> SortedGroup<T> reduce(SortedGroup<T> sGroup, T x) {
        SortedGroup<T> result = new SortedGroup<>();
       // ArrayList<T> elements = sGroup.elements;
        int startIndex = 0;
        int endIndex = sGroup.size() - 1;
        for(int i = 0; i < sGroup.size(); i++) {
            
            
            if (sGroup.get(i).compareTo(x) > 0) {
                result.add(sGroup.get(i));           
        
            }
        }
            return result;
        }
}


