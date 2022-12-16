package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect // this is not stereotype annotation manage by Spring
// Aspects is used to add functionality or decorate the method
@Component
public class HelloServiceAspect {

//    @Before("execution(* service.HelloService.hello(..))")
//    public void before(){
//        System.out.println("A");
//      /*      @Before ->  "A"
//            Hello, Alex!
//            @After ->     "B"
//                    ->this is going to be the output after execution if those two methods
//*/
//    }
//    @After("execution(* service.HelloService.hello(..))")
//    public void after(){
//        System.out.println("B");
//
//    }
//    // @AfterReturning will execute only in case  of the execution of the method happen without any exception
//    @AfterReturning("execution(* service.HelloService.hello(..))")
//    public void afterReturning() {
//        System.out.println("C");
//    }
//
//    //@AfterThrowing is executed only the method throws out an exception
//    @AfterThrowing("execution(* service.HelloService.hello(..))")
//    public void afterThrowing () {
//        System.out.println("D");
//    }


   // create a method that return Object
    @Around("execution(* service.HelloService.hello(..))")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("A");
        Object result = null;
            try{  // after this joinPoint we can do what ever we want
                result=joinPoint.proceed(new Object[]{"Alla"});
                System.out.println("B");
        }catch (Throwable throwable){
                throwable.printStackTrace();
            }
        return result;
    }

}
