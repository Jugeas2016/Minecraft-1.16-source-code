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
/*    */ public class ckz
/*    */   extends cla<cmh>
/*    */ {
/*    */   public ckz(Codec<cmh> ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public cla.a<cmh> a() {
/* 26 */     return a::new;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(cfy ☃, bsy bsy1, long l, chx chx1, int i, int j, bsv bsv1, brd brd1, cmh cmh1) {
/* 31 */     return ☃.a(new brd(i, j));
/*    */   }
/*    */   
/*    */   public static class a extends crv<cmh> {
/*    */     private final long e;
/*    */     
/*    */     public a(cla<cmh> ☃, int i, int j, cra cra1, int k, long l) {
/* 38 */       super(☃, i, j, cra1, k, l);
/* 39 */       this.e = l;
/*    */     }
/*    */     
/*    */     public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cmh cmh1) {
/*    */       crs.m m;
/* 44 */       int k = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       do {
/* 50 */         this.b.clear();
/* 51 */         this.c = cra.a();
/* 52 */         this.d.c(this.e + k++, i, j);
/* 53 */         crs.a();
/*    */         
/* 55 */         m = new crs.m(this.d, (i << 4) + 2, (j << 4) + 2);
/* 56 */         this.b.add(m);
/* 57 */         m.a(m, this.b, this.d);
/*    */         
/* 59 */         List<cru> list = m.c;
/* 60 */         while (!list.isEmpty()) {
/* 61 */           int n = this.d.nextInt(list.size());
/* 62 */           cru cru = list.remove(n);
/* 63 */           cru.a(m, this.b, this.d);
/*    */         } 
/*    */         
/* 66 */         b();
/* 67 */         a(cfy1.f(), this.d, 10);
/*    */       }
/* 69 */       while (this.b.isEmpty() || m.b == null);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */