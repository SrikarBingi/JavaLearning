package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Student;
import com.rowmapper.StudentRowMapper;

@Repository
public class StudentDAO {
	
	 @Autowired
	 JdbcTemplate jdbcTemplate;
	
	public int insert(Student s) {

		String sql = "INSERT INTO students (id, name) VALUES (?, ?)";

        return jdbcTemplate.update(sql,
                s.getId(),
                s.getName());
    }
	
	public int update(Student s) {

        String sql = "update students set name=? where id=?";

        return jdbcTemplate.update(sql,
                s.getName(),
                s.getId());
    }
	
	public int delete(int id) {

        String sql = "delete from students where id=?";

        return jdbcTemplate.update(sql, id);
    }
	
	// SELECT ONE
    public Student getStudent(int id) {

        String sql = "select * from students where id=?";

        return jdbcTemplate.queryForObject(
                sql,
                new StudentRowMapper(),
                id);
    }

    // SELECT ALL
    public List<Student> getAllStudents() {

        String sql = "select * from students";

        return jdbcTemplate.query(
                sql,
                new StudentRowMapper());

    }
    
    public int countStudents() {

        String sql = "select count(*) from students";

        return jdbcTemplate.queryForObject(sql, Integer.class);

    }
}
