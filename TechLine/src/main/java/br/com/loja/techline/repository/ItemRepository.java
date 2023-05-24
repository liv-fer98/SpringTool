package br.com.loja.techline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.loja.techline.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
