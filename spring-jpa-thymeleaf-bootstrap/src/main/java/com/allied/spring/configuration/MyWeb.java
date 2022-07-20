/*
 * package com.allied.spring.configuration;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
 * import
 * org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
 * 
 * @Configuration public class MyWeb {
 * 
 * @SuppressWarnings("deprecation")
 * 
 * @Bean public WebMvcConfigurerAdapter toIndex(){ return new
 * WebMvcConfigurerAdapter() {
 * 
 * @Override public void addViewControllers(ViewControllerRegistry registry) {
 * // forward requests to /admin and /user to their index.html
 * registry.addViewController("/admin").setViewName( "forward:/index.html");
 * registry.addViewController("/user").setViewName( "forward:/index.html"); }
 * 
 * 
 * }; } }
 */