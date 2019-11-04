package com.company.gaundao;

import java.util.ArrayDeque;

public class Pipe {
	private ArrayDeque<Packet> packets = new ArrayDeque<Packet>();
	

	public void write(Packet packet) {
		packets.addFirst(packet);
		//System.out.println(""+packet+" is written into pipe.");
		
	}

	public int size() {
		return packets.size();
	}

	public Packet read() throws EmptyPipeException {
		if (size() == 0) {
			throw new EmptyPipeException();
		}
		Packet p = packets.getLast();
		packets.pollLast();
		return p;
	}
}
