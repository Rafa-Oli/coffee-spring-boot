package br.com.rafaela.javaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafaela.javaspring.domain.Coffee;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {}
