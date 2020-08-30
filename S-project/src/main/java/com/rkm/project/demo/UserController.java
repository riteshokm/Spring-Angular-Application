package com.rkm.project.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @RequestMapping("/donors")
    public List<Donor> getAllUsers(){
        return userService.getAllUsers();
    }

    @CrossOrigin
    @RequestMapping("/donors/{id}")
    public Optional<Donor> getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }
    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, value = "/donors")
    public void addUser(@RequestBody Donor donor){
        userService.addUser(donor);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.DELETE, value = "donors/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }

    @PutMapping("/donors/{id}")
    public void updateUser(@PathVariable(value = "id") Integer id,@RequestBody Donor userdetails){
        userService.updateUser(userdetails,id);
    }

}
