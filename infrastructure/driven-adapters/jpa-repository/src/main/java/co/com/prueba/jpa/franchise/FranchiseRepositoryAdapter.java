package co.com.prueba.jpa.franchise;

import co.com.prueba.jpa.helper.AdapterOperations;
import co.com.prueba.model.franchise.Franchise;
import co.com.prueba.model.franchise.gateways.FranchiseRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class FranchiseRepositoryAdapter extends AdapterOperations<Franchise, FranchiseData, Long, FranchiseDataRepository>
        implements FranchiseRepository
{

    public FranchiseRepositoryAdapter(FranchiseDataRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Franchise.class));
    }

    @Override
    public Franchise save(Franchise franchise) {
        return toEntity( repository.save( toData(franchise) ) );
    }
}
