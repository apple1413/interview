package com.company.gaundao;

public class FilterImpl extends Filter {
	public FilterImpl(Pipe in,Pipe out) {
		super(in,out);
	}
	public void customNotify() {
		process();
	}

	@Override
	public void process() {
		while (input.size() > 0) {
			try {
				Packet packet=input.read();//
				//packet.setContent("");
				output.write(packet);
				System.out.println("已经将"+packet+"写入到了pipe2");

			}  catch (EmptyPipeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
