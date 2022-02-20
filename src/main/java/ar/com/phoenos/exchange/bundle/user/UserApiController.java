package ar.com.phoenos.exchange.bundle.user;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserApiController {

    private final UserService userService;

    @Autowired
    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "register",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE}, // Recibe Json o Form del front
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE}  // Produce Json o Form como respuesta
    )
    @Operation(summary = "Create user", description = "This can only be done by the logged in user.", tags = {"user"}) //Descripción del endpoint
    @ApiResponses(value = {@ApiResponse(description = "successful operation",   // Respuesta del endpoint
            content = {@Content(mediaType = "application/json",                 //Tipo de respuesta
                    schema = @Schema(implementation = UserSwagger.class)        // Clase Swagger para ejemplo
            )}
    )})
    public ResponseEntity<User> registerUser(@RequestBody User user) throws Exception {
        userService.createUser(user);
        return ResponseEntity.ok(user);
    }
}
