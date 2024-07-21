package kr.co.polycube.backendtest.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserResponse.SaveUserDTO saveUser(UserRequest.SaveUserDTO requestDTO) {

        User user=userRepository.save(requestDTO.toEntity());

        return new UserResponse.SaveUserDTO(user);
    }

}
