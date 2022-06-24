package com.example.university.Repository;
import org.springframework.data.jpa.repository.*;
import com.example.university.entity.UnivDetails;

public interface UniviRepository {
	public interface UnivRepository extends JpaRepository<UnivDetails, Integer>{

	}



}
