package com.example.MockUp.Controller;

import java.util.ArrayList;
import java.util.List;
import com.example.MockUp.Model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.slf4j.*;

@RestController
public class MainController {

    private Logger log = LoggerFactory.getLogger(MainController.class);

    ObjectMapper mapper = new ObjectMapper();

    @PostMapping(
        value = "/test",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Object postValue(@RequestBody Request request) {

        log.info("Получен запрос: {}", request);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            log.error("Ошибка при ожидании: {}", e.getMessage());
            Thread.currentThread().interrupt();
        }
        
        List<Response> responseList = new ArrayList<Response>();

        int count = request.getCount();
        
        for(int i = 1; i < count+1; i++){
            Response response = new Response();
            response.setLastname("lastname" + i);
            response.setFirstname("firstname" + i);
            response.setId(i);
            responseList.add(response);
        }

        log.info("Отправлен ответ: {}", responseList);
        
        return responseList;

    }
}
