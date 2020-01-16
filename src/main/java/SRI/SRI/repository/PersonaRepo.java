package SRI.SRI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import SRI.SRI.model.FdiPersona;

public interface PersonaRepo  extends JpaRepository<FdiPersona, Integer>  {
	
	@Modifying
	@Query("SELECT f FROM FdiPersona f where f.prsCedula=:nroId")
	public List<FdiPersona> getPersonabyCedula(@Param("nroId") String nroId);
	
}
