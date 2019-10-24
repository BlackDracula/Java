/*
only question is asked in this one
find if the its sorted or nah (only the method)
*/
public boolean isSorted(int [] list){
  for (int i =0; i < list.length; i++){
      if (list [i-1] > list [i]){
        return false;
       }
  }
  return true;
}
