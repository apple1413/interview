package com.company.gaundao;

import java.util.ArrayDeque;

public class DataSink extends Filter{
	private	FilterImpl observer;

	protected ArrayDeque<Packet> received = new ArrayDeque<Packet>();

	public DataSink(Pipe in) {
		super(in,null);
		observer = null;
	}
	public int size() {
		return received.size();
	}

	public Packet nextPacket() {
		Packet p = received.getLast();
		received.pollLast();
		return p;
	}
	public void customNotify() {
		try {
			while(input.size() > 0) {
				received.addFirst(input.read());
			}
		} catch (EmptyPipeException e) {
			System.err.println(" empty pipe. ");
		}
		if(observer != null)
			observer.customNotify();
	}

	public void setObserver(FilterImpl observer) {
		this.observer = observer;
	}
	public FilterImpl getObserver() {
		return observer;
	}
	@Override
	public void process() {
		try {
			int i=0;
			for(i=0;i<4;i++){
				System.out.println(input.read()+"已经进入了数据池");
				}

		} catch (EmptyPipeException e) {
			e.printStackTrace();
		}

	}
}
