package hello.ca.manoj.hello.controller;

import hello.ca.manoj.hello.domain.RoleRepository;
import hello.ca.manoj.hello.domain.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
public class HelloController {

    @Resource
    RoleRepository roleRepository;



    @RequestMapping("/")
    public String index() {
        return "Greetings!"+"\n"+roleRepository.findAll();
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