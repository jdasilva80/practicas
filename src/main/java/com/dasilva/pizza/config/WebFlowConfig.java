package com.dasilva.pizza.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.webflow.config.AbstractFlowConfiguration;
import org.springframework.webflow.definition.registry.FlowDefinitionRegistry;
import org.springframework.webflow.executor.FlowExecutor;
import org.springframework.webflow.mvc.servlet.FlowHandlerAdapter;
import org.springframework.webflow.mvc.servlet.FlowHandlerMapping;

@Configuration
public class WebFlowConfig extends AbstractFlowConfiguration {

	@Bean
	public FlowDefinitionRegistry flowRegistry() {
		return getFlowDefinitionRegistryBuilder().addFlowLocation("/WEB-INF/flows/pizza_flow.xml", "pedido")
				.addFlowLocation("/WEB-INF/flows/pizza_order_flow.xml", "pizza/customer")
				.addFlowLocation("/WEB-INF/flows/pizza_build_flow.xml", "pizza/order")
				.addFlowLocation("/WEB-INF/flows/pizza_payment_flow.xml", "pizza/payment").build();
	}

	@Bean
	public FlowExecutor flowExecutor() {
		return getFlowExecutorBuilder(flowRegistry()).build();
	}

//	@Bean
//	public FlowBuilderServices flowBuilderServices() {
//		return getFlowBuilderServicesBuilder().setViewFactoryCreator(mvcViewFactoryCreator()).setDevelopmentMode(true)
//				.build();
//	}
//
//	@Bean
//	public InternalResourceViewResolver  mvcViewFactoryCreator() {
//
//		MvcViewFactoryCreator factoryCreator = new MvcViewFactoryCreator();
//		
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/WEB-INF/flows/views/");
//		resolver.setSuffix(".jsp");
////		resolver.setViewClass(JstlView.class);
////		resolver.setExposeContextBeansAsAttributes(true);
//		
////		factoryCreator.setViewResolvers(Collections.singletonList(resolver));
////		factoryCreator.setUseSpringBeanBinding(true);
////		return factoryCreator;
//		return InternalResourceViewResolver;
//	}

	@Bean
	@Autowired
	public FlowHandlerAdapter flowHandlerAdapter(FlowExecutor flowExecutor) {
		FlowHandlerAdapter flowHandlerAdapter = new FlowHandlerAdapter();
		flowHandlerAdapter.setFlowExecutor(flowExecutor);
		return flowHandlerAdapter;
	}

	@Bean
	@Autowired
	public FlowHandlerMapping flowHandlerMapping(FlowDefinitionRegistry flowDefinitionRegistry) {

		FlowHandlerMapping flowHandlerMapping = new FlowHandlerMapping();
		flowHandlerMapping.setFlowRegistry(flowDefinitionRegistry);
		flowHandlerMapping.setOrder(0);

		return flowHandlerMapping;
	}
}
