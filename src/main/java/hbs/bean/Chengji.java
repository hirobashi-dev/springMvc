package hbs.bean;

import lombok.Data;

@Data
public class Chengji {
	private int student_id;
	private String subject;
	private int score;

	public Chengji() {
	}
	public Chengji(int student_id, String subject, int score) {
		this.student_id = student_id;
		this.subject = subject;
		this.score = score;
	}

}
