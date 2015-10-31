/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;




public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //vector from array
Integer inums[] = { 1, 2 , 3 , 4, 5 };
newvector<Integer> iob = new newvector<>(inums);
System.out.println("size of vector:" + iob.size());

iob.add(11);
int a = iob.get(5);
System.out.println("Element at 5:"+a);

for(int i=0;i<iob.size();i++)
{
System.out.println(iob.get(i));
}
 

//creating default vector
newvector<String> defm = new newvector<>();
System.out.println("size of default vector :" + defm.size());

defm.add("def");
defm.add("vector");

System.out.println("Element defm at 9:"+defm.get(9));

for(int i=0;i<defm.size();i++)
{
System.out.println(defm.get(i));

}

//vector with defined size
newvector<Double> vect = new newvector<>(3);
System.out.println("size of vector :" + vect.size());

for(int i=0;i<3;i++)
{
vect.add(1.5+i);

System.out.println(vect.get(i));

}


System.out.println("Element vect at 2:"+vect.get(2));
System.out.println("First element :" +vect.getfirst());
System.out.println("Last element: " +vect.getlast());



    }
    
}
