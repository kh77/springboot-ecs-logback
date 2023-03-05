package com.sm.repo;

import com.sm.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
@Slf4j
public class UserRepository {

    public List<User> getAllUsers() {
        log.debug("Debug -> Get all users data");
        log.info("INFO -> Get all users data");
        return Stream.of(
                new User(100L, "zyx", "xyz@gmail.com", false),
                new User(200L, "john", "john@gmail.com", true),
                new User(300L, "smith", "smith@gmail.com", false),
                new User(400L, "peter", "peter@gmail.com", true),
                new User(500L, "kely", "kely@gmail.com", true))
                .collect(Collectors.toList());
    }


    public long getUserStatusCountByStatus(boolean status){
        log.debug("Debug -> Get users data by status");
        log.info("INFO -> Get users data by status");
       return getAllUsers().stream().filter(user -> user.isStatus() == status ).count();
    }

}
