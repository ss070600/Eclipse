package com.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleBean implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

	BeanFactory beanFactory = null;

	@Override
	public void setBeanName(String name) {
		name = "mybean";
		System.out.println("setBeanName() is invoked");

	}

	@Override
	public void setBeanFactory(BeanFactory arg1) throws BeansException {
		this.beanFactory = arg1;
		System.out.println("setBeanFactory is instantiated ");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() is invoked");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() is invoked");

	}

}
