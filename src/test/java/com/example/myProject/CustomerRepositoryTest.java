package com.example.myProject;

import com.example.myProject.dao.ICustomerRepository;
import com.example.myProject.domain.Customer;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    private ICustomerRepository customerRepository;

    public void test() throws Exception{
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        customerRepository.save(new Customer("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
        customerRepository.save(new Customer("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
        customerRepository.save(new Customer("cc3", "cc@126.com", "cc", "cc123456",formattedDate));
        Assert.assertEquals(9, customerRepository.findAll().size());
    }
}
