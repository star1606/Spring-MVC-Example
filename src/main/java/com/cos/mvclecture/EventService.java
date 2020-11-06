package com.cos.mvclecture;

import java.time.LocalDateTime;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class EventService {
	public List<Event> getEvents() {
		Event event1 = Event.builder()
				.name("스프링 웹 MVC 스터디 1차")
				.limitOfEnrollment(5)
				.startDateTime(LocalDateTime.of(2019, 1, 10, 10, 0))
				.enDateTime(LocalDateTime.of(2019, 1, 10, 12, 0))
				.build();
		
		Event event2 = Event.builder()
				.name("스프링 웹 MVC 스터디 2차")
				.limitOfEnrollment(5)
				.startDateTime(LocalDateTime.of(2019, 1, 17, 10, 0))
				.enDateTime(LocalDateTime.of(2019, 1, 17, 12, 0))
				.build();
		
		Stream<Event> events = Stream.of(event1, event2);
		System.out.println("event 값은? :" + events);
		List<Event> result = events.collect(Collectors.toList());
		System.out.println("result 값은? : " + result);
		
		
		// return을 스트링을 리스트로 하는 방법은?	
		return result;
	}
}
