package anna.p.exercise.ch6;

public class Student2 {
	private String name;
	private int classRoom;
	private int number;
	private int korScore;
	private int engScore;
	private int mathScore;
	
	public Student2() { }
	
	public Student2(String name, int classRoom, int number, int korScore, int engScore, int mathScore) {
		this.name = name;
		this.classRoom = classRoom;
		this.number = number;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getTotal() {
		return this.engScore + this.korScore + this.mathScore;
	}
	public float getAverage() {
		float average = (float)Math.round(((float)getTotal() / 3) * 10) / 10;
		return average;
	}
	public String info() {
		return getName() + "," + getClassRoom() + "," + getNumber() + "," + getKorScore() + "," + 
				getEngScore() + "," + getMathScore() + "," + getTotal() + "," + getAverage();
	}
}
