/*    */ import java.util.List;
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
/*    */ 
/*    */ public class byy
/*    */   extends buf
/*    */ {
/*    */   private final a e;
/* 21 */   public static final cey d = cex.w;
/*    */   
/*    */   public enum a {
/* 24 */     a, b;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected byy(a ☃, ceg.c c1) {
/* 30 */     super(c1);
/* 31 */     j(((ceh)this.n.b()).a(d, Boolean.valueOf(false)));
/* 32 */     this.e = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int g(ceh ☃) {
/* 37 */     return ((Boolean)☃.c(d)).booleanValue() ? 15 : 0;
/*    */   }
/*    */ 
/*    */   
/*    */   protected ceh a(ceh ☃, int i) {
/* 42 */     return ☃.a(d, Boolean.valueOf((i > 0)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bry ☃, fx fx1) {
/* 47 */     if (this.as == cva.y || this.as == cva.z) {
/* 48 */       ☃.a((bfw)null, fx1, adq.ru, adr.e, 0.3F, 0.8F);
/*    */     } else {
/* 50 */       ☃.a((bfw)null, fx1, adq.oR, adr.e, 0.3F, 0.6F);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b(bry ☃, fx fx1) {
/* 56 */     if (this.as == cva.y || this.as == cva.z) {
/* 57 */       ☃.a((bfw)null, fx1, adq.rt, adr.e, 0.3F, 0.7F);
/*    */     } else {
/* 59 */       ☃.a((bfw)null, fx1, adq.oQ, adr.e, 0.3F, 0.5F);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected int b(brx ☃, fx fx1) {
/*    */     List<? extends aqa> list;
/* 65 */     dci dci = c.a(fx1);
/*    */ 
/*    */     
/* 68 */     switch (null.a[this.e.ordinal()]) {
/*    */       case 1:
/* 70 */         list = ☃.a((aqa)null, dci);
/*    */         break;
/*    */       case 2:
/* 73 */         list = ☃.a((Class)aqm.class, dci);
/*    */         break;
/*    */       default:
/* 76 */         return 0;
/*    */     } 
/*    */     
/* 79 */     if (!list.isEmpty()) {
/* 80 */       for (aqa aqa : list) {
/* 81 */         if (!aqa.bQ()) {
/* 82 */           return 15;
/*    */         }
/*    */       } 
/*    */     }
/*    */     
/* 87 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 92 */     ☃.a((cfj<?>[])new cfj[] { d });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\byy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */