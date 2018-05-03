package Server;

import java.util.ArrayList;
import java.util.List;

public class Topic
{
	String name;
	List<String> listOfNews;
	public Topic(String name)
	{
		this.name = name;
		listOfNews = new ArrayList<>();
	}
	
	public void addNews(String news)
	{
		listOfNews.add(news);
	}
}
