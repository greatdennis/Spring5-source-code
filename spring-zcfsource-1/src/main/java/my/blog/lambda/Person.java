package my.blog.lambda;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/20
 */
public class Person {
	private String name;
	private Integer age;
	private Double salary;

	public Person() {
	}

	public Person(String name, Integer age, Double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", salary=" + salary +
				'}';
	}
}
