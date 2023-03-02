package Arrays;

public class test {

        public static void main(String[] args){
            int k[]={1,2,3,4,5};
            int first=0;
            int last=k.length-1;
            while(first<last){
                int temp=k[last];
                k[last]=k[first];
                k[first]=temp;
                first++;
                last--;
            }
            for(int i=0; i<k.length;i++){
                System.out.println(k[i]);
            }

        }
    }

