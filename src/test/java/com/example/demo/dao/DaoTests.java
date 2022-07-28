package com.example.demo.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.entity.Account;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DaoTests {
 
  @Autowired
  AccountDAO accountDao;
 
  @Test
  public void test() {
    Account account = new Account();
 
    account = accountDao.findAccount("Employee1");
 
    
    Assertions.assertNotNull(account.getEncrytedPassword());
 
    
  }
}
