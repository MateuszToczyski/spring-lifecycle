package com.kodilla.lifecycle;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanMonitor implements BeanPostProcessor {

	private static final Logger LOGGER = Logger.getLogger(BeanMonitor.class);

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		LOGGER.info("Before initialization of bean: " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		LOGGER.info("After initialization of bean: " + beanName);
		return bean;
	}
}
