package org.acolle;


import java.util.ArrayList;
import java.util.*;

public class Collection {
	public static void main(String[] args) {
		List <Integer> l= new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(90);
		l.add(60);
		l.add(10);
		System.out.println(l);
		int size = l.size();
		System.out.println(size);
		System.out.println(l.get(1));
		System.out.println(l.lastIndexOf(60));
		System.out.println(l.indexOf(10));
		System.out.println(l.contains(900));
		l.add(400);
		System.out.println(l);
		//indert value of between
		l.add(3, 500);
		System.out.println(l);
		//replace ---set method
		l.set(3, 3000);
		System.out.println(l);
		//remove 
		l.remove(4);
		System.out.println(l);
		//clear
		l.clear();
		l.add(39);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(90);
		l.add(60);
		l.add(10);
		System.out.println(l);
		List<Integer>l2=new ArrayList<>();
		l2.add(30);
		l2.add(40);
		l2.add(900);
		l2.add(600);
		//compare
		l2.addAll(l);
		System.out.println(l2);
		//compaer 2 list
		
		
		System.out.println(l2.equals(l));
		
		//Common values
	//	l2.retainAll(l);
		//System.out.println(l2);
		//remove commo value
		System.out.println(l);
		System.out.println(l2);
		l2.removeAll(l);
		
		System.out.println(l2);
		//for each method
		l.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

