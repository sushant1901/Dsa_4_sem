private void countElement(int[] nums){
  HashMap<Integer,Integer>memo=new HashMap<>();
  for(int currentNum:nums){
    if(memo.containsKey(currentNum))
      memo.put(currentNum,memo.get(currentNum)+1);
    else
      memo.put(currentNum,1);
  }
  return;
}
