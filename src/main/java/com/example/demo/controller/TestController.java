package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class TestController {

    @RequestMapping(path = "/test1")
    public String testing1() {
        return "i am just testing1 ...";
    }

    @GetMapping("/test2")
    public String testing2() {
        return "i am just testing2 ...";

    }

    @RequestMapping(method = RequestMethod.GET, path = "/test3")
    public String testing3() {
        return "i am just testing3 ...";
    }

    @GetMapping("/test4")
    public String testing4() {
        return "i am just testing4 ...";

    }

    @GetMapping("/customer")
    public Customer getdetails1() {
        return new Customer("abc", 895456);
    }

    @GetMapping("/id")
    public int getdetails2() {
        return new Customer("abcdw", 895456).id;

    }

    @GetMapping("/name")
    public String getdetails3() {
        return new Customer("abcdw", 895456).name;

    }

    @GetMapping("/customerlist")
    public List<Customer> listOfCustomer() {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("azx", 129));
        list.add(new Customer("adjh", 242));
        list.add(new Customer("kawjds1", 32));
        list.add(new Customer("edsda", 1231));
        list.add(new Customer("azgv", 3253));
        return list;

    }

    @GetMapping("/name/{id}")
    public Customer myid(@PathVariable int id) {
        return new Customer("aaaa", id);
    }

    @PostMapping("/details")
    public String create(@RequestBody Customer customer) {
        return "created";
    }

    @PostMapping("/status/details")
    public ResponseEntity<String> createwithStatus(@RequestBody Customer customer) {
        return new ResponseEntity<>("created", HttpStatus.ACCEPTED);
    }

    @GetMapping("/mydetails/{id}")
    public ResponseEntity<Customer> myDetails(@PathVariable("id") int roll) {
        return new ResponseEntity<>(new Customer("aaaa", roll), HttpStatus.OK);
    }

    @GetMapping("/mydetailsQ")
    public ResponseEntity<Customer> myDetailsReq(@RequestParam("id") int roll) {
        return new ResponseEntity<>(new Customer("abcd", roll), HttpStatus.OK);
    }
    @GetMapping("/mydetailsQ1")
    public ResponseEntity<Customer> myDetailsREq(@RequestParam int id){
        return new ResponseEntity<>(new Customer("asasd",84),HttpStatus.OK);
    }
}
