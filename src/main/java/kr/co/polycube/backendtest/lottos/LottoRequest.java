package kr.co.polycube.backendtest.lottos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

public class LottoRequest {

    @Data
    public static class SaveDTO {
        @NotNull
        @Positive
        private Integer number1;
        @NotNull
        @Positive
        private Integer number2;
        @NotNull
        @Positive
        private Integer number3;
        @NotNull
        @Positive
        private Integer number4;
        @NotNull
        @Positive
        private Integer number5;
        @NotNull
        @Positive
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
