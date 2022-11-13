import java.io.FileNotFoundException;

//XSmall (Size: 10 lines)
//Small (Size: 100 lines)
//Medium (Size: 1000 lines)
//Large (Size: 10000 lines)
//XLarge (Size: 100000 lines)
//Huge (Size: 1000000 lines)

enum Datasize {
	XSmall, Small, Medium, Large, XLarge, Huge;
}

public class PQTester {

	public static void main(String[] args) throws FileNotFoundException {
		
		long start;
		long end;
		
		//PQUnsortedArray test=======================================================================================
		System.out.println("**************PQUnsortedArray test**************\n");
		
		//XSmall------------------------------------------------------------------------------------------------------
		System.out.println("File Size: XSmall");
		
		start = System.currentTimeMillis();
		MyPQUnsortedArray XSmallPQUnsortedArray = new MyPQUnsortedArray(Datasize.XSmall);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 10; ++idx) {
			XSmallPQUnsortedArray.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
		
		//Small------------------------------------------------------------------------------------------------------
		System.out.println("File Size: Small");
		
		start = System.currentTimeMillis();
		MyPQUnsortedArray SmallPQUnsortedArray = new MyPQUnsortedArray(Datasize.Small);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 100; ++idx) {
			SmallPQUnsortedArray.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
		
		//Medium------------------------------------------------------------------------------------------------------
		System.out.println("File Size: Medium");
		
		start = System.currentTimeMillis();
		MyPQUnsortedArray MediumPQUnsortedArray = new MyPQUnsortedArray(Datasize.Medium);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 1000; ++idx) {
			MediumPQUnsortedArray.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
		
		//Large------------------------------------------------------------------------------------------------------
		System.out.println("File Size: Large");
		
		start = System.currentTimeMillis();
		MyPQUnsortedArray LargePQUnsortedArray = new MyPQUnsortedArray(Datasize.Large);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 10000; ++idx) {
			LargePQUnsortedArray.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
		
		
		//PQSortedArray test=======================================================================================
		System.out.println("**************PQSortedArray test**************\n");
		
		//XSmall------------------------------------------------------------------------------------------------------
		System.out.println("File Size: XSmall");
		
		start = System.currentTimeMillis();
		MyPQSortedArray XSmallPQSortedArray = new MyPQSortedArray(Datasize.XSmall);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 10; ++idx) {
			XSmallPQSortedArray.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
		
		//Small------------------------------------------------------------------------------------------------------
		System.out.println("File Size: Small");
		
		start = System.currentTimeMillis();
		MyPQSortedArray SmallPQSortedArray = new MyPQSortedArray(Datasize.Small);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 100; ++idx) {
			SmallPQSortedArray.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
		
		//Medium------------------------------------------------------------------------------------------------------
		System.out.println("File Size: Medium");
		
		start = System.currentTimeMillis();
		MyPQSortedArray MediumPQSortedArray = new MyPQSortedArray(Datasize.Medium);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 1000; ++idx) {
			MediumPQSortedArray.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
		
		//Large------------------------------------------------------------------------------------------------------
		System.out.println("File Size: Large");
		
		start = System.currentTimeMillis();
		MyPQSortedArray LargePQSortedArray = new MyPQSortedArray(Datasize.Large);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 10000; ++idx) {
			LargePQSortedArray.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
		
		//PQUnsortedList test=======================================================================================
		System.out.println("**************PQUnsortedList test**************\n");
		
		//XSmall------------------------------------------------------------------------------------------------------
		System.out.println("File Size: XSmall");
		
		start = System.currentTimeMillis();
		MyPQUnsortedList XSmallPQUnsortedList = new MyPQUnsortedList(Datasize.XSmall);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 10; ++idx) {
			XSmallPQUnsortedList.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
		
		//Small------------------------------------------------------------------------------------------------------
		System.out.println("File Size: Small");
		
		start = System.currentTimeMillis();
		MyPQUnsortedList SmallPQUnsortedList = new MyPQUnsortedList(Datasize.Small);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 100; ++idx) {
			SmallPQUnsortedList.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
		
		//Medium------------------------------------------------------------------------------------------------------
		System.out.println("File Size: Medium");
		
		start = System.currentTimeMillis();
		MyPQUnsortedList MediumPQUnsortedList = new MyPQUnsortedList(Datasize.Medium);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 1000; ++idx) {
			MediumPQUnsortedList.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
		
		//Large------------------------------------------------------------------------------------------------------
		System.out.println("File Size: Large");
		
		start = System.currentTimeMillis();
		MyPQUnsortedList LargePQUnsortedList = new MyPQUnsortedList(Datasize.Large);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 10000; ++idx) {
			LargePQUnsortedList.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
		
		//PQSortedList test=======================================================================================
		System.out.println("**************PQSortedList test**************\n");
		
		//XSmall------------------------------------------------------------------------------------------------------
		System.out.println("File Size: XSmall");
		
		start = System.currentTimeMillis();
		MyPQSortedList XSmallPQSortedList = new MyPQSortedList(Datasize.XSmall);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 10; ++idx) {
			XSmallPQSortedList.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
		
		//Small------------------------------------------------------------------------------------------------------
		System.out.println("File Size: Small");
		
		start = System.currentTimeMillis();
		MyPQSortedList SmallPQSortedList = new MyPQSortedList(Datasize.Small);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 100; ++idx) {
			SmallPQSortedList.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
		
		//Medium------------------------------------------------------------------------------------------------------
		System.out.println("File Size: Medium");
		
		start = System.currentTimeMillis();
		MyPQSortedList MediumPQSortedList = new MyPQSortedList(Datasize.Medium);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 1000; ++idx) {
			MediumPQSortedList.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
		
		//Large------------------------------------------------------------------------------------------------------
		System.out.println("File Size: Large");
		
		start = System.currentTimeMillis();
		MyPQSortedList LargePQSortedList = new MyPQSortedList(Datasize.Large);
		end = System.currentTimeMillis();
		System.out.println("Inserting all lines in the PQ took: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int idx = 0; idx < 10000; ++idx) {
			LargePQSortedList.removeMin();
		}
		end = System.currentTimeMillis();
		System.out.println("Clearing the PQ took: " + (end - start));
		System.out.println("");
	}
}
