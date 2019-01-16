package com.domainevent.sample.camelConsumer;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("kafka:domaineventdb.public.events?brokers=my-cluster-kafka-bootstrap:9092").to("log:input");
	}

}
