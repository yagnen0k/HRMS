package hexastudio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hexastudio.hrms.entities.concretes.Jobs;

public interface JobsDao extends JpaRepository<Jobs,Integer>{

}
