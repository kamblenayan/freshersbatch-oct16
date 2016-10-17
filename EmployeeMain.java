public class EmployeeMain{
	public static void main(String args[]) throws Exception{
		Employee e[]=new Employee[5];
		e[0]=new Labor(1,"raj",400,100);
		e[1]=new Manager(2,"jay",500,200);
		
		
	for(int i=0;i<e.length;i++){
		System.out.println(" "+e[i].getSalary());
	}
			
	}
}


class Employee{
	private int no;
	private String name;
	private int salary;
	
	public Employee(int no,String name,int salary){
		this.no=no;
		this.name=name;
		this.salary=salary;
	}
	
	public int getSalary()	{
		 return this.salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNo(){
		 return this.no;
	}
	
	public void setSal(int salary){
		this.salary=salary;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setNo(int no){
		this.no=no;
	}
	
}


class Labor extends Employee{
	private int overtime;
	
	public Labor(int no,String name,int salary,int overtime)
	{
		super(no,name,salary);
		this.overtime=overtime;;
	}
	
	public int getSalary(){
		return super.getSalary()+this.overtime;
	}
}

class Manager extends Employee{
	private int incentive;
	
	public Manager(int no,String name,int salary,int incentive)
	{
		super(no,name,salary);
		this.incentive=incentive;;
	}
	
	public  int  getSalary(){
		return super.getSalary()+this.incentive;
	}
}

