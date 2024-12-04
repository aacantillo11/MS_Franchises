package co.com.prueba.model.franchise;
import co.com.prueba.model.branch.Branch;
import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Franchise {

    private String name;
    private List<Branch> branches;
}
