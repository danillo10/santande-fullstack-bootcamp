package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setName("Danillo Leão Deucher");
//        user.setCpf("600.520.763-69");
//        user.setUsername("danillo10");
//        user.setPassword("123456");
//
//        repository.save(user);

        List<User> users = repository.findByNameContaining("Danillo");

        for (Integer i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }
}
