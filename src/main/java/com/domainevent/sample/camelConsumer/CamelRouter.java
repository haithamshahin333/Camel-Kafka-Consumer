package com.domainevent.sample.camelConsumer;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:foo?fixedRate=true&period=5s").to("log:foo?level=DEBUG");	
	}

}
