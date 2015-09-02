package jasper.k.ch8;

public class Student {
		private String name;
		private int classroom;
		private int num;
		private int kor;
		private int eng;
		private int math;
		private int total;
		private float average;
		
		public float getAverage() {
			average = (float)Math.round(((float)total/3*10))/10;
			return average;
		}
		public void setAverage(float average) {
			this.average = average;
		}
		public int getTotal() {
			total = kor + eng + math;
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getClassroom() {
			return classroom;
		}
		public void setClassroom(int classroom) {
			this.classroom = classroom;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
		}
	
	
}
