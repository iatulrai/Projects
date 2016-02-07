package com.javadoc;

public interface Mythical {
	default public String identifyMeself() {
		return "I am a mythical creature";
	}
}