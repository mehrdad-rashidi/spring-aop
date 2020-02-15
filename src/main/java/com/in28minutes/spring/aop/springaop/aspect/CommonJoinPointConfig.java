package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.in28minutes.spring.aop.springaop.data.*.*(..))")
    public void dataLayerExecution(){

    }
    @Pointcut("bean(*dao*)")
    public void beanContainDao(){}
    @Pointcut("within(com.in28minutes.spring.aop.springaop.data..*)")
    public void dataLayerExecutionWithWithin(){}
    @Pointcut("@@annotation(com.in28minutes.spring.aop.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation(){}
}

