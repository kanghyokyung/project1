
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instruciton;

/**
 *
 * @author gyeonghyeko, hyokyung kang
 */
import java.util.LinkedList;
import java.util.*;

public class Phase3 {

    /* Translate each Instruction object into
     * a 32-bit number.
     *
     * tals: list of Instructions to translate
     *
     * returns a list of instructions in their 32-bit binary representation
     *
     */
    int functnumber;
    int opcode;
    
    public static Stack<Integer> decimaltobinary5(int a) {// change integer to binary number put those numbers in stack.. 
        Stack<Integer> stack = new Stack<Integer>();
        while (a != 0)
        {
        int d = a % 2;
        stack.push(d);
        a /= 2;
        }
        while(st.size()<=5){
         stack.push(0)}
   
        }
        return stack;
    }
    public static Stack<Integer> decimaltobinary6(int a) {// change integer to binary number put those numbers in stack.. 
        Stack<Integer> stack = new Stack<Integer>();
        while (a != 0)
        {
        int d = a % 2;
        stack.push(d);
        a /= 2;
        }
        while(st.size()<=6){
         stack.push(0)}
    }
        return stack;
    }

     public static void Stack<Integer> showpop(Stack st) {
      System.out.print("pop -> ");
      Integer a = (Integer) st.pop();
      System.out.println(a);
      System.out.println("stack: " + st);
    }

      

    public static List<Integer> translate_instructions(List<Instruction> tals) {
        
        List<Integer> binary_list = new LinkedList<Integer>();
        
        for (int i=0; i<tals.size(); i++) {
            Instruction tals_tmp=tals.get(i);
            
            
           
            // check the id is R type or I type. 
            
            
            if(tals_tmp.instruction_id==2||tals_tmp.instruction_id==3||tals_tmp.instruction_id==8){
                // check the Id is R-type
                
                if(tals_tmp.instruction_id==2){
                functnumber=33;
                }
                 if(tals_tmp.instruction_id==3){
                functnumber=37;
                }
                 if(tals_tmp.instruction_id==8){
                functnumber=42;
                }
                
                for(i=0;i<decimaltobinary6(0).size();){
                Binary_list.add.decimaltobinary6(0).pop();
                    
                }
             decimaltobinary6(st, 0); decimaltobinary5(st,tals_tmp.rs);decimaltobinary5(st,tals_tmp.rt);decimaltobinary5(st,tals_tmp.rd);decimaltobinary5(st,tals_tmp.shift);decimaltobinary6(st, 42);
                
               
                /*
                change integer to binary 
                 String x=Integer.toBinaryString()
                 int y=Integer.parseInt(x)
                */
                
                //op//rs//rt//rd//shift//funct
                
                
                
                   }
            
            }
            
            if(tals_tmp.instruction_id==1||tals_tmp.instruction_id==5||tals_tmp.instruction_id==6||tals_tmp.instruction_id==9||tals_tmp.instruction_id==10){
            // put the algorithm for only I-type
            //need op,rs,rt,immediate//
                if(tals_tmp.instruction_id==1){
                opcode=42;}
                if(tals_tmp.instruction_id==5){
                opcode=4;}
                if(tals_tmp.instruction_id==6){
                opcode=5;}
                if(tals_tmp.instruction_id==9){
                opcode=15;}
                if(tals_tmp.instruction_id==10){
                opcode=13;}
                
                
                
                    
                
                
            }          
                
            //addiu(I)
            /*if (tals_tmp.instruction_id==1){//addiu_I_type
                String addiu_op_binary = Integer.toBinaryString(9);
                String addiu_rs_binary = Integer.toBinaryString(tals_tmp.rs);
                String addiu_rt_binary = Integer.toBinaryString(tals_tmp.rt);
                String addiu_immediate_binary = Integer.toBinaryString(tals_tmp.immediate);
                
                String addiu_string_binary = addiu_op_binary + addiu_rs_binary + addiu_rt_binary +addiu_immediate_binary;
                int addiu_binary = Integer.valueOf(addiu_string_binary);
                binary_list.add(addiu_binary);
            }*/
            
            
            
            //beq(I)
            /*if (tals_tmp.instruction_id==5){
                String beq_op_binary = Integer.toBinaryString(4);
                String beq_rs_binary = Integer.toBinaryString(tals_tmp.rs);
                String beq_rt_binary = Integer.toBinaryString(tals_tmp.rt);
                String beq_immediate_binary = Integer.toBinaryString(tals_tmp.immediate);
                
                String addiu_string_binary = beq_op_binary + beq_rs_binary + beq_rt_binary +beq_immediate_binary;
                int addiu_binary = Integer.valueOf(addiu_string_binary);
                binary_list.add(addiu_binary);
            }*/
            
            //bne(I)
           /* if (tals_tmp.instruction_id==6){
                String bne_op_binary = Integer.toBinaryString(5);
                String bne_rs_binary = Integer.toBinaryString(tals_tmp.rs);
                String bne_rt_binary = Integer.toBinaryString(tals_tmp.rt);
                String bne_immediate_binary = Integer.toBinaryString(tals_tmp.immediate);
                
                String addiu_string_binary = bne_op_binary + bne_rs_binary + bne_rt_binary +bne_immediate_binary;
                int addiu_binary = Integer.valueOf(addiu_string_binary);
                binary_list.add(addiu_binary);
            }*/
            
           
            /*if(tals.tmp.instruction_id==9){//lui // I-type
                    
                String lui_op_binary = Integer.toBinaryString(15);
                String lui_rs_binary = Integer.toBinaryString(tals_tmp.rs);
                String lui_rt_binary = Integer.toBinaryString(tals_tmp.rt);
                String lui_immediate_binary = Integer.toBinaryString(tals_tmp.immediate);
                
                String lui_string_binary = lui_op_binary + lui_rs_binary + lui_rt_binary +lui_immediate_binary;
                int lui_binary = Integer.valueOf(lui_string_binary);
                binary_list.add(lui_binary);

            }
            if(tals.tmp.instruction_id==10){//ori //I-type
                    
               String ori_op_binary = Integer.toBinaryString(13);
               String ori_rs_binary = Integer.toBinaryString(tals_tmp.rs);
               String ori_rt_binary = Integer.toBinaryString(tals_tmp.rt);
               String ori_immediate_binary = Integer.toBinaryString(tals_tmp.immediate);
               String ori_string_binary = ori_op_binary + ori_rs_binary + ori_rt_binary +ori_immediate_binary;
               int ori_binary = Integer.valueOf(ori_string_binary);
               binary_list.add(ori_binary);


            }*/
            
           
        }
        return null;
    }
}
