public class Person{

	String name;
	String role;
	Address address;

	public Person(String name,String role,Address address){
		this.name=name;
		this.role=role;
		this.address=address;
	}

	public Person(Person other){
		this.name=other.name;
		this.role=other.role;
		this.address=other.address;
	}

	public void showDetails(){
		System.out.println( "Name: " + name + " Role: " + role + " Address: " + address);
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getRole(){
		return role;
	}



}