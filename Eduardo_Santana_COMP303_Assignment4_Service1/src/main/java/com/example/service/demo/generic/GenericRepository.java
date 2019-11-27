/**
 * 
 */
package com.example.service.demo.generic;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author eduardosantana
 *
 */
@Repository
public interface GenericRepository <T extends Entity> extends JpaRepository<T, Integer>  {

}
