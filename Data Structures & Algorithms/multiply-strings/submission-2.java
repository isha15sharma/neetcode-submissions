class Solution {
    public String multiply(String num1, String num2) {
        int[] arr=new int[num1.length()+num2.length()];
         
         if(num1.equals("0") || num2.equals("0")){
            return "0";
         }


        for(int i=num1.length()-1;i>=0;i--){

            int carry=0;
            for(int j=num2.length()-1;j>=0;j--){

                int first=num1.charAt(i)-'0';
                int second=num2.charAt(j)-'0';

                int number=first*second+carry+arr[i+j+1];
                arr[i+j+1]=number%10;
                carry=number/10;
            }

            arr[i]=arr[i]+carry;
        }

        String result="";

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 && result.length()==0){
                continue;
            }
            result=result+arr[i];
        }




return result;
    }
}
