package filter;

import java.util.List;

public class OrCriteria implements Criteria {
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public OrCriteria(Criteria criteria, Criteria otherCriteria){
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {

		List<Person> firstCriteriaitems = criteria.meetCriteria(persons);
		List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
		
		for(Person person : otherCriteriaItems){
			if(!firstCriteriaitems.contains(person)){
				firstCriteriaitems.add(person);
			}
		}
		return firstCriteriaitems;
	
	}
}
