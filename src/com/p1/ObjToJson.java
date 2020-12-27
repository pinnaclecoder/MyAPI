package com.p1;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ObjToJson {
	public static void main(String[] args) {
		List<String> email = new ArrayList<String>();
		email.add("a@gmail.com");
		email.add("b@gmail.com");
		Student st1 = new Student(5, "abccccccccc", email);
		System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(st1));
	}
}
