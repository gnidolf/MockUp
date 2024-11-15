package com.example.MockUp.Controller;

import com.example.MockUp.Model.*;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
// import org.slf4j.*; доделать логирование

@RestController
public class MainController {

    // private Logger log = LoggerFactory.getLogger(MainController.class);

    ObjectMapper mapper = new ObjectMapper();

    @PostMapping(
        value = "/test",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Object postValue(@RequestBody RequestDTO requestDTO) {
        
        List<ResponseDTO> responseList = new ArrayList<ResponseDTO>();

        int count = requestDTO.getCount();
        
        for(int i = 1; i < count+1; i++){
            ResponseDTO responseDTO = new ResponseDTO();
            responseDTO.setLastname("lastname" + i);
            responseDTO.setFirstname("firstname" + i);
            responseDTO.setId(i);
            System.out.println(responseDTO);
            responseList.add(responseDTO);
        }
        

        return responseList;

    }
}
