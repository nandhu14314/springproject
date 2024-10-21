package com.mallesh.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mallesh.entity.patient;
@Repository
public interface patientservimpl extends JpaRepository<patient,Integer > {
	@Query("select ade from patient p inner join p.ad ade where p.pname=:pname")
	public abstract List<Object []> getaddress(String pname);
	@Query("select cto from patient p inner join p.ct cto where p.pname=:pname")
	public abstract List<Object []> getcaretaker(String pname);
	public abstract  Optional<patient> findByPname(String pname);

}
