package com.investment.portfolio.dao;

import com.investment.portfolio.entity.Bond;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BondDAO extends CrudRepository<Bond, String> {
    //todo: add appropriate methods to work with Bonds
}
