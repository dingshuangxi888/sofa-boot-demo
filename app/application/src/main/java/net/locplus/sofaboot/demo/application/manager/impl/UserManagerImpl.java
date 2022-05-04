package net.locplus.sofaboot.demo.application.manager.impl;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import net.locplus.sofaboot.demo.application.manager.UserManager;
import net.locplus.sofaboot.demo.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@SofaService
public class UserManagerImpl implements UserManager {

    @SofaReference
    private UserService userService;

    @Override
    public String queryUser(String userId) {
        return userService.queryUser(userId).getUserName();
    }
}
