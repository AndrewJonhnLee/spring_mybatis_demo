package com.cool.amoy.demo.shiro.config;


import com.cool.amoy.demo.shiro.realm.UserRealm;
import com.cool.amoy.demo.shiro.repositories.UserRepository;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {

    /**
     * 验证用户
     * 可以配置多个Realm Bean，Shiro都会把它注入的
     *
     * @return
     */
//    @Bean
//    @Autowired
//    public Realm realm(UserRepository userRepository) {
//        UserRealm userRealm = new UserRealm();
//        userRealm.setUserRepository(userRepository);
//        return userRealm;
//    }
//
//    /**
//     * 配置shiro的url权限
//     *
//     * @return
//     */
//    @Bean
//    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
//        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
//        chainDefinition.addPathDefinition("/login.html", "authc"); // need to accept POSTs from the login form
//        chainDefinition.addPathDefinition("/logout", "logout");
//        chainDefinition.addPathDefinition("/account-info", "perms[write]");
//        chainDefinition.addPathDefinition("/account-info1", "roles[admin]");
//
//        return chainDefinition;
//    }

}
