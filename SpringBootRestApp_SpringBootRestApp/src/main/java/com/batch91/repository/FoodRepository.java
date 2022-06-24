/**
 * 
 */
package com.batch91.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.batch91.model.Food;

/**
 * @author BHAGYASHRI
 *
 */
@Repository
public interface FoodRepository extends JpaRepository<Food,Integer> {

}
