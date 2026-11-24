class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int a = 0;
        for(int i = 1 ; i <= n ; i++){
            if(target[a] == i){
                list.add("Push");
                a++;
                if(a == target.length){
                    return list;
                }
                
            }else{
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}