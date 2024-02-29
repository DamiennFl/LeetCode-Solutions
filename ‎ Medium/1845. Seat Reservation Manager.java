import java.util.PriorityQueue;

class SeatManager {

    int last;
    PriorityQueue<Integer> queue;
    public SeatManager(int n) {
        this.last = 0;
        this.queue = new PriorityQueue<Integer>();
    }
    
    public int reserve() {
        if(queue.isEmpty()) {
            return ++last;
        } else {
            return queue.poll();
        }
    }
    
    public void unreserve(int seatNumber) {
        if(seatNumber == last) {
            last--;
        } else {
            queue.offer(seatNumber);
        }
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */