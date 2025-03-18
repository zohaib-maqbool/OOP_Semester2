public class Demo{

	public static void main(String args[]){

//		Employe employe= new Employe("Ahmad Akbar","CEO");
//		System.out.println(employe.toString());

//		SystemUnit SystemUnit=new SystemUnit("CPU-07",8192,150,"core-i7 8th Gen","Lenovo ThinkVision LP-07");
//		System.out.println(SystemUnit.toString());

		Employee employee;
		SystemUnit systemUnit;
		Lab lab=new Lab("CUI Lab",new Employee("Ahmad","CEO"),new SystemUnit("CPU-07",8192,150,"core i7 8th","Lenovo"),true);
		System.out.println(lab.toString());


		
	}
}
