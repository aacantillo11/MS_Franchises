package co.com.prueba.usecase.registerfranchise;

import co.com.prueba.model.franchise.Franchise;
import co.com.prueba.model.franchise.gateways.FranchiseRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RegisterFranchiseUseCase {

    private final FranchiseRepository repository;

    public Franchise register(Franchise franchise){
        Franchise franchiseRegistered = repository.save(franchise);
        return franchiseRegistered;
    }
}
