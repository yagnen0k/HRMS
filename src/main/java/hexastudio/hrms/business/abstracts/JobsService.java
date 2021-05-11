package hexastudio.hrms.business.abstracts;

import java.util.List;

import hexastudio.hrms.entities.concretes.Jobs;

public interface JobsService {
	List<Jobs> getAll();
}
