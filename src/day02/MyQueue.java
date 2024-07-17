package day02;

public class MyQueue {
    private Object[] queue;
    private int size;
    private int front; // 사실상 디큐 포인터
    private int rear; // 사실상 인큐 포인터
    private int cnt; // 데이터 입력 개수

    public MyQueue(int size) {
        this.size = size;
        queue = new Object[size];
        front = 0;
        rear = 0;
        cnt = 0;
    }

    public Object enqueue(Object data) {
        if (cnt == size) {
            throw new RuntimeException("overFlow");
        }
        queue[rear++] = data;
        cnt++;
        if (rear == size) {
            rear = 0;
        }
        return data;
    }

    public Object dequeue() {
        if (cnt == 0) throw new RuntimeException("empty");
        Object data = queue[front++];
        cnt--;
        if (front == size) {
            front = 0;
        }
        return data;
    }

    public Object peek() {
        if (cnt == 0) throw new RuntimeException("empty");
        return queue[front];
    }

    // 모두 출력 front 활용
    public void printQueue() {
        if (cnt == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            int index = front;
            for (int i = 0; i < cnt; i++) {
                System.out.print(queue[index] + " ");
                index = (index + 1) % size;  // 원형 구조에서 다음 인덱스로 이동
            }
            System.out.println();  // 모든 요소 출력 후 줄바꿈
        }
    }

    // 검색
    public int indexOf(Object data) {
        int index = front;
        for (int i = 0; i < cnt; i++) {
            if (queue[index].equals(data)) {
                return (index - front + size) % size;  // 인덱스를 front에 상대적으로 조정
            }
            index = (index + 1) % size;  // 원형 구조에서 다음 인덱스로 이동
        }
        return -1;  // 데이터를 찾지 못했을 때 -1 반환
    }

    /**현재 큐에 저장된 데이터수 반환*/
    public int size() {
        return cnt;
    }//-------------------------------
    public boolean isFull() {
        return cnt>=this.size;
    }//-------------------------------
    public boolean isEmpty() {
        return cnt<=0;
    }//-------------------------------
}
