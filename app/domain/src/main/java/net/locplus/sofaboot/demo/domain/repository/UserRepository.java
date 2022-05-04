package net.locplus.sofaboot.demo.domain.repository;

import net.locplus.sofaboot.demo.domain.model.User;

public interface UserRepository {

    User queryUser(String userId);
}
