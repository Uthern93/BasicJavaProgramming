//Uthern 
package tuition;
  public class Subject extends Tuisyen {
      
      public static int sub1,sub2,sub3,sub4;
      public static int exam,payment;
      public static String s1,s2,s3,s4,s5;
      
      static dataSubjek obj1= new dataSubjek();
      
      //subject selection interface
      public static void data(){
          System.out.println("\nSila Masukkan Nombor Untuk Pendafateran Sesi ");
          System.out.println("\n 1.Tuisyen PT3");
          System.out.println("\n 2.Tuisyen SPM");
          
          System.out.println("\nMasukan Number :");
          try{
            String input= sc.nextLine();
            exam =(Integer.parseInt(input));
            
        } catch (NumberFormatException nfe){
        System.err.println("Sila Masukkan Number 1/2 sahaja !!!!");
        sc.close();
        }
          if(exam==1){
           System.out.println("Sila Masukkan Number untuk Pendaftaran Subjek Tuisyen Pt3");
           System.out.println("\n1.Mathematics");
           System.out.println("\n2.Sains");
           System.out.println( "\n3.Bahasa Inggeris");               
           System.out.println("\n4.Bahasa Melayu");
           System.out.println("\n0.Tiada Subjek");
           
           System.out.println("\nPilih 1 Subjek");
           try{
               String input = sc.nextLine();
               sub1=Integer.parseInt(input);
           } catch (NumberFormatException nfe){
        System.err.println("\nMasukkan Number sahaja !!!!");
        sc.close();   
    }
        System.out.println("\nPilih 1 Subjek berlainan jika perlu");
        
         try{
               String input = sc.nextLine();
               sub2=Integer.parseInt(input);
           } catch (NumberFormatException nfe){
        System.err.println("\nMasukkan Number sahaja !!!!");
        sc.close();   
    } 
      System.out.println("\nPilih 1 Subjek berlainan jika perlu");    
       try{
               String input = sc.nextLine();
               sub3=Integer.parseInt(input);
           } catch (NumberFormatException nfe){
        System.err.println("\nMasukkan Number sahaja !!!!");
        sc.close();   
    }    
       System.out.println("\nPilih 1 Subjek berlainan jika perlu");    
       try{
               String input = sc.nextLine();
               sub4=Integer.parseInt(input);
           } catch (NumberFormatException nfe){
        System.err.println("\nMasukkan Number sahaja !!!!");
        sc.close();   
    }       
     obj1.spm ();
    System.out.println("Jumlah Yuran yang perlu dibayar RM:" + payment);
          }else{
            System.err.println("Masukkan Number 1 and 2 sahaja !!!!");  
          }
      }
  }
       
     //Data subject
class dataSubjek extends Subject{
     public void pt3(){
         System.out.println("");
         if(sub1==1|| sub2 == 1||sub3 == 1||sub4==1){
             s1="Subjeck yang didaftarkan : Mathematics";
             System.out.println(""+s1);
             payment = payment +20;
         } 
         if(sub1==2|| sub2 == 2||sub3 == 2||sub4==2){
             s2="Subjeck yang didaftarkan : Sains";
             System.out.println(""+s2);
             payment = payment +20;
         } 
    if(sub1==3|| sub2 == 3||sub3 == 3||sub4==3){
             s3="Subjeck yang didaftarkan :Bahasa Inggeris";
             System.out.println(""+s3);
             payment = payment +20;
         } 
    if(sub1==4|| sub2 == 4||sub3 == 4||sub4==4){
             s4="Subjeck yang didaftarkan :Bahasa Melayu ";
             System.out.println(""+s4);
             payment = payment +20;
         } 
       if(sub1==0|| sub2 == 0||sub3 == 0||sub4==0){
             s5="Subjeck yang didaftarkan : TIADA";
             System.out.println(""+s5);
             System.out.println(""+s5);
         } 
          
      }
      
      public void spm(){
          System.out.println("");
          if(sub1==1|| sub2 == 1||sub3 == 1||sub4==1){
             s1="Subjeck yang didaftarkan : Mathematics";
             System.out.println(""+s1);
             payment = payment +20;
         } 
         if(sub1==2|| sub2 == 2||sub3 == 2||sub4==2){
             s2="Subjeck yang didaftarkan : Sejarah";
             System.out.println(""+s2);
             payment = payment +20;
         } 
    if(sub1==3|| sub2 == 3||sub3 == 3||sub4==3){
             s3="Subjeck yang didaftarkan :Bahasa Inggeris";
             System.out.println(""+s3);
             payment = payment +20;
         } 
    if(sub1==4|| sub2 == 4||sub3 == 4||sub4==4){
             s4="Subjeck yang didaftarkan :Perdagangan ";
             System.out.println(""+s4);
             payment = payment +20;
         } 
       if(sub1==0|| sub2 == 0||sub3 == 0||sub4==0){
             s5="Subjeck yang didaftarkan : TIADA";
             System.out.println(""+s5);
             
         } 
          
          
      }
    
}
