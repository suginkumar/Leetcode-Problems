class Solution {
    public int findMinDifference(List<String> t) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<t.size();i++){
            int q=Intomin(t.get(i));
            l.add(q);
        }
        Collections.sort(l);
        int m=Integer.MAX_VALUE;
        for(int i=1;i<t.size();i++){
            if(l.get(i)-l.get(i-1)<m){
                m=l.get(i)-l.get(i-1);
            } 
        }
        return Math.min(m,(1440-l.get(l.size()-1))+l.get(0));
    }
    public static int Intomin(String s){
        int n=0;
        for(int i=0;i<2;i++){
            n=n*10+(s.charAt(i)-'0');
        }
        int k=0;
        for(int i=3;i<5;i++){
            k=k*10+(s.charAt(i)-'0');
        }
        n=n*60+k;
        return n;
    } 
}