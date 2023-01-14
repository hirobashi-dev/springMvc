package hbs.bean;

public class ChengjiImpl {
	private int student_id;//学生id
	private String  name;//学生名前
	private String subject;//学科
	private int score;//成績
	public ChengjiImpl(int student_id, String name, String subject, int score) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	public ChengjiImpl() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "ChengjiImpl [student_id=" + student_id + ", name=" + name + ", subject=" + subject + ", score=" + score
				+ "]";
	}


}
