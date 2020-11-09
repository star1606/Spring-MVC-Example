package com.cos.mvclecture;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
				.endDateTime(LocalDateTime.of(2019, 1, 10, 12, 0))
				.build();
		
		Event event2 = Event.builder()
				.name("스프링 웹 MVC 스터디 2차")
				.limitOfEnrollment(5)
				.startDateTime(LocalDateTime.of(2019, 1, 17, 10, 0))
				.endDateTime(LocalDateTime.of(2019, 1, 17, 12, 0))
				.build();
		
		//Stream<Event> events = Stream.of(event1, event2);
		//System.out.println("event 값은? :" + events);
		//List<Event> result = events.collect(Collectors.toList());
		//System.out.println("result 값은? : " + result);
		//System.out.println(result.get(0).getName());
		
		// return을 스트링을 리스트로 하는 방법은?	
		
		
		List<Event> eventList = new ArrayList<>();
		System.out.println("eventList add 전" + eventList);
		eventList.add(event1);
		eventList.add(event2);
		System.out.println("eventList add 후" + eventList);
		
		return eventList;
		
		
	}
}
