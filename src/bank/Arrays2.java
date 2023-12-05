package bank;
//@Kuthyar
//Create union of 2 arrays(arr1, arr2) into 1 array(arr3)
//Create intersection of 2 arrays(arr1, arr2) into 1 array(arr4)
public class Arrays2 {
	public static void union(int[]arr1,int[]arr2) {
		System.out.print("Union - ");
		int len1=arr1.length;
		int len2=arr2.length;
		int len3=len1+len2;
		int[]arr3= new int[len3];
			
		for(int i=0;i<len1;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<len2;i++) {
			arr3[i+len1]=arr2[i];
		}
		for(int i=0;i<len3;i++) {
			System.out.print(arr3[i]+" ");
		}
	}
	public static void intersection(int[]arr1, int[]arr2) {
		System.out.print("Intersection - ");
		int len1=arr1.length;
		int len2=arr2.length;
		int len3=len1+len2;
		int[]arr4=new int[len1+len2];
		
		int count=0;
		for(int i=0;i<len1;i++) {
			for(int j=0;j<len2;j++) {
				if(arr1[i]==arr2[j]) {
					arr4[count]=arr2[j];
					count++;
				}
			}
		}
		for(int i=0;i<count;i++) {
			System.out.print(arr4[i]+ " ");
		}
	}
	public static void main(String[] args) {
		int[] arr1= {1,4,9,16,25,36,49,64,81,100};
		int[] arr2= {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,100};
		
		union(arr1,arr2);
		System.out.println();
		
		intersection(arr1,arr2);
		System.out.println();
		
		

	}

}
