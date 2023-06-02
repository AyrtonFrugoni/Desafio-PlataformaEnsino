package entities;

public abstract class Lesson {
	 private String title;

	    public Lesson(String title) {
	        this.title = title;
	    }

	    public abstract int duration();

	    public String getTitle() {
	        return title;
	    }
	}



