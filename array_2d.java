package java_overview_topic;

public class array_2d {

	public static void main(String[] args) {
		// 2d array
		// TODO Auto-generated method stub
	     int dasid[][]= {
	        		{123,789},
	        		{456,908}
	        		};
	        
	        for (int i=0 ;i < dasid.length; i++) {
	      for (int j=0; j<dasid[i].length;j++) {
	        	System.out.print(dasid[i][j]+" ");
	        }
	      System.out.println("");
		}
	
	        
	        // 3d array
	        String name[][][]= {
	        		{
	        		{"Aishu","sai","murugan"},
	        		{"Pramila","Ramesh","Kousalya"},
	        		{"kumar","sumai","senthi"}
	        		}
	        };
	        
	        	for (int i=0 ;i<name.length; i++) {
	        		for (int j =0;j<name[i].length;j++) {
	        			for(int k=0;k<name[i][j].length;k++) {
	        			//System.out.println(name[i][j][k]+"");
	        			System.out.print(name[i][j][k]+"");
	        		}
	        	System.out.println();  //// Newline after each "row"
	        }
	        	 System.out.println(); // Additional newline after each "block"
	}

}
}


