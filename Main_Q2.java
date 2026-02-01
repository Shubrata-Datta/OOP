import java.util.ArrayList;
class DataStore<T extends Number>{
	private ArrayList<T> values=new ArrayList<>();
	void addValue(T value){
		values.add(value);
		
	}
	double calculateAverage(){
		double sum=0;
		for(T value: values){
			sum+=value.doubleValue();
		}
		return sum/values.size();
	}
	
}
public class Main_Q2{
	public static void main(String[] args){
		DataStore<Integer> marks=new DataStore<>();
		marks.addValue(80);
		marks.addValue(90);
		
		DataStore<Double> cgpa=new DataStore<>();
		cgpa.addValue(3.5);
		cgpa.addValue(3.8);
		System.out.println("Average Marks:" +marks.calculateAverage());
		System.out.println("Average Cgpa:"+cgpa.calculateAverage());
	}
}