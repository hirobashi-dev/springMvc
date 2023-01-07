package hbs.bean;

public class Chengji {
	int STUDENT_ID;
	String SUBJECT;
	int SCORE;

	public Chengji(int sTUDENT_ID, String sUBJECT, int sCORE) {
		STUDENT_ID = sTUDENT_ID;
		SUBJECT = sUBJECT;
		SCORE = sCORE;
	}
	public Chengji() {
	}
	public int getSTUDENT_ID() {
		return STUDENT_ID;
	}
	public void setSTUDENT_ID(int sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
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
	@Override
	public String toString() {
		return "Exresult [STUDENT_ID=" + STUDENT_ID + ", SUBJECT=" + SUBJECT + ", SCORE=" + SCORE + "]";
	}


}
