package org.gravity.arte.execution;

public class Timer {
	
	private boolean running = false;
	private boolean paused = false;
	
	private long time = 0;
	private long start_time = 0;
	
	public void start(){
		if(!running){
			running = true;
			paused = false;
			time = 0;
			start_time = System.nanoTime();
		}
	}
	
	public long stop(){
		if(running){
			if(paused){
				running = false;
				paused = false;
				return time;
			}
			else{
				long duration =time + System.nanoTime()-start_time;
				return duration;
			}
		}
		else{
			return -1;
		}
	}
	
	public void reset(){
		time = 0;
		start_time = 0;
		running = false;
		paused = false;
	}
	
	public long pause(){
		if(running){
			if(paused){
				return time;
			}
			else{
				time += System.nanoTime() - start_time;
				start_time = 0;
				paused = true;
				return time;
			}
		}
		else{
			return -1;
		}
	}
	
	public void proceed(){
		if(paused && running){
			paused = false;
			start_time = System.nanoTime();
		}
	}
	
	public long getCurrentTime(){
		if(running){
			if(paused){
				return time;
			}
			else{
				return time += System.nanoTime()-start_time;
			}
		}
		else{
			return -1;
		}
	}

	public boolean isRunning() {
		return running;
	}

	public boolean isPaused() {
		return paused;
	}

}
