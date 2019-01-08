import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

//@FunctionalInterface
class Student {// implements Comparable{
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public String toString() {
		return "{id: " + id + ", name: " + name + "}";
	}
	/*
	 * @Override public int compareTo(Object o) { Student s=(Student)o; int i=0;
	 * if(this.id<s.id)i= -1; if(this.id>s.id) i=1; if(this.id==s.id) i=0; return i;
	 * }
	 */}

public class DemoClass {

	public static void main(String[] args) {
		Interf i = (a, b) -> {
			System.out.println("Sum: " + (a + b));
			System.out.println("Sub: " + (a - b));
			System.out.println("Mul: " + (a * b));
			
			System.out.println("Sum: " + (a + b));
			System.out.println("Sub: " + (a - b));
			System.out.println("Mul: " + (a * b));
			System.out.println("Sum: " + (a + b));
			System.out.println("Sub: " + (a - b));
			System.out.println("Mul: " + (a * b));
		};
		i.m1(10, 20);

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(3, "vijay3"));
		al.add(new Student(5, "vijay5"));
		al.add(new Student(1, "vijay1"));
		al.add(new Student(2, "vijay2"));
		al.add(new Student(4, "vijay4"));
		// new ArrayList<Student>()
		ArrayList<Student> l1 = (ArrayList<Student>) al.stream().filter(Student -> Student.getId() % 2 == 0)
				.collect(Collectors.toList()); // new ArrayList<Student>()
		// System.out.println(al);
		System.out.println(l1);

		Comparator<Student> com = (s,s1) -> {
										//Student s = (Student) o;
										//Student s1 = (Student) o1;
										int val = 0;
										if (s1.id < s.id)
											val = 1;
										if (s1.id > s.id)
											val = -1;
										if (s1.id == s.id)
											val = 0;
										return val;
									};

		System.out.println("Before Sort: "+al);
		al.sort(com);
		System.out.println("After Sort: "+al);
		Function<Student,Integer> f = student -> student.getId();
		System.out.println(f);
	}

}
