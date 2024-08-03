package flatten;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Flattener {
	<T> List<T> flatten(List<T> list) {
		List<T> flatList = new ArrayList<T>();
		System.out.println(list);
		
		//list.forEach(l -> l.);
		for(int i = 0 ;  i < list.size(); i++) { 
			
			if(list.get(i) instanceof List<?>) {
				//flatList.addAll((Collection<? extends T>) list.get(i));
				List<T> subList = new ArrayList<T>((Collection<? extends T>) list.get(i));
				for(int j = 0; j < subList.size();j++) {
					if(subList.get(j) instanceof List<?>) flatList.addAll((Collection<? extends T>) subList.get(j));
					else flatList.add(subList.get(j));
				}
			}
			
			else flatList.add(list.get(i));
		}
		
		String stringList = list.toString();
		//stringList = stringList.replaceAll("[^\\w, ]*","");
		//System.out.println(stringList);
		


		return flatList;  
    }

}
