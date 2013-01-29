/*
 * Copyright 2012-2015, the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sift.runtime.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.sift.runtime.Tuple;
import org.sift.runtime.spi.Shuffler;

/**
 * The <code>MemShuffler</code> is a memory based {@link Shuffler} implementation
 * 
 * @author Regunath B
 * @version 1.0, 28 Jan 2013
 */
public class MemShuffler implements Shuffler, Comparator<Tuple> {

	/**
	 * Interface method implementation. Sorts the specified Tuple list in memory
	 * @see org.sift.runtime.spi.Shuffler#sort(java.util.List)
	 */
	public void sort(List<Tuple> tuples) {
		Collections.sort(tuples, this);		
	}

	/**
	 * Interface method implementation. Compares the keys of the specified Tuple instances using their natural ordering of characters
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Tuple tuple1, Tuple tuple2) {
		return tuple1.getKey().compareTo(tuple2.getKey());
	}

}
