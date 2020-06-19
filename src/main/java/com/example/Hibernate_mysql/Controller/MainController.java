package com.example.Hibernate_mysql.Controller;

import com.example.Hibernate_mysql.Model.User;
import com.example.Hibernate_mysql.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MainController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/get")
    //returns all value in the table
    public List<User> send(){
        return userRepository.findAll();
    }

    @PostMapping("/save")
    //save the data to the table in the database
    public String save(@RequestBody User user){
        userRepository.save(user);                                                                                                                                          

        return "Data Saved";
    }

    @DeleteMapping("/delete/{id}")
    //performs delete operation using id
    public String delete(@PathVariable (value = "id") int id){
        userRepository.deleteById(id);

        return "Data Deleted";

    }


}
