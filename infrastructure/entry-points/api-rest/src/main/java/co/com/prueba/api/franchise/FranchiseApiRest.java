package co.com.prueba.api.franchise;
import co.com.prueba.api.franchise.converter.FranchiseConverter;
import co.com.prueba.api.franchise.dto.FranchiseCreatedDTO;
import co.com.prueba.api.franchise.dto.FranchiseRegisterDTO;
import co.com.prueba.model.franchise.Franchise;
import co.com.prueba.usecase.registerfranchise.RegisterFranchiseUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/franchises", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class FranchiseApiRest {
   private final RegisterFranchiseUseCase registerFranchiseUseCase;
   private final FranchiseConverter franchiseConverter;


    @GetMapping(path = "/path")
    public String commandName() {
//      return useCase.doAction();
        return "Hello World";
    }

    @PostMapping
    public FranchiseCreatedDTO registerFranchise(@RequestBody FranchiseRegisterDTO franchiseDTO){

        Franchise franchiseCreated = registerFranchiseUseCase
                .register( franchiseConverter.toFranchise(franchiseDTO) );

        return franchiseConverter.toFranchiseCreatedDTO( franchiseCreated );

    }
}
