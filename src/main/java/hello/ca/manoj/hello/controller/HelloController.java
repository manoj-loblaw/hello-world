package hello.ca.manoj.hello.controller;

import hello.ca.manoj.hello.domain.RoleRepository;
import hello.ca.manoj.hello.domain.Roles;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
public class HelloController {

    @Resource
    RoleRepository roleRepository;

    private String getRoles() {
        StringBuilder result = new StringBuilder();
        List<Roles> roles= roleRepository.findAll();
        roles.forEach(role -> result.append(role.getRoleId() + "\n"));
        return result.toString();
    }


    @RequestMapping("/")
    public String index() {
        return "Greetings!"+"\r\n"+ getRoles();
    }


    @PostMapping("/add/role")
    public String createRole(@Valid @RequestBody Roles role) {
        try {
            roleRepository.save(role);
            return "Save was successful";
        } catch (Exception e) {
            return "Error saving the data";
        }
    }

}