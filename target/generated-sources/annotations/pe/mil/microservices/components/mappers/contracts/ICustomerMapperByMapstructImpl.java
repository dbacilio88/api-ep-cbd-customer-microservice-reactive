package pe.mil.microservices.components.mappers.contracts;

import javax.annotation.processing.Generated;
import pe.mil.microservices.dto.requests.RegisterCustomerRequest;
import pe.mil.microservices.repositories.entities.CustomerEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-11T15:10:11-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16 (OpenLogic)"
)
public class ICustomerMapperByMapstructImpl implements ICustomerMapperByMapstruct {

    @Override
    public CustomerEntity mapCustomerEntityByRegisterCustomerRequest(RegisterCustomerRequest source) {
        if ( source == null ) {
            return null;
        }

        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setCustomerId( source.getCustomerId() );
        customerEntity.setName( source.getName() );
        customerEntity.setDescription( source.getDescription() );

        return customerEntity;
    }
}
