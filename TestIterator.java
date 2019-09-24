package cn.test.Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 利用迭代器去遍历list.set,map.
 * @author dell
 *
 */

public class TestIterator {
	
	public static void testIteratorList() {
		List<String> list=new ArrayList<>();
		list.add("q");
		list.add("w");
		list.add("r");
		for(Iterator<String> iter=list.iterator();iter.hasNext();) {
			String temp=iter.next();
			System.out.println(temp);
		}
		
	}
	
	public static void testIteratorSet() {
		Set<String> set=new HashSet<>();
		set.add("q");
		set.add("a");
		set.add("r");
		for(Iterator<String> iter=set.iterator();iter.hasNext();) {
			String temp=iter.next();
			System.out.println(temp);
		}
		
	}
	
	public static void testIteratorMap() {
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"q");
		map.put(2,"w");
		map.put(3,"r");
		
		Set<Entry<Integer,String>> ss=map.entrySet();
		for(Iterator<Entry<Integer,String>> iter=ss.iterator();iter.hasNext();) {
			Entry<Integer,String> temp=iter.next();
			System.out.println(temp);
		}
		
		Set<Integer> keyset=map.keySet();
		for(Iterator<Integer> iter=keyset.iterator();iter.hasNext();) {
			Integer temp=iter.next();
			System.out.println(temp+"--"+map.get(temp));
		}
		
	}
	public static void main(String[] args) {
		testIteratorList();
		testIteratorSet();
		testIteratorMap();
	}

}
