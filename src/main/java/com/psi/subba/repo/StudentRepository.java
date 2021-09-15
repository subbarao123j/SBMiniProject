package com.psi.subba.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.psi.subba.model.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>

{

}
