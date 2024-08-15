package com.cbdemo.cb.repo;

import com.cbdemo.cb.model.Customer;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

public interface CustomerRepo extends CouchbaseRepository<Customer,Integer> {

}
