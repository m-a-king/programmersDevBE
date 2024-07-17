package day02;

import java.util.Comparator;

public class MyLinkedList<T> {
    Node<T> head = null; // 시작
    Node<T> currentNode = null; // 현재 바라보고 있는 노드


    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    public void addFirst(T newData) {
        Node<T> tmp = head;
        Node<T> newNode = new Node(newData, tmp);
        head = currentNode = newNode;
    }

    public void addLast(T newData) {
        if (head == null) {
            addFirst(newData);
        } else {
            Node<T> end = new Node(newData, null);
            Node<T> ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = currentNode = end;
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = currentNode = head.next;
        }
    }

    public void removeLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            removeFirst();
        } else {
            Node<T> ptr = head;
            Node<T> beforePtr = null;
            while (ptr.next != null) {
                beforePtr = ptr;
                ptr = ptr.next;
            }
            beforePtr.next = null; // Remove the last node by setting second to last node's next to null
            currentNode = beforePtr; // Update currentNode to the new last node
        }
    }

    public void printCurrentNode() {
        System.out.println("----------------------------");
        if (currentNode == null) {
            System.out.println("선택한 노드가 없습니다");
        } else {
            System.out.println("currentNode = " + currentNode.data);
        }
    }

    public void printAllNode() {
        System.out.println("****************************");
        Node<T> ptr = head;
        if (ptr == null) {
            return;
        }
        while (ptr.next != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println(ptr.data);

    }

    /**
     * 선택한 노드를 삭제하는 메서드
     */
    public void removeCurrentNode() {
        if (currentNode == null) {
            System.out.println("현재 선택된 노드가 없습니다.");
            return;
        }

        if (currentNode == head) {
            // 현재 노드가 첫 번째 노드인 경우
            removeFirst();
        } else {
            Node<T> ptr = head;
            Node<T> beforePtr = null;

            // currentNode의 이전 노드를 찾기
            while (ptr != null && ptr != currentNode) {
                beforePtr = ptr;
                ptr = ptr.next;
            }

            if (ptr == null) {
                System.out.println("현재 선택된 노드를 찾을 수 없습니다.");
                return;
            }

            // beforePtr를 사용하여 currentNode를 리스트에서 제거
            if (beforePtr != null) {
                beforePtr.next = currentNode.next;
            }

            // currentNode를 다음 노드로 업데이트
            currentNode = currentNode.next;
        }

        System.out.println("선택된 노드가 삭제되었습니다.");
    }

    /**
     * 전체 노드를 삭제하는 메서드
     */
    public void clear() {
        while (head != null) {
            removeFirst();
        }
        currentNode = null;
    }//----------------------------------

    /**
     * 선택한 노드를 한칸 뒤로 이동시키는 메서드
     */
    public boolean next() {
        if (currentNode == null || currentNode.next == null) {
            return false;
        }
        currentNode = currentNode.next;
        return true;
    }//------------------------------------

    /**
     * 특정 노드를 검색하는 메서드
     */
    public T search(T obj, Comparator<T> comparator) {
        Node<T> ptr = head;
        while (ptr != null) {
            if (comparator.compare(obj, ptr.data) == 0) {
                //검색에 성공했다면
                currentNode = ptr;
                return ptr.data;//검색한 데이터 반환
            }//if------------
            ptr = ptr.next;//이동
        }//while------
        return null;//찾지 못한 경우
    }//-----------------------------
}
