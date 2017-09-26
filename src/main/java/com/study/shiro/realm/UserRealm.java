package com.study.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

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
        return null;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
