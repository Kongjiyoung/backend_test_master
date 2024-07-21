package kr.co.polycube.backendtest.lottos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

public class LottoRequest {

    @Data
    public static class SaveDTO {
        @NotEmpty
        private Integer number1;
        @NotEmpty
        private Integer number2;
        @NotEmpty
        private Integer number3;
        @NotEmpty
        private Integer number4;
        @NotEmpty
        private Integer number5;
        @NotEmpty
        private Integer number6;

        public Lotto toEntity(){
            return Lotto.builder()
                    .number1(number1)
                    .number2(number2)
                    .number3(number3)
                    .number4(number4)
                    .number5(number5)
                    .number6(number6)
                    .build();
        }
    }
}
