package com.t2208e.T2208E_Java_JPA.service;

import com.t2208e.T2208E_Java_JPA.Specifications.UserSpecifications;
import com.t2208e.T2208E_Java_JPA.entity.User;
import com.t2208e.T2208E_Java_JPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    public List<User> searchUsers(String username, String address) {
        Specification<User> spec = Specification.where(UserSpecifications.hasUsername(username))
                .and(UserSpecifications.hasAddress(address));
        return userRepository.findAll(spec);
    }
}
