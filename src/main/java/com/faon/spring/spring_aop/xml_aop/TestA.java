package com.faon.spring.spring_aop.xml_aop;

/**
 * 前置通知	在一个方法执行之前，执行通知。
 * 后置通知	在一个方法执行之后，不考虑其结果，执行通知。
 * 返回后通知	在一个方法执行之后，只有在方法成功完成时，才能执行通知。
 * 抛出异常后通知	在一个方法执行之后，只有在方法退出抛出异常时，才能执行通知。
 * 环绕通知	在建议方法调用之前和之后，执行通知。
 */
public class TestA {

    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    public void beforeAdvice(){
        System.out.println("Going to setup student profile.");
    }
    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */
    public void afterAdvice(){
        System.out.println("Student profile has been setup.");
    }
    /**
     * This is the method which I would like to execute
     * when any method returns.
     * 方法执行完就会执行不管有没有错误
     *
     */
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:" + retVal.toString() );
    }
    /**
     * This is the method which I would like to execute
     * if there is an exception raised.
     * 异常出现时执行的方法
     */
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
    }
}
