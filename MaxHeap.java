
public class MaxHeap {
	private int[] data;
	private int capacity;
	private int size;
	
	public MaxHeap(int[] data) {
		this.size = data.length;
		this.capacity = 0;
		this.data = new int[this.size+1];
		for(int i=0; i<this.size ;i++) {
			this.data[++this.capacity] = data[i];
		}
		this.heapify(this.capacity/2);
	}
	
	public MaxHeap(int size) {
		this.capacity = 0;
		this.size = size;
		data = new int[size];
	}
	
	public MaxHeap() {
		this(8);
	}
	
	public void Insert(int newdata) {
		if(++this.capacity >= this.size) return;
		this.data[this.capacity] = newdata;
		int current = this.capacity;
		int currentparent = current/2;
		while(current != 1) {
			if(this.data[current] > this.data[currentparent]) {
				this.Swap(current, currentparent);
			}
			current = currentparent;
			currentparent /= 2;
		}
	}
	
	public int MaxRemove() {
		int MaxValue = this.data[1];
		this.data[1] = this.data[this.capacity--];
		int c = 1;
		while(c<this.capacity){
			int l = c*2;
			int r = l+1;
			if(l > this.capacity) break;
			if(r > this.capacity) {
				if(this.data[c] < this.data[l]) this.Swap(c, l);
				break;
			}
			int max = l;
			if(this.data[l] < this.data[r]) max = r;
			if(this.data[c] < this.data[max]) this.Swap(c, max);
			c = max;
		}
		return MaxValue;
	}
	
	public void Swap(int a, int b) {
		int tmp = this.data[a];
		this.data[a] = this.data[b];
		this.data[b] = tmp;
	}

	public void heapify(int now) {
		if(now==0) return;
		int c = now;
		while(c<this.capacity){
			int l = c*2;
			int r = l+1;
			if(l > this.capacity) break;
			if(r > this.capacity) {
				if(this.data[c] < this.data[l]) this.Swap(c, l);
				break;
			}
			int max = l;
			if(this.data[l] < this.data[r]) max = r;
			if(this.data[c] < this.data[max]) this.Swap(c, max);
			c = max;
		}
		this.heapify(--now);
	}
	
	public int[] Sort() {
		int[] MinHeap = new int[this.capacity];
		for(int i=0; i<this.capacity; i++) MinHeap[i] = this.data[i+1];
		int c = this.capacity;
		while(c != 0) {
			int tmp = MinHeap[0];
			MinHeap[0] = MinHeap[c-1];
			MinHeap[c-1] = tmp;
			int cc=1;
			c--;
			while(c>cc) {
				int l = cc*2;
				int r = l+1;
				if(l > c) break;
				if(r > c) {
					if(MinHeap[cc-1] < MinHeap[0]) {
						int ttmp = MinHeap[cc];
						MinHeap[cc-1] = MinHeap[0];
						MinHeap[0] = ttmp;
					}
					break;
				}
				int max = l;
				if(MinHeap[l-1] < MinHeap[r-1]) max = r;
				if(MinHeap[cc-1] < MinHeap[max-1]) {
					int ttmp = MinHeap[cc-1];
					MinHeap[cc-1] = MinHeap[max-1];
					MinHeap[max-1] = ttmp;
				}
				cc = max;
			}
		}
		return MinHeap;
	}
	
	public void HeapPrint() {
		for(int i=1; i<=this.capacity; i++) System.out.print(this.data[i]+" ");
		System.out.println();
	}
}
