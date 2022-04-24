package ru.job4j.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.job4j.domain.Employee;
import ru.job4j.domain.Person;
import ru.job4j.repository.EmployeeRepository;
import ru.job4j.repository.PersonRepository;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {


    private final EmployeeRepository employeeRepository;
    private final PersonRepository personRepository;



    public EmployeeController(PersonRepository personRepository, EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        this.personRepository = personRepository;
    }

    @GetMapping("/")
    public List<Employee> findAll() {
        return (List<Employee>) this.employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> findById(@PathVariable int id) {
        var person = this.employeeRepository.findById(id);
        return new ResponseEntity<Employee>(
                person.orElse(new Employee()),
                person.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND
        );
    }

    @PostMapping("/")
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        employee.setHireDate(LocalDateTime.now());
       return new ResponseEntity<>(
               this.employeeRepository.save(employee),
               HttpStatus.CREATED
       );
    }

    @PutMapping("/")
    public ResponseEntity<Void> update(@RequestBody Employee employee) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
     return  null;
    }
}
