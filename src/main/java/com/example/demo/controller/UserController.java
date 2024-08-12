package com.example.demo.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.model.domain.User;
import com.example.demo.model.service.UserService;
import io.micrometer.common.lang.Nullable;

public class UserController {
    private final UserService userService = null;

    @PostMapping("/save_user")
    public String create(@RequestParam String name) {
        User user = new User();
        user.setName(name);

        Long userId = userService.save(user);
        return userId + "번 유저 등록 완료";
    }

    @PutMapping("")
    public String update(@RequestParam Long id, String name) {
        Long userId = userService.update(id, name);
        return userId + "번 유저 수정 완료";
    }

    @DeleteMapping("")
    public String delete(@RequestParam Long id) {
        userService.remove(id);
        return id + "번 유저 삭제 완료";
    }

    @GetMapping("/read")
    public String read(@RequestParam @Nullable Long id, String name) {
        if(id != null) {
            return userService.findById(id).toString();
        } else {
            return userService.findByName(name).toString();
        }
    }

    @GetMapping("/all")
    public String readAll() {
        return userService.findAll().toString();
    }
}
