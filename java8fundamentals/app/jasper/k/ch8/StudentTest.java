package jasper.k.ch8;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("홍길동");
		s.setClassroom(1);
		s.setNum(1);
		s.setKor(100);
		s.setEng(60);
		s.setMath(76);
		
		System.out.println("name :"+s.getName());
		System.out.println("Tota :"+s.getTotal());
		System.out.println("Average :"+s.getAverage());
	}

}
