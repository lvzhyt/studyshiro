package com.study.shiro.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lzh on 2017/9/26.
 */
public class UserRealm extends AuthorizingRealm {
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        String username = (String) principals.getPrimaryPrincipal();
//        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//        // 根据用户名查询当前用户拥有的角色
//        Set<Role> roles = userService.findRoles(username);
//        Set<String> roleNames = new HashSet<String>();
//        for (Role role : roles) {
//            roleNames.add(role.getRole());
//        }
//        // 将角色名称提供给info
//        authorizationInfo.setRoles(roleNames);
//        // 根据用户名查询当前用户权限
//        Set<Permission> permissions = userService.findPermissions(username);
//        Set<String> permissionNames = new HashSet<String>();
//        for (Permission permission : permissions) {
//            permissionNames.add(permission.getPermission());
//        }
//        // 将权限名称提供给info
//        authorizationInfo.setStringPermissions(permissionNames);

//        return authorizationInfo;
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set roles = new HashSet();
        roles.add("user");
        info.setRoles(roles);
        return info;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        Object princial = token.getUsername();
        Object credentials = token.getPassword();
        String realName = getName();
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(princial,credentials,realName);
        return info;
    }
}
