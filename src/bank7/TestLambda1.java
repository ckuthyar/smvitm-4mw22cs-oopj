package bank7;
import java.util.stream.IntStream;
public class TestLambda1 {

	public static void main(String[] args) {
		IntStream.iterate(1,i->i<10,i->i+1).filter(i->i%2==0).forEach(result->System.out.printf("% d",result));
		IntStream.iterate('A',i->i<='J',i->i+1).map(Character::toLowerCase).forEach(result->System.out.printf("%c",result));

	}
	

}
