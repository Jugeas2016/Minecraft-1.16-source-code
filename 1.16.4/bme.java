/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import java.util.Optional;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bme
/*    */   extends blx
/*    */ {
/* 23 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   public bme(blx.a ☃) {
/* 26 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/* 31 */     bmb bmb = bfw1.b(aot1);
/* 32 */     md md = bmb.o();
/*    */     
/* 34 */     if (!bfw1.bC.d) {
/* 35 */       bfw1.a(aot1, bmb.b);
/*    */     }
/*    */     
/* 38 */     if (md == null || !md.c("Recipes", 9)) {
/* 39 */       a.error("Tag not valid: {}", md);
/* 40 */       return aov.d(bmb);
/*    */     } 
/*    */     
/* 43 */     if (!☃.v) {
/* 44 */       mj mj = md.d("Recipes", 8);
/* 45 */       List<boq<?>> list = Lists.newArrayList();
/*    */       
/* 47 */       bor bor = ☃.l().aF();
/* 48 */       for (int i = 0; i < mj.size(); i++) {
/* 49 */         String str = mj.j(i);
/* 50 */         Optional<? extends boq<?>> optional = bor.a(new vk(str));
/* 51 */         if (optional.isPresent()) {
/* 52 */           list.add(optional.get());
/*    */         } else {
/* 54 */           a.error("Invalid recipe: {}", str);
/* 55 */           return aov.d(bmb);
/*    */         } 
/*    */       } 
/*    */       
/* 59 */       bfw1.a(list);
/* 60 */       bfw1.b(aea.c.b(this));
/*    */     } 
/*    */     
/* 63 */     return aov.a(bmb, ☃.s_());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bme.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */