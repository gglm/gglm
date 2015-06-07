package com.wjtcy.gglm.manager.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextUtil implements ApplicationContextAware {

	// Spring应用上下文环境  
    private static ApplicationContext applicationContext;  
    
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		SpringContextUtil.applicationContext = applicationContext; 
	}
	
	public static Object getBean(String name) throws BeansException {  
        return applicationContext.getBean(name);  
    }

}
