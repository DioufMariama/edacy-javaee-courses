package sn.edacy.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.*;

import sn.edacy.model.Cohort;
import sn.edacy.model.Talent;

@Stateless
public class TalentService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void saveTalent(Talent talent) {
		System.out.println("C'est habi");
		
	}
	
	public void saveCohort(Cohort cohort) {
		entityManager.persist(cohort);
	}
}
