package com.study.tad;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("꺼져");

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("잘되냥");
	}

}
