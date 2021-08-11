/*    */ import javax.sound.sampled.AudioFormat;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ import org.lwjgl.openal.AL10;
/*    */ import org.lwjgl.openal.ALC10;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ddy
/*    */ {
/* 11 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private static String a(int ☃) {
/* 14 */     switch (☃) {
/*    */       case 40961:
/* 16 */         return "Invalid name parameter.";
/*    */       case 40962:
/* 18 */         return "Invalid enumerated parameter value.";
/*    */       case 40963:
/* 20 */         return "Invalid parameter parameter value.";
/*    */       case 40964:
/* 22 */         return "Invalid operation.";
/*    */       case 40965:
/* 24 */         return "Unable to allocate memory.";
/*    */     } 
/* 26 */     return "An unrecognized error occurred.";
/*    */   }
/*    */ 
/*    */   
/*    */   static boolean a(String ☃) {
/* 31 */     int i = AL10.alGetError();
/* 32 */     if (i != 0) {
/* 33 */       a.error("{}: {}", ☃, a(i));
/* 34 */       return true;
/*    */     } 
/* 36 */     return false;
/*    */   }
/*    */   
/*    */   private static String b(int ☃) {
/* 40 */     switch (☃) {
/*    */       case 40961:
/* 42 */         return "Invalid device.";
/*    */       case 40962:
/* 44 */         return "Invalid context.";
/*    */       case 40964:
/* 46 */         return "Invalid value.";
/*    */       case 40963:
/* 48 */         return "Illegal enum.";
/*    */       case 40965:
/* 50 */         return "Unable to allocate memory.";
/*    */     } 
/* 52 */     return "An unrecognized error occurred.";
/*    */   }
/*    */ 
/*    */   
/*    */   static boolean a(long ☃, String str) {
/* 57 */     int i = ALC10.alcGetError(☃);
/* 58 */     if (i != 0) {
/* 59 */       a.error("{}{}: {}", str, Long.valueOf(☃), b(i));
/* 60 */       return true;
/*    */     } 
/* 62 */     return false;
/*    */   }
/*    */   
/*    */   static int a(AudioFormat ☃) {
/* 66 */     AudioFormat.Encoding encoding = ☃.getEncoding();
/* 67 */     int i = ☃.getChannels();
/* 68 */     int j = ☃.getSampleSizeInBits();
/*    */     
/* 70 */     if (encoding.equals(AudioFormat.Encoding.PCM_UNSIGNED) || encoding.equals(AudioFormat.Encoding.PCM_SIGNED)) {
/* 71 */       if (i == 1) {
/* 72 */         if (j == 8)
/* 73 */           return 4352; 
/* 74 */         if (j == 16) {
/* 75 */           return 4353;
/*    */         }
/* 77 */       } else if (i == 2) {
/* 78 */         if (j == 8)
/* 79 */           return 4354; 
/* 80 */         if (j == 16) {
/* 81 */           return 4355;
/*    */         }
/*    */       } 
/*    */     }
/*    */     
/* 86 */     throw new IllegalArgumentException("Invalid audio format: " + ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */