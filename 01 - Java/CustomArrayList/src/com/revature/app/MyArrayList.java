package com.revature.app;

public class MyArrayList <T> {
	
	private Object[] data;
	private int counter;
	
	public MyArrayList() {
		data = new Object[10];
		counter = 0;
	}
	
	public MyArrayList(int size) {
		data = new Object[size];
		counter = 0;
	}
	
	public int getSize() {
		return counter;
	}
	
	public void add(T element) {
		
		if (counter + 1 >= data.length) {
			// Resize the array
			resize();
		}
		
		data[counter] = element;
		++counter;
	}
	
	public T get(int index) {
		
		if (index < 0 || index >= data.length)
			throw new IndexOutOfBoundsException();
		
		return (T)data[index];
	}
	
	private void resize() {
		// Calculate new size and create a new array
		int newSize = data.length*2;
		Object[] newData = new Object[newSize];
		
		// Copy data over from old array to new array
		for (int i = 0; i < data.length; ++i) {
			newData[i] = data[i];
		}
		
		// Replace data array with newData
		data = newData;
	}
}
