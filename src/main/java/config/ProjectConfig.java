package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"service", "aspects"}) // this basePackage is an Array that mean we must use curly brackets separates elements by come
@EnableAspectJAutoProxy
public class ProjectConfig {


}
