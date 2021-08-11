/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum elp
/*    */   implements elv
/*    */ {
/* 14 */   a(0, 0),
/* 15 */   b(0, 90),
/* 16 */   c(0, 180),
/* 17 */   d(0, 270),
/* 18 */   e(90, 0),
/* 19 */   f(90, 90),
/* 20 */   g(90, 180),
/* 21 */   h(90, 270),
/* 22 */   i(180, 0),
/* 23 */   j(180, 90),
/* 24 */   k(180, 180),
/* 25 */   l(180, 270),
/* 26 */   m(270, 0),
/* 27 */   n(270, 90),
/* 28 */   o(270, 180),
/* 29 */   p(270, 270);
/*    */   
/*    */   private static final Map<Integer, elp> q;
/*    */   private final f r;
/*    */   
/*    */   static {
/* 35 */     q = (Map<Integer, elp>)Arrays.<elp>stream(values()).collect(Collectors.toMap(☃ -> Integer.valueOf(☃.t), ☃ -> ☃));
/*    */   }
/*    */   private final c s; private final int t;
/*    */   
/*    */   private static int b(int ☃, int i) {
/* 40 */     return ☃ * 360 + i;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   elp(int ☃, int i) {
/* 46 */     this.t = b(☃, i);
/*    */     
/* 48 */     d d = new d(new g(0.0F, 1.0F, 0.0F), -i, true);
/* 49 */     d.a(new d(new g(1.0F, 0.0F, 0.0F), -☃, true));
/*    */     
/* 51 */     c c1 = c.a;
/*    */     int j;
/* 53 */     for (j = 0; j < i; j += 90) {
/* 54 */       c1 = c1.a(c.u);
/*    */     }
/*    */     
/* 57 */     for (j = 0; j < ☃; j += 90) {
/* 58 */       c1 = c1.a(c.s);
/*    */     }
/*    */     
/* 61 */     this.r = new f(null, d, null, null);
/* 62 */     this.s = c1;
/*    */   }
/*    */ 
/*    */   
/*    */   public f b() {
/* 67 */     return this.r;
/*    */   }
/*    */   
/*    */   public static elp a(int ☃, int i) {
/* 71 */     return q.get(Integer.valueOf(b(afm.b(☃, 360), afm.b(i, 360))));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\elp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */