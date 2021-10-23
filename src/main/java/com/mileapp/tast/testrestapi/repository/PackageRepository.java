package com.mileapp.tast.testrestapi.repository;

import java.util.List;

import com.mileapp.tast.testrestapi.domain.Package;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PackageRepository extends MongoRepository<Package, String> {
    List<Package> findAll();

}