package teste.demo.resources;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teste.demo.entities.User;

@RestController
// "https/facebook/users" usado como tag no caminho da url
@RequestMapping(value = "/users")
public class UserResources {
    
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User((long) 1, "teste", "teste@gmail.com", "999999999", "123456");
        // "ok" para retornar com uscesso e body para especificar o objeto.
        return ResponseEntity.ok().body(u);

    }
}
