import java.time.LocalDate;

public class date2 {
	protected int age;
	protected String name;
	protected String sex;
	protected String date;

	public date2(int age, String name, String sex, String date) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
		this.date = date;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(char sex) {
		if (sex == 'M') {
			this.sex = "male";
		} else if (sex == 'F') {
			this.sex = "female";
		} else {
			this.sex = "não identificado";
		}
	}

	public String getDate() {
		return date;
	}

	public void setDate(LocalDate data) {
		this.date = data.toString();
	}

	public String lista() {
		return "nome : " + name + " idade : " + age + " \nsexo : " + sex + " Data de nascimento : " + date;

	}

}
