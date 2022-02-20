package ar.com.phoenos.exchange.bundle.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDate;

public class UserSwagger {

    @JsonProperty("username")
    @Schema(example = "RickSanchez1234", description = "Login username")
    private String username;

    @JsonProperty("displayName")
    @Schema(example = "Rick", description = "User name")
    private String displayName;

    @JsonProperty("displaySurname")
    @Schema(example = "Sanchez")
    private String displaySurname;

    @JsonProperty("birthDate")
    private LocalDate birthDate;

    @JsonProperty("creationDate")
    private LocalDate creationDate;

    @JsonProperty("password")
    @Schema(example = "abc123!%&", description = "Encrypted password")
    private String password;

    @JsonProperty("email")
    @Schema(example = "rick_sanchez@example.gtld", description = "Registration and recovery Email")
    private String email;

    @JsonProperty("passportId")
    @Schema(example = "123456passport", description = "User passport")
    private String passportId;


    @JsonProperty("activated")
    @Schema(example = "true", description = "Is user active")
    private Boolean activated;

}


