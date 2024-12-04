package co.com.prueba.api.franchise.converter;

import co.com.prueba.api.franchise.dto.FranchiseCreatedDTO;
import co.com.prueba.api.franchise.dto.FranchiseRegisterDTO;
import co.com.prueba.model.franchise.Franchise;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class FranchiseConverter {

    public Franchise toFranchise(FranchiseRegisterDTO dto){
        return Franchise.builder()
                .name(dto.getName())
                .branches(new ArrayList<>())
                .build();
    }

    public FranchiseCreatedDTO toFranchiseCreatedDTO(Franchise franchise){

        return FranchiseCreatedDTO.builder()
                .name(franchise.getName())
                .build();

    }
}
