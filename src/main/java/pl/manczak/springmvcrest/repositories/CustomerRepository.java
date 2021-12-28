package pl.manczak.springmvcrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.manczak.springmvcrest.domain.Customer;

public interface CustomerRepository extends JpaRepository <Customer, Long> {
}
