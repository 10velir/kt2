package com.itacademy.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableTransactionManagement
@ComponentScan("com.itacademy.web.controller")
@Import(value = {InternationalizationConfig.class, ThymeleafConfig.class})
@EnableWebMvc
public class WebConfig {

}
