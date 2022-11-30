package com.sm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class[] configFiles = { StudentAppConfig.class };

		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {

		String[] mappings = { "/" };

		return mappings;
	}

}
