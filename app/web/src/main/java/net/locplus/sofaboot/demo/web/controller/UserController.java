package net.locplus.sofaboot.demo.web.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import net.locplus.sofaboot.demo.application.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @SofaReference
    private UserManager userManager;

    @GetMapping("/query")
    public String queryUser(@RequestParam String userId) {
        return userManager.queryUser(userId);
    }

}
