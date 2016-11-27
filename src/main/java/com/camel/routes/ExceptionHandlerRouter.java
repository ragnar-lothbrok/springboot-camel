package com.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ExceptionHandlerRouter extends RouteBuilder {

	private static final Logger LOG = LoggerFactory.getLogger(ExceptionHandlerRouter.class);

	public void configure() throws Exception {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Start config for exception handler.");
		}
		onException(Exception.class).handled(true).log("Error caused : ${exception.message}");
	}
}
