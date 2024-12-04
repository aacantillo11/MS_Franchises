package co.com.prueba.model.franchise.gateways;

import co.com.prueba.model.franchise.Franchise;

public interface FranchiseRepository {
    Franchise save(Franchise franchise);
}
