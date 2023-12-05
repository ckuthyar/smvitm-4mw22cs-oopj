package bank;

public class CoderToday {
	public static int[] pickB(int[] random1, int[] random2) {
		int count=0;
		for(int i=0;i<30;i++) {
			if(random1[i]>=70) {
				random2[count]=random1[i];
				count++;
			}else {
				random2[count]=100+random1[i%37];
			}
		}
		System.out.println("Coders selected for today are: ");
		for(int i=0; i<4;i++) {
			System.out.println("4MW22CS"+random2[i]);
		}
		return random2;
	}
	public static int[] pickA(int[] random1, int[] random2) {
		int count=0;
		for(int i=0;i<30;i++) {
			if(random1[i]<70) {
				random2[count]=random1[i];
				count++;
			}
		}
		System.out.println("Coders selected for today are: ");
		for(int i=0; i<4;i++) {
			System.out.println("4MW22CS"+random2[i]);
		}
		return random2;
	}

	public static void main(String[] args) {
		int[] sectionA= {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,42,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69};
		int[] sectionB= {70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137};
		int[] random1= new int[30];
		int[] random2= new int[30];
		int count=0;
		for(int i=0;i<30;i++) {
		    random1[i]=(int)(Math.random()*100);
		    //System.out.println(random1[i]);
		}
		//pickA(random1, random2);
		pickB(random1, random2);		
		
	

	}

}
