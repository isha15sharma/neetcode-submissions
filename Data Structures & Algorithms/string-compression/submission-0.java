class Solution {
    public int compress(char[] chars) {
        int write=0;
        int i=0;

        while(i<chars.length){

            char current=chars[i];
            int count=0;

            while(i<chars.length && chars[i] == current){
                count++;
                i++;
            }

            chars[write]=current;
            write++;

            if(count>1){
                String strs=String.valueOf(count);

                for(int j=0;j<strs.length();j++){
                    chars[write]=strs.charAt(j);
                    write++;
                }
            }

        }
    return write;

    }
}