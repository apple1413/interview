package com.company.gaundao;

public class DataSource extends Filter{
		
	public DataSource(Pipe out) {
		super(null,out);		
	}

	@Override
	public void process() {
		for(int i=1;i<5;i++) {
			System.out.println("DataSource: packet("+i+") is created.");
			Packet p=new Packet(i);
			p.setContent("第"+i+"已经写入pipe");
			System.out.println("第"+i+"已经写入pipe");
			output.write(p);
			
			
		}
		
	}
}
