package com.nlp.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestMessageFilter {

	public static void main(String[] args) {
		Long StartTime = System.currentTimeMillis();
		List<String> set = new ArrayList<String>();
		set.addAll(getSampleArrayList());
		System.out.println("000000000000 "+ set.size());
		Map<String, List<String>> map = NlpService.getFilteredMap(set);
		map.entrySet().stream().forEach(mapContent -> {
			System.out.println(" map content is::::: " + mapContent + "******");
		});

		System.out.println("Time taken-------------------- " + (System.currentTimeMillis() - StartTime));
	}

	private static List<String> getSampleArrayList() {
		List<String> stringSet = new ArrayList<String>();
		stringSet.add("its is grateful beautiful friends are fulfilling an incredibly joyful accomplishment.");
		stringSet.add("What an truly terrible idea");
		stringSet.add("How are you");
		stringSet.add("VPN is slow");
		stringSet.add("VPN is down");
		stringSet.add("VPN is worst");
		stringSet.add("I am Software Engineer");
		stringSet.add("I am Software Developer");
		stringSet.add("I am Engineer");
		stringSet.add("i am facing VPN slowness");
		stringSet.add("i faced issue where VPN is performing slow");
		stringSet.add("i am facing VPN slowness");
		stringSet.add("i am getting issues related to VPN slowness");
		stringSet.add("there are VPN slowness issues");
		stringSet.add("How are you");
		stringSet.add("how are you doing");
		stringSet.add("how do you do");
		stringSet.add("You are bad guy");
		stringSet.add("You are not good guy");
		stringSet.add("You are not good guy");
		return stringSet;
	}

}
