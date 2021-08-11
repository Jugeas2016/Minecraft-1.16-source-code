/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.mojang.serialization.Codec;
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
/*    */ 
/*    */ public class cke
/*    */   extends cla<cmh>
/*    */ {
/* 23 */   private static final List<btg.c> u = (List<btg.c>)ImmutableList.of(new btg.c(aqe.f, 10, 2, 3), new btg.c(aqe.bb, 5, 4, 4), new btg.c(aqe.aU, 8, 5, 5), new btg.c(aqe.av, 2, 5, 5), new btg.c(aqe.S, 3, 4, 4));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public cke(Codec<cmh> ☃) {
/* 32 */     super(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean a(cfy ☃, bsy bsy1, long l, chx chx1, int i, int j, bsv bsv1, brd brd1, cmh cmh1) {
/* 38 */     return (chx1.nextInt(5) < 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public cla.a<cmh> a() {
/* 43 */     return a::new;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<btg.c> c() {
/* 48 */     return u;
/*    */   }
/*    */   
/*    */   public static class a extends crv<cmh> {
/*    */     public a(cla<cmh> ☃, int i, int j, cra cra1, int k, long l) {
/* 53 */       super(☃, i, j, cra1, k, l);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cmh cmh1) {
/* 58 */       cri.q q = new cri.q(this.d, (i << 4) + 2, (j << 4) + 2);
/* 59 */       this.b.add(q);
/* 60 */       q.a(q, this.b, this.d);
/*    */       
/* 62 */       List<cru> list = q.d;
/* 63 */       while (!list.isEmpty()) {
/* 64 */         int k = this.d.nextInt(list.size());
/* 65 */         cru cru = list.remove(k);
/* 66 */         cru.a(q, this.b, this.d);
/*    */       } 
/*    */       
/* 69 */       b();
/* 70 */       a(this.d, 48, 70);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cke.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */