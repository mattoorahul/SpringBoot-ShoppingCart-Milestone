package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.controller.AdminController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SpringShoppingCart2ApplicationTests {

	@Autowired
	AdminController adminController;

	@Test
	public void contextLoads() {
		Assertions.assertNotNull(adminController);
	}
}
