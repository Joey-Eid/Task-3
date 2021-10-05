package Sumerge;

import java.util.*;
import java.util.function.Predicate;

public class Filter {
	static String mainTitle,finalMessage="";
	
	public static void main(String[] args) {
		
		List<String> titles = new ArrayList<String>();
		List<Employee> employees = Arrays.asList(
		new Employee("ASE","Samuel","011292898"),
		new Employee("ASE","Michael","0112927898"),
		new Employee("SE","Christopher","011234872898"),
		new Employee("SE","Benjamin","01129283578"),
		new Employee("SSE","Nicholas","01129234798")
		);
		
	    for(Employee job: employees) {
	    	if (!titles.contains(job.getTitle())){
	    		titles.add(job.getTitle());
	    	}
	    }
	    for(String mainTitle: titles) {
		filterPrint(employees, worker -> worker.getTitle().startsWith(mainTitle));
	    }
	    System.out.print(finalMessage);
	}
	public static void filterPrint(List<Employee> employees, Predicate<Employee> predicate) {
		int Count = 0;
		String message = "";
		String position = "";
		for (Employee worker: employees) {
			if (predicate.test(worker)) {
				++Count;
				message+=worker + "\n";
				position = worker.getTitle();
			}
		}
		if (Count >= 2)
		finalMessage += "Title " + position +" Count " + Count +"\n"+message;
		else finalMessage += "Special Title " + position +" Count " + Count +"\n"+message;
	}
	
}
