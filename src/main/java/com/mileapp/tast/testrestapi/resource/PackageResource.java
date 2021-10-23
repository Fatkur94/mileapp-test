package com.mileapp.tast.testrestapi.resource;

import java.util.List;

import javax.validation.Valid;

import com.mileapp.tast.testrestapi.domain.Package;
import com.mileapp.tast.testrestapi.repository.PackageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PackageResource {

    @Autowired
    private PackageRepository packageRepository;

    @RequestMapping(value="/packages", method=RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Package> getAll() {
        return packageRepository.findAll();
    }

    @RequestMapping(value="/packages/{id}", method=RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> getPackagesById(@PathVariable String id) {
        
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value="/packages", method=RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> createAnggota(@RequestBody Package package1) {
        
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value="/packages/{id}", method=RequestMethod.PUT,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> putPackages(@PathVariable String id) {
        
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value="/packages/{id}", method=RequestMethod.PATCH,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> patchPackages(@PathVariable String id) {
        
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value="/packages/{id}", method=RequestMethod.DELETE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> deletePackages(@PathVariable String id) {
        
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
