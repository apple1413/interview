package com.company.gaundao;

public abstract class Filter {
	protected Pipe input;
	protected Pipe output;
	
	public Filter(Pipe in, Pipe out) {
		input=in;
		output=out;
	}
	
	public abstract void process();
}
