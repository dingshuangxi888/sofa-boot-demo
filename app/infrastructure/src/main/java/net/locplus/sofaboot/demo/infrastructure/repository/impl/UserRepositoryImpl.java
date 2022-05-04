package net.locplus.sofaboot.demo.infrastructure.repository.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import net.locplus.sofaboot.demo.domain.model.User;
import net.locplus.sofaboot.demo.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
@SofaService
public class UserRepositoryImpl implements UserRepository {

    @Override
    public User queryUser(String userId) {
        User user = new User();
        user.setUserId("111");
        user.setUserName("zhangsan");
        return user;
    }
}
