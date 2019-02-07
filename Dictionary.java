package part1;
import java.util.*;
import java.io.*;
public class Dictionary {
	
	private ArrayList<Word> theDictionary;
	private BufferedWriter outputWriter;

	
	
	public Dictionary() {
		theDictionary = new ArrayList<Word>();
	}
	
	public Dictionary (String inString) {
		
		addWords(inString);
		int counter = numberOfWords();
	
	}
	public void addWords(String inString) {
		//breaks up the value of arg in individual words
		//string seperator
		
		String[] theWords = inString.split(" +");
		for(int i=0; i < theWords.length; i++ ) {
			Word oneWord = new Word(theWords[i]);
			theDictionary.add(oneWord);
		}
		
		
	}
	
	public int numberOfWords() {
		return theDictionary.size();
	}
	
	public void removeDuplicates() {
		
		if(theDictionary.size()< 2)
		{
			System.out.println("No duplicates found because there is only one word");
		}
		else {
			for(int i = 0; i < (theDictionary.size()-1); i++) {
				for(int j = 1; j < theDictionary.size(); j++) {
					if(theDictionary.get(i).equals(theDictionary.get(j))) {
						theDictionary.remove(i);
						theDictionary.get(j).increaseCounts();//changes the value of counts
						
					
					}
				}
			}
		}
		
	}
	
	public String countOccurences() {
		String result="";
		for(int N = 1; N < theDictionary.size(); N++) {
			int M = 0;
			for(int j = 0; j < theDictionary.size(); j++) {
				if(theDictionary.get(j).getCounts() == N) {
					M++;
				}
			}
			result = result + "\nThere are " + M + " words that occured " + N + "times.";
			
		}
		return result;
		
	}
	
	public void sortDictionaryByCounts() {
		int n = theDictionary.size();
		Word temp;
	
		for(int i=0; i<n; i++) {
			for(int j=1; j < (n-i); j++) {
				if((theDictionary.get(j-1).getCounts())<(theDictionary.get(j).getCounts())) {
					temp = theDictionary.get(j-1);
					theDictionary.add((j-1),theDictionary.get(j));
					theDictionary.add(j,temp);
				}
			}
		}
	}
	
	public void setFileName(String inString) {
		
	
		
		//catch IOexception
	}
	
	public void saveFile() {
		
	}
	
	public String toString() {
		String result="";
		//total number of words
		//total number of occurences
		
		
		return result;
	}
	
}
