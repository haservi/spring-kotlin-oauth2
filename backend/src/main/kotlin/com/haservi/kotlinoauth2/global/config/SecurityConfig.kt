package com.haservi.kotlinoauth2.global.config

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.ObjectPostProcessor
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.web.SecurityFilterChain
import javax.servlet.Filter

@Configuration
@EnableWebSecurity
class SecurityConfig {

    // https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter
    // https://docs.spring.io/spring-security/reference/servlet/authorization/authorize-http-requests.html
    @Bean
    fun configure(http: HttpSecurity): SecurityFilterChain {
        http
            .formLogin().disable()
        http
            .authorizeRequests()
            .antMatchers("/h2-console/**").permitAll()
        http
            .csrf().disable()
        http
            .headers()
            .frameOptions()
            .sameOrigin().and()
        return http.build()
    }

//    @Bean
//    fun webConfigure(web: WebSecurity): WebSecurity {
//        web
//            .ignoring()
//            .antMatchers("/h2-console/**")
//        return web
//    }

}


