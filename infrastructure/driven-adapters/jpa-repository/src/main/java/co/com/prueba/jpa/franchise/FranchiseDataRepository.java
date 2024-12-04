package co.com.prueba.jpa.franchise;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface FranchiseDataRepository extends CrudRepository<FranchiseData/* change for adapter model */, Long>, QueryByExampleExecutor<FranchiseData/* change for adapter model */> {
}
