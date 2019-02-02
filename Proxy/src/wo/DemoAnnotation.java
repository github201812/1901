package wo;

import java.util.Arrays;

@AnnotationDemo12(color = "red" , value="jj",age={4,5,6})
public class DemoAnnotation {
	@AnnotationDemo12(value="kk",age={7,8,9})
	public static void main(String[]args){
		System.runFinalizersOnExit(true);
		if(DemoAnnotation.class.isAnnotationPresent(AnnotationDemo12.class)){
			AnnotationDemo12 a=DemoAnnotation.class.getAnnotation(AnnotationDemo12.class);
			System.out.println(a.color());
			System.out.println(Arrays.toString(a.age()));
			//System.out.println(a.annotationType());
		}
	}
}
