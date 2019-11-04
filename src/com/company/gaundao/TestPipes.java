package com.company.gaundao;

public class TestPipes {

	public static void main(String[] args) {
		//System.out.println("asdasdasd");
		/** Instantiate our pattern blueprint classes. */
		
		Pipe pipe1 = new Pipe();
	
		Pipe pipe2= new Pipe();
		DataSource source = new DataSource(pipe1);
		source.process();
		FilterImpl filter=new FilterImpl(pipe1,pipe2);
		filter.process();
		DataSink sink = new DataSink(pipe2);
		sink.process();
		
		
	
	}

}
