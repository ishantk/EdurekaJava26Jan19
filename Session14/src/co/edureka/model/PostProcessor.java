package co.edureka.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object beanRef, String beanId) throws BeansException {
		System.out.println(">> postProcess..BEFORE..Initialization executed: "+beanId);
		return beanRef;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object beanRef, String beanId) throws BeansException {
		System.out.println(">> postProcess..AFTER..Initialization executed: "+beanId);
		return beanRef;
	}
	
}
