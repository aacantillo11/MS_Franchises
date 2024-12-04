package co.com.prueba.api.franchise.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FranchiseRegisterDTO {
    @NotBlank
    private String name;
}
