package humberd.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TimeAspect {
    @Pointcut("execution(public * humberd.*.*(..)) && !execution(* humberd.*.set*(..)) && !execution(* humberd.*.get*(..))")
    public void publicTime() {
    }

//    @Around("publicTime()")
//    public Object time(ProceedingJoinPoint pjp) throws Throwable {
//        long time = System.nanoTime();
//        Object ret = pjp.proceed();
//        System.out.println("----------Executed in: " + (System.nanoTime() - time)+"ns ----------------");
//        return ret;
//    }
}
