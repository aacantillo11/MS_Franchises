package co.com.prueba.jpa.franchise;

import co.com.prueba.jpa.branch.BranchData;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "franchises")
public class FranchiseData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "franchise",cascade = CascadeType.REMOVE)
    private List<BranchData> branches = new ArrayList<>();

}
