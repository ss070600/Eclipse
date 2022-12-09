package com.beans;

import java.util.*;

public class LibraryMap {
	private HashMap<String, List<Book>> libMap = new HashMap<String, List<Book>>();

	public HashMap<String, List<Book>> getLibMap() {
		return libMap;
	}

	public void setLibMap(HashMap<String, List<Book>> libMap) {
		this.libMap = libMap;
	}

	public void displayBooks() {
		for (Map.Entry<String, List<Book>> entry : libMap.entrySet()) {
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		}
	}

	@Override
	public String toString() {
		return "LibraryMap [libMap=" + libMap + "]";
	}
	
}
