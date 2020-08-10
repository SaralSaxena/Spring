package com.saral.springconditional.conf;

import com.saral.springconditional.bean.GenericMessage;
import com.saral.springconditional.bean.WelcomeMessage;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf {

    @Bean
    @ConditionalOnProperty(name="welcomebean.enabled", havingValue="true")
    //The annotation is used to conditionally create a Spring bean depending on the configuration of a property.
    public WelcomeMessage welcomeBeanBean() {

        return new WelcomeMessage("Welcome!!!!!!!!!");
    }

    @Bean
    @ConditionalOnMissingBean(WelcomeMessage.class)
    //The above bean will get loaded by Spring only if there is no other bean of this type present in the contex
    public GenericMessage messageBean() {

        return new GenericMessage("Today is a beautiful day!!!!!!!!!!!!!!!!!.");
    }
}