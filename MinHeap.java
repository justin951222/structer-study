
public class MinHeap {
	private int[] data;
	private int capacity;
	private int size;
	
	public MinHeap(int[] data) {
		this.size = data.length;
		this.capacity = 0;
		this.data = new int[this.size+1];
		for(int i=0; i<this.size ;i++) {
			this.data[++this.capacity] = data[i];
		}
		this.heapify(this.capacity/2);
	}
	
	public MinHeap(int size) {
		this.capacity = 0;
		this.size = size;
		data = new int[size];
	}
	
	public MinHeap() {
		this(8);
	}
	
	public void Insert(int newdata) {
		if(++this.capacity >= this.size) return;
		this.data[this.capacity] = newdata;
		int current = this.capacity;
		int currentparent = current/2;
		while(current != 1) {
			if(this.data[current] < this.data[currentparent]) {
				this.Swap(current, currentparent);
			}
			current = currentparent;
			currentparent /= 2;
		}
	}
	
	public int MinRemove() {
		int MinValue = this.data[1];
		this.data[1] = this.data[this.capacity--];
		int c = 1;
		while(c<this.capacity){
			int l = c*2;
			int r = l+1;
			if(l > this.capacity) break;
			if(r > this.capacity) {
				if(this.data[c] > this.data[l]) this.Swap(c, l);
				break;
			}
			int min = l;
			if(this.data[l]>this.data[r]) min = r;
			if(this.data[c] > this.data[min]) this.Swap(c, min);
			c = min;
		}
		return MinValue;
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
				if(this.data[c] > this.data[l]) this.Swap(c, l);
				break;
			}
			int min = l;
			if(this.data[l] > this.data[r]) min = r;
			if(this.data[c] > this.data[min]) this.Swap(c, min);
			c = min;
		}
		this.heapify(--now);
	}
	
	public int[] Sort() {
		int[] MaxHeap = new int[this.capacity];
		for(int i=0; i<this.capacity; i++) MaxHeap[i] = this.data[i+1];
		int c = this.capacity;
		while(c != 0) {
			int tmp = MaxHeap[0];
			MaxHeap[0] = MaxHeap[c-1];
			MaxHeap[c-1] = tmp;
			int cc=1;
			c--;
			while(c>cc) {
				int l = cc*2;
				int r = l+1;
				if(l > c) break;
				if(r > c) {
					if(MaxHeap[cc-1] > MaxHeap[l-1]) {
						tmp = MaxHeap[cc-1];
						MaxHeap[cc-1] = MaxHeap[l-1];
						MaxHeap[l-1] = tmp;
					}
					break;
				}
				int min = l;
				if(MaxHeap[l-1] > MaxHeap[r-1]) min = r;
				if(MaxHeap[cc-1] > MaxHeap[min-1]) {
					tmp = MaxHeap[cc-1];
					MaxHeap[cc-1] = MaxHeap[min-1];
					MaxHeap[min-1] = tmp;
				}
				cc = min;
			}
		}
		return MaxHeap;
	}
	
	public void HeapPrint() {
		for(int i=1; i<=this.capacity; i++) System.out.print(this.data[i]+" ");
		System.out.println();
	}
}
