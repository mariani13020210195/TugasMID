//Mariani 13020210195

public class TestErr20195 {

    public static void main(String[] args) {
		int j = 0;
		int tot = 0;
		for(int i=0; i<10;i++) {
		tot += i;
		if(i<j) {
			System.out.println(i);
		}else
			System.out.println(j);
		do{
			j++;
			}while(j<10);
		}
		
	}
}