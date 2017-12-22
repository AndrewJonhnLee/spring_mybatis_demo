package com.cool.amoy.demo.shiro.realm;

import com.cool.amoy.demo.shiro.entity.User;
import com.cool.amoy.demo.shiro.repositories.UserRepository;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class UserRealm extends AuthorizingRealm {

    private UserRepository userRepository;

    /**
     * 认证（用户登录）
     *
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userCode = (String) token.getPrincipal();
        User user = userRepository.findByUsername(userCode);

        if (user == null) {
            throw new UnknownAccountException("账户不存在");
        }


        if (user.getEnable() != null && user.getEnable().intValue() == 1) {
            throw new DisabledAccountException("账户被禁用");
        }

        // 从获得密码
        String password = user.getPassword();

        if (password == null) {
            throw new IncorrectCredentialsException("密码错误！");
        }
        // 清除user对象中的密码
        user.setPassword("");
        // 如果查询到返回认证信息AuthenticationInfo
        // 将user设置simpleAuthenticationInfo
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                user, password.toCharArray(), getName());
        return simpleAuthenticationInfo;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }


    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}