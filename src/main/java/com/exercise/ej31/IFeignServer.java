package com.exercise.ej31;

import com.exercise.ej31.profesor.infrastructure.ProfesorPersonaOutputDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// cliente feign. url a la que voy a llamar. En getmapping lo mismo del endpoint que va a recibir la llamada.
@FeignClient(name="simpleFeign", url="http://localhost:8081/")
public interface IFeignServer {

    @GetMapping("profesor/{id}")
    ResponseEntity<ProfesorPersonaOutputDTO> callServer(@PathVariable String id);

}
