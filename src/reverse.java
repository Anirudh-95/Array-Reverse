
public class reverse {

	public static void main(String[] args) {
		int [] arr=new int[5];
		
		for(int i=0;i<5;i++){
			System.out.println("Enter a number");
			arr[i]=IO.readInt();
		}	
		array(arr);
	}
		
	    public static void array(int arr[]){
			int[] narr=new int[5];
			int j=0;
			for(int i=4;i>=0;i--){
				narr[j]=arr[i];
					System.out.println(narr[j]);
					j++;
				}	
	}
}

