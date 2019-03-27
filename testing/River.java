package testing;


import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

public class River{

	final static int size=5;
	private static int count = 0;
	static Animal[]river = new Animal[size];
	static int randomNum=0;
	public static void enterRiver() {
		for(int i=0;i<river.length;i++) {
			randomNum = ThreadLocalRandom.current().nextInt(0,1+1);
			switch(randomNum) {

			case 0:
				river[i]=new Bear("tedy",4,4);
				break;

			case 1:
				river[i]=new Fish("nemo",2,2);
				break;
			}
		}
	}
	
	public static void showRiver() {
		
		for (int i=0;i<river.length;i++) {
			System.out.println(river[i]);
		}
	}
	
	public static void swimAround() {
		
		for (int i=0;i<river.length;i++) {
			randomNum = ThreadLocalRandom.current().nextInt(0,1+1);
			switch(randomNum) {
			case 0://moves
				if((river[i].getClass()==Bear.class)&&(
						river[++i].getClass()==Fish.class)) {
					
					river[i++]=river[i];
					System.out.println("tedy eats nemo");
				}
								
				return;
				
			case 1://stays
				System.out.println("noone swims");
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		enterRiver();
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				count++;
				showRiver();
				System.out.println("---new swim---");
				swimAround();
				
				if(count >2) {
					timer.cancel();				
					timer.purge();
					System.out.println("stoped");
				}
			}
		};
		timer.schedule(task, 2000,2000);
		Thread.sleep(2000);
	}
}
