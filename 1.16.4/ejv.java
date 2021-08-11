/*    */ import com.google.common.collect.Lists;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ejv
/*    */   extends ekc
/*    */ {
/*    */   @Nullable
/*    */   private static ejs c;
/* 17 */   private static final vk b = new vk("missingno");
/*    */   private static final afi<det> d;
/*    */   
/*    */   static {
/* 21 */     d = new afi<>(() -> {
/*    */           det ☃ = new det(16, 16, false);
/*    */           int i = -16777216;
/*    */           int j = -524040;
/*    */           for (int k = 0; k < 16; k++) {
/*    */             for (int m = 0; m < 16; m++) {
/*    */               if ((((k < 8) ? 1 : 0) ^ ((m < 8) ? 1 : 0)) != 0) {
/*    */                 ☃.a(m, k, -524040);
/*    */               } else {
/*    */                 ☃.a(m, k, -16777216);
/*    */               } 
/*    */             } 
/*    */           } 
/*    */           ☃.g();
/*    */           return ☃;
/*    */         });
/*    */   }
/* 38 */   private static final ekc.a e = new ekc.a(b, 16, 16, new elc(Lists.newArrayList((Object[])new elb[] { new elb(0, -1) }), 16, 16, 1, false));
/*    */   
/*    */   private ejv(ekb ☃, int i, int j, int k, int m, int n) {
/* 41 */     super(☃, e, i, j, k, m, n, d.a());
/*    */   }
/*    */   
/*    */   public static ejv a(ekb ☃, int i, int j, int k, int m, int n) {
/* 45 */     return new ejv(☃, i, j, k, m, n);
/*    */   }
/*    */   
/*    */   public static vk a() {
/* 49 */     return b;
/*    */   }
/*    */   
/*    */   public static ekc.a b() {
/* 53 */     return e;
/*    */   }
/*    */ 
/*    */   
/*    */   public void close() {
/* 58 */     for (int ☃ = 1; ☃ < this.a.length; ☃++) {
/* 59 */       this.a[☃].close();
/*    */     }
/*    */   }
/*    */   
/*    */   public static ejs c() {
/* 64 */     if (c == null) {
/* 65 */       c = new ejs(d.a());
/* 66 */       djz.C().M().a(b, c);
/*    */     } 
/* 68 */     return c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */