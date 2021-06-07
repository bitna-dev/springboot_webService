package com.jojoldu.book.springboot;

import com.jojoldu.book.springboot.web.dto.HelloResponseDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HelloResponseDTOTest {

    @Test
    @DisplayName("롬복 테스트")
    public void lombokTest() {
        //given
        String name="rice";
        int amount=1000;

        //when
        HelloResponseDTO dto = new HelloResponseDTO(name,amount);

        //then
        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
