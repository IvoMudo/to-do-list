package br.com.ivoprojects.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserModel createUser(UserModel userModel){
        if (userRepository.findByUsername(userModel.getUsername())!=null){
            return null;
        }
        var a = userRepository.save(userModel);
        System.out.println(a);
        return userModel;
    }
}
