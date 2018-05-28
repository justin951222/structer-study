
public class test {
	public static void main(String[] args) {
		int[] data = {14, 16, 4, 10, 3, 7, 8, 1, 9, 2}; 
		MaxHeap H = new MaxHeap(8);
		H.Insert(1);
		H.Insert(3);
		H.Insert(2);
		H.Insert(4);
		H.Insert(8);
		H.Insert(7);
		H.Insert(6);
		H.HeapPrint();
		int[] I = H.Sort();
		for(int i=1; i<I.length; i++) System.out.print(I[i]+" ");
		System.out.println();
		System.out.println();
		H.MaxRemove();
		H.HeapPrint();
		H.MaxRemove();
		H.HeapPrint();
		System.out.println();
		
		H = new MaxHeap(data);
		H.HeapPrint();
		System.out.println();
		
		I = H.Sort();
		for(int i=1; i<I.length; i++) System.out.print(I[i]+" ");
		System.out.println();
		System.out.println();
		
		MinHeap Hm = new MinHeap(data);
		Hm.HeapPrint();
		Hm.MinRemove();
		Hm.HeapPrint();
		Hm.MinRemove();
		Hm.HeapPrint();
		System.out.println();
		

		I = Hm.Sort();
		for(int i=0; i<I.length; i++) System.out.print(I[i]+" ");
		System.out.println();
		System.out.println();
		
		Hm = new MinHeap(8);
		Hm.Insert(8);
		Hm.Insert(7);
		Hm.Insert(6);
		Hm.Insert(1);
		Hm.Insert(3);
		Hm.Insert(2);
		Hm.Insert(4);
		Hm.HeapPrint();
		

		I = Hm.Sort();
		for(int i=0; i<I.length; i++) System.out.print(I[i]+" ");
		System.out.println();
		System.out.println();
	}
}
