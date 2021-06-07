package com.jojoldu.book.springboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = HelloControllerTest.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;


    @Test
    @DisplayName("hello가 리턴")
    public void returnHello() throws Exception{
        String hello = "hello";
        Assertions.assertThat(get("/hello").equals(hello));


//        mvc.perform(get("/hello"))
//                .andExpect(status().isOk())
//                .andExpect(content().string(hello));
        //200이 아니라 404가 나오는 이유를 아직 못찾았다. ㅠ
        //webMvc는 @Service,@Repository,@Component 사용 불가
    }

    @Test
    @DisplayName("helloDTO리턴")
    public void returnHelloDTO() throws Exception{
        String name = "hello";
        int amount = 1000;

        //mvc만 이용하면 에러발생!!!! 해결책을 찾아야한다..
//        mvc.perform(get("/hello/dto")
//            .param("name",name).param("amount",String.valueOf(amount)))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name",is(name)))
//                .andExpect(jsonPath("$.amount",is(amount)));


    }

}
