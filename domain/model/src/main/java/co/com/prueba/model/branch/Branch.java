package co.com.prueba.model.branch;
import co.com.prueba.model.product.Product;
import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Branch {

    private String name;
    private List<Product> products;
}
