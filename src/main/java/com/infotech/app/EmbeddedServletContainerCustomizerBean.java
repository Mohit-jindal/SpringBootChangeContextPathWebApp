package com.infotech.app;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

@Component
public class EmbeddedServletContainerCustomizerBean implements EmbeddedServletContainerCustomizer {

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) 
	{
		container.setPort(7171);
		container.setContextPath("/mywebapp");
	}

}
