package kr.co.polycube.backendtest.lottos;

import kr.co.polycube.backendtest._core.errors.exception.Exception400;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@RequiredArgsConstructor
@Service
public class LottoService {
    private final LottoRepository lottoRepository;

    public LottoResponse.SaveDTO save(LottoRequest.SaveDTO requestDTO) {
        int[] numbers = {
                requestDTO.getNumber1(),
                requestDTO.getNumber2(),
                requestDTO.getNumber3(),
                requestDTO.getNumber4(),
                requestDTO.getNumber5(),
                requestDTO.getNumber6()
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    throw new Exception400("로또 번호는 중복될 수 없습니다");
                }
            }
        }

        Lotto lotto = lottoRepository.save(requestDTO.toEntity());

        return new LottoResponse.SaveDTO(lotto);
    }

}
