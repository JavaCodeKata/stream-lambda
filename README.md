Simple Kata for learning Java 8 Streams and Lambdas
=============

Class `ListTransformer` accepts a `List` as an argument and has three methods:
```Java
	/**
	 * This method should take the String List and sort all the String elements in ascending (ASCII) order.
	 * @return The sorted values in ascending ASCII order.
	 */
	public List<String> getSortedStrings();
	
		/**
	 * This method should take the String List and:
	 * <ol>
	 *     <li>filter the elements that contains one or more digits;</li>
	 *     <li>transform (map) the remaining Strings into Integers;</li>
	 *     <li>sort the Integers in ascending order.</li>
	 * </ol>
	 * @return
	 */
	public List<Integer> getSortedIntegers();
	
	/**
	 * This method should take the String List and:
	 * <ol>
	 *     <li>filter the elements that contains one or more digits;</li>
	 *     <li>transform (map) the remaining Strings into Integers;</li>
	 *     <li>sort the Integers in descending order.</li>
	 * </ol>
	 * @return
	 */
	public List<Integer> getSortedDescendingIntegers();
```

We have an accompanying JUnit test called `ListTransformerTest` to validate your code.

If you're not familiar with lambdas we encourage you to first make the tests pass using the imperative syntax.
Then you can refactor your code with small steps and assure that your tests are still passing.

Enjoy and have nice lambdas! :-)
