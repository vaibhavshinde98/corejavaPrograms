package Collection.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {

	public static void main(String[] args) {
		ArrayList a= new ArrayList<>();
		a.add(new Song("all is well","sonu nigam","3 idiots","hindi"));
		a.add(new Song("zara sa","k.k","jannat","hindi"));
		a.add(new Song("ved tuze","ajay-atul","ved","marathi"));
		a.add(new Song("perfect","ed sheeran","album","english"));
		
		System.out.println("song playlist has been created...");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("type song to search in playlist:    ");
		
		String song= sc.next();
		
		for(int i=0;i<a.size();i++) {
			Song so=(Song)a.get(i);
			if(song.equals(so.name)) {
				System.out.println("sound found...!");
				System.out.println(a.get(i));
				break;
			}
		}
	}

}
