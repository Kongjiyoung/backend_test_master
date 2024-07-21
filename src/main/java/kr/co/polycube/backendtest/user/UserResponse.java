package kr.co.polycube.backendtest.user;


import lombok.Data;

public class UserResponse {


    @Data
    public static class SaveUserDTO{
        private Long Id;

        public SaveUserDTO(User user) {
            Id = user.getId();
        }
    }

}
