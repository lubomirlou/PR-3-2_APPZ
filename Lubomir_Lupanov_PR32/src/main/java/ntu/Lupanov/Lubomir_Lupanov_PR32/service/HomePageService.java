package ntu.Lupanov.Lubomir_Lupanov_PR32.service;

import lombok.AllArgsConstructor;
import ntu.Lupanov.Lubomir_Lupanov_PR32.model.User;
import ntu.Lupanov.Lubomir_Lupanov_PR32.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class HomePageService {

    public static final String GREETINGS_FORMAT = "Welcome to the Internet :) %s %s,\nhave a little fun.\nTime of last refresh:%s";
    private UserRepository userRepository;

    public String getHelloString() {
        User user = userRepository.getDefaultUser();
        return String.format(GREETINGS_FORMAT, user.getName(), user.getSurname(), LocalDateTime.now());
    }
}