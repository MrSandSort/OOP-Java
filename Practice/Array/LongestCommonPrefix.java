package Practice.Array;

public class LongestCommonPrefix {

    // let's get started with what's common here 
    public static void main(String[] args){
        String[] arr=new String[]{"flower","flow","floor"};
        String val= CommonPrefix(arr);
        System.out.println(val);
    }



    // common prefix check --> check for array length if null or zero return empty prefix
    // Then set, the first index at array as prefix
    // then match if prefix 

    public static String CommonPrefix(String[] args){
        if(args== null || args.length==0){
            return "";
        }

        String prefix=args[0];

        for(int i=1; i<args.length;i++){
            while(args[i].indexOf(prefix)!=0){
                prefix= prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
                
        }
        return prefix;

        }
        
}
