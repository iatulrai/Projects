package javaThreading;

import java.util.HashMap;
import java.util.Map;

public class SimpleCache {

	private final Map cache = new HashMap();

	public Object load(String objectName) {
		return objectName;

	}

	public void clearCache() {
		synchronized (cache) {
			cache.clear();

		}
	}

	public Object getObject(String objectName, Object o) {

		synchronized (cache) {

			Object o1 = cache.get(objectName);
			
			if (o1 == null) {
				
				o1 = load(objectName);
				cache.put(objectName, o1);

			}
		}
		
		return o;
	}

}
