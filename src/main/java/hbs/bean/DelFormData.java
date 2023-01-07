package hbs.bean;

public class DelFormData {
	private int STUDENT_ID;//学生ID
	private String  NAME;//学生名前
	private String SUBJECT;//学科
	private int SCORE;//成績
	private String check;//index
	public DelFormData(int sTUDENT_ID, String nAME, String sUBJECT, int sCORE, String check) {
		super();
		STUDENT_ID = sTUDENT_ID;
		NAME = nAME;
		SUBJECT = sUBJECT;
		SCORE = sCORE;
		this.check = check;
	}
	public DelFormData() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public int getSTUDENT_ID() {
		return STUDENT_ID;
	}
	public void setSTUDENT_ID(int sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getSUBJECT() {
		return SUBJECT;
	}
	public void setSUBJECT(String sUBJECT) {
		SUBJECT = sUBJECT;
	}
	public int getSCORE() {
		return SCORE;
	}
	public void setSCORE(int sCORE) {
		SCORE = sCORE;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	@Override
	public String toString() {
		return "DelFormData [STUDENT_ID=" + STUDENT_ID + ", NAME=" + NAME + ", SUBJECT=" + SUBJECT + ", SCORE=" + SCORE
				+ ", check=" + check + "]";
	}

}
