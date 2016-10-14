class Table{
	public static void main(String args[]){
		
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num = Integer.parseInt(args[0]);
		Table t=new Table();
		t.calculate(num);
		}
		
		public void calculate(int n){
			int arr[]=new int[10];
			for(int i=1;i<arr.length+1;i++)
				System.out.println(n * i);
			}
}