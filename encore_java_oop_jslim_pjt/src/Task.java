import java.util.Comparator;

public class Task implements Comparable<Task>{
	private int priority; //일의 중요도
    private String title; //업무 내용
    
    public Task() {
	}
    public Task(int priority, String title) {
        this.priority = priority;
        this.title = title;
    }
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public int compareTo(Task o) {
		return this.priority - o.priority ;
	}

	
}
