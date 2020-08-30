package com.rkm.project.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<Donor> getAllUsers(){

        ArrayList<Donor> donors = new ArrayList<>();
        userRepo.findAll().forEach(donors::add);
        return donors;
    }

    public Optional<Donor> getUser(Integer id){
        return userRepo.findById(id);
    }

    public void addUser(Donor donor){
        userRepo.save(donor);
    }

    public void deleteUser(Integer id){
        userRepo.deleteById(id);
    }

    public void updateUser(Donor donor, Integer id){
        userRepo.save(donor);
    }

}
