package am.amishra.tba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import am.amishra.tba.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
