class SortNumbers{
	public static void main(String args[]){
	
	int array[]=new int[args.length];
	for(int i=0;i<args.length;i++){
		array[i]=Integer.parseInt(args[i]);
		
		}	
		SortNumbers s=new SortNumbers();
		s.bubblesort(array);
		
	}
	public void bubblesort(int [] ar){
		for(int i=1;i<ar.length;i++){
			for(int j=0;j<ar.length-1;j++){
			if(ar[j]>ar[j+1]){
				int temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
				}
				
			}
		}
		System.out.println("sorted numbers are as follows");
		for(int i=0;i<ar.length;i++){
		System.out.println(ar[i]);
		}
	}
		
}