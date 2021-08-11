/*    */ import com.google.common.collect.Lists;
/*    */ import com.ibm.icu.lang.UCharacter;
/*    */ import com.ibm.icu.text.ArabicShaping;
/*    */ import com.ibm.icu.text.Bidi;
/*    */ import com.ibm.icu.text.BidiRun;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ekw
/*    */ {
/*    */   public static afa a(nu ☃, boolean bool) {
/* 16 */     oc oc = oc.a(☃, UCharacter::getMirror, ekw::a);
/* 17 */     Bidi bidi = new Bidi(oc.a(), bool ? 127 : 126);
/* 18 */     bidi.setReorderingMode(0);
/*    */     
/* 20 */     List<afa> list = Lists.newArrayList();
/* 21 */     int i = bidi.countRuns();
/* 22 */     for (int j = 0; j < i; j++) {
/* 23 */       BidiRun bidiRun = bidi.getVisualRun(j);
/* 24 */       list.addAll(oc.a(bidiRun.getStart(), bidiRun.getLength(), bidiRun.isOddRun()));
/*    */     } 
/*    */     
/* 27 */     return afa.a(list);
/*    */   }
/*    */   
/*    */   private static String a(String ☃) {
/*    */     try {
/* 32 */       return (new ArabicShaping(8)).shape(☃);
/* 33 */     } catch (Exception exception) {
/* 34 */       return ☃;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ekw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */