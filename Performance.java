import java.util.*;
class Performer {
	void perform(){
		System.out.println("Everyone is performing");
	}
}
class Singer extends Performer{
	@Override
	void perform(){
		System.out.println("Singer sings a song");
	}
}
class Dancer extends Performer{
	@Override
	void perform(){
		System.out.println("Dancer is dancing");
		
	}
}
class Magician extends Performer{
	@Override
	void perform(){
		System.out.println("Magician is performing");
	}
}
public class Performance{
	public static void main(String[] args){
		List<Performer> performers=new ArrayList<>();
		performers.add(new Singer());
		performers.add(new Dancer());
		performers.add(new Magician());
		for (Performer p : performers){
			p.perform();
		}
		
		
	}
} 
