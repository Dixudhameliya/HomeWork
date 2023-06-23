package ObjectOriented;

public class First {

	public static void main(String[] args) {
		
		Student s1=new Student("john",11,94,96,98);
		Student s2=new Student("john",11,94,96,98);
		/*Student s2=new Student("simth",12,95,98,99);
		Student s3=new Student("darek",13,96,96,94);*/
		
		Student students[]=new Student[] {s1,s2};
		System.out.println(s1.toString());
		
		if(s1.equals(s2)) {
			System.out.println("both are equal");
		}else {
		   System.out.println("both are not equal");
		}
		
		
		/*s1.setMaths(100);
		
		for(Student student:students) {
		
		System.out.println("-------");
		System.out.println("Student name:"+student.getName());
		System.out.println("Student rollno:"+student.getRollno());
		System.out.println("Student maths marks:"+student.getMaths());
		System.out.println("Student english marks:"+student.getEnglish());
		System.out.println("Student science marks:"+student.getScience());
	}*/

}
}