import java.io.*;
import java.util.*;

public class project1main {

	public static void main(String[] args) {
		
		//reading and writing to a file
		
		File inFile = new File(args[0]);
		File outFile = new File(args[1]); 
		PrintStream outstream;
		try {
		        outstream = new PrintStream(outFile);
		}catch(FileNotFoundException e2) {
		        e2.printStackTrace();
		        return;
		}
		Scanner reader;
		try {
			reader = new Scanner(inFile);
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find input file");
			return;
		}
		
		//reading and writing to a file
		
		
		boolean check = true;
		int duration_check = 0;
		TreeMap<Integer, Student> tmapstudent = new TreeMap<Integer, Student>();
		TreeMap<Integer, House> tmaphouse = new TreeMap<Integer, House>();
		
		try {
		while (check == true) {
		String inputCode = reader.next();
		
		if (inputCode.equals("h") || inputCode.equals("s")) {
			if (inputCode.equals("h")) {
			int pId = Integer.parseInt(reader.next());
			int pDuration = Integer.parseInt(reader.next());
			double pRating = Double.parseDouble(reader.next());
			House h = new House(pId, pDuration, pRating);
			tmaphouse.put(h.getID(), h);}
			else {
				int pId = Integer.parseInt(reader.next());
				String pName = reader.next();
				int pDuration = Integer.parseInt(reader.next());
				double pRating = Double.parseDouble(reader.next());
				if (pDuration >= duration_check) {
					duration_check += pDuration;
				}
				Student s = new Student(pId, pName, pDuration, pRating);
				tmapstudent.put(s.getID(), s);
			}
		}}}
		catch(Exception e){
			check = false;}
		
		for(int i = 0; i<duration_check; i++) {
			
		for (Map.Entry<Integer,Student> entry : tmapstudent.entrySet()) {
			for (Map.Entry<Integer,House> entry2 : tmaphouse.entrySet()) {
				if(entry.getValue().getRating() <= entry2.getValue().getRating() && entry2.getValue().getDuration() == 0 && entry.getValue().getDuration() != 0 && entry.getValue().getAllocation() == 0) {
					entry.getValue().setAllocation(1);
					entry2.getValue().setDuration(entry.getValue().getDuration());	
				}
				}
		}
		for (Map.Entry<Integer,Student> entry : tmapstudent.entrySet()) {
		if (entry.getValue().getDuration() != 0) {
		entry.getValue().setDuration();
		}}
		for (Map.Entry<Integer,House> entry2 : tmaphouse.entrySet()) {
		if (entry2.getValue().getDuration() != 0) {
			int x = entry2.getValue().getDuration()-1;
		entry2.getValue().setDuration(x);}
		}}
		for (Map.Entry<Integer,Student> entry : tmapstudent.entrySet()) {
			if(entry.getValue().getAllocation() == 0)
				outstream.println(entry.getValue().getName());
			}
		outstream.close();
		reader.close();
}}
