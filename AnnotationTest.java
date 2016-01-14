import java.util.ArrayList;
import java.util.List;

public class AnnotationTest extends HeadClass{
	
	@Override 
	@MyAnnotation(title="Title", version=3, text="sometext")
	public void doWork(){
		System.out.println("I doin work");
	}
	@Deprecated
	@MyAnnotation(title="Title", version=3, text="sometext")
	public void printResult() {
		System.out.println("Print result");
	}
	
	@SuppressWarnings("unchecked")
	@MyAnnotation(title="Title", version=3, text="sometext")
	public void test(){
		List words = new ArrayList();
		words.add("hello");
	}
}
