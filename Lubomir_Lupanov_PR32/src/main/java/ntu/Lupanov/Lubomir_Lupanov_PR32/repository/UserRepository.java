package ntu.Lupanov.Lubomir_Luapnov_PR32.repository;

import ntu.Lupanov.Lubomir_Luapnov_PR32.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    public User getDefaultUser() {
        return new User("Lubomir", "Lupanov");
    }
}