package com.example.demo;

import java.util.Comparator;

public class UsnComparator implements Comparator<Data>{

	@Override
	public int compare(Data arg0, Data arg1) {
		return arg0.getUsn().compareTo(arg1.getUsn());
	}
    
}
