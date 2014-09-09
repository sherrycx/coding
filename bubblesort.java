
public class bubblesort {
	
	 public static int[] sort(int[] res){
		 
		 for(int i=0;i<res.length;i++){
			 
			 for(int j=1;j<res.length-i;j++){
				 
				 if(res[j-1]>res[j]){
					 int tmp = res[j];
					 res[j] = res[j-1];
					 res[j-1] = tmp;
				 }
				 
				 
			 }
		 }
		 
		 return res;
		 
	 }
	 
	 public static void main(String[] args){
		 
		 int[] ori = {1,5,7,3,2,8,4};
		 sort(ori);
		 
		 System.out.println(ori);
		 return;
	 }

}
