package com.rays.interfacee;

public class TestBusinessman {
	public static void main(String[] args) {

		Businessman bm = new Businessman();

		bm.donation();
		bm.earnMoney();

		SocialWorker sw = new Businessman();

		sw.helpToOthers();
		sw.helpToOthers();

		Richman rm = new Businessman();

		rm.earnMoney();
		rm.donation();
		rm.party();

	}
}