package com.itheima;

import com.itheima.dao.bookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDruidApplicationTests {
    @Autowired
    private bookDao bookDao;

    @Test
    void contextLoads() {
        System.out.println(bookDao.getById(1));

    }

}
