package chapter15;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		//왼쪽 마지막 노드에서 오른쪽 마지막 노드까지 바나복해서 가져오기(오름차순)
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
	}
}
