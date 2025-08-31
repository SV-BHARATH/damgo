

package com.example.SpringMailSender.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringMailSender.user.Register;


@Repository
public interface USerRepository extends JpaRepository<Register,Long>
{
	

}

