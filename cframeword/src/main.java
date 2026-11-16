import java.util.*;


public class main {

    public static void main(String[] args) {

   List <Integer> list=new ArrayList<>();
   //1:add elements
list.add (1);
list.add(2);
list.add(3);
        System.out.println(list.size());
//2:access using index
//System.out.println(list.get(1));
//System.out.println(list.get(2));  
//3:set the values
 //list.set(1,5);
 //System.out.println(list);
 //4:addall
 //list.addAll(0,List.of(7,8,9));
 //System.out.println(list);
//System.out.println(list.get(1));
//5:remove
//list.remove(0);
//System.out.println(list);
//6:indexof
//System.out.println(list.indexOf(1));
//7:lastindexof
//list.add(2,5);
//System.out.println(list);
//System.out.println(list.lastIndexOf(5));
//8:listiterator
//jo index pass hoga yaha se list print hogi 
//ListIterator<Integer>it=list.listIterator(2);
//while(it.hasNext()){
//    System.out.println(it.next());
//}

//ListIterator<Integer>it=list.listIterator(2);
//while(it.hasPrevious()){
//    System.out.println(it.previous());
//}

//ListIterator<Integer>it=list.listIterator(2);
//while(it.hasPrevious()){
//    System.out.println(it.previousIndex());
//    it.previous();
//}

//9:unmodifiable list 
List<Integer> l1=List.of(1,2,3,4,5,6,7,8);
//System.out.println(l1);
//l1.add(0, 0);
//System.out.println(l1);

//10:copy of
List<Integer>l2=List.copyOf(l1);
System.out.println(l2);

 
 
            }
    
    }


