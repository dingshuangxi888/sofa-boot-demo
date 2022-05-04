package net.locplus.sofaboot.demo.domain.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import net.locplus.sofaboot.demo.domain.model.User;
import net.locplus.sofaboot.demo.domain.repository.UserRepository;
import net.locplus.sofaboot.demo.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SofaService
public class UserServiceImpl implements UserService {

    @SofaReference
    private UserRepository userRepository;

    @Override
    public User queryUser(String userId) {
        return userRepository.queryUser(userId);
    }
}
