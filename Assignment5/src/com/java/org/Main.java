package com.java.org;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main {

	public static void main(String[] args) {
		
		List<Fruit> fru = Arrays.asList(
				new Fruit("Orange", 88, 45, "Orange"), new Fruit("Mango", 105, 30, "Yellow"),
				new Fruit("Guava", 110, 55, "Green"), new Fruit("Blueberry", 50, 34, "Blue"));

		List<News> news1 = Arrays.asList(
				new News(22, "Onkar", "Alisha", " Immersive learning is good."),
				new News(23, "Shradha", "Srista", "Let's rock and roll!"),
				new News(23, "Salina", "Sanjana", "India will face budget issues later. "),
				new News(24, "Chinmaya", "Chandan", "Farming is the key to Indian Economy"),
				new News(22, "Poonam", "Sonali", "Reality is way far different from what you think."),
				new News(23, "Ankita", "Aniket", "Festivals are the best thing ever happed to India!"));
		
		List<Trader> Trade = Arrays.asList(
				new Trader("Sanam", "Pune"), new Trader("Sargam", "Mumbai"), new Trader("Sagar", "Pune"),
				new Trader("Santanu", "Delhi"), new Trader("Guru", "Delhi"), new Trader("Kiran", "Pune"));
		List<Transaction> Tran = Arrays.asList(

				new Transaction(new Trader("Sanam", "Pune"), 2013, 21000),
				new Transaction(new Trader("Sargam", "Mumbai"), 2011, 22000),
				new Transaction(new Trader("Santanu", "Delhi"), 2015, 55000),
				new Transaction(new Trader("Sagar", "Pune"), 2000, 22200),
				new Transaction(new Trader("Guru", "Delhi"), 2004, 190000),
				new Transaction(new Trader("Kiran", "Pune"), 2015, 300000));

		// Q1) Displayed the fruit names of low calories fruits i.e. calories < 100
		// sorted in
		// descending order of calories.
		System.out.println("According to calories<100: ");
		fru.stream().filter(t -> (t.FCalories < 100)).collect(Collectors.toList())
				.forEach(t -> System.out.println(t));

		// Display color wise list of fruit names
		System.out.println("\n Sort according to color: ");
		fru.stream().sorted((p1, p2) -> p1.FColour.compareTo(p2.FColour)).forEach(System.out::println);

		// Display only RED color fruits sorted as per their price in ascending order.
		System.out.println("\n Sort Red color fruits sorted withprice in ascending: ");
		fru.stream().filter(t -> t.FColour.equals("Red")).forEach(t -> System.out.println(t));

		// Find out the newsId which has received maximum comments.
		System.out.println("\n NewsId which has received maximum comments: ");
		int p = news1.stream().min((p1, p2) -> {
			return (int) p1.getNewsID() + p2.getNewsID();
		}).get().getNewsID();
		System.out.println(p);

		// Find out how many times the word 'budget' arrived in user comments all news.
		System.out.println("\n The word 'budget' arrived in user comments: ");

		news1.stream().filter(t -> t.comment.contains("budget")).forEach(t -> System.out.println(t));

		// Find out which user has posted maximum comments.
		System.out.println("\nwhich user has posted maximum comments");
		String n = news1.stream().max((p1, p2) -> {
			return (int) p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser());
		}).get().getNewsCommentbyUser();

		System.out.println(n);

		// Display commentByUser wise number of comments
		System.out.println("\n CommentByUser wise number of comments:");
		news1.stream().sorted((p1, p2) -> p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser()))
				.collect(Collectors.toList())
				.forEach(t -> System.out.println(t.commentByUser + "=" + t.comment));

		// Find all transactions in the year 2011 and sort them by value (small to
		// high).
		System.out.println("\n Transactions in the year 2011 and sort them by value (small to high): ");
		Tran.stream().filter(t -> (t.getYear() == (2014)))
				.forEach(t -> System.out.println("year=" + t.year + " value=" + t.value));

		// What are all the unique cities where the traders work?
		System.out.println("\n All the unique cities where the traders work:");

		Trade.stream()
				.forEach(t -> System.out.println("Cities=" + t.TradeCity));

		System.out.println("\n Traders from Pune and sort them by name:");
		Trade.stream().filter(t -> t.TradeCity.equals("Pune"))
				.sorted((p1, p2) -> p1.TraderName.compareTo(p2.TraderName))
				.forEach(t -> System.out.println(t.TradeCity + "=" + t.TraderName));

		System.out.println("\n String of all traders’ names sorted alphabetically:");
		Trade.stream().sorted((p1, p2) -> p1.TraderName.compareTo(p2.TraderName))
				.forEach(t -> System.out.println(t.TraderName));

		System.out.println("\n Any traders based in Indore?");
		boolean a = Trade.stream().anyMatch(t -> t.TraderName.equals("indore"));
		System.out.println(a);

		// Print all transactions’ values from the traders living in Delhi.
		System.out.println("\n All transactions values from the traders living in Delhi:");

		Tran.stream().filter(t -> t.trader.TradeCity.equals("Delhi"))
				.forEach(t -> System.out.println(t.trader.TradeCity + "=" + t.value));

		// What’s the highest value of all the transactions?
		System.out.println("\n Highest value of all the transactions:");

		int b = Tran.stream().max((p1, p2) -> p1.value - p2.value).get().getValue();

		System.out.println(b);
		// Find the transaction with the smallest value
		System.out.println("\n Transaction with the smallest value:");
		int s = Tran.stream().min((p1, p2) -> p1.value - p2.value).get().getValue();

		System.out.println(s);

	}

}
