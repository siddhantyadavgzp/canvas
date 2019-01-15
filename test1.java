
   
   import java.io.*;
        public class main
        {

            public static void main(String args[]) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int t;
                t = Integer.parseInt(br.readLine());
                for (int i = 0; i < t; i++) {


                    String s = br.readLine();
                    int starth = Integer.parseInt(s.substring(6, 8));
                    int endh = Integer.parseInt(s.substring(0, 2));
                    int startm = Integer.parseInt(s.substring(9, 11));
                    int endm = Integer.parseInt(s.substring(3, 5));
                    int timem;
                    int timeh;
                    if(endm>=startm){
                        timem=endm-startm;
                        timeh=endh-starth;
                    }
                    else{
                        timem=60+endm-startm;
                        timeh=endh-starth-1;
                    }
String total;
			
if(timeh<10)
		total="0"+String.valueOf(timeh);
else
		total=String.valueOf(timeh);
total+=":";
if(timem<10)
	total+="0"+String.valueOf(timem);
else
total+=String.valueOf(timem);
			
		    System.out.println(total);
                }
            }

        }