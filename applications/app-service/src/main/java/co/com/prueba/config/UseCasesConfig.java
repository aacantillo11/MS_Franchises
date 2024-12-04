package co.com.prueba.config;

import co.com.prueba.model.franchise.gateways.FranchiseRepository;
import co.com.prueba.usecase.registerfranchise.RegisterFranchiseUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "co.com.prueba.usecase",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
        },
        useDefaultFilters = false)
public class UseCasesConfig {

        @Bean
        public RegisterFranchiseUseCase registerFranchiseUseCase(FranchiseRepository repository){
                return new RegisterFranchiseUseCase(repository);
        }
}
