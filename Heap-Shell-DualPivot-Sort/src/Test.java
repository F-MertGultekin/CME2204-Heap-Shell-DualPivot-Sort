

public class Test {

	public static void main(String[] args) {
		/*
		 * arrays which has 1000 element sort time calculated up to nanoseconds
		 * Others calculated up to milisecond
		 * why we calculated some arrays up o ns 
		 * because when we calculate as milisecond their value are zero
		 * 
		 * All outputs are ordered like in the running time table
		 * 							Equals - Random - Increasing - Decreasing(1.000- 10.100- 100.00)
		 * 				 Heap Sort	x		x			x			x
		 * Double Pivot Quick Sort  x		x			x			x
		 * 				Shell Sort	x		x			x			x
		 * 
		 * 
		 * 
		 * There are totaly 36 output data.
		 */
		
		int[] input1=new int[1000];
		int[] input2=new int[10000];
		int[] input3=new int[100000];
		System.out.println();
	
		/*
		HEAP SORT 
		*/
		InputHandle handleObj=new InputHandle();
		//		 heap sort equal integer input 1
		long startTimehe1 =  System.nanoTime();
		handleObj.equalInt(input1);
		SortingClass sortObjhe1=new SortingClass();
		sortObjhe1.heapSort(input1);
		long estimatedTimehe1 = System.nanoTime() - startTimehe1;
		System.out.print(estimatedTimehe1+" ns - ");


		// heap sort equal integer input 2
		long startTimehe2 = System. currentTimeMillis();
		handleObj.equalInt(input2);
		SortingClass sortObjhe2=new SortingClass();
		sortObjhe2.heapSort(input2);
		long estimatedTimehe2 = System. currentTimeMillis() - startTimehe2;
		System.out.print(estimatedTimehe2+" - ");



		//heap sort equal int input 3
		long startTimehe3=System.currentTimeMillis();
		handleObj.equalInt(input3);
		SortingClass sortObjhe3=new SortingClass();
		sortObjhe3.heapSort(input3);
		long estimatedTimehe3 = System. currentTimeMillis() - startTimehe3;
		System.out.print(estimatedTimehe3+" - ");

		//heap sort random int input 1
		long startTimehr1=System.nanoTime();
		handleObj.RandomInt(input1);
		SortingClass sortObjhr1=new SortingClass();
		sortObjhr1.heapSort(input1);
		long estimatedTimehr1 = System.nanoTime() - startTimehr1;
		System.out.print(estimatedTimehr1+" ns - ");

		//heap sort random int input 2
		long startTimehr2=System.currentTimeMillis();
		handleObj.RandomInt(input2);
		SortingClass sortObjhr2=new SortingClass();
		sortObjhr2.heapSort(input2);
		long estimatedTimehr2 = System. currentTimeMillis() - startTimehr2;
		System.out.print(estimatedTimehr2+" - ");

		//heap sort random int input 3
		long startTimehr3=System.currentTimeMillis();
		handleObj.RandomInt(input3);
		SortingClass sortObjhr3=new SortingClass();
		sortObjhr3.heapSort(input3);
		long estimatedTimehr3 = System. currentTimeMillis() - startTimehr3;
		System.out.print(estimatedTimehr3+" - ");



		//heap sort inceasing int input 1
		long startTimehi1=System.nanoTime();
		handleObj.IncreasingInt(input1);
		SortingClass sortObjhi1=new SortingClass();
		sortObjhi1.heapSort(input1);
		long estimatedTimehi1 = System.nanoTime() - startTimehi1;
		System.out.print(estimatedTimehi1+" ns - ");

		//heap sort inceasing int input 2
		long startTimehi2=System.currentTimeMillis();
		handleObj.IncreasingInt(input2);
		SortingClass sortObjhi2=new SortingClass();
		sortObjhi2.heapSort(input2);
		long estimatedTimehi2 = System. currentTimeMillis() - startTimehi2;
		System.out.print(estimatedTimehi2+" - ");

		//heap sort inceasing int input 3
		long startTimehi3=System.currentTimeMillis();
		handleObj.IncreasingInt(input3);
		SortingClass sortObjhi3=new SortingClass();
		sortObjhi3.heapSort(input3);
		long estimatedTimehi3 = System. currentTimeMillis() - startTimehi3;
		System.out.print(estimatedTimehi3+" - ");


		//heap sort decreasing int input 1
		long startTimehd1=System.nanoTime();
		handleObj.DecreasingInt(input1);
		SortingClass sortObjhd1=new SortingClass();
		sortObjhd1.heapSort(input1);
		long estimatedTimehd1 = System.nanoTime() - startTimehd1;
		System.out.print(estimatedTimehd1+" ns - ");


		//heap sort decreasing int input 2
		long startTimehd2=System.currentTimeMillis();
		handleObj.DecreasingInt(input2);
		SortingClass sortObjhd2=new SortingClass();
		sortObjhd2.heapSort(input2);
		long estimatedTimehd2 = System. currentTimeMillis() - startTimehd2;
		System.out.print(estimatedTimehd2+" - ");
		
		
		
		//heap sort decreasing int input 3
		long startTimehd3=System.currentTimeMillis();
		handleObj.DecreasingInt(input3);
		SortingClass sortObjhd3=new SortingClass();
		sortObjhd3.heapSort(input3);
		long estimatedTimehd3 = System. currentTimeMillis() - startTimehd3;
		System.out.print(estimatedTimehd3);
		
		/*
		DUAL PIVOT QUICK SORT
		*/
		System.out.println();
		//dual pivot quick sort equal int input 1 
		long startTimeqe1=System.nanoTime();
		handleObj.equalInt(input1);
		SortingClass sortObjqe1=new SortingClass();
		sortObjqe1.dualPivotSort(input1,0,input1.length-1);
		long estimatedTimeqe1 = System.nanoTime() - startTimeqe1;
		System.out.print(estimatedTimeqe1+" ns - ");


		//dual pivot quick sort equal int input 2 
		long startTimeqe2=System.currentTimeMillis();
		handleObj.equalInt(input2);
		SortingClass sortObjqe2=new SortingClass();
		sortObjqe2.dualPivotSort(input2,0,input2.length-1);
		long estimatedTimeqe2 = System. currentTimeMillis() - startTimeqe2;
		System.out.print(estimatedTimeqe2+" - ");
		
		
		
		//dual pivot quick sort equal int input 3
		long startTimeqe3=System.currentTimeMillis();
		handleObj.equalInt(input3);
		SortingClass sortObjqe3=new SortingClass();
		sortObjqe3.dualPivotSort(input3,0,input3.length-1);
		long estimatedTimeqe3 = System. currentTimeMillis() - startTimeqe3;
		System.out.print(estimatedTimeqe3+" - ");



		//dual pivot quick sort random int input 1 
		long startTimeqr1=System.nanoTime();
		handleObj.RandomInt(input1);
		SortingClass sortObjqr1=new SortingClass();
		sortObjqr1.dualPivotSort(input1,0,input1.length-1);
		long estimatedTimeqr1 = System.nanoTime() - startTimeqr1;
		System.out.print(estimatedTimeqr1+" ns - ");


		//dual pivot quick sort random int input 2 
		long startTimeqr2=System.currentTimeMillis();
		handleObj.RandomInt(input2);
		SortingClass sortObjqr2=new SortingClass();
		sortObjqr2.dualPivotSort(input2,0,input2.length-1);
		long estimatedTimeqr2 = System. currentTimeMillis() - startTimeqr2;
		System.out.print(estimatedTimeqr2+" - ");




		//dual pivot quick sort random int input 3 
		long startTimeqr3=System.currentTimeMillis();
		handleObj.RandomInt(input3);
		SortingClass sortObjqr3=new SortingClass();
		sortObjqr3.dualPivotSort(input3,0,input3.length-1);
		long estimatedTimeqr3 = System. currentTimeMillis() - startTimeqr3;
		System.out.print(estimatedTimeqr3+" - ");

		
		
		//dual pivot quick sort increasing int input 1 
		long startTimeqi1=System.nanoTime();
		handleObj.IncreasingInt(input1);
		SortingClass sortObjqi1=new SortingClass();
		sortObjqi1.dualPivotSort(input1,0,input1.length-1);
		long estimatedTimeqi1 = System.nanoTime() - startTimeqi1;
		System.out.print(estimatedTimeqi1+" ns - ");


		//dual pivot quick sort increasing int input 2 
		long startTimeqi2=System.currentTimeMillis();
		handleObj.IncreasingInt(input2);
		SortingClass sortObjqi2=new SortingClass();
		sortObjqi2.dualPivotSort(input2,0,input2.length-1);
		long estimatedTimeqi2 = System. currentTimeMillis() - startTimeqi2;
		System.out.print(estimatedTimeqi2+" - ");


		//dual pivot quick sort increasing int input 3 
		long startTimeqi3=System.currentTimeMillis();
		handleObj.IncreasingInt(input3);
		SortingClass sortObjqi3=new SortingClass();
		sortObjqi3.dualPivotSort(input3,0,input3.length-1);
		long estimatedTimeqi3 = System. currentTimeMillis() - startTimeqi3;
		System.out.print(estimatedTimeqi3+" - ");

		//dual pivot quick sort decreasing int input 1 
		long startTimeqd1=System.nanoTime();
		handleObj.IncreasingInt(input1);
		SortingClass sortObjqd1=new SortingClass();
		sortObjqd1.dualPivotSort(input1,0,input1.length-1);
		long estimatedTimeqd1 =System.nanoTime() - startTimeqd1;
		System.out.print(estimatedTimeqd1+" ns - ");


		//dual pivot quick sort decreasing int input 2 
		long startTimeqd2=System.currentTimeMillis();
		handleObj.IncreasingInt(input2);
		SortingClass sortObjqd2=new SortingClass();
		sortObjqd2.dualPivotSort(input2,0,input2.length-1);
		long estimatedTimeqd2 = System. currentTimeMillis() - startTimeqd2;
		System.out.print(estimatedTimeqd2+" - ");


		//dual pivot quick sort decreasing int input 3 
		long startTimeqd3=System.currentTimeMillis();
		handleObj.IncreasingInt(input3);
		SortingClass sortObjqd3=new SortingClass();
		sortObjqd3.dualPivotSort(input3,0,input3.length-1);
		long estimatedTimeqd3 = System. currentTimeMillis() - startTimeqd3;
		System.out.print(estimatedTimeqd3);
		
		
		
		
		System.out.println();
		/*
			SHELL SORT
		*/


		//shell sort equal int input 1 
		long startTimese1=System.nanoTime();
		handleObj.equalInt(input1);
		SortingClass sortObjse1=new SortingClass();
		sortObjse1.shellSort(input1);
		long estimatedTimese1 = System.nanoTime() - startTimese1;	
		System.out.print(estimatedTimese1+" ns  - ");

		//shell sort equal int input 2 
		long startTimese2=System.currentTimeMillis();
		handleObj.equalInt(input2);
		SortingClass sortObjse2=new SortingClass();
		sortObjse2.shellSort(input2);
		long estimatedTimese2 = System. currentTimeMillis() - startTimese2;	
		System.out.print(estimatedTimese2+" - ");

		//shell sort equal int input 3 
		long startTimese3=System.currentTimeMillis();
		handleObj.equalInt(input3);
		SortingClass sortObjse3=new SortingClass();
		sortObjse3.shellSort(input3);
		long estimatedTimese3 = System. currentTimeMillis() - startTimese3;	

		System.out.print(estimatedTimese3+" - ");


		//shell sort random int input 1 
		long startTimesr1=System.nanoTime();
		handleObj.RandomInt(input1);
		SortingClass sortObjsr1=new SortingClass();
		sortObjsr1.shellSort(input1);
		long estimatedTimesr1 = System.nanoTime() - startTimesr1;	
		System.out.print(estimatedTimesr1+" ns - ");

		//shell sort random int input 2 
		long startTimesr2=System.currentTimeMillis();
		handleObj.RandomInt(input2);
		SortingClass sortObjsr2=new SortingClass();
		sortObjsr2.shellSort(input2);
		long estimatedTimesr2 = System. currentTimeMillis() - startTimesr2;	
		System.out.print(estimatedTimesr2+" - ");
		
		
		
		//shell sort random int input 3 
		long startTimesr3=System.currentTimeMillis();
		handleObj.RandomInt(input3);
		SortingClass sortObjsr3=new SortingClass();
		sortObjsr3.shellSort(input3);
		long estimatedTimesr3 = System. currentTimeMillis() - startTimesr3;	
		System.out.print(estimatedTimesr3+" - ");


		//shell sort increasing int input 1 
		long startTimesi1=System.nanoTime();
		handleObj.IncreasingInt(input1);
		SortingClass sortObjsi1=new SortingClass();
		sortObjsi1.shellSort(input1);
		long estimatedTimesi1 = System.nanoTime() - startTimesi1;	
		System.out.print(estimatedTimesi1+" ns - ");


		//shell sort increasing int input 2 
		long startTimesi2=System.currentTimeMillis();
		handleObj.IncreasingInt(input2);
		SortingClass sortObjsi2=new SortingClass();
		sortObjsi2.shellSort(input2);
		long estimatedTimesi2 = System. currentTimeMillis() - startTimesi2;	
		System.out.print(estimatedTimesi2+" - ");
		
		
		//shell sort increasing int input 3 
		long startTimesi3=System.currentTimeMillis();
		handleObj.IncreasingInt(input3);
		SortingClass sortObjsi3=new SortingClass();
		sortObjsi3.shellSort(input3);
		long estimatedTimesi3 = System. currentTimeMillis() - startTimesi3;	
		System.out.print(estimatedTimesi3+" - ");


		//shell sort decreasing int input 1 
		long startTimesd1=System.nanoTime();
		handleObj.DecreasingInt(input1);
		SortingClass sortObjsd1=new SortingClass();
		sortObjsd1.shellSort(input1);
		long estimatedTimesd1 = System.nanoTime() - startTimesd1;	
		System.out.print(estimatedTimesd1+" ns - ");


		//shell sort decreasing int input 2 
		long startTimesd2=System.currentTimeMillis();
		handleObj.DecreasingInt(input2);
		SortingClass sortObjsd2=new SortingClass();
		sortObjsd2.shellSort(input2);
		long estimatedTimesd2 = System. currentTimeMillis() - startTimesd2;	
		System.out.print(estimatedTimesd2+" - ");

		//shell sort decreasing int input 3 
		long startTimesd3=System.currentTimeMillis();
		handleObj.DecreasingInt(input3);
		SortingClass sortObjsd3=new SortingClass();
		sortObjsd3.shellSort(input3);
		long estimatedTimesd3 = System. currentTimeMillis() - startTimesd3;	
		System.out.print(estimatedTimesd3);


	}

}
