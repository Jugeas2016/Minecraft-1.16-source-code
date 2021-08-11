/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cqu
/*    */   extends cqo<clu>
/*    */ {
/*    */   public cqu(Codec<clu> ☃) {
/* 16 */     super(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Stream<fx> a(Random ☃, clu clu1, fx fx1) {
/* 23 */     List<fx> list = Lists.newArrayList();
/*    */     
/* 25 */     for (int i = 0; i < ☃.nextInt(☃.nextInt(clu1.a().a(☃)) + 1) + 1; i++) {
/* 26 */       int j = ☃.nextInt(16) + fx1.u();
/* 27 */       int k = ☃.nextInt(16) + fx1.w();
/* 28 */       int m = ☃.nextInt(120) + 4;
/* 29 */       list.add(new fx(j, m, k));
/*    */     } 
/*    */     
/* 32 */     return list.stream();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cqu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */