package com.saral.springconditional;

import com.saral.springconditional.bean.MessageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private MessageBean messageBean;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(messageBean.getMessage());
    }
}
