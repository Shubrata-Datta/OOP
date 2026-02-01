class Course{
	double calculateFee(){
		return 0;
	}
}
class OnlineCourse extends Course{
	@Override
	double calculateFee(){
		return 5000;
	} 
}
class OfflineCourse extends Course{
	@Override
	double calculateFee(){
		return 10000;
	}
}
public class Main_Q1{
	public static void main(String[] args){
		Course[] courses=new Course[2];
		courses[0]=new OnlineCourse();
		courses[1]=new OfflineCourse();
		for(Course c: courses){
			System.out.println("Course Fee:"+c.calculateFee());
		}
	}
}