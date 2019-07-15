package server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author weifeng
 * @description 安全策略配置(eureka服务提供者必须配置,否则无法注册)
 * @date 2019/7/12
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();//关闭csrf
        super.configure(http);
    }
//    @Resource
//    public void configGolabl(AuthenticationManagerBuilder auth) throws Exception {
//           auth.inMemoryAuthentication().withUser("root").password("123456").roles("ADMIN");
//    }
}
