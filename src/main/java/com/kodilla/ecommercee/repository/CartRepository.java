package com.kodilla.ecommercee.repository;

import com.kodilla.ecommercee.domain.Cart;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CartRepository extends CrudRepository<Cart, Long> {
    @Override
    Cart save(Cart cart);

    @Override
    Optional<Cart> findById(Long cartId);

    @Override
    List<Cart> findAll();

    @Override
    void deleteById(Long cartId);
}
