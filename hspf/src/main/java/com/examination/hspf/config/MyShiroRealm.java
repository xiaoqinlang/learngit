package com.examination.hspf.config;

import com.examination.hspf.domain.SysAdmin;
import com.examination.hspf.service.AdminService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class MyShiroRealm extends AuthorizingRealm {
    @Autowired
    AdminService adminService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    /**
     * 用来验证身份，也就是说验证账号和密码是否正确
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("开始验证");
        //获取用户的输入账号
        String username = (String) token.getPrincipal();
        System.out.println("该用户使用的账号是：" + username);
        //通过username从数据库中进行查找user对象，如果找到通过
        SysAdmin sysAdmin = adminService.findByUsername(username);
        if(sysAdmin == null){
            System.out.println("====>>该用户不存在，请先注册");
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                sysAdmin,//用户名
                sysAdmin.getPassword(),//密码，数据库中的密码应该是经过盐值加密的
                getName()
        );
        return authenticationInfo;
    }
}
