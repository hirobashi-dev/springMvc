package hbs.bean;

public class Student {

	private int id;
	private String name ;
	private String gende ;
	private int age ;
	private String jyusyo;


	public Student() {
	}
	public Student(int id, String name, String gende, int age, String jyusyo) {
		this.id = id;
		this.name = name;
		this.gende = gende;
		this.age = age;
		this.jyusyo = jyusyo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGende() {
		return gende;
	}
	public void setGende(String gende) {
		this.gende = gende;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJyusyo() {
		return jyusyo;
	}
	public void setJyusyo(String jyusyo) {
		this.jyusyo = jyusyo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gende=" + gende + ", age=" + age + ", jyusyo=" + jyusyo
				+ "]";
	}


}
