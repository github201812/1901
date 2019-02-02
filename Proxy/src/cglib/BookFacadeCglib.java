package cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class BookFacadeCglib implements MethodInterceptor{
	private Object target;
	
	public Object getInstance(Object target){
		this.target=target;
		Enhancer enhancer = new Enhancer();
	    enhancer.setSuperclass(this.target.getClass());  
	    enhancer.setCallback(this); 
       return enhancer.create(); 		
		
	}

	@Override
	public Object intercept(Object obj, Method arg1, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("预处理——————");
        proxy.invokeSuper(obj, args); //调用业务类（父类中）的方法
        System.out.println("调用后操作——————");
		return null;
	}
	
	
}
