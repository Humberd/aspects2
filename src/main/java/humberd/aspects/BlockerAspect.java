package humberd.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BlockerAspect {
    @Pointcut("execution(* humberd.*.set*(..))")
    public void setBlocker() {
    }

//    @Before("setBlocker()")
//    public void beforeSetBLocker() {
//        System.out.println("----------ASPECT BLOCKER IS BLOCKING THIS EXECUTION-------");
//        throw new RuntimeException("----------ASPECT BLOCKER IS BLOCKING THIS EXECUTION-------");
//    }
}
