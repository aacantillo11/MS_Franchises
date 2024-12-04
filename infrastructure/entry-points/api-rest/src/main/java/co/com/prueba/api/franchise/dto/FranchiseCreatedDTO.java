package co.com.prueba.api.franchise.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class FranchiseCreatedDTO {
    private String name;
}
