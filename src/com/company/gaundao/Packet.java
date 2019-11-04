package com.company.gaundao;

public class Packet {
	//标号
	private int pno = -1;
	//标号对应的内容
	private String content;
	public Packet() {
	}

	public Packet(int no) {
		pno = no;
	}
	public  void setContent(String c) {
		content=c;
	}
	public String toString() {
		return "Packet(" + pno + "):"+content;
	}
}
