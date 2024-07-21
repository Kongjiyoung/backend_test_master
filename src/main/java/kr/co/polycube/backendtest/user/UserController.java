package kr.co.polycube.backendtest.user;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/users")
    public ResponseEntity<?> saveUser(@Validated @RequestBody UserRequest.SaveUserDTO requestDTO, Errors errors){

        UserResponse.SaveUserDTO responseDTO=userService.saveUser(requestDTO);

        return ResponseEntity.ok(responseDTO);
    }


}
