package com.springcore.springEL;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springEL/config.xml");
		Demo d1 = context.getBean("demo",Demo.class);
		System.out.println(d1);
		SpelExpressionParser parser = new SpelExpressionParser();
		Expression exp = (Expression) parser.parseExpression("89-10");
		System.out.println(exp.getValue());
	}

}
