package com.nlp.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestMessageFilter {

	public static void main(String[] args) {
		Long StartTime = System.currentTimeMillis();
		List<String> set = new ArrayList<String>();
		set.addAll(getSampleArrayList());
		Map<String, List<String>> map = NlpService.getFilteredMap(set);
		map.entrySet().stream().forEach(mapContent -> {
			System.out.println(" map content is::::: " + mapContent + "******");
		});

		System.out.println("Time taken-------------------- " + (System.currentTimeMillis() - StartTime));
	}

	private static List<String> getSampleArrayList() {
		List<String> stringList = new ArrayList<String>();
		stringList.add("its is grateful beautiful friends are fulfilling an incredibly joyful accomplishment.");
		stringList.add("What an truly terrible idea");
		stringList.add("How are you");
		stringList.add("VPN is slow");
		stringList.add("VPN is down");
		stringList.add("VPN is worst");
		stringList.add("I am Software Engineer");
		stringList.add("I am Software Developer");
		stringList.add("I am Engineer");
		stringList.add("i am facing VPN slowness");
		stringList.add("i faced issue where VPN is performing slow");
		stringList.add("i am facing VPN slowness");
		stringList.add("i am getting issues related to VPN slowness");
		stringList.add("there are VPN slowness issues");
		stringList.add("How are you");
		stringList.add("how are you doing");
		stringList.add("how do you do");
		stringList.add("You are bad guy");
		stringList.add("You are not good guy");
		stringList.add("You are not good guy");
		return stringList;
	}

}
