
public class LlavesDes {
    
    public static void main(String[] args){
         clavesDes("1010101010101010101010101010101010101010101010101010101010101010", "1010101010101010101010101010101010101010101010101010101010101010");
    }
    
        public static String[] Expansion(String[] ERE){
        String[] Estedato=new String[32];
        
        for (int i = 0; i < 32; i++) {
        Estedato[i]=ERE[i];
        }
        
        String[] Exp=new String[48];
        Exp[1-1]=Estedato[32-1];
        Exp[2-1]=Estedato[1-1];
        Exp[3-1]=Estedato[2-1];
        Exp[4-1]=Estedato[3-1];
        Exp[5-1]=Estedato[4-1];
        Exp[6-1]=Estedato[5-1];
        Exp[7-1]=Estedato[4-1];
        Exp[8-1]=Estedato[5-1];
        Exp[9-1]=Estedato[6-1];
        Exp[10-1]=Estedato[7-1];
        Exp[11-1]=Estedato[8-1];
        Exp[12-1]=Estedato[9-1];
        Exp[13-1]=Estedato[8-1];
        Exp[14-1]=Estedato[9-1];
        Exp[15-1]=Estedato[10-1];
        Exp[16-1]=Estedato[11-1];
        Exp[17-1]=Estedato[12-1];
        Exp[18-1]=Estedato[13-1];
        Exp[19-1]=Estedato[12-1];
        Exp[20-1]=Estedato[13-1];
        Exp[21-1]=Estedato[14-1];
        Exp[22-1]=Estedato[15-1];
        Exp[23-1]=Estedato[16-1];
        Exp[24-1]=Estedato[17-1];
        Exp[25-1]=Estedato[16-1];
        Exp[26-1]=Estedato[17-1];
        Exp[27-1]=Estedato[18-1];
        Exp[28-1]=Estedato[19-1];
        Exp[29-1]=Estedato[20-1];
        Exp[30-1]=Estedato[21-1];
        Exp[31-1]=Estedato[20-1];
        Exp[32-1]=Estedato[21-1];
        Exp[33-1]=Estedato[22-1];
        Exp[34-1]=Estedato[23-1];
        Exp[35-1]=Estedato[24-1];
        Exp[36-1]=Estedato[25-1];
        Exp[37-1]=Estedato[24-1];
        Exp[38-1]=Estedato[25-1];
        Exp[39-1]=Estedato[26-1];
        Exp[40-1]=Estedato[27-1];
        Exp[41-1]=Estedato[28-1];
        Exp[42-1]=Estedato[29-1];
        Exp[43-1]=Estedato[28-1];
        Exp[44-1]=Estedato[29-1];
        Exp[45-1]=Estedato[30-1];
        Exp[46-1]=Estedato[31-1];
        Exp[47-1]=Estedato[32-1];
        Exp[48-1]=Estedato[1-1];

        return Exp;
    }
    public static String XOR(String uno, String dos){
        String Response = "";
        
        if(uno.equals(dos)){
            Response="0";
        }
        else if(!uno.equals(dos)){
            Response="1";
        } 
        return Response;
    }
    
    public static String DecimalABin4(String decim){
        String CuatroBits ="";
        if(decim.equals("0")){CuatroBits="0000";}   if(decim.equals("1")){CuatroBits="0001";}   
        if(decim.equals("2")){CuatroBits="0010";}   if(decim.equals("3")){CuatroBits="0011";}   
        if(decim.equals("4")){CuatroBits="0100";}   if(decim.equals("5")){CuatroBits="0101";}   
        if(decim.equals("6")){CuatroBits="0110";}   if(decim.equals("7")){CuatroBits="0111";}
        if(decim.equals("8")){CuatroBits="1000";}   if(decim.equals("9")){CuatroBits="1001";}   
        if(decim.equals("10")){CuatroBits="1010";}   if(decim.equals("11")){CuatroBits="1011";}   
        if(decim.equals("12")){CuatroBits="1100";}   if(decim.equals("13")){CuatroBits="1101";}   
        if(decim.equals("14")){CuatroBits="1110";}   if(decim.equals("15")){CuatroBits="1111";}  
        
        
        return CuatroBits;
    }
    
    public static String ESE(String[] sonseis, int cual){
        
        String Mb=sonseis[0]+sonseis[5];
        String Nb=sonseis[1]+sonseis[2]+sonseis[3]+sonseis[4];
        String Md="";
        String Nd = "";
        
        if(Mb.equals("00")){Md="0";}            if(Mb.equals("01")){Md="1";}
        if(Mb.equals("10")){Md="2";}            if(Mb.equals("11")){Md="3";}
        
        if(Nb.equals("0000")){Nd="0";}          if(Nb.equals("0001")){Nd="1";}
        if(Nb.equals("0010")){Nd="2";}          if(Nb.equals("0011")){Nd="3";}
        if(Nb.equals("0100")){Nd="4";}          if(Nb.equals("0101")){Nd="5";}
        if(Nb.equals("0110")){Nd="6";}          if(Nb.equals("0111")){Nd="7";}
        if(Nb.equals("1000")){Nd="8";}          if(Nb.equals("1001")){Nd="9";}
        if(Nb.equals("1010")){Nd="10";}          if(Nb.equals("1011")){Nd="11";}
        if(Nb.equals("1100")){Nd="12";}          if(Nb.equals("1101")){Nd="13";}
        if(Nb.equals("1110")){Nd="14";}          if(Nb.equals("1111")){Nd="15";}
        
      String Sd = "";
        String Sb;
        if(cual==1){
            if(Md.equals("0")){
                if(Nd.equals("0")){Sd="14";} if(Nd.equals("1")){Sd="4";} if(Nd.equals("2")){Sd="13";}  if(Nd.equals("3")){Sd="1";}
                if(Nd.equals("4")){Sd="2";} if(Nd.equals("5")){Sd="15";} if(Nd.equals("6")){Sd="11";}  if(Nd.equals("7")){Sd="8";}
                if(Nd.equals("8")){Sd="3";} if(Nd.equals("9")){Sd="10";} if(Nd.equals("10")){Sd="6";}  if(Nd.equals("11")){Sd="12";}
                if(Nd.equals("12")){Sd="5";} if(Nd.equals("13")){Sd="9";} if(Nd.equals("14")){Sd="0";}  if(Nd.equals("15")){Sd="7";}
            }else
            if(Md.equals("1")){
                if(Nd.equals("0")){Sd="0";} if(Nd.equals("1")){Sd="15";} if(Nd.equals("2")){Sd="7";}  if(Nd.equals("3")){Sd="4";}
                if(Nd.equals("4")){Sd="14";} if(Nd.equals("5")){Sd="2";} if(Nd.equals("6")){Sd="13";}  if(Nd.equals("7")){Sd="1";}
                if(Nd.equals("8")){Sd="10";} if(Nd.equals("9")){Sd="6";} if(Nd.equals("10")){Sd="12";}  if(Nd.equals("11")){Sd="11";}
                if(Nd.equals("12")){Sd="9";} if(Nd.equals("13")){Sd="5";} if(Nd.equals("14")){Sd="3";}  if(Nd.equals("15")){Sd="8";}
            }else
            if(Md.equals("2")){
                if(Nd.equals("0")){Sd="4";} if(Nd.equals("1")){Sd="1";} if(Nd.equals("2")){Sd="14";}  if(Nd.equals("3")){Sd="8";}
                if(Nd.equals("4")){Sd="13";} if(Nd.equals("5")){Sd="6";} if(Nd.equals("6")){Sd="2";}  if(Nd.equals("7")){Sd="11";}
                if(Nd.equals("8")){Sd="15";} if(Nd.equals("9")){Sd="12";} if(Nd.equals("10")){Sd="9";}  if(Nd.equals("11")){Sd="7";}
                if(Nd.equals("12")){Sd="3";} if(Nd.equals("13")){Sd="10";} if(Nd.equals("14")){Sd="5";}  if(Nd.equals("15")){Sd="0";}
            }else
            if(Md.equals("3")){
                if(Nd.equals("0")){Sd="15";} if(Nd.equals("1")){Sd="12";} if(Nd.equals("2")){Sd="8";}  if(Nd.equals("3")){Sd="2";}
                if(Nd.equals("4")){Sd="4";} if(Nd.equals("5")){Sd="9";} if(Nd.equals("6")){Sd="1";}  if(Nd.equals("7")){Sd="7";}
                if(Nd.equals("8")){Sd="5";} if(Nd.equals("9")){Sd="11";} if(Nd.equals("10")){Sd="3";}  if(Nd.equals("11")){Sd="14";}
                if(Nd.equals("12")){Sd="10";} if(Nd.equals("13")){Sd="0";} if(Nd.equals("14")){Sd="6";}  if(Nd.equals("15")){Sd="13";}
            }
        }
        else if(cual==2){
            if(Md.equals("0")){
                if(Nd.equals("0")){Sd="15";}
                if(Nd.equals("1")){Sd="1";} 
                if(Nd.equals("2")){Sd="8";} 
                if(Nd.equals("3")){Sd="14";}
                if(Nd.equals("4")){Sd="6";}
                if(Nd.equals("5")){Sd="11";} 
                if(Nd.equals("6")){Sd="3";}  
                if(Nd.equals("7")){Sd="4";}
                if(Nd.equals("8")){Sd="9";} 
                if(Nd.equals("9")){Sd="7";}
                if(Nd.equals("10")){Sd="2";}
                if(Nd.equals("11")){Sd="13";}
                if(Nd.equals("12")){Sd="12";}
                if(Nd.equals("13")){Sd="0";} 
                if(Nd.equals("14")){Sd="5";} 
                if(Nd.equals("15")){Sd="10";}
            }else
            if(Md.equals("1")){
                if(Nd.equals("0")){Sd="3";} 
                if(Nd.equals("1")){Sd="13";} 
                if(Nd.equals("2")){Sd="4";}  
                if(Nd.equals("3")){Sd="7";}
                if(Nd.equals("4")){Sd="15";} 
                if(Nd.equals("5")){Sd="2";} 
                if(Nd.equals("6")){Sd="8";} 
                if(Nd.equals("7")){Sd="14";}
                if(Nd.equals("8")){Sd="12";}
                if(Nd.equals("9")){Sd="0";}
                if(Nd.equals("10")){Sd="1";}
                if(Nd.equals("11")){Sd="10";}
                if(Nd.equals("12")){Sd="6";}
                if(Nd.equals("13")){Sd="9";} 
                if(Nd.equals("14")){Sd="11";} 
                if(Nd.equals("15")){Sd="5";}
            }else
                
            if(Md.equals("2")){
                if(Nd.equals("0")){Sd="0";} 
                if(Nd.equals("1")){Sd="14";} 
                if(Nd.equals("2")){Sd="7";} 
                if(Nd.equals("3")){Sd="11";}
                if(Nd.equals("4")){Sd="10";}
                if(Nd.equals("5")){Sd="4";} 
                if(Nd.equals("6")){Sd="13";} 
                if(Nd.equals("7")){Sd="1";}
                if(Nd.equals("8")){Sd="5";} 
                if(Nd.equals("9")){Sd="8";} 
                if(Nd.equals("10")){Sd="12";} 
                if(Nd.equals("11")){Sd="6";}
                if(Nd.equals("12")){Sd="9";} 
                if(Nd.equals("13")){Sd="3";} 
                if(Nd.equals("14")){Sd="2";} 
                if(Nd.equals("15")){Sd="15";}
            }else
            if(Md.equals("3")){
                if(Nd.equals("0")){Sd="13";}
                if(Nd.equals("1")){Sd="8";}
                if(Nd.equals("2")){Sd="10";}
                if(Nd.equals("3")){Sd="1";}
                if(Nd.equals("4")){Sd="3";}
                if(Nd.equals("5")){Sd="15";} 
                if(Nd.equals("6")){Sd="4";} 
                if(Nd.equals("7")){Sd="2";}
                if(Nd.equals("8")){Sd="11";} 
                if(Nd.equals("9")){Sd="6";} 
                if(Nd.equals("10")){Sd="7";} 
                if(Nd.equals("11")){Sd="12";}
                if(Nd.equals("12")){Sd="0";} 
                if(Nd.equals("13")){Sd="5";} 
                if(Nd.equals("14")){Sd="14";}
                if(Nd.equals("15")){Sd="9";}
            }
        }
        else if(cual==3){
            if(Md.equals("0")){
                if(Nd.equals("0")){Sd="10";}
                if(Nd.equals("1")){Sd="0";} 
                if(Nd.equals("2")){Sd="9";} 
                if(Nd.equals("3")){Sd="14";}
                if(Nd.equals("4")){Sd="6";}
                if(Nd.equals("5")){Sd="3";} 
                if(Nd.equals("6")){Sd="15";}  
                if(Nd.equals("7")){Sd="5";}
                if(Nd.equals("8")){Sd="1";} 
                if(Nd.equals("9")){Sd="13";}
                if(Nd.equals("10")){Sd="12";}
                if(Nd.equals("11")){Sd="7";}
                if(Nd.equals("12")){Sd="11";}
                if(Nd.equals("13")){Sd="4";} 
                if(Nd.equals("14")){Sd="2";} 
                if(Nd.equals("15")){Sd="8";}
            }else
            if(Md.equals("1")){
                if(Nd.equals("0")){Sd="13";} 
                if(Nd.equals("1")){Sd="7";} 
                if(Nd.equals("2")){Sd="0";}  
                if(Nd.equals("3")){Sd="9";}
                if(Nd.equals("4")){Sd="3";} 
                if(Nd.equals("5")){Sd="4";} 
                if(Nd.equals("6")){Sd="6";} 
                if(Nd.equals("7")){Sd="10";}
                if(Nd.equals("8")){Sd="2";}
                if(Nd.equals("9")){Sd="8";}
                if(Nd.equals("10")){Sd="5";}
                if(Nd.equals("11")){Sd="14";}
                if(Nd.equals("12")){Sd="12";}
                if(Nd.equals("13")){Sd="11";} 
                if(Nd.equals("14")){Sd="15";} 
                if(Nd.equals("15")){Sd="1";}
            }else
                
            if(Md.equals("2")){
                if(Nd.equals("0")){Sd="13";} 
                if(Nd.equals("1")){Sd="6";} 
                if(Nd.equals("2")){Sd="4";} 
                if(Nd.equals("3")){Sd="9";}
                if(Nd.equals("4")){Sd="8";}
                if(Nd.equals("5")){Sd="15";} 
                if(Nd.equals("6")){Sd="3";} 
                if(Nd.equals("7")){Sd="0";}
                if(Nd.equals("8")){Sd="11";} 
                if(Nd.equals("9")){Sd="1";} 
                if(Nd.equals("10")){Sd="2";} 
                if(Nd.equals("11")){Sd="12";}
                if(Nd.equals("12")){Sd="5";} 
                if(Nd.equals("13")){Sd="10";} 
                if(Nd.equals("14")){Sd="14";} 
                if(Nd.equals("15")){Sd="7";}
            }else
            if(Md.equals("3")){
                if(Nd.equals("0")){Sd="1";} 
                if(Nd.equals("1")){Sd="10";}
                if(Nd.equals("2")){Sd="13";}
                if(Nd.equals("3")){Sd="0";}
                if(Nd.equals("4")){Sd="6";}
                if(Nd.equals("5")){Sd="9";} 
                if(Nd.equals("6")){Sd="8";} 
                if(Nd.equals("7")){Sd="7";}
                if(Nd.equals("8")){Sd="4";} 
                if(Nd.equals("9")){Sd="15";} 
                if(Nd.equals("10")){Sd="14";} 
                if(Nd.equals("11")){Sd="3";}
                if(Nd.equals("12")){Sd="11";} 
                if(Nd.equals("13")){Sd="5";} 
                if(Nd.equals("14")){Sd="2";}
                if(Nd.equals("15")){Sd="12";}
            }
        }
        else if(cual==4){
            if(Md.equals("0")){
                if(Nd.equals("0")){Sd="7";}
                if(Nd.equals("1")){Sd="13";} 
                if(Nd.equals("2")){Sd="14";} 
                if(Nd.equals("3")){Sd="3";}
                if(Nd.equals("4")){Sd="0";}
                if(Nd.equals("5")){Sd="6";} 
                if(Nd.equals("6")){Sd="9";}  
                if(Nd.equals("7")){Sd="10";}
                if(Nd.equals("8")){Sd="1";} 
                if(Nd.equals("9")){Sd="2";}
                if(Nd.equals("10")){Sd="8";}
                if(Nd.equals("11")){Sd="5";}
                if(Nd.equals("12")){Sd="11";}
                if(Nd.equals("13")){Sd="12";} 
                if(Nd.equals("14")){Sd="4";} 
                if(Nd.equals("15")){Sd="15";}
            }else
            if(Md.equals("1")){
                if(Nd.equals("0")){Sd="13";} 
                if(Nd.equals("1")){Sd="8";} 
                if(Nd.equals("2")){Sd="11";}  
                if(Nd.equals("3")){Sd="5";}
                if(Nd.equals("4")){Sd="6";} 
                if(Nd.equals("5")){Sd="15";} 
                if(Nd.equals("6")){Sd="0";} 
                if(Nd.equals("7")){Sd="3";}
                if(Nd.equals("8")){Sd="4";}
                if(Nd.equals("9")){Sd="7";}
                if(Nd.equals("10")){Sd="2";}
                if(Nd.equals("11")){Sd="12";}
                if(Nd.equals("12")){Sd="1";}
                if(Nd.equals("13")){Sd="10";} 
                if(Nd.equals("14")){Sd="14";} 
                if(Nd.equals("15")){Sd="9";}
            }else
                
            if(Md.equals("2")){
                if(Nd.equals("0")){Sd="10";} 
                if(Nd.equals("1")){Sd="6";} 
                if(Nd.equals("2")){Sd="9";} 
                if(Nd.equals("3")){Sd="0";}
                if(Nd.equals("4")){Sd="12";}
                if(Nd.equals("5")){Sd="11";} 
                if(Nd.equals("6")){Sd="7";} 
                if(Nd.equals("7")){Sd="13";}
                if(Nd.equals("8")){Sd="15";} 
                if(Nd.equals("9")){Sd="1";} 
                if(Nd.equals("10")){Sd="3";} 
                if(Nd.equals("11")){Sd="14";}
                if(Nd.equals("12")){Sd="5";} 
                if(Nd.equals("13")){Sd="2";} 
                if(Nd.equals("14")){Sd="8";} 
                if(Nd.equals("15")){Sd="4";}
            }else
            if(Md.equals("3")){
                if(Nd.equals("0")){Sd="3";} 
                if(Nd.equals("1")){Sd="15";}
                if(Nd.equals("2")){Sd="0";}
                if(Nd.equals("3")){Sd="6";}
                if(Nd.equals("4")){Sd="10";}
                if(Nd.equals("5")){Sd="1";} 
                if(Nd.equals("6")){Sd="13";} 
                if(Nd.equals("7")){Sd="8";}
                if(Nd.equals("8")){Sd="9";} 
                if(Nd.equals("9")){Sd="4";} 
                if(Nd.equals("10")){Sd="5";} 
                if(Nd.equals("11")){Sd="11";}
                if(Nd.equals("12")){Sd="12";} 
                if(Nd.equals("13")){Sd="7";} 
                if(Nd.equals("14")){Sd="2";}
                if(Nd.equals("15")){Sd="14";}
            }
        }
        else if(cual==5){
            if(Md.equals("0")){
                if(Nd.equals("0")){Sd="2";}
                if(Nd.equals("1")){Sd="12";} 
                if(Nd.equals("2")){Sd="4";} 
                if(Nd.equals("3")){Sd="1";}
                if(Nd.equals("4")){Sd="7";}
                if(Nd.equals("5")){Sd="10";} 
                if(Nd.equals("6")){Sd="11";}  
                if(Nd.equals("7")){Sd="6";}
                if(Nd.equals("8")){Sd="8";} 
                if(Nd.equals("9")){Sd="5";}
                if(Nd.equals("10")){Sd="3";}
                if(Nd.equals("11")){Sd="15";}
                if(Nd.equals("12")){Sd="13";}
                if(Nd.equals("13")){Sd="0";} 
                if(Nd.equals("14")){Sd="14";} 
                if(Nd.equals("15")){Sd="9";}
            }else
            if(Md.equals("1")){
                if(Nd.equals("0")){Sd="14";} 
                if(Nd.equals("1")){Sd="11";} 
                if(Nd.equals("2")){Sd="2";}  
                if(Nd.equals("3")){Sd="12";}
                if(Nd.equals("4")){Sd="4";} 
                if(Nd.equals("5")){Sd="7";} 
                if(Nd.equals("6")){Sd="13";} 
                if(Nd.equals("7")){Sd="1";}
                if(Nd.equals("8")){Sd="5";}
                if(Nd.equals("9")){Sd="0";}
                if(Nd.equals("10")){Sd="15";}
                if(Nd.equals("11")){Sd="10";}
                if(Nd.equals("12")){Sd="3";}
                if(Nd.equals("13")){Sd="9";} 
                if(Nd.equals("14")){Sd="8";} 
                if(Nd.equals("15")){Sd="6";}
            }else
                
            if(Md.equals("2")){
                if(Nd.equals("0")){Sd="4";} 
                if(Nd.equals("1")){Sd="2";} 
                if(Nd.equals("2")){Sd="1";} 
                if(Nd.equals("3")){Sd="11";}
                if(Nd.equals("4")){Sd="10";}
                if(Nd.equals("5")){Sd="13";} 
                if(Nd.equals("6")){Sd="7";} 
                if(Nd.equals("7")){Sd="8";}
                if(Nd.equals("8")){Sd="15";} 
                if(Nd.equals("9")){Sd="9";} 
                if(Nd.equals("10")){Sd="12";} 
                if(Nd.equals("11")){Sd="5";}
                if(Nd.equals("12")){Sd="6";} 
                if(Nd.equals("13")){Sd="3";} 
                if(Nd.equals("14")){Sd="0";} 
                if(Nd.equals("15")){Sd="14";}
            }else
            if(Md.equals("3")){
                if(Nd.equals("0")){Sd="11";} 
                if(Nd.equals("1")){Sd="8";}
                if(Nd.equals("2")){Sd="12";}
                if(Nd.equals("3")){Sd="7";}
                if(Nd.equals("4")){Sd="1";}
                if(Nd.equals("5")){Sd="14";} 
                if(Nd.equals("6")){Sd="2";} 
                if(Nd.equals("7")){Sd="13";}
                if(Nd.equals("8")){Sd="6";} 
                if(Nd.equals("9")){Sd="15";} 
                if(Nd.equals("10")){Sd="0";} 
                if(Nd.equals("11")){Sd="9";}
                if(Nd.equals("12")){Sd="10";} 
                if(Nd.equals("13")){Sd="4";} 
                if(Nd.equals("14")){Sd="5";}
                if(Nd.equals("15")){Sd="3";}
            }
        }
        else if(cual==6){
            if(Md.equals("0")){
                if(Nd.equals("0")){Sd="12";}
                if(Nd.equals("1")){Sd="1";} 
                if(Nd.equals("2")){Sd="10";} 
                if(Nd.equals("3")){Sd="15";}
                if(Nd.equals("4")){Sd="9";}
                if(Nd.equals("5")){Sd="2";} 
                if(Nd.equals("6")){Sd="6";}  
                if(Nd.equals("7")){Sd="8";}
                if(Nd.equals("8")){Sd="0";} 
                if(Nd.equals("9")){Sd="13";}
                if(Nd.equals("10")){Sd="3";}
                if(Nd.equals("11")){Sd="4";}
                if(Nd.equals("12")){Sd="14";}
                if(Nd.equals("13")){Sd="7";} 
                if(Nd.equals("14")){Sd="5";} 
                if(Nd.equals("15")){Sd="11";}
            }else
            if(Md.equals("1")){
                if(Nd.equals("0")){Sd="10";} 
                if(Nd.equals("1")){Sd="15";} 
                if(Nd.equals("2")){Sd="4";}  
                if(Nd.equals("3")){Sd="2";}
                if(Nd.equals("4")){Sd="7";} 
                if(Nd.equals("5")){Sd="12";} 
                if(Nd.equals("6")){Sd="19";} 
                if(Nd.equals("7")){Sd="5";}
                if(Nd.equals("8")){Sd="6";}
                if(Nd.equals("9")){Sd="1";}
                if(Nd.equals("10")){Sd="13";}
                if(Nd.equals("11")){Sd="14";}
                if(Nd.equals("12")){Sd="0";}
                if(Nd.equals("13")){Sd="11";} 
                if(Nd.equals("14")){Sd="3";} 
                if(Nd.equals("15")){Sd="8";}
            }else
                
            if(Md.equals("2")){
                if(Nd.equals("0")){Sd="9";} 
                if(Nd.equals("1")){Sd="14";} 
                if(Nd.equals("2")){Sd="15";} 
                if(Nd.equals("3")){Sd="5";}
                if(Nd.equals("4")){Sd="2";}
                if(Nd.equals("5")){Sd="8";} 
                if(Nd.equals("6")){Sd="12";} 
                if(Nd.equals("7")){Sd="3";}
                if(Nd.equals("8")){Sd="7";} 
                if(Nd.equals("9")){Sd="0";} 
                if(Nd.equals("10")){Sd="4";} 
                if(Nd.equals("11")){Sd="10";}
                if(Nd.equals("12")){Sd="1";} 
                if(Nd.equals("13")){Sd="13";} 
                if(Nd.equals("14")){Sd="11";} 
                if(Nd.equals("15")){Sd="6";}
            }else
            if(Md.equals("3")){
                if(Nd.equals("0")){Sd="4";} 
                if(Nd.equals("1")){Sd="3";}
                if(Nd.equals("2")){Sd="2";}
                if(Nd.equals("3")){Sd="12";}
                if(Nd.equals("4")){Sd="9";}
                if(Nd.equals("5")){Sd="5";} 
                if(Nd.equals("6")){Sd="15";} 
                if(Nd.equals("7")){Sd="10";}
                if(Nd.equals("8")){Sd="11";} 
                if(Nd.equals("9")){Sd="14";} 
                if(Nd.equals("10")){Sd="1";} 
                if(Nd.equals("11")){Sd="7";}
                if(Nd.equals("12")){Sd="6";} 
                if(Nd.equals("13")){Sd="0";} 
                if(Nd.equals("14")){Sd="8";}
                if(Nd.equals("15")){Sd="13";}
            }
        }
        else if(cual==7){
            if(Md.equals("0")){
                if(Nd.equals("0")){Sd="4";}
                if(Nd.equals("1")){Sd="11";} 
                if(Nd.equals("2")){Sd="2";} 
                if(Nd.equals("3")){Sd="14";}
                if(Nd.equals("4")){Sd="15";}
                if(Nd.equals("5")){Sd="0";} 
                if(Nd.equals("6")){Sd="8";}  
                if(Nd.equals("7")){Sd="13";}
                if(Nd.equals("8")){Sd="3";} 
                if(Nd.equals("9")){Sd="12";}
                if(Nd.equals("10")){Sd="9";}
                if(Nd.equals("11")){Sd="7";}
                if(Nd.equals("12")){Sd="5";}
                if(Nd.equals("13")){Sd="10";} 
                if(Nd.equals("14")){Sd="6";} 
                if(Nd.equals("15")){Sd="1";}
            }else
            if(Md.equals("1")){
                if(Nd.equals("0")){Sd="13";} 
                if(Nd.equals("1")){Sd="0";} 
                if(Nd.equals("2")){Sd="11";}  
                if(Nd.equals("3")){Sd="7";}
                if(Nd.equals("4")){Sd="4";} 
                if(Nd.equals("5")){Sd="9";} 
                if(Nd.equals("6")){Sd="1";} 
                if(Nd.equals("7")){Sd="10";}
                if(Nd.equals("8")){Sd="14";}
                if(Nd.equals("9")){Sd="3";}
                if(Nd.equals("10")){Sd="5";}
                if(Nd.equals("11")){Sd="12";}
                if(Nd.equals("12")){Sd="2";}
                if(Nd.equals("13")){Sd="15";} 
                if(Nd.equals("14")){Sd="8";} 
                if(Nd.equals("15")){Sd="6";}
            }else
                
            if(Md.equals("2")){
                if(Nd.equals("0")){Sd="1";} 
                if(Nd.equals("1")){Sd="4";} 
                if(Nd.equals("2")){Sd="11";} 
                if(Nd.equals("3")){Sd="13";}
                if(Nd.equals("4")){Sd="12";}
                if(Nd.equals("5")){Sd="3";} 
                if(Nd.equals("6")){Sd="7";} 
                if(Nd.equals("7")){Sd="14";}
                if(Nd.equals("8")){Sd="10";} 
                if(Nd.equals("9")){Sd="15";} 
                if(Nd.equals("10")){Sd="6";} 
                if(Nd.equals("11")){Sd="8";}
                if(Nd.equals("12")){Sd="0";} 
                if(Nd.equals("13")){Sd="5";} 
                if(Nd.equals("14")){Sd="9";} 
                if(Nd.equals("15")){Sd="2";}
            }else
            if(Md.equals("3")){
                if(Nd.equals("0")){Sd="6";} 
                if(Nd.equals("1")){Sd="11";}
                if(Nd.equals("2")){Sd="13";}
                if(Nd.equals("3")){Sd="8";}
                if(Nd.equals("4")){Sd="1";}
                if(Nd.equals("5")){Sd="4";} 
                if(Nd.equals("6")){Sd="10";} 
                if(Nd.equals("7")){Sd="7";}
                if(Nd.equals("8")){Sd="9";} 
                if(Nd.equals("9")){Sd="5";} 
                if(Nd.equals("10")){Sd="0";} 
                if(Nd.equals("11")){Sd="15";}
                if(Nd.equals("12")){Sd="14";} 
                if(Nd.equals("13")){Sd="2";} 
                if(Nd.equals("14")){Sd="3";}
                if(Nd.equals("15")){Sd="12";}
            }
        }
        else if(cual==8){
            if(Md.equals("0")){
                if(Nd.equals("0")){Sd="13";}
                if(Nd.equals("1")){Sd="2";} 
                if(Nd.equals("2")){Sd="8";} 
                if(Nd.equals("3")){Sd="4";}
                if(Nd.equals("4")){Sd="6";}
                if(Nd.equals("5")){Sd="15";} 
                if(Nd.equals("6")){Sd="11";}  
                if(Nd.equals("7")){Sd="1";}
                if(Nd.equals("8")){Sd="10";} 
                if(Nd.equals("9")){Sd="9";}
                if(Nd.equals("10")){Sd="3";}
                if(Nd.equals("11")){Sd="14";}
                if(Nd.equals("12")){Sd="5";}
                if(Nd.equals("13")){Sd="0";} 
                if(Nd.equals("14")){Sd="12";} 
                if(Nd.equals("15")){Sd="7";}
            }else
            if(Md.equals("1")){
                if(Nd.equals("0")){Sd="1";} 
                if(Nd.equals("1")){Sd="15";} 
                if(Nd.equals("2")){Sd="13";}  
                if(Nd.equals("3")){Sd="8";}
                if(Nd.equals("4")){Sd="10";} 
                if(Nd.equals("5")){Sd="3";} 
                if(Nd.equals("6")){Sd="7";} 
                if(Nd.equals("7")){Sd="4";}
                if(Nd.equals("8")){Sd="12";}
                if(Nd.equals("9")){Sd="5";}
                if(Nd.equals("10")){Sd="6";}
                if(Nd.equals("11")){Sd="11";}
                if(Nd.equals("12")){Sd="0";}
                if(Nd.equals("13")){Sd="14";} 
                if(Nd.equals("14")){Sd="9";} 
                if(Nd.equals("15")){Sd="2";}
            }else
                
            if(Md.equals("2")){
                if(Nd.equals("0")){Sd="7";} 
                if(Nd.equals("1")){Sd="11";} 
                if(Nd.equals("2")){Sd="4";} 
                if(Nd.equals("3")){Sd="1";}
                if(Nd.equals("4")){Sd="9";}
                if(Nd.equals("5")){Sd="12";} 
                if(Nd.equals("6")){Sd="14";} 
                if(Nd.equals("7")){Sd="2";}
                if(Nd.equals("8")){Sd="0";} 
                if(Nd.equals("9")){Sd="6";} 
                if(Nd.equals("10")){Sd="10";} 
                if(Nd.equals("11")){Sd="13";}
                if(Nd.equals("12")){Sd="15";} 
                if(Nd.equals("13")){Sd="3";} 
                if(Nd.equals("14")){Sd="5";} 
                if(Nd.equals("15")){Sd="8";}
            }else
            if(Md.equals("3")){
                if(Nd.equals("0")){Sd="2";} 
                if(Nd.equals("1")){Sd="1";}
                if(Nd.equals("2")){Sd="14";}
                if(Nd.equals("3")){Sd="7";}
                if(Nd.equals("4")){Sd="4";}
                if(Nd.equals("5")){Sd="10";} 
                if(Nd.equals("6")){Sd="8";} 
                if(Nd.equals("7")){Sd="13";}
                if(Nd.equals("8")){Sd="15";} 
                if(Nd.equals("9")){Sd="12";} 
                if(Nd.equals("10")){Sd="9";} 
                if(Nd.equals("11")){Sd="0";}
                if(Nd.equals("12")){Sd="3";} 
                if(Nd.equals("13")){Sd="5";} 
                if(Nd.equals("14")){Sd="6";}
                if(Nd.equals("15")){Sd="11";}
            }
        }
        
        return Sd;  
        
    }
    public static String PPermut(String ConcS){
        String[] Cadena=new String[32];
        Cadena[0]=Character.toString(ConcS.charAt(15));
        Cadena[1]=Character.toString(ConcS.charAt(6));
        Cadena[2]=Character.toString(ConcS.charAt(19));
        Cadena[3]=Character.toString(ConcS.charAt(20));
        Cadena[4]=Character.toString(ConcS.charAt(28));
        Cadena[5]=Character.toString(ConcS.charAt(11));
        Cadena[6]=Character.toString(ConcS.charAt(27));
        Cadena[7]=Character.toString(ConcS.charAt(16));
        Cadena[8]=Character.toString(ConcS.charAt(0));
        Cadena[9]=Character.toString(ConcS.charAt(14));
        Cadena[10]=Character.toString(ConcS.charAt(22));
        Cadena[11]=Character.toString(ConcS.charAt(25));
        Cadena[12]=Character.toString(ConcS.charAt(4));
        Cadena[13]=Character.toString(ConcS.charAt(17));
        Cadena[14]=Character.toString(ConcS.charAt(30));
        Cadena[15]=Character.toString(ConcS.charAt(9));
        Cadena[16]=Character.toString(ConcS.charAt(1));
        Cadena[17]=Character.toString(ConcS.charAt(7));
        Cadena[18]=Character.toString(ConcS.charAt(23));
        Cadena[19]=Character.toString(ConcS.charAt(13));
        Cadena[20]=Character.toString(ConcS.charAt(31));
        Cadena[21]=Character.toString(ConcS.charAt(26));
        Cadena[22]=Character.toString(ConcS.charAt(2));
        Cadena[23]=Character.toString(ConcS.charAt(8));
        Cadena[24]=Character.toString(ConcS.charAt(18));
        Cadena[25]=Character.toString(ConcS.charAt(12));
        Cadena[26]=Character.toString(ConcS.charAt(29));
        Cadena[27]=Character.toString(ConcS.charAt(5));
        Cadena[28]=Character.toString(ConcS.charAt(21));
        Cadena[29]=Character.toString(ConcS.charAt(10));
        Cadena[30]=Character.toString(ConcS.charAt(3));
        Cadena[31]=Character.toString(ConcS.charAt(24));
        
        String Cadenon="";
        for (int i = 0; i < 32; i++) {
            Cadenon=Cadenon+Cadena[i];
        }
        
        return Cadenon;
        
    }
    
    public static String FinalPermutation( String RF, String LF){
        String CadenaIFin=RF+LF;
        String[] CadenaFinal= new String[64];
        CadenaFinal[0]=Character.toString(CadenaIFin.charAt(39));
        CadenaFinal[1]=Character.toString(CadenaIFin.charAt(7));
        CadenaFinal[2]=Character.toString(CadenaIFin.charAt(47));
        CadenaFinal[3]=Character.toString(CadenaIFin.charAt(15));
        CadenaFinal[4]=Character.toString(CadenaIFin.charAt(55));
        CadenaFinal[5]=Character.toString(CadenaIFin.charAt(23));
        CadenaFinal[6]=Character.toString(CadenaIFin.charAt(63));
        CadenaFinal[7]=Character.toString(CadenaIFin.charAt(31));
        CadenaFinal[8]=Character.toString(CadenaIFin.charAt(38));
        CadenaFinal[9]=Character.toString(CadenaIFin.charAt(6));
        CadenaFinal[10]=Character.toString(CadenaIFin.charAt(46));
        CadenaFinal[11]=Character.toString(CadenaIFin.charAt(14));
        CadenaFinal[12]=Character.toString(CadenaIFin.charAt(54));
        CadenaFinal[13]=Character.toString(CadenaIFin.charAt(22));
        CadenaFinal[14]=Character.toString(CadenaIFin.charAt(62));
        CadenaFinal[15]=Character.toString(CadenaIFin.charAt(30));
        CadenaFinal[16]=Character.toString(CadenaIFin.charAt(37));
        CadenaFinal[17]=Character.toString(CadenaIFin.charAt(5));
        CadenaFinal[18]=Character.toString(CadenaIFin.charAt(45));
        CadenaFinal[19]=Character.toString(CadenaIFin.charAt(13));
        CadenaFinal[20]=Character.toString(CadenaIFin.charAt(53));
        CadenaFinal[21]=Character.toString(CadenaIFin.charAt(21));
        CadenaFinal[22]=Character.toString(CadenaIFin.charAt(61));
        CadenaFinal[23]=Character.toString(CadenaIFin.charAt(29));
        CadenaFinal[24]=Character.toString(CadenaIFin.charAt(36));
        CadenaFinal[25]=Character.toString(CadenaIFin.charAt(4));
        CadenaFinal[26]=Character.toString(CadenaIFin.charAt(44));
        CadenaFinal[27]=Character.toString(CadenaIFin.charAt(12));
        CadenaFinal[28]=Character.toString(CadenaIFin.charAt(52));
        CadenaFinal[29]=Character.toString(CadenaIFin.charAt(20));
        CadenaFinal[30]=Character.toString(CadenaIFin.charAt(60));
        CadenaFinal[31]=Character.toString(CadenaIFin.charAt(28));
        CadenaFinal[32]=Character.toString(CadenaIFin.charAt(35));
        CadenaFinal[33]=Character.toString(CadenaIFin.charAt(3));
        CadenaFinal[34]=Character.toString(CadenaIFin.charAt(43));
        CadenaFinal[35]=Character.toString(CadenaIFin.charAt(11));
        CadenaFinal[36]=Character.toString(CadenaIFin.charAt(51));
        CadenaFinal[37]=Character.toString(CadenaIFin.charAt(19));
        CadenaFinal[38]=Character.toString(CadenaIFin.charAt(59));
        CadenaFinal[39]=Character.toString(CadenaIFin.charAt(27));
        CadenaFinal[40]=Character.toString(CadenaIFin.charAt(34));
        CadenaFinal[41]=Character.toString(CadenaIFin.charAt(2));
        CadenaFinal[42]=Character.toString(CadenaIFin.charAt(42));
        CadenaFinal[43]=Character.toString(CadenaIFin.charAt(10));
        CadenaFinal[44]=Character.toString(CadenaIFin.charAt(50));
        CadenaFinal[45]=Character.toString(CadenaIFin.charAt(18));
        CadenaFinal[46]=Character.toString(CadenaIFin.charAt(58));
        CadenaFinal[47]=Character.toString(CadenaIFin.charAt(26));
        CadenaFinal[48]=Character.toString(CadenaIFin.charAt(33));
        CadenaFinal[49]=Character.toString(CadenaIFin.charAt(1));
        CadenaFinal[50]=Character.toString(CadenaIFin.charAt(41));
        CadenaFinal[51]=Character.toString(CadenaIFin.charAt(9));
        CadenaFinal[52]=Character.toString(CadenaIFin.charAt(49));
        CadenaFinal[53]=Character.toString(CadenaIFin.charAt(17));
        CadenaFinal[54]=Character.toString(CadenaIFin.charAt(57));
        CadenaFinal[55]=Character.toString(CadenaIFin.charAt(25));
        CadenaFinal[56]=Character.toString(CadenaIFin.charAt(32));
        CadenaFinal[57]=Character.toString(CadenaIFin.charAt(0));
        CadenaFinal[58]=Character.toString(CadenaIFin.charAt(40));
        CadenaFinal[59]=Character.toString(CadenaIFin.charAt(8));
        CadenaFinal[60]=Character.toString(CadenaIFin.charAt(48));
        CadenaFinal[61]=Character.toString(CadenaIFin.charAt(16));
        CadenaFinal[62]=Character.toString(CadenaIFin.charAt(56));
        CadenaFinal[63]=Character.toString(CadenaIFin.charAt(24));



        
        
        return "";
        
    }
    
    
    
    
    
    public static void clavesDes(String Clave, String Dato) {
        String clave=Clave;
        //char[] C= new char[56]; no funcionó y no se por que
        char C1=clave.charAt(56);
        char C2=clave.charAt(48);
        char C3=clave.charAt(40);
        char C4=clave.charAt(32);
        char C5=clave.charAt(24);
        char C6=clave.charAt(16);
        char C7=clave.charAt(8);
        char C8=clave.charAt(0);
        char C9=clave.charAt(57);
        char C10=clave.charAt(49);
        char C11=clave.charAt(41);
        char C12=clave.charAt(33);
        char C13=clave.charAt(25);
        char C14=clave.charAt(17);
        char C15=clave.charAt(9);
        char C16=clave.charAt(1);
        char C17=clave.charAt(58);
        char C18=clave.charAt(50);
        char C19=clave.charAt(42);
        char C20=clave.charAt(34);
        char C21=clave.charAt(26);
        char C22=clave.charAt(18);
        char C23=clave.charAt(10);
        char C24=clave.charAt(2);
        char C25=clave.charAt(59);
        char C26=clave.charAt(51);
        char C27=clave.charAt(43);
        char C28=clave.charAt(35);
        char C29=clave.charAt(62);
        char C30=clave.charAt(54);
        char C31=clave.charAt(46);
        char C32=clave.charAt(38);
        char C33=clave.charAt(30);
        char C34=clave.charAt(22);
        char C35=clave.charAt(14);
        char C36=clave.charAt(6);
        char C37=clave.charAt(61);
        char C38=clave.charAt(53);
        char C39=clave.charAt(45);
        char C40=clave.charAt(37);
        char C41=clave.charAt(29);
        char C42=clave.charAt(21);
        char C43=clave.charAt(13);
        char C44=clave.charAt(5);
        char C45=clave.charAt(60);
        char C46=clave.charAt(52);
        char C47=clave.charAt(44);
        char C48=clave.charAt(36);
        char C49=clave.charAt(28);
        char C50=clave.charAt(20);
        char C51=clave.charAt(12);
        char C52=clave.charAt(4);
        char C53=clave.charAt(27);
        char C54=clave.charAt(19);
        char C55=clave.charAt(11);
        char C56=clave.charAt(3);

        
        String PermutedChoiceL="";
        String PermutedChoiceR="";
        PermutedChoiceL=new StringBuilder().append(C1).append(C2).append(C3).append(C4).append(C5).append(C6).append(C7)
                .append(C8).append(C9).append(C10).append(C11).append(C12).append(C13).append(C14).append(C15)
                .append(C16).append(C17).append(C18).append(C19).append(C20).append(C21).append(C22).append(C23)
                .append(C24).append(C25).append(C26).append(C27).append(C28).toString();
        
        
        PermutedChoiceR=new StringBuilder().append(C29).append(C30).append(C31)
                .append(C32).append(C33).append(C34).append(C35).append(C36).append(C37).append(C38).append(C39)
                .append(C40).append(C41).append(C42).append(C43).append(C44).append(C45).append(C46).append(C47)
                .append(C48).append(C49).append(C50).append(C51).append(C52).append(C53).append(C54).append(C55)
                .append(C56).toString();
        
        System.out.println("La permutacion inicial resulta: "+PermutedChoiceL+PermutedChoiceR);
       
        String[] CD= new String[56];
        String[][] Llave =new String[16][48];
       
        for (int i = 0; i < 16; i++) {
                     if (i==0 || i==1 || i==8 || i==15){
                    
                        PermutedChoiceL=PermutedChoiceL.substring(1,28)+PermutedChoiceL.charAt(0);
                        PermutedChoiceR=PermutedChoiceR.substring(1,28)+PermutedChoiceR.charAt(0);
                }
                           
            else{
                                
                    PermutedChoiceL=PermutedChoiceL.substring(2,28)+PermutedChoiceL.charAt(0)+PermutedChoiceL.charAt(1);
                    PermutedChoiceR=PermutedChoiceR.substring(2,28)+PermutedChoiceR.charAt(0)+PermutedChoiceR.charAt(1);

                }
                CD[i]=PermutedChoiceL+PermutedChoiceR;
                
            
                                      System.out.print(/*PermutedChoiceL+PermutedChoiceR+*/"K"+(i+1)+": ");
                
                String[] P=new String[48];                  
                P[0]=Character.toString(CD[i].charAt(13));                      
                P[1]=Character.toString(CD[i].charAt(16));
                P[2]=Character.toString(CD[i].charAt(10));
                P[3]=Character.toString(CD[i].charAt(23));
                P[4]=Character.toString(CD[i].charAt(0));
                P[5]=Character.toString(CD[i].charAt(4));
                P[6]=Character.toString(CD[i].charAt(2));
                P[7]=Character.toString(CD[i].charAt(27));
                P[8]=Character.toString(CD[i].charAt(14));
                P[9]=Character.toString(CD[i].charAt(5));
                P[10]=Character.toString(CD[i].charAt(20));
                P[11]=Character.toString(CD[i].charAt(9));
                P[12]=Character.toString(CD[i].charAt(22));
                P[13]=Character.toString(CD[i].charAt(18));
                P[14]=Character.toString(CD[i].charAt(11));
                P[15]=Character.toString(CD[i].charAt(3));
                P[16]=Character.toString(CD[i].charAt(25));
                P[17]=Character.toString(CD[i].charAt(7));
                P[18]=Character.toString(CD[i].charAt(15));
                P[19]=Character.toString(CD[i].charAt(6));
                P[20]=Character.toString(CD[i].charAt(26));
                P[21]=Character.toString(CD[i].charAt(19));
                P[22]=Character.toString(CD[i].charAt(12));
                P[23]=Character.toString(CD[i].charAt(1));
                P[24]=Character.toString(CD[i].charAt(40));
                P[25]=Character.toString(CD[i].charAt(51));
                P[26]=Character.toString(CD[i].charAt(30));
                P[27]=Character.toString(CD[i].charAt(36));
                P[28]=Character.toString(CD[i].charAt(46));
                P[29]=Character.toString(CD[i].charAt(54));
                P[30]=Character.toString(CD[i].charAt(29));
                P[31]=Character.toString(CD[i].charAt(39));
                P[32]=Character.toString(CD[i].charAt(50));
                P[33]=Character.toString(CD[i].charAt(44));
                P[34]=Character.toString(CD[i].charAt(32));
                P[35]=Character.toString(CD[i].charAt(47));
                P[36]=Character.toString(CD[i].charAt(43));
                P[37]=Character.toString(CD[i].charAt(48));
                P[38]=Character.toString(CD[i].charAt(38));
                P[39]=Character.toString(CD[i].charAt(55));
                P[40]=Character.toString(CD[i].charAt(33));
                P[41]=Character.toString(CD[i].charAt(52));
                P[42]=Character.toString(CD[i].charAt(45));
                P[43]=Character.toString(CD[i].charAt(41));
                P[44]=Character.toString(CD[i].charAt(49));
                P[45]=Character.toString(CD[i].charAt(35));
                P[46]=Character.toString(CD[i].charAt(28));
                P[47]=Character.toString(CD[i].charAt(31));
                for (int j = 0; j < 48; j++) {
                    Llave[i][j]=P[j];
                    System.out.print(Llave[i][j]);
                    
            }
                System.out.println("");     
        }
        
        String datin=Dato;
        String[] dato= new String[64];
        String[] L0=new String[32];
        String[] R0=new String[32];
        String[][] L=new String[16][32];
        String[][] R=new String[16][32];
        
        for (int i = 0; i < 64; i++) {
            
            dato[i]=Character.toString(datin.charAt(i));
            //System.out.print(dato[i]);
        }
        //System.out.println("");
        
        
        String[] IniPer= new String[64];
        int[] Permutacion={57,49,41,33,25,17,9,1,
                           59,51,43,35,27,19,11,3,
                           61,53,45,37,29,21,13,5,
                           63,55,47,39,31,23,15,7,
                           56,48,40,32,24,16,8,0,
                           58,50,42,34,26,18,10,2,
                           60,52,44,36,28,20,12,4,
                           62,54,46,38,30,22,14,6};
        for (int i = 0; i < 64; i++) {
            IniPer[i]=dato[Permutacion[i]];
        }
        
        
        for (int i = 0; i < 64; i++) {
            if(i<32){
                L[0][i]=IniPer[i];
                //System.out.print(L0[i]);
            }
            else{
                R[0][i-32]=IniPer[i];
            //System.out.print(R0[i-32]);
            }
        }       
        
        String[] Expanded=new String[48];
        for (int k = 0; k < 16; k++) {
            
        
            Expanded=Expansion(R[k]);
            for (int i = 0; i < 48; i++) {
                System.out.print(Expanded[i]);
            }
            String[][] Exores=new String[16][48];
            for (int i = 0; i < 48; i++) {
                Exores[0][i]=XOR(Expanded[i],Llave[0][i]);
            }
            String[][] Ss1= new String[8][6];
            int Cuentatotal=0;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 6; j++) {
                    Ss1[i][j]=Exores[0][Cuentatotal];
                    Cuentatotal=Cuentatotal++;
                }
            }
            String[][] RS=new String[8][6];
            String[][] Bin= new String[8][4];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 6; j++) {
                    RS[i][j]=Ss1[i][j];                   
                }
            }
            for (int j = 0; j < 8; j++) {
                

                for (int i = 0; i < 4; i++) {
                   Bin[j][i]=DecimalABin4(ESE(RS[j], j));
               }
            }
            
            String PaPermut="";
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 4; j++) {
                    PaPermut=PaPermut+Bin[i][j];
                }
            }
            
            String YaPermutado="";
            YaPermutado=PPermut(PaPermut);
            String[] DivisionPaXor= new String[32];
            for (int i = 0; i <32; i++) {
                DivisionPaXor[i]=Character.toString(YaPermutado.charAt(i));
            }
            String[][] Ll=new String[16][32];
            for (int i = 0; i < 32; i++) {
                R[k+1][i]=XOR(L[k][i], DivisionPaXor[i]);
            }
            
        }
        
        String RESULTADO="";
        String RCasiF="";
        String LCasiF="";
        for (int i = 0; i < 32; i++) {
            RCasiF=RCasiF+R[15][i];
            LCasiF=LCasiF+L[15][i];
        }
        RESULTADO=FinalPermutation(RCasiF, LCasiF);
        System.out.println(RESULTADO);
        
        
        
        
        
          
        
        
    }

}
