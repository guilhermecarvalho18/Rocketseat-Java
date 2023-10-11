package br.com.todolist.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* Modifiers

 * public
 * private
 * protected

 */
@RestController
@RequestMapping("/users")
public class UserController {
    
    /*
     * String
     * Integer
     * Double
     * Float
     * Char
     * Date
     * void
     */

    @Autowired 
    private IUserRepository userRepository;


    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel){
        //System.out.println(userModel.getUsername());  
        var user = this.userRepository.findByUsername(userModel.getUsername());      
        
        if(user != null){
            System.out.println("User already registered");
            return ResponseEntity.status(400).body("User already registered");
        }
        
        var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }
}
