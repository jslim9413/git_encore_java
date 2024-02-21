import java.util.PriorityQueue;

public class TestCaseMain {

	public static void main(String[] args) {
		PriorityQueue<Task> pq = new PriorityQueue<>();

        pq.add(new Task(4, "키보드 청소하기"));
        pq.add(new Task(1, "알고리즘 문제 풀기"));
        pq.add(new Task(3, "취업 공고 찾아보기"));
        pq.add(new Task(2, "강의 듣기"));

        while (!pq.isEmpty()) {
            Task task = pq.poll();
            System.out.println("[중요도: " + task.getPriority() + "]" + task.getTitle());
        }
	}

}


