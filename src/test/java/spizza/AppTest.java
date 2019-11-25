package spizza;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.webflow.mvc.servlet.FlowHandlerAdapter;
import org.springframework.webflow.mvc.servlet.FlowHandlerMapping;

import com.dasilva.pizza.actions.PizzaFlowActions;
import com.dasilva.pizza.config.WebConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { WebConfig.class })
public class AppTest {

	@Autowired
	PizzaFlowActions pizzaFlowActions;

	@Autowired
	FlowHandlerMapping flowRegistry;

	@Autowired
	FlowHandlerAdapter flowExecutor;

	@Test
	public void pizzaTest1() {

		assertNotNull(pizzaFlowActions);

		pizzaFlowActions.saveOrder(null);

		assertNotNull(flowRegistry);

		assertNotNull(flowExecutor);
	}

}
