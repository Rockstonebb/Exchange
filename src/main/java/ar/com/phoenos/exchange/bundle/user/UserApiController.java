package ar.com.phoenos.exchange.bundle.user;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

@RestController
@RequestMapping("users")
public class UserApiController {

    private final UserService userService;

    @Autowired
    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "register")
    @Operation(summary = "Create user", description = "This can only be done by the logged in user.", tags = {"user"})
    @ApiResponses(value = {@ApiResponse(description = "successful operation",
            content = {@Content(mediaType = "application/json", schema = @Schema(implementation = UserSwagger.class))})})
    @Produces({"application/json"})
    @Consumes({"application/json"})
    public ResponseEntity<User> registerUser(@RequestBody User user) throws Exception {
        System.out.println(user);
        userService.createUser(user);
        return ResponseEntity.ok(user);
    }
}
